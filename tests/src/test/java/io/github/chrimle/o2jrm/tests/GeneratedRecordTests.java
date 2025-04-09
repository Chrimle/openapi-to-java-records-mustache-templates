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

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import io.github.chrimle.o2jrm.GeneratedSource;
import io.github.chrimle.o2jrm.annotations.*;
import io.github.chrimle.o2jrm.models.GeneratedField;
import io.github.chrimle.o2jrm.tests.GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests;
import io.github.chrimle.o2jrm.tests.GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests.AdditionalModelTypeAnnotationsTests;
import io.github.chrimle.o2jrm.tests.GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests.GenerateBuildersTests;
import io.github.chrimle.o2jrm.tests.GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests.SerializableModelTests;
import io.github.chrimle.o2jrm.tests.GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests.UseJakartaEeTests;
import io.github.chrimle.o2jrm.tests.GeneratedRecordTests.OpenAPITests.SchemaTests;
import io.github.chrimle.o2jrm.tests.GeneratedRecordTests.OpenAPITests.SchemaTests.DeprecatedTests;
import io.github.chrimle.o2jrm.tests.GeneratedRecordTests.OpenAPITests.SchemaTests.PropertiesTests;
import io.github.chrimle.o2jrm.tests.GeneratedRecordTests.OpenAPITests.SchemaTests.PropertiesTests.PropertyTests;
import io.github.chrimle.o2jrm.tests.GeneratedRecordTests.OpenAPITests.SchemaTests.PropertiesTests.PropertyTests.DefaultTests;
import io.github.chrimle.o2jrm.tests.GeneratedRecordTests.OpenAPITests.SchemaTests.PropertiesTests.PropertyTests.NullableTests;
import io.github.chrimle.o2jrm.tests.GeneratedRecordTests.OpenAPITests.SchemaTests.PropertiesTests.PropertyTests.XFieldExtraAnnotationTests;
import io.github.chrimle.o2jrm.tests.GeneratedRecordTests.OpenAPITests.SchemaTests.TypeTests;
import io.github.chrimle.o2jrm.tests.GeneratedRecordTests.OpenAPITests.SchemaTests.XClassExtraAnnotationTests;
import io.github.chrimle.o2jrm.utils.AssertionUtils;
import io.github.chrimle.o2jrm.utils.CustomAssertions;
import io.github.chrimle.o2jrm.utils.GeneratedRecordTestUtils;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import org.junit.jupiter.api.*;
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
 *   <li>{@link XFieldExtraAnnotationTests
 *       `components.schemas.{schema}.properties.{property}.x-field-extra-annotation`}
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
@DisplayName("Testing Generated `record` classes")
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
          CustomAssertions.assertClassIsRecordClass(generatedSource.getClassUnderTest());
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

            CustomAssertions.assertClassIsNotAnnotatedWith(
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

            CustomAssertions.assertClassIsAnnotatedWith(
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

            CustomAssertions.assertClassIsNotAnnotatedWith(
                generatedSource.getClassUnderTest(), TestExtraAnnotation.class);
            CustomAssertions.assertClassIsNotAnnotatedWith(
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
              CustomAssertions.assertClassIsAnnotatedWith(
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
          CustomAssertions.assertClassHasConstructor(
              generatedSource.getClassUnderTest(), generatedSource.fieldClasses());
        }

        @ParameterizedTest
        @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
        @DisplayName(
            "[okhttp-gson] Generated `record` has same number of fields as OpenAPI properties")
        public void whenObjectHasPropertiesThenGeneratedRecordHasSameNumberOfFields_okhttp_gson(
            final GeneratedSource generatedSource) {
          Assumptions.assumeFalse(generatedSource.serializableModel());
          Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());

          CustomAssertions.assertClassHasNumberOfFields(
              generatedSource.getClassUnderTest(), generatedSource.generatedFields().length + 2);
        }

        @ParameterizedTest
        @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
        @DisplayName(
            "[webclient] Generated `record` has same number of fields as OpenAPI properties")
        public void whenObjectHasPropertiesThenGeneratedRecordHasSameNumberOfFields_webclient(
            final GeneratedSource generatedSource) {
          Assumptions.assumeFalse(generatedSource.serializableModel());
          Assumptions.assumeTrue(generatedSource.isLibraryWebClient());

          CustomAssertions.assertClassHasNumberOfFields(
              generatedSource.getClassUnderTest(), generatedSource.generatedFields().length);
        }

        @ParameterizedTest
        @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
        @DisplayName("Generated `record` has fields with same name and type as OpenAPI properties")
        public void whenObjectHasPropertiesThenGeneratedRecordHasFieldsWithSameNameAndType(
            final GeneratedSource generatedSource) {
          for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
            CustomAssertions.assertClassHasField(
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
                    CustomAssertions.assertClassHasField(
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

                CustomAssertions.assertFieldIsAnnotatedWith(field, expectedAnnotation);
                CustomAssertions.assertFieldIsNotAnnotatedWith(field, unexpectedAnnotation);
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
              @DisplayName("Generated `field` is NOT annotated with extra field annotations`")
              public void
                  whenXFieldExtraAnnotationIsUnsetThenFieldIsNotAnnotatedWithExtraFieldAnnotation(
                      final GeneratedSource generatedSource) {
                for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
                  final Field field =
                      CustomAssertions.assertClassHasField(
                          generatedSource.getClassUnderTest(),
                          generatedField.name(),
                          generatedField.type());
                  if (generatedField.extraFieldAnnotations().isEmpty()) {
                    CustomAssertions.assertFieldIsNotAnnotatedWith(
                        field, TestFieldExtraAnnotationOne.class);
                    CustomAssertions.assertFieldIsNotAnnotatedWith(
                        field, TestFieldExtraAnnotationTwo.class);
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
              @DisplayName("Generated `field` is annotated with extra field annotations`")
              public void
                  whenXFieldExtraAnnotationIsSetThenFieldIsAnnotatedWithExtraFieldAnnotation(
                      final GeneratedSource generatedSource) {
                for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
                  final Field field =
                      CustomAssertions.assertClassHasField(
                          generatedSource.getClassUnderTest(),
                          generatedField.name(),
                          generatedField.type());
                  if (!generatedField.extraFieldAnnotations().isEmpty()) {
                    for (final Class<? extends Annotation> expectedAnnotation :
                        generatedField.extraFieldAnnotations()) {
                      CustomAssertions.assertFieldIsAnnotatedWith(field, expectedAnnotation);
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
    @DisplayName("Testing `<library>`")
    class LibraryTests {

      @Nested
      @DisplayName("Testing `<library>okhttp-gson</library>` (default)")
      class OkHttpGsonTests {

        @ParameterizedTest
        @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
        @DisplayName("Generated `record` HAS `openapiFields`-field")
        void whenLibraryIsOkHttpGsonThenGeneratedRecordHasOpenApiFieldsField(
            final GeneratedSource generatedSource) throws IllegalAccessException {
          Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());

          final Field openapiFields =
              CustomAssertions.assertClassHasField(
                  generatedSource.getClassUnderTest(), "openapiFields", HashSet.class);
          final HashSet<String> actualValue = (HashSet<String>) openapiFields.get(null);
          Assertions.assertEquals(generatedSource.generatedFields().length, actualValue.size());
          Assertions.assertEquals(
              Arrays.stream(generatedSource.generatedFields())
                  .map(GeneratedField::name)
                  .collect(Collectors.toSet()),
              actualValue);
        }

        @ParameterizedTest
        @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
        @DisplayName("Generated `record` HAS `openapiRequiredFields`-field")
        void whenLibraryIsOkHttpGsonThenGeneratedRecordHasOpenApiRequiredFieldsField(
            final GeneratedSource generatedSource) throws IllegalAccessException {
          Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());

          final Field openapiRequiredFields =
              CustomAssertions.assertClassHasField(
                  generatedSource.getClassUnderTest(), "openapiRequiredFields", HashSet.class);
          final HashSet<String> actualValue = (HashSet<String>) openapiRequiredFields.get(null);
          final Set<String> expectedValue =
              Arrays.stream(generatedSource.generatedFields())
                  .filter(GeneratedField::isRequired)
                  .map(GeneratedField::name)
                  .collect(Collectors.toSet());
          Assertions.assertEquals(expectedValue, actualValue);
        }

        @ParameterizedTest
        @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
        @DisplayName("Generated `record` HAS `validateJsonElement`-method")
        void whenLibraryIsOkHttpGsonThenGeneratedRecordHasValidateJsonElementMethod(
            final GeneratedSource generatedSource) {
          Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());

          CustomAssertions.assertClassHasMethod(
              generatedSource.getClassUnderTest(), "validateJsonElement", JsonElement.class);
        }

        @Nested
        @DisplayName("Testing the `validateJsonElement`-method")
        class ValidateJsonElementMethodTests {

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "When `jsonElement` is `null` and `record` has required fields Then `validateJsonElement`-method throws `IllegalArgumentException`")
          void whenJsonElementIsNullAndRecordHasRequiredFieldsThenIllegalArgumentExceptionIsThrown(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());
            Assumptions.assumeTrue(
                Arrays.stream(generatedSource.generatedFields())
                    .anyMatch(GeneratedField::isRequired));

            final Method validateJsonElementMethod =
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(), "validateJsonElement", JsonElement.class);
            CustomAssertions.assertStaticMethodThrowsWhenInvoked(
                validateJsonElementMethod, IllegalArgumentException.class, (Object) null);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "When `jsonElement` is empty JSON and `record` has required fields Then `validateJsonElement`-method throws `IllegalArgumentException`")
          void
              whenJsonElementIsEmptyJsonAndRecordHasRequiredFieldsThenIllegalArgumentExceptionIsThrown(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());
            Assumptions.assumeTrue(
                Arrays.stream(generatedSource.generatedFields())
                    .anyMatch(GeneratedField::isRequired));

            final Method validateJsonElementMethod =
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(), "validateJsonElement", JsonElement.class);
            final JsonElement jsonObject = JsonParser.parseString("{}");
            CustomAssertions.assertStaticMethodThrowsWhenInvoked(
                validateJsonElementMethod, IllegalArgumentException.class, jsonObject);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "When `jsonElement` is `null` and `record` has no required fields Then `validateJsonElement`-method throws `NullPointerException`")
          void whenJsonElementIsNullAndRecordHasNoRequiredFieldsThenNullPointerExceptionIsThrown(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());
            Assumptions.assumeTrue(
                Arrays.stream(generatedSource.generatedFields())
                    .noneMatch(GeneratedField::isRequired));

            final Method validateJsonElementMethod =
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(), "validateJsonElement", JsonElement.class);
            CustomAssertions.assertStaticMethodThrowsWhenInvoked(
                validateJsonElementMethod, NullPointerException.class, (Object) null);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "When `jsonElement` is empty JSON and `record` has no required fields Then `validateJsonElement`-method throws nothing")
          void whenJsonElementIsEmptyJsonAndRecordHasNoRequiredFieldsThenNothingIsThrown(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());
            Assumptions.assumeTrue(
                Arrays.stream(generatedSource.generatedFields())
                    .noneMatch(GeneratedField::isRequired));

            final Method validateJsonElementMethod =
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(), "validateJsonElement", JsonElement.class);
            final JsonElement jsonObject = JsonParser.parseString("{}");
            CustomAssertions.assertStaticMethodCanBeInvoked(validateJsonElementMethod, jsonObject);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "When `jsonElement` has unexpected key Then `validateJsonElement`-method throws `IllegalArgumentException`")
          void whenJsonElementHasUnexpectedKeyThenIllegalArgumentExceptionIsThrown(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());

            final Method validateJsonElementMethod =
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(), "validateJsonElement", JsonElement.class);
            final JsonElement jsonObject = JsonParser.parseString("{'unexpectedKey': 42}");
            CustomAssertions.assertStaticMethodThrowsWhenInvoked(
                validateJsonElementMethod, IllegalArgumentException.class, jsonObject);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "When `jsonElement` does NOT have expected key Then `validateJsonElement`-method throws `IllegalArgumentException`")
          void whenJsonElementDoesNotHaveExpectedKeyThenIllegalArgumentExceptionIsThrown(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());
            Assumptions.assumeTrue(
                Arrays.stream(generatedSource.generatedFields())
                    .anyMatch(GeneratedField::isRequired));

            final Method validateJsonElementMethod =
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(), "validateJsonElement", JsonElement.class);
            String jsonString = "{";
            boolean hasSkippedRequiredKey = false;
            for (int i = 0; i < generatedSource.generatedFields().length - 1; i++) {
              final GeneratedField<?> generatedField = generatedSource.generatedFields()[i];
              if (generatedField.isRequired() && !hasSkippedRequiredKey) {
                hasSkippedRequiredKey = true;
                continue;
              }
              jsonString += "'" + generatedField.name() + "': 42,";
            }
            jsonString = jsonString.substring(0, jsonString.length() - 1);
            jsonString += "}";
            final JsonElement jsonObject = JsonParser.parseString(jsonString);
            CustomAssertions.assertStaticMethodThrowsWhenInvoked(
                validateJsonElementMethod, IllegalArgumentException.class, jsonObject);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "When required `jsonElement` value is `null` Then `validateJsonElement`-method throws `IllegalArgumentException`")
          void whenRequiredJsonElementValueIsNullThenIllegalArgumentExceptionIsThrown(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());
            Assumptions.assumeTrue(
                Arrays.stream(generatedSource.generatedFields())
                    .anyMatch(GeneratedField::isRequired));

            final Method validateJsonElementMethod =
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(), "validateJsonElement", JsonElement.class);
            String jsonString = "{";
            for (int i = 0; i < generatedSource.generatedFields().length; i++) {
              final GeneratedField<?> generatedField = generatedSource.generatedFields()[i];
              jsonString += "'" + generatedField.name() + "': null";
              if (i + 1 < generatedSource.generatedFields().length) {
                jsonString += ",";
              }
            }
            jsonString += "}";
            final JsonElement jsonObject = JsonParser.parseString(jsonString);
            CustomAssertions.assertStaticMethodThrowsWhenInvoked(
                validateJsonElementMethod, IllegalArgumentException.class, jsonObject);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "When optional `jsonElement` values are `null` Then `validateJsonElement`-method throws nothing")
          void whenOptionalJsonElementValuesAreNullThenNothingIsThrown(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());

            final Method validateJsonElementMethod =
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(), "validateJsonElement", JsonElement.class);
            for (int j = 0; j < generatedSource.generatedFields().length; j++) {
              String jsonString = "{";
              boolean hasInvalidKey = false;
              boolean isRequired = false;
              boolean isEnum = false;
              boolean isCustomClass = false;
              for (int i = 0; i < generatedSource.generatedFields().length; i++) {
                final GeneratedField<?> generatedField = generatedSource.generatedFields()[i];
                if (i == j) {
                  jsonString += "'" + generatedField.name() + "': null";
                  hasInvalidKey = true;
                  isRequired = generatedField.isRequired();
                  isEnum = generatedField.type().isEnum();
                  isCustomClass = generatedField.isCustomClass();
                } else {
                  jsonString += generatedField.getKeyAndValueAsJson();
                }
                if (i + 1 < generatedSource.generatedFields().length) {
                  jsonString += ",";
                }
              }
              jsonString += "}";
              final JsonElement jsonObject = JsonParser.parseString(jsonString);
              if (hasInvalidKey && isRequired) {
                final Class<? extends Exception> expectedException =
                    isEnum
                        ? UnsupportedOperationException.class
                        : isCustomClass
                            ? IllegalStateException.class
                            : IllegalArgumentException.class;
                CustomAssertions.assertStaticMethodThrowsWhenInvoked(
                    validateJsonElementMethod, expectedException, jsonObject);
              } else {
                CustomAssertions.assertStaticMethodCanBeInvoked(
                    validateJsonElementMethod, jsonObject);
              }
            }
          }

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "When optional `jsonElement` values is not present Then `validateJsonElement`-method throws nothing")
          void whenOptionalJsonElementValuesIsNotPresentThenNothingIsThrown(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());

            final Method validateJsonElementMethod =
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(), "validateJsonElement", JsonElement.class);
            for (int j = 0; j < generatedSource.generatedFields().length; j++) {
              String jsonString = "{";
              boolean skipNextSeparator = false;
              for (int i = 0; i < generatedSource.generatedFields().length; i++) {
                final GeneratedField<?> generatedField = generatedSource.generatedFields()[i];
                if (i == j && !generatedField.isRequired()) {
                  if (i == 0) skipNextSeparator = true;
                } else {
                  if (i != 0 && !skipNextSeparator) {
                    jsonString += ",";
                  }
                  jsonString += generatedField.getKeyAndValueAsJson();
                  skipNextSeparator = false;
                }
              }
              jsonString += "}";
              final JsonElement jsonObject = JsonParser.parseString(jsonString);
              CustomAssertions.assertStaticMethodCanBeInvoked(
                  validateJsonElementMethod, jsonObject);
            }
          }

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "When `jsonElement` value is valid Then `validateJsonElement`-method throws nothing")
          void whenJsonElementIsValidThenNothingIsThrown(final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());

            final Method validateJsonElementMethod =
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(), "validateJsonElement", JsonElement.class);
            String jsonString = "{";
            for (int i = 0; i < generatedSource.generatedFields().length; i++) {
              final GeneratedField<?> generatedField = generatedSource.generatedFields()[i];
              jsonString += generatedField.getKeyAndValueAsJson();
              if (i + 1 < generatedSource.generatedFields().length) {
                jsonString += ",";
              }
            }
            jsonString += "}";
            final JsonElement jsonObject = JsonParser.parseString(jsonString);
            CustomAssertions.assertStaticMethodCanBeInvoked(validateJsonElementMethod, jsonObject);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "When required `jsonElement` value is unexpected type Then `validateJsonElement`-method throws `IllegalArgumentException`")
          void whenRequiredJsonElementValueIsUnexpectedTypeThenIllegalArgumentExceptionIsThrown(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());

            final Method validateJsonElementMethod =
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(), "validateJsonElement", JsonElement.class);
            for (int j = 0; j < generatedSource.generatedFields().length; j++) {
              String jsonString = "{";
              boolean hasInvalidKey = false;
              boolean isSkippedFieldOfTypeEnum = false;
              boolean isSkippedFieldCustomClass = false;
              for (int i = 0; i < generatedSource.generatedFields().length; i++) {
                final GeneratedField<?> generatedField = generatedSource.generatedFields()[i];
                if (i == j
                    && generatedField.type() != Integer.class
                    && generatedField.type() != Long.class
                    && generatedField.type() != BigDecimal.class
                    && generatedField.type() != Boolean.class
                    && generatedField.type() != UUID.class) {
                  jsonString +=
                      "'" + generatedField.name() + "': {'madeUpField': 'thisIsUnexpected'}";
                  hasInvalidKey = true;
                  isSkippedFieldOfTypeEnum = generatedField.type().isEnum();
                  isSkippedFieldCustomClass = generatedField.isCustomClass();
                } else {
                  jsonString += generatedField.getKeyAndValueAsJson();
                }
                if (i + 1 < generatedSource.generatedFields().length) {
                  jsonString += ",";
                }
              }
              jsonString += "}";
              final JsonElement jsonObject = JsonParser.parseString(jsonString);
              if (hasInvalidKey) {
                Class<? extends Exception> expectedException;
                if (isSkippedFieldOfTypeEnum) {
                  expectedException = UnsupportedOperationException.class;
                } else if (isSkippedFieldCustomClass) {
                  expectedException = IllegalArgumentException.class; // IOException.class;
                } else {
                  expectedException = IllegalArgumentException.class;
                }
                CustomAssertions.assertStaticMethodThrowsWhenInvoked(
                    validateJsonElementMethod, expectedException, jsonObject);
              } else {
                CustomAssertions.assertStaticMethodCanBeInvoked(
                    validateJsonElementMethod, jsonObject);
              }
            }
          }

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "When required `jsonElement` value is unexpectedly not JSON primitive Then `validateJsonElement`-method throws `IllegalArgumentException`")
          void
              whenRequiredJsonElementValueIsUnexpectedlyNotJsonPrimitiveThenIllegalArgumentExceptionIsThrown(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());

            final Method validateJsonElementMethod =
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(), "validateJsonElement", JsonElement.class);
            for (int j = 0; j < generatedSource.generatedFields().length; j++) {
              String jsonString = "{";
              boolean hasInvalidKey = false;
              boolean hasReplacedFieldOwnValidateJsonElement = false;
              for (int i = 0; i < generatedSource.generatedFields().length; i++) {
                final GeneratedField<?> generatedField = generatedSource.generatedFields()[i];
                if (i == j && generatedField.isJsonPrimitive()) {
                  jsonString += "'" + generatedField.name() + "': []";
                  hasInvalidKey = true;
                  hasReplacedFieldOwnValidateJsonElement =
                      generatedField.isCustomClass() || generatedField.type().isEnum();
                } else {
                  jsonString += generatedField.getKeyAndValueAsJson();
                }
                if (i + 1 < generatedSource.generatedFields().length) {
                  jsonString += ",";
                }
              }
              jsonString += "}";
              final JsonElement jsonObject = JsonParser.parseString(jsonString);
              if (hasInvalidKey) {
                CustomAssertions.assertStaticMethodThrowsWhenInvoked(
                    validateJsonElementMethod,
                    hasReplacedFieldOwnValidateJsonElement
                        ? IllegalStateException.class
                        : IllegalArgumentException.class,
                    jsonObject);
              } else {
                CustomAssertions.assertStaticMethodCanBeInvoked(
                    validateJsonElementMethod, jsonObject);
              }
            }
          }
        }

        @Nested
        @DisplayName("Testing Generating `CustomTypeAdapterFactory`-class")
        class CustomTypeAdapterFactoryTests {

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "When `library` is NOT `okhttp-gson` Then inner-class `CustomTypeAdapterFactory` is NOT generated")
          void whenLibraryIsNotOkHttpGsonThenInnerClassCustomTypeAdapterFactoryIsNotGenerated(
              final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.isLibraryOkHttpGson());

            CustomAssertions.assertClassDoesNotHaveInnerClass(
                generatedSource.getClassUnderTest(), "CustomTypeAdapterFactory");
          }

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "When `library` IS `okhttp-gson` Then inner-class `CustomTypeAdapterFactory` IS generated")
          void whenLibraryIsOkHttpGsonThenInnerClassCustomTypeAdapterFactoryIsGenerated(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());

            CustomAssertions.assertClassHasInnerClass(
                generatedSource.getClassUnderTest(), "CustomTypeAdapterFactory");
          }
        }
      }

      @Nested
      @DisplayName("Testing `<library>webclient</library>`")
      class WebClientTests {

        @ParameterizedTest
        @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
        @DisplayName("Generated `record` does NOT have `openapiFields`-field")
        void whenLibraryIsWebClientThenGeneratedRecordDoesNotHaveOpenApiFieldsField(
            final GeneratedSource generatedSource) {
          Assumptions.assumeTrue(generatedSource.isLibraryWebClient());

          CustomAssertions.assertClassDoesNotHaveFieldWithName(
              generatedSource.getClassUnderTest(), "openapiFields");
        }

        @ParameterizedTest
        @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
        @DisplayName("Generated `record` does NOT have `openapiRequiredFields`-field")
        void whenLibraryIsWebClientThenGeneratedRecordDoesNotHaveOpenApiRequiredFieldsField(
            final GeneratedSource generatedSource) {
          Assumptions.assumeTrue(generatedSource.isLibraryWebClient());

          CustomAssertions.assertClassDoesNotHaveFieldWithName(
              generatedSource.getClassUnderTest(), "openapiRequiredFields");
        }

        @ParameterizedTest
        @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
        @DisplayName("Generated `record` does NOT have `validateJsonElement`-method")
        void whenLibraryIsWebClientThenGeneratedRecordDoesNotHaveValidateJsonElementMethod(
            final GeneratedSource generatedSource) {
          Assumptions.assumeTrue(generatedSource.isLibraryWebClient());

          CustomAssertions.assertClassDoesNotHaveMethod(
              generatedSource.getClassUnderTest(), "validateJsonElement", JsonElement.class);
        }
      }
    }

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

            CustomAssertions.assertClassIsNotAnnotatedWith(
                generatedSource.getClassUnderTest(), TestAnnotationOne.class);
            CustomAssertions.assertClassIsNotAnnotatedWith(
                generatedSource.getClassUnderTest(), TestAnnotationTwo.class);
            CustomAssertions.assertClassIsNotAnnotatedWith(
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

            CustomAssertions.assertClassIsAnnotatedWith(
                generatedSource.getClassUnderTest(), TestAnnotationOne.class);
            CustomAssertions.assertClassIsAnnotatedWith(
                generatedSource.getClassUnderTest(), TestAnnotationTwo.class);
            CustomAssertions.assertClassIsAnnotatedWith(
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

            CustomAssertions.assertClassDoesNotImplementInterface(
                generatedSource.getClassUnderTest(), Serializable.class);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `record` does NOT have `serialVersionUID`-field")
          void
              whenConfigOptionSerializableModelIsFalseThenGeneratedRecordClassDoesNotHaveSerialVersionUidField(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.serializableModel());

            CustomAssertions.assertClassDoesNotHaveFieldWithName(
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

            CustomAssertions.assertClassImplementsInterface(
                generatedSource.getClassUnderTest(), Serializable.class);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "[okhttp-gson] Generated `record` has one additional number of fields than OpenAPI properties")
          public void
              whenConfigOptionSerializableModelIsTrueThenGeneratedRecordHasOneAdditionalField_okhttp_gson(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.serializableModel());
            Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());

            CustomAssertions.assertClassHasNumberOfFields(
                generatedSource.getClassUnderTest(), generatedSource.generatedFields().length + 3);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "[webclient] Generated `record` has one additional number of fields than OpenAPI properties")
          public void
              whenConfigOptionSerializableModelIsTrueThenGeneratedRecordHasOneAdditionalField_webclient(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.serializableModel());
            Assumptions.assumeTrue(generatedSource.isLibraryWebClient());

            CustomAssertions.assertClassHasNumberOfFields(
                generatedSource.getClassUnderTest(), generatedSource.generatedFields().length + 1);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `record` has `serialVersionUID`-field")
          void
              whenConfigOptionSerializableModelIsTrueThenGeneratedRecordClassHasSerialVersionUidField(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.serializableModel());

            CustomAssertions.assertClassHasField(
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

            CustomAssertions.assertClassDoesNotHaveMethod(
                generatedSource.getClassUnderTest(), "builder");
            CustomAssertions.assertClassDoesNotHaveInnerClass(
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

            CustomAssertions.assertClassHasMethod(generatedSource.getClassUnderTest(), "builder");
            CustomAssertions.assertClassHasInnerClass(
                generatedSource.getClassUnderTest(), "Builder");
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

          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Fields of generated `record` are NOT annotated with JavaX `@Nullable` or `@Nonnull`")
          public void whenUseJakartaEeIsTrueThenJavaXAnnotationsAreNotUsedForNullableAndNonnull(
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
                  CustomAssertions.assertClassHasField(
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
                CustomAssertions.assertFieldIsNotAnnotatedWith(field, annotation);
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
