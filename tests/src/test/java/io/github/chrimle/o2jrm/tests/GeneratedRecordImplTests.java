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
package io.github.chrimle.o2jrm.tests;

import io.github.chrimle.o2jrm.GeneratedSource;
import io.github.chrimle.o2jrm.PluginExecutionImpl;
import io.github.chrimle.o2jrm.models.GeneratedClass;
import io.github.chrimle.o2jrm.models.GeneratedClassImpl;
import io.github.chrimle.o2jrm.models.GeneratedField;
import io.github.chrimle.o2jrm.models.GeneratedRecordImpl;
import io.github.chrimle.o2jrm.utils.AssertionUtilsImpl;
import io.github.chrimle.o2jrm.utils.CustomAssertions;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Stream;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Testing Generated `record` classes")
final class GeneratedRecordImplTests extends GeneratedRecordTests {

  /**
   * Generates a {@link GeneratedSource} for every possible combination of {@link
   * PluginExecutionImpl} and {@link GeneratedRecordImpl}.
   *
   * @return a stream of {@code GeneratedSource}s.
   */
  @SuppressWarnings("unused")
  static Stream<Arguments> allPluginExecutionsAndGeneratedRecordCombinations() {
    return Stream.of(PluginExecutionImpl.values())
        .flatMap(
            pluginExecution ->
                Stream.of(GeneratedRecordImpl.values())
                    .map(
                        generatedRecord ->
                            new GeneratedSource(
                                pluginExecution,
                                generatedRecord,
                                GeneratedClassImpl.getGeneratedFields(
                                    generatedRecord, pluginExecution),
                                GeneratedClass.getClass(generatedRecord, pluginExecution))))
        .map(Arguments::of);
  }

  @Nested
  @DisplayName("Testing OpenAPI Schemas & Properties")
  class OpenAPITests extends GeneratedRecordTests.OpenAPITests {

    @Nested
    @DisplayName("Testing `components.schemas.{schema}`")
    class SchemaTests extends GeneratedRecordTests.OpenAPITests.SchemaTests {

      @Nested
      @DisplayName("Testing `components.schemas.{schema}.properties`")
      class PropertiesTests extends GeneratedRecordTests.OpenAPITests.SchemaTests.PropertiesTests {

        @Nested
        @DisplayName("Testing `components.schemas.{schema}.properties.{property}`")
        class PropertyTests
            extends GeneratedRecordTests.OpenAPITests.SchemaTests.PropertiesTests.PropertyTests {

          @Nested
          @DisplayName("Testing `{schema}.properties.{property}.nullable`")
          class NullableTests
              extends GeneratedRecordTests.OpenAPITests.SchemaTests.PropertiesTests.PropertyTests
                  .NullableTests {

            @Override
            Class<? extends Annotation> getNullableAnnotation() {
              return javax.annotation.Nullable.class;
            }

            @Override
            Class<? extends Annotation> getNonnullAnnotation() {
              return javax.annotation.Nonnull.class;
            }
          }
        }
      }
    }
  }

  @Nested
  @DisplayName("Testing `openapi-generator` Configurations & ConfigOptions")
  class GeneratorConfigurationTests extends GeneratedRecordTests.GeneratorConfigurationTests {

    @Nested
    @DisplayName("Testing `<configOptions>`")
    class ConfigOptionsTests
        extends GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests {

      @Nested
      @DisplayName("Testing `<useJakartaEe>`")
      class UseJakartaEeTests
          extends GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests
              .UseJakartaEeTests {

        @Nested
        @DisplayName("Testing `<useJakartaEe>false</useJakartaEe>`")
        class UseJakartaEeFalseTests
            extends GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests
                .UseJakartaEeTests.UseJakartaEeFalseTests {

          @Override
          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Fields of generated `record` are NOT annotated with Jakarta `@Nullable` or `@Nonnull`")
          void whenUseJakartaEeIsFalseThenJakartaAnnotationsAreNotUsedForNullableAndNonnull(
              final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.useJakartaEe());

            for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
              final Field field =
                  CustomAssertions.assertClassHasField(
                      generatedSource.getClassUnderTest(),
                      generatedField.name(),
                      generatedField.type());

              CustomAssertions.assertFieldIsNotAnnotatedWith(
                  field, jakarta.annotation.Nullable.class);
              CustomAssertions.assertFieldIsNotAnnotatedWith(
                  field, jakarta.annotation.Nonnull.class);
            }
          }
        }

        @Nested
        @DisplayName("Testing `<useJakartaEe>true</useJakartaEe>`")
        class UseJakartaEeTrueTests
            extends GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests
                .UseJakartaEeTests.UseJakartaEeTrueTests {

          @Override
          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Fields of generated `record` are annotated with Jakarta `@Nullable` or `@Nonnull`")
          void whenUseJakartaEeIsTrueThenJakartaAnnotationsAreUsedForNullableAndNonnull(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.useJakartaEe());

            for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
              final Field field =
                  CustomAssertions.assertClassHasField(
                      generatedSource.getClassUnderTest(),
                      generatedField.name(),
                      generatedField.type());

              final Class<? extends Annotation> expectedAnnotation =
                  generatedField.isNullable()
                      ? jakarta.annotation.Nullable.class
                      : jakarta.annotation.Nonnull.class;

              final Class<? extends Annotation> unexpectedAnnotation =
                  generatedField.isNullable()
                      ? jakarta.annotation.Nonnull.class
                      : jakarta.annotation.Nullable.class;

              CustomAssertions.assertFieldIsAnnotatedWith(field, expectedAnnotation);
              CustomAssertions.assertFieldIsNotAnnotatedWith(field, unexpectedAnnotation);
            }
          }

          @Override
          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Fields of generated `record` are NOT annotated with JavaX `@Nullable` or `@Nonnull`")
          void whenUseJakartaEeIsTrueThenJavaXAnnotationsAreNotUsedForNullableAndNonnull(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.useJakartaEe());

            for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
              final Field field =
                  CustomAssertions.assertClassHasField(
                      generatedSource.getClassUnderTest(),
                      generatedField.name(),
                      generatedField.type());

              CustomAssertions.assertFieldIsNotAnnotatedWith(
                  field, javax.annotation.Nullable.class);
              CustomAssertions.assertFieldIsNotAnnotatedWith(field, javax.annotation.Nonnull.class);
            }
          }
        }
      }

      @Nested
      @DisplayName("Testing `<useBeanValidation>`")
      class UseBeanValidationTests
          extends GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests
              .UseBeanValidationTests {

        @Nested
        @DisplayName("Testing `<useBeanValidation>false</useBeanValidation>`")
        class UseBeanValidationFalseTests
            extends GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests
                .UseBeanValidationTests.UseBeanValidationFalseTests {

          @Override
          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Generated `record` does NOT use Jakarta Bean Validation annotations on fields")
          void
              whenUseBeanValidationIsFalseThenFieldsAreNotAnnotatedWithJakartaBeanValidationAnnotations(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.useBeanValidation());

            for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
              final Field field =
                  CustomAssertions.assertClassHasField(
                      generatedSource.getClassUnderTest(),
                      generatedField.name(),
                      generatedField.type());

              for (final Class<? extends Annotation> annotation :
                  List.of(
                      javax.validation.Valid.class,
                      javax.validation.constraints.NotNull.class,
                      javax.validation.constraints.Pattern.class,
                      javax.validation.constraints.Size.class,
                      javax.validation.constraints.Min.class,
                      javax.validation.constraints.Max.class,
                      javax.validation.constraints.DecimalMin.class,
                      javax.validation.constraints.DecimalMax.class,
                      javax.validation.constraints.Email.class)) {
                CustomAssertions.assertFieldIsNotAnnotatedWith(field, annotation);
              }
            }
          }
        }

        @Nested
        @DisplayName("Testing `<useBeanValidation>true</useBeanValidation>`")
        class UseBeanValidationTrueTests
            extends GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests
                .UseBeanValidationTests.UseBeanValidationTrueTests {

          @Override
          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `record` use Jakarta Bean Validation annotations on fields")
          void
              whenUseBeanValidationIsTrueThenFieldsAreAnnotatedWithJakartaBeanValidationAnnotations(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.useBeanValidation());
            AssertionUtilsImpl.assertRecordHasFieldsOfTypeWithNullableAnnotations(generatedSource);
          }
        }
      }
    }
  }
}
