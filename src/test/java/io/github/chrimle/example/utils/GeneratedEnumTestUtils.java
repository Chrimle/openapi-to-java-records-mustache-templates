/*
  Copyright 2024 Chrimle

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.

*/
package io.github.chrimle.example.utils;

import io.github.chrimle.example.GeneratedSource;
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
