package com.chrimle.example.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import org.junit.jupiter.api.Assertions;

/**
 * Generalized Test-class for testing Generated Enum-classes
 */
public class GeneratedEnumTestUtils {

  public static <E extends Enum<E>> void assertEnumClass(
      final Class<E> classUnderTest,
      final boolean isDeprecated,
      final boolean hasAdditionalTypeAnnotations,
      final boolean useEnumCaseInsensitive) {
    AssertionUtils.assertIsEnum(classUnderTest);
    assertEnumValues(classUnderTest);
    AssertionUtils.assertClassIsAnnotatedAsDeprecated(classUnderTest,
        isDeprecated);
    AssertionUtils.assertClassIsAnnotatedWithAdditionalTypeAnnotations(
        classUnderTest, hasAdditionalTypeAnnotations);
    assertEnumHasCaseInsensitiveFromValueMethod(classUnderTest,
        useEnumCaseInsensitive);
  }


  private static <E extends Enum<E>> void assertEnumValues(
      final Class<E> classUnderTest) {
    Assertions.assertEquals(3, classUnderTest.getEnumConstants().length);
    for (int i = 1; i <= 3; i++) {
      Assertions.assertEquals("ENUM" + i,
          classUnderTest.getEnumConstants()[i - 1].name());
    }
  }

  private static <E extends Enum<E>> void assertEnumHasCaseInsensitiveFromValueMethod(
      final Class<E> classUnderTest, final boolean useEnumCaseInsensitive) {
    if (!useEnumCaseInsensitive) {
      return;
    }
    // Assert 'fromValue'-method exists
    final Method fromValueMethod = Assertions.assertDoesNotThrow(
        () -> classUnderTest.getMethod("fromValue", String.class),
        classUnderTest.getCanonicalName()
            + " did NOT have a 'fromValue' method!"
    );

    // Assert 'IllegalArgumentException' is throws for unknown Enum-values
    InvocationTargetException invocationTargetException = Assertions.assertThrows(
        InvocationTargetException.class,
        () -> fromValueMethod.invoke(null, "invalid"));
    Assertions.assertInstanceOf(IllegalArgumentException.class,
        invocationTargetException.getCause());

    // Assert all enum values can be mapped to case-insensitively
    for (final String name : List.of("enum", "Enum", "EnUm", "ENUM",
        "eNuM")) {
      for (int i = 1; i <= 3; i++) {
        final String value = name + i;
        Assertions.assertDoesNotThrow(
            () -> fromValueMethod.invoke(null, value));
      }
    }

  }


}
