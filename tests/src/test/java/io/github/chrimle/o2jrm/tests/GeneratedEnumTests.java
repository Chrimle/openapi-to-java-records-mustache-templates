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
import io.github.chrimle.o2jrm.annotations.TestAnnotationOne;
import io.github.chrimle.o2jrm.annotations.TestAnnotationThree;
import io.github.chrimle.o2jrm.annotations.TestAnnotationTwo;
import io.github.chrimle.o2jrm.models.GeneratedField;
import io.github.chrimle.o2jrm.tests.GeneratedEnumTests.GeneratorConfigurationTests.ConfigOptionsTests;
import io.github.chrimle.o2jrm.tests.GeneratedEnumTests.GeneratorConfigurationTests.ConfigOptionsTests.AdditionalEnumTypeAnnotationsTests;
import io.github.chrimle.o2jrm.tests.GeneratedEnumTests.GeneratorConfigurationTests.ConfigOptionsTests.UseEnumCaseInsensitiveTests;
import io.github.chrimle.o2jrm.tests.GeneratedEnumTests.OpenAPITests.SchemaTests;
import io.github.chrimle.o2jrm.tests.GeneratedEnumTests.OpenAPITests.SchemaTests.DeprecatedTests;
import io.github.chrimle.o2jrm.tests.GeneratedEnumTests.OpenAPITests.SchemaTests.EnumTests;
import io.github.chrimle.o2jrm.tests.GeneratedEnumTests.OpenAPITests.SchemaTests.EnumTests.ConstantsTests;
import io.github.chrimle.o2jrm.utils.CustomAssertions;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Tests for <b>all</b> generated {@code enum} classes. Tests are grouped by the <i>method of
 * configuring</i> the resulting {@code enum}.
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
 *   <li>{@link DeprecatedTests `components.schemas.{schema}.deprecated`}
 *   <li>{@link EnumTests `components.schemas.{schema}.enum`}
 *   <li>{@link ConstantsTests `components.schemas.{schema}.enum.{constants}`}
 * </ul>
 *
 * <p><b>`openapi-generator` Configurations</b>
 *
 * <p>{@link GeneratorConfigurationTests}
 *
 * <ul>
 *   <li>{@link ConfigOptionsTests configOptions}
 *   <li>{@link AdditionalEnumTypeAnnotationsTests additionalEnumTypeAnnotations}
 *   <li>{@link UseEnumCaseInsensitiveTests useEnumCaseInsensitive}
 * </ul>
 */
@DisplayName("Test Generated `enum` classes")
final class GeneratedEnumTests implements GeneratedClassTests {

  @Nested
  @DisplayName("Testing OpenAPI Schemas & Properties")
  class OpenAPITests {

    @Nested
    @DisplayName("Testing `components.schemas.{schema}`")
    class SchemaTests {

      @Nested
      @DisplayName("Testing `components.schemas.{schema}.enum`")
      class EnumTests {
        @ParameterizedTest
        @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
        @DisplayName("Generates an `enum` class")
        void whenIsEnumThenGeneratedClassIsEnumClass(final GeneratedSource generatedSource) {
          CustomAssertions.assertClassIsEnumClass(generatedSource.getClassUnderTest());
        }

        @Nested
        @DisplayName("Testing `components.schemas.{schema}.enum.{constants}`")
        class ConstantsTests {

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName("Generates an `enum` with expected number of constants")
          void whenEnumHasConstantsThenGeneratedEnumClassHasExpectedNumberOfConstants(
              final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.enumUnknownDefaultCase());
            CustomAssertions.assertClassHasEnumConstants(
                generatedSource.getClassUnderTest(), generatedSource.generatedFields().length);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName("Generates `enum` constants with expected names")
          void whenEnumHasConstantsThenGeneratedEnumClassHasConstantsWithExpectedNames(
              final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.enumUnknownDefaultCase());
            CustomAssertions.assertClassHasEnumConstantsWithNames(
                generatedSource.getClassUnderTest(),
                Arrays.stream(generatedSource.generatedFields())
                    .map(GeneratedField::name)
                    .toArray(String[]::new));
          }

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName(
              "OpenAPI `{schema}.enum.{constants}` -> Generates `enum` constants with expected values")
          void whenEnumHasConstantsThenGeneratedEnumClassHasConstantsWithExpectedValues(
              final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.enumUnknownDefaultCase());
            CustomAssertions.assertClassHasEnumConstantsWithValues(
                generatedSource.getClassUnderTest(),
                Arrays.stream(generatedSource.generatedFields())
                    .map(GeneratedField::enumValue)
                    .toArray());
          }
        }
      }

      @Nested
      @DisplayName("Testing `components.schemas.{schema}.deprecated`")
      class DeprecatedTests {

        @Nested
        @DisplayName("Testing `components.schemas.{schema}.deprecated: false`")
        class DeprecatedFalseTests {
          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `enum` class is NOT annotated with `@Deprecated`")
          void whenEnumIsNotDeprecatedThenGeneratedEnumClassNotIsAnnotatedDeprecated(
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
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `enum` class is annotated with `@Deprecated`")
          void whenEnumIsDeprecatedThenGeneratedEnumClassIsAnnotatedDeprecated(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.isDeprecated());
            CustomAssertions.assertClassIsAnnotatedWith(
                generatedSource.getClassUnderTest(), Deprecated.class);
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
      @DisplayName("Testing `<additionalEnumTypeAnnotations>`")
      class AdditionalEnumTypeAnnotationsTests {

        @Nested
        @DisplayName("Testing `<additionalEnumTypeAnnotations></additionalEnumTypeAnnotations>`")
        class AdditionalEnumTypeAnnotationsUnsetTests {

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `enum` class is NOT annotated with additional annotations")
          void
              whenConfigOptionAdditionalEnumTypeAnnotationsIsUnsetThenGeneratedEnumDoesNotHaveAdditionalAnnotations(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.hasAdditionalEnumTypeAnnotations());

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
            "Testing `<additionalEnumTypeAnnotations>@TestAnnotationOne;@TestAnnotationTwo;@TestAnnotationThree</additionalEnumTypeAnnotations>`")
        class AdditionalEnumTypeAnnotationsSetTests {

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `enum` class is annotated with additional annotations")
          void
              whenConfigOptionAdditionalEnumTypeAnnotationsIsSetThenGeneratedEnumHasAdditionalAnnotations(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.hasAdditionalEnumTypeAnnotations());

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
      @DisplayName("Testing `<useEnumCaseInsensitive>`")
      class UseEnumCaseInsensitiveTests {

        @ParameterizedTest
        @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
        @DisplayName("Generated `enum` class ALWAYS has a `static fromValue(T)` method")
        void alwaysGenerateEnumClassWithStaticFromValueMethod(
            final GeneratedSource generatedSource) {
          CustomAssertions.assertClassHasMethod(
              generatedSource.getClassUnderTest(), "fromValue", generatedSource.fieldClasses()[0]);
        }

        @ParameterizedTest
        @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
        @DisplayName(
            "Generated `static fromValue(T)` method ALWAYS `throw IllegalArgumentException` when `null` is given")
        void alwaysThrowIllegalArgumentExceptionWhenProvidingNullAsArgumentToStaticFromValueMethod(
            final GeneratedSource generatedSource) {
          Assumptions.assumeFalse(generatedSource.enumUnknownDefaultCase());
          CustomAssertions.assertStaticMethodThrowsWhenInvoked(
              CustomAssertions.assertClassHasMethod(
                  generatedSource.getClassUnderTest(),
                  "fromValue",
                  generatedSource.fieldClasses()[0]),
              IllegalArgumentException.class,
              (Object) null);
        }

        @ParameterizedTest
        @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
        @DisplayName(
            "Generated `static fromValue(T)` method ALWAYS `throw IllegalArgumentException` when non-matching string `value` is given")
        void
            alwaysThrowIllegalArgumentExceptionWhenProvidingNonMatchingStringValueAsArgumentToStaticFromValueMethod(
                final GeneratedSource generatedSource) {
          Assumptions.assumeFalse(generatedSource.enumUnknownDefaultCase());
          Assumptions.assumeTrue(String.class.equals(generatedSource.generatedFields()[0].type()));

          CustomAssertions.assertStaticMethodThrowsWhenInvoked(
              CustomAssertions.assertClassHasMethod(
                  generatedSource.getClassUnderTest(),
                  "fromValue",
                  generatedSource.fieldClasses()[0]),
              IllegalArgumentException.class,
              "invalid");
        }

        @ParameterizedTest
        @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
        @DisplayName(
            "Generated `static fromValue(T)` method ALWAYS `throw IllegalArgumentException` when non-matching integer `value` is given")
        void
            alwaysThrowIllegalArgumentExceptionWhenProvidingNonMatchingIntegerValueAsArgumentToStaticFromValueMethod(
                final GeneratedSource generatedSource) {
          Assumptions.assumeFalse(generatedSource.enumUnknownDefaultCase());
          Assumptions.assumeTrue(Integer.class.equals(generatedSource.generatedFields()[0].type()));

          CustomAssertions.assertStaticMethodThrowsWhenInvoked(
              CustomAssertions.assertClassHasMethod(
                  generatedSource.getClassUnderTest(),
                  "fromValue",
                  generatedSource.fieldClasses()[0]),
              IllegalArgumentException.class,
              42);
        }

        @ParameterizedTest
        @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
        @DisplayName(
            "Generated `static fromValue(T)` method ALWAYS return expected `enum`-constant when `value` match")
        void
            alwaysReturnEnumConstantWhenProvidingExistingEnumValueAsArgumentToStaticFromValueMethod(
                final GeneratedSource generatedSource) {
          final Method fromValueMethod =
              CustomAssertions.assertClassHasMethod(
                  generatedSource.getClassUnderTest(),
                  "fromValue",
                  generatedSource.fieldClasses()[0]);
          for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
            CustomAssertions.assertStaticMethodReturnsNonNull(
                fromValueMethod, generatedField.enumValue());
          }
        }

        @Nested
        @DisplayName("Testing `<useEnumCaseInsensitive>false</useEnumCaseInsensitive>`")
        class UseEnumCaseInsensitiveFalseTests {

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Generated `static fromValue(T)` method throws `IllegalArgumentException` when string `value` has wrong case")
          void
              whenConfigOptionUseEnumCaseInsensitiveIsFalseThenFromValueMethodThrowsIllegalArgumentExceptionWhenGivenValueHasWrongCase(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.enumUnknownDefaultCase());
            Assumptions.assumeFalse(generatedSource.useEnumCaseInsensitive());
            Assumptions.assumeTrue(
                String.class.equals(generatedSource.generatedFields()[0].type()));

            final Method fromValueMethod =
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(),
                    "fromValue",
                    generatedSource.fieldClasses()[0]);
            for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
              final Object enumValue = ((String) generatedField.enumValue()).toLowerCase();
              CustomAssertions.assertStaticMethodThrowsWhenInvoked(
                  fromValueMethod, IllegalArgumentException.class, enumValue);
            }
          }
        }

        @Nested
        @DisplayName("Testing `<useEnumCaseInsensitive>true</useEnumCaseInsensitive>`")
        class UseEnumCaseInsensitiveTrueTests {

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Generated `static fromValue(T)` method returns `enum`-constant when string `value` has different case")
          void
              whenConfigOptionUseEnumCaseInsensitiveIsTrueThenFromValueMethodReturnsEnumConstantWithDifferentCase(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.useEnumCaseInsensitive());
            Assumptions.assumeTrue(
                String.class.equals(generatedSource.generatedFields()[0].type()));

            final Method fromValueMethod =
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(),
                    "fromValue",
                    generatedSource.fieldClasses()[0]);
            for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
              final Object enumValue = ((String) generatedField.enumValue()).toLowerCase();
              CustomAssertions.assertStaticMethodReturnsNonNull(fromValueMethod, enumValue);
            }
          }
        }
      }

      @Nested
      @DisplayName("Testing `<enumUnknownDefaultCase>`")
      class EnumUnknownDefaultCaseTests {

        @Nested
        @DisplayName("Testing `<enumUnknownDefaultCase>false</enumUnknownDefaultCase>`")
        class EnumUnknownDefaultCaseFalseTests {

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName("Generates an `enum` with expected number of constants")
          void
              whenConfigOptionEnumUnknownDefaultCaseIsFalseThenGeneratedEnumClassHasExpectedNumberOfConstants(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.enumUnknownDefaultCase());
            CustomAssertions.assertClassHasEnumConstants(
                generatedSource.getClassUnderTest(), generatedSource.generatedFields().length);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Generated `enum`-class with `String` values does NOT have `\"UNKNOWN_DEFAULT_OPEN_API\"` as a constant")
          void
              whenConfigOptionEnumUnknownDefaultCaseIsFalseThenGeneratedEnumClassDoesNotHaveUnknownDefaultOpenApiEnumConstant(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.enumUnknownDefaultCase());
            Assumptions.assumeTrue(
                String.class.equals(generatedSource.generatedFields()[0].type()));

            CustomAssertions.assertClassDoesNotHaveEnumConstantWithName(
                generatedSource.getClassUnderTest(), "UNKNOWN_DEFAULT_OPEN_API");
          }

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Generated `enum`-class with `Integer` values does NOT have `\"NUMBER_unknown_default_open_api\"` as a constant")
          void
              whenConfigOptionEnumUnknownDefaultCaseIsFalseThenGeneratedEnumClassDoesNotHaveNumberUnknownDefaultOpenApiEnumConstant(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.enumUnknownDefaultCase());
            Assumptions.assumeTrue(
                Integer.class.equals(generatedSource.generatedFields()[0].type()));

            CustomAssertions.assertClassDoesNotHaveEnumConstantWithName(
                generatedSource.getClassUnderTest(), "NUMBER_unknown_default_open_api");
          }

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Generated `static fromValue(T)` method ALWAYS `throw IllegalArgumentException` when `null` is given")
          void
              alwaysThrowIllegalArgumentExceptionWhenProvidingNullAsArgumentToStaticFromValueMethod(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.enumUnknownDefaultCase());

            CustomAssertions.assertStaticMethodThrowsWhenInvoked(
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(),
                    "fromValue",
                    generatedSource.fieldClasses()[0]),
                IllegalArgumentException.class,
                (Object) null);
          }
        }

        @Nested
        @DisplayName("Testing `<enumUnknownDefaultCase>true</enumUnknownDefaultCase>`")
        class EnumUnknownDefaultCaseTrueTests {

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Generates an `enum` with expected number of constants PLUS an additional one constant")
          void
              whenConfigOptionEnumUnknownDefaultCaseIsTrueThenGeneratedEnumClassHasExpectedNumberOfConstantsPlusOne(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.enumUnknownDefaultCase());
            CustomAssertions.assertClassHasEnumConstants(
                generatedSource.getClassUnderTest(), generatedSource.generatedFields().length + 1);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Generated `enum`-class with `String` values HAS `\"UNKNOWN_DEFAULT_OPEN_API\"` as a constant")
          void
              whenConfigOptionEnumUnknownDefaultCaseIsTrueThenGeneratedEnumClassHasUnknownDefaultOpenApiEnumConstant(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.enumUnknownDefaultCase());
            Assumptions.assumeTrue(
                String.class.equals(generatedSource.generatedFields()[0].type()));

            CustomAssertions.assertClassHasEnumConstantWithName(
                generatedSource.getClassUnderTest(), "UNKNOWN_DEFAULT_OPEN_API");
          }

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Generated `enum`-class with `String` values HAS `\"UNKNOWN_DEFAULT_OPEN_API\"` constant with `value` as `\"unknown_default_open_api\"`")
          void
              whenConfigOptionEnumUnknownDefaultCaseIsTrueThenGeneratedEnumClassHasUnknownDefaultOpenApiEnumConstantWithExpectedStringValue(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.enumUnknownDefaultCase());
            Assumptions.assumeTrue(
                String.class.equals(generatedSource.generatedFields()[0].type()));

            CustomAssertions.assertClassHasEnumConstantWithValue(
                generatedSource.getClassUnderTest(), "unknown_default_open_api");
          }

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Generated `enum`-class with `Integer` values HAS `\"NUMBER_unknown_default_open_api\"` as a constant")
          void
              whenConfigOptionEnumUnknownDefaultCaseIsTrueThenGeneratedEnumClassHasNumberUnknownDefaultOpenApiEnumConstant(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.enumUnknownDefaultCase());
            Assumptions.assumeTrue(
                Integer.class.equals(generatedSource.generatedFields()[0].type()));

            CustomAssertions.assertClassHasEnumConstantWithName(
                generatedSource.getClassUnderTest(), "NUMBER_unknown_default_open_api");
          }

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Generated `enum`-class with `Integer` values HAS `\"NUMBER_unknown_default_open_api\"` constant with `value` as `11184809`")
          void
              whenConfigOptionEnumUnknownDefaultCaseIsTrueThenGeneratedEnumClassHasUnknownDefaultOpenApiEnumConstantWithExpectedIntegerValue(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.enumUnknownDefaultCase());
            Assumptions.assumeTrue(
                Integer.class.equals(generatedSource.generatedFields()[0].type()));

            CustomAssertions.assertClassHasEnumConstantWithValue(
                generatedSource.getClassUnderTest(), 11184809);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Generated `static fromValue(T)` method returns `NUMBER_unknown_default_open_api` when `null` is given")
          void whenConfigOptionEnumUnknownDefaultCaseIsTrueThenFromValueReturnsIntegerDefaultValue(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.enumUnknownDefaultCase());
            Assumptions.assumeTrue(
                Integer.class.equals(generatedSource.generatedFields()[0].type()));
            CustomAssertions.assertStaticMethodReturnsNonNull(
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(),
                    "fromValue",
                    generatedSource.fieldClasses()[0]),
                (Object) null);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Generated `static fromValue(T)` method returns `\"NUMBER_unknown_default_open_api\"` when `null` is given")
          void whenConfigOptionEnumUnknownDefaultCaseIsTrueThenFromValueReturnsStringDefaultValue(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.enumUnknownDefaultCase());
            Assumptions.assumeTrue(
                String.class.equals(generatedSource.generatedFields()[0].type()));

            CustomAssertions.assertStaticMethodReturnsNonNull(
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(),
                    "fromValue",
                    generatedSource.fieldClasses()[0]),
                (Object) null);
          }
        }
      }
    }
  }
}
