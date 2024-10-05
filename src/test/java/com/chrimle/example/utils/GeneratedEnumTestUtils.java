package com.chrimle.example.utils;

import com.chrimle.example.GeneratedSource;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import org.junit.jupiter.api.Assertions;

/** Generalized Test-class for testing Generated Enum-classes */
public class GeneratedEnumTestUtils {

  public static void assertEnumClass(final GeneratedSource generatedSource) {

    final Class<?> classUnderTest = generatedSource.getClassUnderTest();

    AssertionUtils.assertIsEnum(classUnderTest);
    assertEnumValues(classUnderTest);
    AssertionUtils.assertClassIsAnnotatedAsDeprecated(
        classUnderTest, generatedSource.isDeprecated());
    AssertionUtils.assertClassIsAnnotatedWithAdditionalTypeAnnotations(
        classUnderTest, generatedSource.hasAdditionalEnumTypeAnnotations());
    assertEnumHasCaseInsensitiveFromValueMethod(generatedSource);
  }

  private static <E extends Enum<E>> void assertEnumValues(final Class<?> classUnderTest) {
    Assertions.assertEquals(3, classUnderTest.getEnumConstants().length);
    for (int i = 1; i <= 3; i++) {
      Assertions.assertEquals("ENUM" + i, ((E) classUnderTest.getEnumConstants()[i - 1]).name());
    }
  }

  private static void assertEnumHasCaseInsensitiveFromValueMethod(
      final GeneratedSource generatedSource) {
    if (!generatedSource.useEnumCaseInsensitive()) {
      // Assert 'fromValue'-method does NOT exist
      AssertionUtils.assertClassDoesNotHaveMethod(
          generatedSource.getClassUnderTest(), "fromValue", String.class);
      return;
    }
    // Assert 'fromValue'-method exists
    final Method fromValueMethod =
        AssertionUtils.assertClassHasMethod(
            generatedSource.getClassUnderTest(), "fromValue", String.class);

    // Assert 'IllegalArgumentException' is throws for unknown Enum-values
    InvocationTargetException invocationTargetException =
        Assertions.assertThrows(
            InvocationTargetException.class, () -> fromValueMethod.invoke(null, "invalid"));
    Assertions.assertInstanceOf(
        IllegalArgumentException.class, invocationTargetException.getCause());

    // Assert all enum values can be mapped to case-insensitively
    for (final String name : List.of("enum", "Enum", "EnUm", "ENUM", "eNuM")) {
      for (int i = 1; i <= 3; i++) {
        final String value = name + i;
        Assertions.assertDoesNotThrow(() -> fromValueMethod.invoke(null, value));
      }
    }
  }
}
