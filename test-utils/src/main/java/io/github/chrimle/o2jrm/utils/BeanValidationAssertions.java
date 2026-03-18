package io.github.chrimle.o2jrm.utils;

import java.lang.annotation.Annotation;

public class BeanValidationAssertions {

  private BeanValidationAssertions() {}

  public static void assertPatternAnnotation(
      final Class<? extends Annotation> expectedAnnotationClass,
      final String expectedRegexp,
      final Annotation actualAnnotation) {
    final var regexpMethod =
        CustomAssertions.assertClassHasMethod(expectedAnnotationClass, "regexp");
    CustomAssertions.assertInstanceMethodReturnsValue(
        regexpMethod, expectedRegexp, actualAnnotation);
  }

  public static void assertSizeAnnotation(
      final Class<? extends Annotation> expectedAnnotationClass,
      final int expectedMin,
      final int expectedMax,
      final Annotation actualAnnotation) {
    // Assert Min
    final var minMethod = CustomAssertions.assertClassHasMethod(expectedAnnotationClass, "min");
    CustomAssertions.assertInstanceMethodReturnsValue(minMethod, expectedMin, actualAnnotation);
    // Assert Max
    final var maxMethod = CustomAssertions.assertClassHasMethod(expectedAnnotationClass, "max");
    CustomAssertions.assertInstanceMethodReturnsValue(maxMethod, expectedMax, actualAnnotation);
  }

  public static void assertMinAnnotation(
      final Class<? extends Annotation> expectedAnnotationClass,
      final long expectedMin,
      final Annotation actualAnnotation) {
    final var minMethod = CustomAssertions.assertClassHasMethod(expectedAnnotationClass, "value");
    CustomAssertions.assertInstanceMethodReturnsValue(minMethod, expectedMin, actualAnnotation);
  }

  public static void assertMaxAnnotation(
      final Class<? extends Annotation> expectedAnnotationClass,
      final long expectedMax,
      final Annotation actualAnnotation) {
    final var maxMethod = CustomAssertions.assertClassHasMethod(expectedAnnotationClass, "value");
    CustomAssertions.assertInstanceMethodReturnsValue(maxMethod, expectedMax, actualAnnotation);
  }

  public static void assertDecimalMinAnnotation(
      final Class<? extends Annotation> expectedAnnotationClass,
      final String expectedMin,
      final Annotation actualAnnotation) {
    final var minMethod = CustomAssertions.assertClassHasMethod(expectedAnnotationClass, "value");
    CustomAssertions.assertInstanceMethodReturnsValue(minMethod, expectedMin, actualAnnotation);
  }
}
