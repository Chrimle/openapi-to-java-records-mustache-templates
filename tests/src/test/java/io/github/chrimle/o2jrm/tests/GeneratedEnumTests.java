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

import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.chrimle.o2jrm.GeneratedSource;
import io.github.chrimle.o2jrm.PluginExecutionImpl;
import io.github.chrimle.o2jrm.annotations.TestAnnotationOne;
import io.github.chrimle.o2jrm.annotations.TestAnnotationThree;
import io.github.chrimle.o2jrm.annotations.TestAnnotationTwo;
import io.github.chrimle.o2jrm.models.GeneratedClass;
import io.github.chrimle.o2jrm.models.GeneratedClassImpl;
import io.github.chrimle.o2jrm.models.GeneratedEnumImpl;
import io.github.chrimle.o2jrm.models.GeneratedField;
import io.github.chrimle.o2jrm.utils.CustomAssertions;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.stream.Stream;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test Generated `enum` classes")
final class GeneratedEnumTests extends IGeneratedEnumTests implements GeneratedClassTests {

  @SuppressWarnings("unused")
  static Stream<Arguments> allPluginExecutionsAndGeneratedEnumCombinations() {
    return Stream.of(PluginExecutionImpl.values())
        .flatMap(
            pluginExecution ->
                Stream.of(GeneratedEnumImpl.values())
                    .map(
                        generatedEnum ->
                            new GeneratedSource(
                                pluginExecution,
                                generatedEnum,
                                GeneratedClassImpl.getGeneratedFields(
                                    generatedEnum, pluginExecution),
                                GeneratedClass.getClass(generatedEnum, pluginExecution))))
        .map(Arguments::of);
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
            "When `serializationLibrary` is `jackson` Then generated `fromValue(T)` method is annotated with `@JsonCreator`")
        void whenSerializationLibraryIsJacksonThenFromValueMethodIsAnnotatedWithJsonCreator(
            final GeneratedSource generatedSource) {
          Assumptions.assumeTrue(generatedSource.isSerializationLibraryJackson());

          CustomAssertions.assertMethodIsAnnotatedWith(
              CustomAssertions.assertClassHasMethod(
                  generatedSource.getClassUnderTest(),
                  "fromValue",
                  generatedSource.fieldClasses()[0]),
              JsonCreator.class);
        }

        @ParameterizedTest
        @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
        @DisplayName(
            "When `serializationLibrary` is NOT `jackson` Then generated `fromValue(T)` method is NOT annotated with `@JsonCreator`")
        void whenSerializationLibraryIsNotJacksonThenFromValueMethodIsNotAnnotatedWithJsonCreator(
            final GeneratedSource generatedSource) {
          Assumptions.assumeFalse(generatedSource.isSerializationLibraryJackson());

          CustomAssertions.assertMethodIsNotAnnotatedWith(
              CustomAssertions.assertClassHasMethod(
                  generatedSource.getClassUnderTest(),
                  "fromValue",
                  generatedSource.fieldClasses()[0]),
              JsonCreator.class);
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
              "Generated `enum`-class with `URI` values does NOT have `\"UNKNOWN_DEFAULT_OPEN_API\"` as a constant")
          void
              whenConfigOptionEnumUnknownDefaultCaseIsFalseThenGeneratedEnumClassDoesNotHaveUriUnknownDefaultOpenApiEnumConstant(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.enumUnknownDefaultCase());
            Assumptions.assumeTrue(URI.class.equals(generatedSource.generatedFields()[0].type()));

            CustomAssertions.assertClassDoesNotHaveEnumConstantWithName(
                generatedSource.getClassUnderTest(), "UNKNOWN_DEFAULT_OPEN_API");
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
              "Generated `enum`-class with `URI` values HAS `\"UNKNOWN_DEFAULT_OPEN_API\"` as a constant")
          void
              whenConfigOptionEnumUnknownDefaultCaseIsTrueThenGeneratedEnumClassHasUriUnknownDefaultOpenApiEnumConstant(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.enumUnknownDefaultCase());
            Assumptions.assumeTrue(URI.class.equals(generatedSource.generatedFields()[0].type()));

            CustomAssertions.assertClassHasEnumConstantWithName(
                generatedSource.getClassUnderTest(), "UNKNOWN_DEFAULT_OPEN_API");
          }

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Generated `enum`-class with `URI` values HAS `\"UNKNOWN_DEFAULT_OPEN_API\"` constant with `value` as `URI.create(\"11184809\")`")
          void
              whenConfigOptionEnumUnknownDefaultCaseIsTrueThenGeneratedEnumClassHasUnknownDefaultOpenApiEnumConstantWithExpectedUriValue(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.enumUnknownDefaultCase());
            Assumptions.assumeTrue(URI.class.equals(generatedSource.generatedFields()[0].type()));

            CustomAssertions.assertClassHasEnumConstantWithValue(
                generatedSource.getClassUnderTest(), URI.create("11184809"));
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

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName(
              "Generated `static fromValue(T)` method returns `\"UNKNOWN_DEFAULT_OPEN_API\"` when `null` is given")
          void whenConfigOptionEnumUnknownDefaultCaseIsTrueThenFromValueReturnsUriDefaultValue(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.enumUnknownDefaultCase());
            Assumptions.assumeTrue(URI.class.equals(generatedSource.generatedFields()[0].type()));

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
