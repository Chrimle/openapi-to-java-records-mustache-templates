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

import java.lang.annotation.Annotation;
import java.util.function.Supplier;
import org.junit.jupiter.api.Assertions;

/** Collection of custom assertion methods for the purpose of re-use. */
public interface CustomAssertions {

  /**
   * Asserts that the {@code object} is not {@code null}.
   *
   * @param object to be asserted.
   * @param messageSupplier for the assertion message.
   * @param <T> type of the {@code object}.
   * @return the {@code object} if it is not {@code null}.
   */
  static <T> T assertNotNull(final T object, final Supplier<String> messageSupplier) {
    Assertions.assertNotNull(object, messageSupplier);
    return object;
  }

  /**
   * Asserts that the {@code objectSupplier} returns an {@link Object} which is not {@code null}.
   *
   * @param objectSupplier of the object to be asserted.
   * @param messageSupplier for the assertion message.
   * @param <T> the type of the object.
   * @return the object if it is not {@code null}.
   */
  static <T> T assertNotNull(
      final Supplier<T> objectSupplier, final Supplier<String> messageSupplier) {
    return assertNotNull(objectSupplier.get(), messageSupplier);
  }

  /**
   * Asserts that the {@code aClass} is a <i>record</i> class.
   *
   * @param aClass to be asserted.
   */
  static void assertClassIsRecordClass(final Class<?> aClass) {
    Assertions.assertTrue(aClass::isRecord, () -> aClass + " is NOT a record class");
  }

  /**
   * Asserts that the {@code aClass} is an <i>enum</i> class.
   *
   * @param aClass to be asserted.
   */
  static void assertClassIsEnumClass(final Class<?> aClass) {
    Assertions.assertTrue(aClass::isEnum, () -> aClass + " is NOT an enum class");
  }

  /**
   * Asserts that the {@code aClass} is annotated with the {@code annotation}.
   *
   * @param aClass to be asserted.
   * @param annotation which the {@code aClass} is expected to be annotated with.
   * @param <T> the type of the {@code annotation}.
   * @return the {@code annotation} instance from the {@code aClass}.
   */
  static <T extends Annotation> T assertClassIsAnnotatedWith(
      final Class<?> aClass, final Class<T> annotation) {
    return assertNotNull(
        () -> aClass.getAnnotation(annotation),
        () ->
            aClass.getCanonicalName() + " is NOT annotated with " + annotation.getCanonicalName());
  }
}