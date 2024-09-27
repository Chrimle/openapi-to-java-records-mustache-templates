package com.chrimle.example.utils;

import com.chrimle.example.PluginExecution;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import org.junit.jupiter.api.Assertions;

/** Generalized Test-class for testing Generated Enum-classes */
public class GeneratedEnumTestUtils {

  public static void assertExampleEnum(
      final PluginExecution pluginExecution, final Class<?> classUnderTest) {
    assertEnumClass(pluginExecution, classUnderTest, false);
  }

  public static void assertDeprecatedExampleEnum(
      final PluginExecution pluginExecution, final Class<?> classUnderTest) {
    assertEnumClass(pluginExecution, classUnderTest, true);
  }

  public static void assertEnumClass(
      final PluginExecution pluginExecution,
      final Class<?> classUnderTest,
      final boolean isDeprecated) {
    AssertionUtils.assertIsEnum(classUnderTest);
    assertEnumValues(classUnderTest);
    AssertionUtils.assertClassIsAnnotatedAsDeprecated(classUnderTest, isDeprecated);
    AssertionUtils.assertClassIsAnnotatedWithAdditionalTypeAnnotations(
        classUnderTest, pluginExecution.hasAdditionalEnumTypeAnnotations());
    assertEnumHasCaseInsensitiveFromValueMethod(
        classUnderTest, pluginExecution.useEnumCaseInsensitive());
  }

  private static <E extends Enum<E>> void assertEnumValues(final Class<?> classUnderTest) {
    Assertions.assertEquals(3, classUnderTest.getEnumConstants().length);
    for (int i = 1; i <= 3; i++) {
      Assertions.assertEquals("ENUM" + i, ((E) classUnderTest.getEnumConstants()[i - 1]).name());
    }
  }

  private static void assertEnumHasCaseInsensitiveFromValueMethod(
      final Class<?> classUnderTest, final boolean useEnumCaseInsensitive) {
    if (!useEnumCaseInsensitive) {
      // Assert 'fromValue'-method does NOT exist
      AssertionUtils.assertClassDoesNotHaveMethod(classUnderTest, "fromValue", String.class);
      return;
    }
    // Assert 'fromValue'-method exists
    final Method fromValueMethod =
        AssertionUtils.assertClassHasMethod(classUnderTest, "fromValue", String.class);

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
