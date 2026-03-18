/*
  Copyright 2024-2026 Chrimle

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
import io.github.chrimle.o2jrm.models.BeanValidationAnnotation;
import io.github.chrimle.o2jrm.models.GeneratedField;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import org.junit.jupiter.api.Assertions;

public class AssertionUtilsImpl {

  public static void assertRecordHasFieldsOfTypeWithNullableAnnotations(
      final GeneratedSource generatedSource) {

    for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
      final Field field =
          CustomAssertions.assertClassHasField(
              generatedSource.getClassUnderTest(), generatedField.name(), generatedField.type());

      final Class<? extends Annotation> validAnnotation =
          generatedSource.getBeanValidationAnnotations().get(BeanValidationAnnotation.VALID);
      if (generatedField.isCustomClass()) {
        CustomAssertions.assertFieldIsAnnotatedWith(field, validAnnotation);
      } else {
        CustomAssertions.assertFieldIsNotAnnotatedWith(field, validAnnotation);
      }
      final Class<? extends Annotation> notNullAnnotation =
          generatedSource.getBeanValidationAnnotations().get(BeanValidationAnnotation.NOT_NULL);
      if (generatedField.isBeanValidationNullable()) {
        CustomAssertions.assertFieldIsNotAnnotatedWith(field, notNullAnnotation);
      } else {
        CustomAssertions.assertFieldIsAnnotatedWith(field, notNullAnnotation);
      }
      final Class<? extends Annotation> patternAnnotation =
          generatedSource.getBeanValidationAnnotations().get(BeanValidationAnnotation.PATTERN);
      if (generatedField.pattern().isPresent()) {
        final var actualPatternAnnotation =
            CustomAssertions.assertFieldIsAnnotatedWith(field, patternAnnotation);
        BeanValidationAssertions.assertPatternAnnotation(
            patternAnnotation, generatedField.pattern().get(), actualPatternAnnotation);
      } else {
        CustomAssertions.assertFieldIsNotAnnotatedWith(field, patternAnnotation);
      }
      final Class<? extends Annotation> sizeAnnotation =
          generatedSource.getBeanValidationAnnotations().get(BeanValidationAnnotation.SIZE);
      if (generatedField.minLength().isPresent() || generatedField.maxLength().isPresent()) {
        final var actualSizeAnnotation =
            CustomAssertions.assertFieldIsAnnotatedWith(field, sizeAnnotation);
        BeanValidationAssertions.assertSizeAnnotation(
            sizeAnnotation,
            generatedField.minLength().orElse(0),
            generatedField.maxLength().orElse(Integer.MAX_VALUE),
            actualSizeAnnotation);
      } else if (generatedField.minItems().isPresent() || generatedField.maxItems().isPresent()) {
        final var actualSizeAnnotation =
            CustomAssertions.assertFieldIsAnnotatedWith(field, sizeAnnotation);
        BeanValidationAssertions.assertSizeAnnotation(
            sizeAnnotation,
            generatedField.minItems().orElse(0),
            generatedField.maxItems().orElse(Integer.MAX_VALUE),
            actualSizeAnnotation);
      } else {
        CustomAssertions.assertFieldIsNotAnnotatedWith(field, sizeAnnotation);
      }
      final Class<Min> minAnnotation = Min.class;
      if (generatedField.minimum().isPresent()) {
        final Min min = CustomAssertions.assertFieldIsAnnotatedWith(field, minAnnotation);
        Assertions.assertEquals(generatedField.minimum().get(), min.value());
      } else {
        CustomAssertions.assertFieldIsNotAnnotatedWith(field, minAnnotation);
      }
      final Class<Max> maxAnnotation = Max.class;
      if (generatedField.maximum().isPresent()) {
        final Max max = CustomAssertions.assertFieldIsAnnotatedWith(field, maxAnnotation);
        Assertions.assertEquals(generatedField.maximum().get(), max.value());
      } else {
        CustomAssertions.assertFieldIsNotAnnotatedWith(field, maxAnnotation);
      }
      final Class<DecimalMin> decimalMinAnnotation = DecimalMin.class;
      if (generatedField.decimalMin().isPresent()) {
        final DecimalMin decimalMin =
            CustomAssertions.assertFieldIsAnnotatedWith(field, decimalMinAnnotation);
        Assertions.assertEquals(generatedField.decimalMin().get(), decimalMin.value());
      } else {
        CustomAssertions.assertFieldIsNotAnnotatedWith(field, decimalMinAnnotation);
      }
      final Class<DecimalMax> decimalMaxAnnotation = DecimalMax.class;
      if (generatedField.decimalMax().isPresent()) {
        final DecimalMax decimalMax =
            CustomAssertions.assertFieldIsAnnotatedWith(field, decimalMaxAnnotation);
        Assertions.assertEquals(generatedField.decimalMax().get(), decimalMax.value());
      } else {
        CustomAssertions.assertFieldIsNotAnnotatedWith(field, decimalMaxAnnotation);
      }
      final Class<Email> emailAnnotation = Email.class;
      if (generatedField.isEmail()) {
        CustomAssertions.assertFieldIsAnnotatedWith(field, emailAnnotation);
      } else {
        CustomAssertions.assertFieldIsNotAnnotatedWith(field, emailAnnotation);
      }
    }
  }
}
