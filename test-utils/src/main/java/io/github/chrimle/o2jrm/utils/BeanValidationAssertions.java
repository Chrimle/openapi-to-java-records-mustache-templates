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
