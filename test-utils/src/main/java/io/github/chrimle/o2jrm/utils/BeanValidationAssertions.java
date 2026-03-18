package io.github.chrimle.o2jrm.utils;

import java.lang.annotation.Annotation;

public class BeanValidationAssertions {

  public static void assertPatternAnnotation(
      final Class<? extends Annotation> expectedAnnotationClass,
      final String expectedRegexp,
      final Annotation actualAnnotation) {
    final var regexpMethod =
        CustomAssertions.assertClassHasMethod(expectedAnnotationClass, "regexp");
    CustomAssertions.assertInstanceMethodReturnsValue(
        regexpMethod, expectedRegexp, actualAnnotation);
  }
}
