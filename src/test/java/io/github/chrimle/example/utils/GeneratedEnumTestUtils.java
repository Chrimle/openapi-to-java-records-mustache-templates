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
import io.github.chrimle.example.models.GeneratedField;
import java.util.Arrays;
import java.util.Optional;
import org.junit.jupiter.api.Assertions;

/** Generalized Test-class for testing Generated Enum-classes */
public class GeneratedEnumTestUtils {

  public static void assertEnumNames(final GeneratedSource generatedSource) {
    for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
      final String enumName = generatedField.name();
      Assertions.assertTrue(
          Arrays.stream((Enum<?>[]) generatedSource.getClassUnderTest().getEnumConstants())
              .map(Enum::name)
              .anyMatch(enumName::equals));
    }
  }

  public static void assertEnumHasNumberOfConstants(final GeneratedSource generatedSource) {
    final GeneratedField<?>[] generatedFields = generatedSource.generatedFields();
    final Enum<?>[] enumConstants =
        (Enum<?>[]) generatedSource.getClassUnderTest().getEnumConstants();
    Assertions.assertEquals(generatedFields.length, enumConstants.length);
  }

  public static void assertEnumValues(final GeneratedSource generatedSource) {
    final Enum<?>[] enumConstants =
        (Enum<?>[]) generatedSource.getClassUnderTest().getEnumConstants();
    final GeneratedField<?>[] generatedFields = generatedSource.generatedFields();

    for (final GeneratedField<?> generatedField : generatedFields) {
      final String enumName = generatedField.name();
      final Object enumValue = generatedField.enumValue();

      final Optional<Enum<?>> enumConstant =
          Arrays.stream(enumConstants).filter(anEnum -> anEnum.name().equals(enumName)).findFirst();

      Assertions.assertTrue(
          enumConstant.isPresent(),
          "Enum-class '"
              + generatedSource.getClassUnderTest().getCanonicalName()
              + "' does not have an enum constant with the name: "
              + enumName);

      AssertionUtils.assertInstanceMethodReturns(enumConstant.get(), "getValue", enumValue);
    }
  }
}
