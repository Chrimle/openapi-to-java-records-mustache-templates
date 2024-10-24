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
    assertEnumNames(classUnderTest);
    assertEnumValues(classUnderTest);
    AssertionUtils.assertClassIsAnnotatedAsDeprecated(
        classUnderTest, generatedSource.isDeprecated());
    AssertionUtils.assertClassIsAnnotatedWithAdditionalTypeAnnotations(
        classUnderTest, generatedSource.hasAdditionalEnumTypeAnnotations());
    assertEnumHasCaseInsensitiveFromValueMethod(generatedSource);
  }

  private static void assertEnumNames(final Class<?> classUnderTest) {
    Assertions.assertEquals(3, classUnderTest.getEnumConstants().length);
    for (int i = 1; i <= 3; i++) {
      Assertions.assertEquals(
          "ENUM" + i, ((Enum<?>) classUnderTest.getEnumConstants()[i - 1]).name());
    }
  }

  private static void assertEnumValues(final Class<?> classUnderTest) {
    Assertions.assertEquals(3, classUnderTest.getEnumConstants().length);
    for (int i = 1; i <= 3; i++) {
      final Object enumValue = classUnderTest.getEnumConstants()[i - 1];
      AssertionUtils.assertInstanceMethodReturns(enumValue, "getValue", "ENUM" + i);
    }
  }

  private static void assertEnumHasCaseInsensitiveFromValueMethod(
      final GeneratedSource generatedSource) {
    // Assert 'fromValue'-method exists
    final Method fromValueMethod =
        AssertionUtils.assertClassHasMethod(
            generatedSource.getClassUnderTest(), "fromValue", String.class);

    // Assert 'IllegalArgumentException' is thrown for unknown Enum-values
    InvocationTargetException invocationTargetException =
        Assertions.assertThrows(
            InvocationTargetException.class, () -> fromValueMethod.invoke(null, "invalid"));
    Assertions.assertInstanceOf(
        IllegalArgumentException.class, invocationTargetException.getCause());

    for (final String name : List.of("enum", "Enum", "EnUm", "ENUM", "eNuM")) {
      for (int i = 1; i <= 3; i++) {
        final String value = name + i;
        if (generatedSource.useEnumCaseInsensitive()) {
          // Assert all enum values can be mapped to case-insensitively
          Assertions.assertDoesNotThrow(() -> fromValueMethod.invoke(null, value));
        } else if ("ENUM".equals(name)) {
          Assertions.assertDoesNotThrow(() -> fromValueMethod.invoke(null, value));
        } else {
          // Assert 'IllegalArgumentException' is thrown when case-sensitive
          Assertions.assertInstanceOf(
              IllegalArgumentException.class,
              Assertions.assertThrows(
                      InvocationTargetException.class, () -> fromValueMethod.invoke(null, value))
                  .getCause());
        }
      }
    }
  }
}
