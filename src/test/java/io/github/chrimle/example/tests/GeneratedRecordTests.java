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
package io.github.chrimle.example.tests;

import io.github.chrimle.example.GeneratedSource;
import io.github.chrimle.example.annotations.*;
import io.github.chrimle.example.models.GeneratedField;
import io.github.chrimle.example.tests.GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests;
import io.github.chrimle.example.tests.GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests.AdditionalModelTypeAnnotationsTests;
import io.github.chrimle.example.tests.GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests.GenerateBuildersTests;
import io.github.chrimle.example.tests.GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests.SerializableModelTests;
import io.github.chrimle.example.tests.GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests.UseJakartaEeTests;
import io.github.chrimle.example.tests.GeneratedRecordTests.OpenAPITests.SchemaTests;
import io.github.chrimle.example.tests.GeneratedRecordTests.OpenAPITests.SchemaTests.DeprecatedTests;
import io.github.chrimle.example.tests.GeneratedRecordTests.OpenAPITests.SchemaTests.PropertiesTests;
import io.github.chrimle.example.tests.GeneratedRecordTests.OpenAPITests.SchemaTests.PropertiesTests.PropertyTests;
import io.github.chrimle.example.tests.GeneratedRecordTests.OpenAPITests.SchemaTests.PropertiesTests.PropertyTests.DefaultTests;
import io.github.chrimle.example.tests.GeneratedRecordTests.OpenAPITests.SchemaTests.PropertiesTests.PropertyTests.NullableTests;
import io.github.chrimle.example.tests.GeneratedRecordTests.OpenAPITests.SchemaTests.TypeTests;
import io.github.chrimle.example.tests.GeneratedRecordTests.OpenAPITests.SchemaTests.XClassExtraAnnotationTests;
import io.github.chrimle.example.utils.AssertionUtils;
import io.github.chrimle.example.utils.GeneratedRecordTestUtils;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Tests for <b>all</b> generated {@code record} classes. Tests are grouped by the <i>method of
 * configuring</i> the resulting {@code record}.
 *
 * <p>
 *
 * <h2>Table of Contents</h2>
 *
 * <i>All tests are categorized and grouped accordingly, using {@link Nested} classes. This is the
 * complete list of tested <i>properties</i> and <i>configurations</i>.<br>
 *
 * <p><b>OpenAPI Specification</b>
 *
 * <p>{@link OpenAPITests}
 *
 * <ul>
 *   <li>{@link SchemaTests `components.schemas.{schema}`}
 *   <li>{@link TypeTests `components.schemas.{schema}.type`}
 *   <li>{@link DeprecatedTests `components.schemas.{schema}.deprecated`}
 *   <li>{@link XClassExtraAnnotationTests `components.schemas.{schema}.x-class-extra-annotation`}
 *   <li>{@link PropertiesTests `components.schemas.{schema}.properties`}
 *   <li>{@link PropertyTests `components.schemas.{schema}.properties.{property}`}
 *   <li>{@link NullableTests `components.schemas.{schema}.properties.{property}.nullable`}
 *   <li>{@link DefaultTests `components.schemas.{schema}.properties.{property}.default`}
 * </ul>
 *
 * <p><b>`openapi-generator` Configurations</b>
 *
 * <p>{@link GeneratorConfigurationTests}
 *
 * <ul>
 *   <li>{@link ConfigOptionsTests configOptions}
 *   <li>{@link AdditionalModelTypeAnnotationsTests additionalModelTypeAnnotations}
 *   <li>{@link SerializableModelTests serializableModel}
 *   <li>{@link GenerateBuildersTests generateBuilders}
 *   <li>{@link UseJakartaEeTests useJakartaEe}
 * </ul>
 */
final class GeneratedRecordTests implements GeneratedClassTests {

  @Nested
  @DisplayName("Testing OpenAPI Schemas & Properties")
  class OpenAPITests {

    @Nested
    @DisplayName("Testing `components.schemas.{schema}`")
    class SchemaTests {

      @Nested
      @DisplayName("Testing `components.schemas.{schema}.type`")
      class TypeTests {

        @ParameterizedTest
        @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
        @DisplayName("OpenAPI `{schema}.type: object` -> Generates a `record` class")
        public void whenIsObjectThenGeneratedClassIsRecordClass(
            final GeneratedSource generatedSource) {
          AssertionUtils.assertIsRecord(generatedSource.getClassUnderTest());
        }
      }

      @Nested
      @DisplayName("Testing `components.schemas.{schema}.deprecated`")
      class DeprecatedTests {

        @Nested
        @DisplayName("Testing `components.schemas.{schema}.deprecated: false`")
        class DeprecatedFalseTests {
          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `record` is NOT annotated with `@Deprecated`")
          public void whenRecordIsNotDeprecatedThenGeneratedRecordClassIsNotAnnotatedDeprecated(
              final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.isDeprecated());

            AssertionUtils.assertClassIsNotAnnotatedWith(
                generatedSource.getClassUnderTest(), Deprecated.class);
          }
        }

        @Nested
        @DisplayName("Testing `components.schemas.{schema}.deprecated: true`")
        class DeprecatedTrueTests {
          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `record` is annotated with `@Deprecated`")
          public void whenRecordIsDeprecatedThenGeneratedRecordClassIsAnnotatedDeprecated(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.isDeprecated());

            AssertionUtils.assertClassIsAnnotatedWith(
                generatedSource.getClassUnderTest(), Deprecated.class);
          }
        }
      }

      @Nested
      @DisplayName("Testing `components.schemas.{schema}.x-class-extra-annotation`")
      class XClassExtraAnnotationTests {

        @Nested
        @DisplayName("Testing `components.schemas.{schema}.x-class-extra-annotation: <null>`")
        class XClassExtraAnnotationUnsetTests {
          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `record` has no extra annotations")
          public void whenExtraClassAnnotationsIsNotSetThenGeneratedRecordHasNoExtraAnnotations(
              final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.hasExtraAnnotations());

            AssertionUtils.assertClassIsNotAnnotatedWith(
                generatedSource.getClassUnderTest(), TestExtraAnnotation.class);
            AssertionUtils.assertClassIsNotAnnotatedWith(
                generatedSource.getClassUnderTest(), TestExtraAnnotationTwo.class);
          }
        }

        @Nested
        @DisplayName("Testing `components.schemas.{schema}.x-class-extra-annotation: <not-null>`")
        class XClassExtraAnnotationSetTests {
          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `record` has extra annotations")
          public void whenExtraClassAnnotationsIsNotSetThenGeneratedRecordHasNoExtraAnnotations(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.hasExtraAnnotations());

            for (final Class<? extends Annotation> annotation :
                generatedSource.getExtraAnnotations()) {
              AssertionUtils.assertClassIsAnnotatedWith(
                  generatedSource.getClassUnderTest(), annotation);
            }
          }
        }
      }

      @Nested
      @DisplayName("Testing `components.schemas.{schema}.properties`")
      class PropertiesTests {

        @ParameterizedTest
        @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
        @DisplayName("Generates a constructor with properties as method arguments")
        public void whenObjectHasPropertiesThenGeneratedConstructorHasMethodArguments(
            final GeneratedSource generatedSource) {
          AssertionUtils.assertRecordHasConstructor(
              generatedSource.getClassUnderTest(), generatedSource.fieldClasses());
        }

        @ParameterizedTest
        @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
        @DisplayName("Generated `record` has same number of fields as OpenAPI properties")
        public void whenObjectHasPropertiesThenGeneratedRecordHasSameNumberOfFields(
            final GeneratedSource generatedSource) {
          Assumptions.assumeFalse(generatedSource.serializableModel());

          AssertionUtils.assertRecordHasExpectedNumberOfFields(
              generatedSource.getClassUnderTest(), generatedSource.generatedFields().length);
        }

        @ParameterizedTest
        @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
        @DisplayName("Generated `record` has fields with same name and type as OpenAPI properties")
        public void whenObjectHasPropertiesThenGeneratedRecordHasFieldsWithSameNameAndType(
            final GeneratedSource generatedSource) {
          for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
            AssertionUtils.assertRecordHasField(
                generatedSource.getClassUnderTest(), generatedField.name(), generatedField.type());
          }
        }

        @ParameterizedTest
        @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
        @DisplayName("Instantiating the `record` will set fields to provided values")
        public void whenObjectHasPropertiesThenFieldIsSetToProvidedValueWhenInstantiatingRecord(
            final GeneratedSource generatedSource) {
          GeneratedRecordTestUtils.assertInstantiatingRecordWithValuesSetsFieldsToProvidedValue(
              generatedSource);
        }

        @Nested
        @DisplayName("Testing `components.schemas.{schema}.properties.{property}`")
        class PropertyTests {

          @Nested
          @DisplayName("Testing `{schema}.properties.{property}.default`")
          class DefaultTests {
            @ParameterizedTest
            @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
            @DisplayName(
                "Instantiating the `record` with `null` will set fields to `null` or `default`")
            public void
                whenPropertyHasDefaultSetThenFieldIsSetToDefaultValueWhenInstantiatingWithNull(
                    final GeneratedSource generatedSource) {
              GeneratedRecordTestUtils
                  .assertInstantiatingRecordWithNullSetsFieldsToNullOrDefaultValue(generatedSource);
            }
          }

          @Nested
          @DisplayName("Testing `{schema}.properties.{property}.nullable`")
          class NullableTests {

            @ParameterizedTest
            @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
            @DisplayName(
                "Fields of generated `record` are annotated with `@Nullable` or `@Nonnull`")
            public void whenPropertyHasNullableSetThenFieldIsAnnotatedWithNullableOrNonnull(
                final GeneratedSource generatedSource) {
              Assumptions.assumeFalse(generatedSource.useJakartaEe());

              for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
                final Field field =
                    AssertionUtils.assertRecordHasField(
                        generatedSource.getClassUnderTest(),
                        generatedField.name(),
                        generatedField.type());

                final Class<? extends Annotation> expectedAnnotation =
                    generatedField.isNullable()
                        ? javax.annotation.Nullable.class
                        : javax.annotation.Nonnull.class;

                final Class<? extends Annotation> unexpectedAnnotation =
                    generatedField.isNullable()
                        ? javax.annotation.Nonnull.class
                        : javax.annotation.Nullable.class;

                AssertionUtils.assertHasAnnotation(
                    generatedSource.getClassUnderTest(), field, expectedAnnotation);
                AssertionUtils.assertDoesNotHaveAnnotation(
                    generatedSource.getClassUnderTest(), field, unexpectedAnnotation);
              }
            }
          }

          @Nested
          @DisplayName("Testing `{schema}.properties.{property}.x-field-extra-annotation`")
          class XFieldExtraAnnotationTests {

            @Nested
            @DisplayName(
                "Testing `{schema}.properties.{property}.x-field-extra-annotation: <null>`")
            class XFieldExtraAnnotationUnsetTests {

              @ParameterizedTest
              @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
              @DisplayName(
                  "Generated `field` is NOT annotated with extra field extraFieldAnnotations`")
              public void
                  whenXFieldExtraAnnotationIsUnsetThenFieldIsNotAnnotatedWithExtraFieldAnnotation(
                      final GeneratedSource generatedSource) {
                for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
                  final Field field =
                      AssertionUtils.assertRecordHasField(
                          generatedSource.getClassUnderTest(),
                          generatedField.name(),
                          generatedField.type());
                  if (generatedField.extraFieldAnnotations().isEmpty()) {
                    AssertionUtils.assertDoesNotHaveAnnotation(
                        generatedSource.getClassUnderTest(),
                        field,
                        TestFieldExtraAnnotationOne.class);
                    AssertionUtils.assertDoesNotHaveAnnotation(
                        generatedSource.getClassUnderTest(),
                        field,
                        TestFieldExtraAnnotationTwo.class);
                  }
                }
              }
            }

            @Nested
            @DisplayName(
                "Testing `{schema}.properties.{property}.x-field-extra-annotation: @TestFieldExtraAnnotationOne, @TestFieldExtraAnnotationTwo`")
            class XFieldExtraAnnotationSetTests {

              @ParameterizedTest
              @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
              @DisplayName("Generated `field` is annotated with extra field extraFieldAnnotations`")
              public void
                  whenXFieldExtraAnnotationIsSetThenFieldIsAnnotatedWithExtraFieldAnnotation(
                      final GeneratedSource generatedSource) {
                for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
                  final Field field =
                      AssertionUtils.assertRecordHasField(
                          generatedSource.getClassUnderTest(),
                          generatedField.name(),
                          generatedField.type());
                  if (!generatedField.extraFieldAnnotations().isEmpty()) {
                    for (final Class<? extends Annotation> expectedAnnotation :
                        generatedField.extraFieldAnnotations()) {
                      AssertionUtils.assertHasAnnotation(
                          generatedSource.getClassUnderTest(), field, expectedAnnotation);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  @Nested
  @DisplayName("Testing `openapi-generator` Configurations & ConfigOptions")
  class GeneratorConfigurationTests {

    @Nested
    @DisplayName("Testing `<configOptions>`")
    class ConfigOptionsTests {

      @Nested
      @DisplayName("Testing `<additionalModelTypeAnnotations>`")
      class AdditionalModelTypeAnnotationsTests {

        @Nested
        @DisplayName("Testing `<additionalModelTypeAnnotations></additionalModelTypeAnnotations>`")
        class AdditionalModelTypeAnnotationsUnsetTests {
          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `record` does NOT have additional annotations")
          void
              whenAdditionalModelTypeAnnotationsIsNotSetThenGeneratedRecordClassDoesNotHaveAdditionalAnnotations(
                  final GeneratedSource generatedSource) {

            Assumptions.assumeFalse(generatedSource.hasAdditionalModelTypeAnnotations());

            AssertionUtils.assertClassIsNotAnnotatedWith(
                generatedSource.getClassUnderTest(), TestAnnotationOne.class);
            AssertionUtils.assertClassIsNotAnnotatedWith(
                generatedSource.getClassUnderTest(), TestAnnotationTwo.class);
            AssertionUtils.assertClassIsNotAnnotatedWith(
                generatedSource.getClassUnderTest(), TestAnnotationThree.class);
          }
        }

        @Nested
        @DisplayName(
            "Testing `<additionalModelTypeAnnotations>@TestAnnotationOne;@TestAnnotationTwo;@TestAnnotationThree</additionalModelTypeAnnotations>`")
        class AdditionalModelTypeAnnotationsSetTests {
          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `record` has additional annotations")
          void
              whenConfigOptionAdditionalModelTypeAnnotationsIsSetThenGeneratedRecordClassHasAdditionalAnnotations(
                  final GeneratedSource generatedSource) {

            Assumptions.assumeTrue(generatedSource.hasAdditionalModelTypeAnnotations());

            AssertionUtils.assertClassIsAnnotatedWith(
                generatedSource.getClassUnderTest(), TestAnnotationOne.class);
            AssertionUtils.assertClassIsAnnotatedWith(
                generatedSource.getClassUnderTest(), TestAnnotationTwo.class);
            AssertionUtils.assertClassIsAnnotatedWith(
                generatedSource.getClassUnderTest(), TestAnnotationThree.class);
          }
        }
      }

      @Nested
      @DisplayName("Testing `<serializableModel>`")
      class SerializableModelTests {

        @Nested
        @DisplayName("Testing `<serializableModel>false</serializableModel>`")
        class SerializableModelFalseTests {

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `record` does NOT implement `Serializable`")
          void
              whenConfigOptionSerializableModelIsFalseThenGeneratedRecordClassDoesNotImplementSerializable(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.serializableModel());

            AssertionUtils.assertClassDoesNotImplementsInterface(
                generatedSource.getClassUnderTest(), Serializable.class);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `record` does NOT have `serialVersionUID`-field")
          void
              whenConfigOptionSerializableModelIsFalseThenGeneratedRecordClassDoesNotHaveSerialVersionUidField(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.serializableModel());

            AssertionUtils.assertRecordDoesNotHaveField(
                generatedSource.getClassUnderTest(), "serialVersionUID");
          }
        }

        @Nested
        @DisplayName("Testing `<serializableModel>true</serializableModel>`")
        class SerializableModelTrueTests {

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `record` implement `Serializable`")
          void
              whenConfigOptionSerializableModelIsTrueThenGeneratedRecordClassImplementsSerializable(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.serializableModel());

            AssertionUtils.assertClassImplementsInterface(
                generatedSource.getClassUnderTest(), Serializable.class);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Generated `record` has one additional number of fields than OpenAPI properties")
          public void
              whenConfigOptionSerializableModelIsTrueThenGeneratedRecordHasOneAdditionalField(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.serializableModel());

            AssertionUtils.assertRecordHasExpectedNumberOfFields(
                generatedSource.getClassUnderTest(), generatedSource.generatedFields().length + 1);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `record` has `serialVersionUID`-field")
          void
              whenConfigOptionSerializableModelIsTrueThenGeneratedRecordClassHasSerialVersionUidField(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.serializableModel());

            AssertionUtils.assertRecordHasField(
                generatedSource.getClassUnderTest(), "serialVersionUID", long.class);
          }
        }
      }

      @Nested
      @DisplayName("Testing `<generateBuilders>`")
      class GenerateBuildersTests {

        @Nested
        @DisplayName("Testing `<generateBuilders>false</generateBuilders>`")
        class GenerateBuildersFalseTests {

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `record` does NOT have inner `Builder`-class")
          void
              whenConfigOptionGenerateBuildersIsFalseThenGeneratedRecordDoesNotHaveInnerBuilderClass(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.generateBuilders());

            AssertionUtils.assertClassDoesNotHaveMethod(
                generatedSource.getClassUnderTest(), "builder");
            AssertionUtils.assertClassDoesNotHaveInnerClass(
                generatedSource.getClassUnderTest(), "Builder");
          }
        }

        @Nested
        @DisplayName("Testing `<generateBuilders>true</generateBuilders>`")
        class GenerateBuildersTrueTests {
          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `record` has inner `Builder`-class")
          void whenConfigOptionGenerateBuildersIsSetThenGeneratedRecordHasInnerBuilderClass(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.generateBuilders());

            AssertionUtils.assertClassHasMethod(generatedSource.getClassUnderTest(), "builder");
            AssertionUtils.assertClassHasInnerClass(generatedSource.getClassUnderTest(), "Builder");
            AssertionUtils.assertInnerBuilderClassExistsAndCanBuildRecord(generatedSource);
          }
        }
      }

      @Nested
      @DisplayName("Testing `<useJakartaEe>`")
      class UseJakartaEeTests {

        @Nested
        @DisplayName("Testing `<useJakartaEe>false</useJakartaEe>`")
        class UseJakartaEeFalseTests {
          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Fields of generated `record` are NOT annotated with Jakarta `@Nullable` or `@Nonnull`")
          public void whenUseJakartaEeIsFalseThenJakartaAnnotationsAreNotUsedForNullableAndNonnull(
              final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.useJakartaEe());

            for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
              final Field field =
                  AssertionUtils.assertRecordHasField(
                      generatedSource.getClassUnderTest(),
                      generatedField.name(),
                      generatedField.type());

              AssertionUtils.assertDoesNotHaveAnnotation(
                  generatedSource.getClassUnderTest(), field, jakarta.annotation.Nullable.class);
              AssertionUtils.assertDoesNotHaveAnnotation(
                  generatedSource.getClassUnderTest(), field, jakarta.annotation.Nonnull.class);
            }
          }
        }

        @Nested
        @DisplayName("Testing `<useJakartaEe>true</useJakartaEe>`")
        class UseJakartaEeTrueTests {
          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Fields of generated `record` are annotated with Jakarta `@Nullable` or `@Nonnull`")
          public void whenUseJakartaEeIsTrueThenJakartaAnnotationsAreUsedForNullableAndNonnull(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.useJakartaEe());

            for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
              final Field field =
                  AssertionUtils.assertRecordHasField(
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

              AssertionUtils.assertHasAnnotation(
                  generatedSource.getClassUnderTest(), field, expectedAnnotation);
              AssertionUtils.assertDoesNotHaveAnnotation(
                  generatedSource.getClassUnderTest(), field, unexpectedAnnotation);
            }
          }

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Fields of generated `record` are NOT annotated with JavaX `@Nullable` or `@Nonnull`")
          public void whenUseJakartaEeIsTrueThenJavaXAnnotationsAreNotUsedForNullableAndNonnull(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.useJakartaEe());

            for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
              final Field field =
                  AssertionUtils.assertRecordHasField(
                      generatedSource.getClassUnderTest(),
                      generatedField.name(),
                      generatedField.type());

              AssertionUtils.assertDoesNotHaveAnnotation(
                  generatedSource.getClassUnderTest(), field, javax.annotation.Nullable.class);
              AssertionUtils.assertDoesNotHaveAnnotation(
                  generatedSource.getClassUnderTest(), field, javax.annotation.Nonnull.class);
            }
          }
        }
      }

      @Nested
      @DisplayName("Testing `<useBeanValidation>`")
      class UseBeanValidationTests {

        @Nested
        @DisplayName("Testing `<useBeanValidation>false</useBeanValidation>`")
        class UseBeanValidationFalseTests {
          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Generated `record` does NOT use Jakarta Bean Validation annotations on fields")
          public void
              whenUseBeanValidationIsFalseThenFieldsAreNotAnnotatedWithJakartaBeanValidationAnnotations(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.useBeanValidation());

            for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
              final Field field =
                  AssertionUtils.assertRecordHasField(
                      generatedSource.getClassUnderTest(),
                      generatedField.name(),
                      generatedField.type());

              for (final Class<? extends Annotation> annotation :
                  List.of(
                      jakarta.validation.Valid.class,
                      jakarta.validation.constraints.NotNull.class,
                      jakarta.validation.constraints.Pattern.class,
                      jakarta.validation.constraints.Size.class,
                      jakarta.validation.constraints.Min.class,
                      jakarta.validation.constraints.Max.class,
                      jakarta.validation.constraints.DecimalMin.class,
                      jakarta.validation.constraints.DecimalMax.class,
                      jakarta.validation.constraints.Email.class)) {
                AssertionUtils.assertDoesNotHaveAnnotation(
                    generatedSource.getClassUnderTest(), field, annotation);
              }
            }
          }
        }

        @Nested
        @DisplayName("Testing `<useBeanValidation>true</useBeanValidation>`")
        class UseBeanValidationTrueTests {
          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `record` use Jakarta Bean Validation annotations on fields")
          public void
              whenUseBeanValidationIsTrueThenFieldsAreAnnotatedWithJakartaBeanValidationAnnotations(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.useBeanValidation());
            AssertionUtils.assertRecordHasFieldsOfTypeWithNullableAnnotations(generatedSource);
          }
        }
      }
    }
  }
}
