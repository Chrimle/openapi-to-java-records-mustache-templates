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
import jakarta.validation.Valid;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.lang.reflect.*;
import org.junit.jupiter.api.Assertions;

public class AssertionUtils {

  public static void assertRecordHasFieldsOfTypeWithNullableAnnotations(
      final GeneratedSource generatedSource) {

    for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
      final Field field =
          CustomAssertions.assertClassHasField(
              generatedSource.getClassUnderTest(), generatedField.name(), generatedField.type());

      final Class<Valid> validAnnotation = Valid.class;
      if (generatedField.isCustomClass()) {
        CustomAssertions.assertFieldIsAnnotatedWith(field, validAnnotation);
      } else {
        CustomAssertions.assertFieldIsNotAnnotatedWith(field, validAnnotation);
      }
      final Class<NotNull> notNullAnnotation = NotNull.class;
      if (generatedField.isBeanValidationNullable()) {
        CustomAssertions.assertFieldIsNotAnnotatedWith(field, notNullAnnotation);
      } else {
        CustomAssertions.assertFieldIsAnnotatedWith(field, notNullAnnotation);
      }
      final Class<Pattern> patternAnnotation = Pattern.class;
      if (generatedField.pattern().isPresent()) {
        final Pattern actualPatternAnnotation =
            CustomAssertions.assertFieldIsAnnotatedWith(field, patternAnnotation);
        Assertions.assertEquals(generatedField.pattern().get(), actualPatternAnnotation.regexp());
      } else {
        CustomAssertions.assertFieldIsNotAnnotatedWith(field, patternAnnotation);
      }
      final Class<Size> sizeAnnotation = Size.class;
      if (generatedField.minLength().isPresent() || generatedField.maxLength().isPresent()) {
        final Size actualSizeAnnotation =
            CustomAssertions.assertFieldIsAnnotatedWith(field, sizeAnnotation);
        Assertions.assertEquals(generatedField.minLength().orElse(0), actualSizeAnnotation.min());
        Assertions.assertEquals(
            generatedField.maxLength().orElse(Integer.MAX_VALUE), actualSizeAnnotation.max());
      } else if (generatedField.minItems().isPresent() || generatedField.maxItems().isPresent()) {
        final Size actualSizeAnnotation =
            CustomAssertions.assertFieldIsAnnotatedWith(field, sizeAnnotation);
        Assertions.assertEquals(generatedField.minItems().orElse(0), actualSizeAnnotation.min());
        Assertions.assertEquals(
            generatedField.maxItems().orElse(Integer.MAX_VALUE), actualSizeAnnotation.max());
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

  public static void assertInnerBuilderClassExistsAndCanBuildRecord(
      final GeneratedSource generatedSource) {
    // Assert Builder can be instantiated from builder()-method
    final Object builderObject =
        CustomAssertions.assertStaticMethodReturnsNonNull(
            CustomAssertions.assertClassHasMethod(generatedSource.getClassUnderTest(), "builder"));
    for (GeneratedField<?> generatedField : generatedSource.generatedFields()) {
      CustomAssertions.assertInstanceMethodReturnsValue(
          CustomAssertions.assertClassHasMethod(
              builderObject.getClass(), generatedField.name(), generatedField.type()),
          builderObject,
          builderObject,
          (Object) null);
    }
    Assertions.assertInstanceOf(
        generatedSource.getClassUnderTest(),
        CustomAssertions.assertInstanceMethodReturnsNonNull(
            CustomAssertions.assertClassHasMethod(builderObject.getClass(), "build"),
            builderObject));
  }
}
