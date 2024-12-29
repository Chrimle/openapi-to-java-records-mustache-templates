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
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.function.Supplier;
import org.junit.jupiter.api.Assertions;

/** Collection of custom assertion methods for the purpose of re-use. */
public interface CustomAssertions {

  /**
   * Asserts that the {@code objectSupplier} returns an {@link Object} which is {@code null}.
   *
   * @param objectSupplier of the object to be asserted.
   * @param messageSupplier for the assertion message.
   * @param <T> the type of the object.
   */
  static <T> void assertNull(
      final Supplier<T> objectSupplier, final Supplier<String> messageSupplier) {
    Assertions.assertNull(objectSupplier.get(), messageSupplier);
  }

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

  /**
   * Asserts that the {@code aClass} is <b>not</b> annotated with the {@code annotation}.
   *
   * @param aClass to be asserted.
   * @param annotation which the {@code aClass} is expected <b>not</b> to be annotated with.
   */
  static void assertClassIsNotAnnotatedWith(
      final Class<?> aClass, final Class<? extends Annotation> annotation) {
    assertNull(
        () -> aClass.getAnnotation(annotation),
        () -> aClass.getCanonicalName() + " IS annotated with " + annotation.getCanonicalName());
  }

  /**
   * Asserts that the {@code aClass} <i>implements</i> the {@code interfaceClass}.
   *
   * @param aClass to be asserted.
   * @param interfaceClass which the {@code aClass} is expected to <i>implement</i>.
   */
  static void assertClassImplementsInterface(final Class<?> aClass, final Class<?> interfaceClass) {
    Assertions.assertTrue(
        () -> Arrays.asList(aClass.getInterfaces()).contains(interfaceClass),
        () ->
            aClass.getCanonicalName()
                + " does NOT implement the interface "
                + interfaceClass.getCanonicalName());
  }

  /**
   * Asserts that the {@code aClass} does <b>not</b> <i>implement</i> the {@code interfaceClass}.
   *
   * @param aClass to be asserted.
   * @param interfaceClass which the {@code aClass} is expected <b>not</b> to <i>implement</i>.
   */
  static void assertClassDoesNotImplementInterface(
      final Class<?> aClass, final Class<?> interfaceClass) {
    Assertions.assertFalse(
        () -> Arrays.asList(aClass.getInterfaces()).contains(interfaceClass),
        () ->
            aClass.getCanonicalName()
                + " DOES implement the interface "
                + interfaceClass.getCanonicalName());
  }

  /**
   * Asserts that the {@code aClass} has a field with the matching {@code fieldName}.
   *
   * @param aClass to be asserted.
   * @param fieldName of the field which {@code aClass} is expected to have.
   * @return the {@link Field} with the matching name.
   */
  static Field assertClassHasFieldWithName(final Class<?> aClass, final String fieldName) {
    return Assertions.assertDoesNotThrow(
        () -> aClass.getDeclaredField(fieldName),
        () -> aClass.getCanonicalName() + " does NOT have a field with name " + fieldName);
  }

  /**
   * Asserts that the {@code field} is annotated with the {@code annotation}.
   *
   * @param field to be asserted.
   * @param annotation which the {@code field} is expected to be annotated with.
   * @param <T> the type of the {@code annotation}.
   * @return the {@code annotation} instance from the {@code field}.
   */
  static <T extends Annotation> T assertFieldIsAnnotatedWith(
      final Field field, final Class<T> annotation) {
    return assertNotNull(
        () -> field.getAnnotation(annotation),
        () -> field + " is NOT annotated with " + annotation.getCanonicalName());
  }

  /**
   * Asserts that the {@code field} is <b>not</b> annotated with the {@code annotation}.
   *
   * @param field to be asserted.
   * @param annotation which the {@code field} is expected <b>not</b> to be annotated with.
   */
  static void assertFieldIsNotAnnotatedWith(
      final Field field, final Class<? extends Annotation> annotation) {
    assertNull(
        () -> field.getAnnotation(annotation),
        () -> field + " IS annotated with " + annotation.getCanonicalName());
  }
}
