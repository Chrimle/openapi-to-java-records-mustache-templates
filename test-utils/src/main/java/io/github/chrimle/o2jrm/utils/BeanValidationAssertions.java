/*
 *   Copyright 2024-2026 Chrimle
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package io.github.chrimle.o2jrm.utils;

import java.lang.annotation.Annotation;

public class BeanValidationAssertions {

  private BeanValidationAssertions() {}

  public static void assertPatternAnnotation(
      final Class<? extends Annotation> expectedAnnotationClass,
      final String expectedRegexp,
      final Annotation actualAnnotation) {
    assertAnnotationAndValue(expectedAnnotationClass, expectedRegexp, actualAnnotation, "regexp");
  }

  public static void assertSizeAnnotation(
      final Class<? extends Annotation> expectedAnnotationClass,
      final int expectedMin,
      final int expectedMax,
      final Annotation actualAnnotation) {
    // Assert Min
    assertAnnotationAndValue(expectedAnnotationClass, expectedMin, actualAnnotation, "min");
    // Assert Max
    assertAnnotationAndValue(expectedAnnotationClass, expectedMax, actualAnnotation, "max");
  }

  public static void assertMinAnnotation(
      final Class<? extends Annotation> expectedAnnotationClass,
      final long expectedMin,
      final Annotation actualAnnotation) {
    assertAnnotationAndValue(expectedAnnotationClass, expectedMin, actualAnnotation, "value");
  }

  public static void assertMaxAnnotation(
      final Class<? extends Annotation> expectedAnnotationClass,
      final long expectedMax,
      final Annotation actualAnnotation) {
    assertAnnotationAndValue(expectedAnnotationClass, expectedMax, actualAnnotation, "value");
  }

  public static void assertDecimalMinAnnotation(
      final Class<? extends Annotation> expectedAnnotationClass,
      final String expectedMin,
      final Annotation actualAnnotation) {
    assertAnnotationAndValue(expectedAnnotationClass, expectedMin, actualAnnotation, "value");
  }

  public static void assertDecimalMaxAnnotation(
      final Class<? extends Annotation> expectedAnnotationClass,
      final String expectedMax,
      final Annotation actualAnnotation) {
    assertAnnotationAndValue(expectedAnnotationClass, expectedMax, actualAnnotation, "value");
  }

  private static void assertAnnotationAndValue(
      final Class<? extends Annotation> expectedAnnotationClass,
      final Object expected,
      final Annotation actualAnnotation,
      final String propertyName) {
    final var method = CustomAssertions.assertClassHasMethod(expectedAnnotationClass, propertyName);
    CustomAssertions.assertInstanceMethodReturnsValue(method, expected, actualAnnotation);
  }
}
