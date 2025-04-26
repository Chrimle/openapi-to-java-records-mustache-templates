/*
  Copyright 2024-2025 Chrimle

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
package io.github.chrimle.o2jrm.utils;

import io.github.chrimle.o2jrm.GeneratedSource;
import io.github.chrimle.o2jrm.models.GeneratedField;
import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Assertions;

/** Generalized Test-class for testing Generated Record-classes */
public class GeneratedRecordTestUtils {

  /**
   * Asserts that the {@code record} can be instantiated with test values.
   *
   * @param generatedSource which contains the class to assert.
   * @return the instantiated object.
   * @since 2.9.0
   */
  public static Object assertInstantiatingRecordWithValuesSetsFieldsToProvidedValue(
      final GeneratedSource generatedSource) {
    final Class<?> classUnderTest = generatedSource.getClassUnderTest();
    final Class<?>[] fieldClasses = generatedSource.fieldClasses();
    final Constructor<?> constructor =
        CustomAssertions.assertClassHasConstructor(classUnderTest, fieldClasses);

    final Object objectWithNonNullFields =
        CustomAssertions.assertConstructorCanInstantiateObject(
            constructor,
            Arrays.stream(fieldClasses)
                .map(GeneratedRecordTestUtils::getClassSpecificTestingValue)
                .toArray());
    Assertions.assertInstanceOf(classUnderTest, objectWithNonNullFields);

    for (GeneratedField<?> generatedField : generatedSource.generatedFields()) {
      assertFieldHasTestingValueSet(generatedField, objectWithNonNullFields);
    }
    return objectWithNonNullFields;
  }

  public static void assertInstantiatingRecordWithNullSetsFieldsToNullOrDefaultValue(
      final GeneratedSource generatedSource) {
    final Class<?> classUnderTest = generatedSource.getClassUnderTest();
    final Class<?>[] fieldClasses = generatedSource.fieldClasses();
    final Constructor<?> constructor =
        CustomAssertions.assertClassHasConstructor(classUnderTest, fieldClasses);

    final Object objectWithNullFields =
        CustomAssertions.assertConstructorCanInstantiateObject(
            constructor, Arrays.stream(fieldClasses).map(x -> null).toArray());
    Assertions.assertInstanceOf(classUnderTest, objectWithNullFields);

    for (GeneratedField<?> generatedField : generatedSource.generatedFields()) {
      assertFieldHasEitherNullOrDefaultValueSet(generatedField, objectWithNullFields);
    }
  }

  private static <T> void assertFieldHasEitherNullOrDefaultValueSet(
      final GeneratedField<T> generatedField, final Object object) {
    CustomAssertions.assertInstanceMethodReturnsValue(
        CustomAssertions.assertClassHasMethod(object.getClass(), generatedField.name()),
        generatedField
            .defaultValue()
            .orElseGet(
                () ->
                    generatedField.isNullable()
                        ? null
                        : getClassSpecificDefaultValue(generatedField.type())),
        object);
  }

  private static <T> void assertFieldHasTestingValueSet(
      final GeneratedField<T> generatedField, final Object object) {
    CustomAssertions.assertInstanceMethodReturnsValue(
        CustomAssertions.assertClassHasMethod(object.getClass(), generatedField.name()),
        getClassSpecificTestingValue(generatedField.type()),
        object);
  }

  /**
   * Returns the default value for the given class, according to openapi-generator-maven-plugin.
   *
   * @param fieldClass to get the default value for
   * @return the default value
   * @param <T> type of the class
   */
  private static <T> T getClassSpecificDefaultValue(final Class<? extends T> fieldClass) {
    if (Arrays.class.equals(fieldClass)) {
      return fieldClass.cast(Collections.emptyList());
    }
    if (Set.class.equals(fieldClass)) {
      return fieldClass.cast(new LinkedHashSet<>());
    }
    if (List.class.equals(fieldClass)) {
      return fieldClass.cast(new ArrayList<>());
    }
    return null;
  }

  /**
   * Returns a testing value (pure) for the given class.
   *
   * @param fieldClass to get a testing value for
   * @return the testing value
   * @param <T> type of the class
   */
  private static <T> T getClassSpecificTestingValue(final Class<? extends T> fieldClass) {
    if (Boolean.class.equals(fieldClass)) {
      return fieldClass.cast(Boolean.TRUE);
    }
    if (String.class.equals(fieldClass)) {
      return fieldClass.cast("testString");
    }
    if (Integer.class.equals(fieldClass)) {
      return fieldClass.cast(42);
    }
    if (BigDecimal.class.equals(fieldClass)) {
      return fieldClass.cast(BigDecimal.valueOf(123.456));
    }
    if (List.class.equals(fieldClass)) {
      return fieldClass.cast(new ArrayList<>(List.of(Boolean.TRUE, Boolean.FALSE)));
    }
    if (Set.class.equals(fieldClass)) {
      return fieldClass.cast(new LinkedHashSet<>(List.of(Boolean.TRUE, Boolean.FALSE)));
    }
    return null;
  }
}
