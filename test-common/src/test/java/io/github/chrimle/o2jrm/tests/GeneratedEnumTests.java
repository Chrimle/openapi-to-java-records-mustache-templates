/*
 *   Copyright 2024-2026 Chrimle
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package io.github.chrimle.o2jrm.tests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.chrimle.o2jrm.GeneratedSource;
import io.github.chrimle.o2jrm.annotations.TestAnnotationOne;
import io.github.chrimle.o2jrm.annotations.TestAnnotationThree;
import io.github.chrimle.o2jrm.annotations.TestAnnotationTwo;
import io.github.chrimle.o2jrm.configs.ConfigOption;
import io.github.chrimle.o2jrm.configs.Library;
import io.github.chrimle.o2jrm.interfaces.TestInterfaceOne;
import io.github.chrimle.o2jrm.interfaces.TestInterfaceTwo;
import io.github.chrimle.o2jrm.models.GeneratedField;
import io.github.chrimle.o2jrm.tests.GeneratedEnumTests.GeneratorConfigurationTests.ConfigOptionsTests;
import io.github.chrimle.o2jrm.tests.GeneratedEnumTests.GeneratorConfigurationTests.ConfigOptionsTests.AdditionalEnumTypeAnnotationsTests;
import io.github.chrimle.o2jrm.tests.GeneratedEnumTests.GeneratorConfigurationTests.ConfigOptionsTests.UseEnumCaseInsensitiveTests;
import io.github.chrimle.o2jrm.tests.GeneratedEnumTests.OpenAPITests.SchemaTests;
import io.github.chrimle.o2jrm.tests.GeneratedEnumTests.OpenAPITests.SchemaTests.DeprecatedTests;
import io.github.chrimle.o2jrm.tests.GeneratedEnumTests.OpenAPITests.SchemaTests.EnumTests;
import io.github.chrimle.o2jrm.tests.GeneratedEnumTests.OpenAPITests.SchemaTests.EnumTests.ConstantsTests;
import io.github.chrimle.o2jrm.utils.CustomAssertions;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.io.StringReader;
import java.lang.reflect.Method;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

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
public abstract class GeneratedEnumTests {

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
        @ArgumentsSource(GeneratedEnumProvider.class)
        @DisplayName("Generates an `enum` class")
        void whenIsEnumThenGeneratedClassIsEnumClass(final GeneratedSource generatedSource) {
          CustomAssertions.assertClassIsEnumClass(generatedSource.getClassUnderTest());
        }

        @Nested
        @DisplayName("Testing `getValue()` method")
        class GetValueMethodTests {

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @DisplayName("Generated `enum` classes always has `getValue()`-method")
          void alwaysGenerateGetValueMethod(final GeneratedSource generatedSource) {
            CustomAssertions.assertClassHasMethod(generatedSource.getClassUnderTest(), "getValue");
          }

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(isOneOfLibraries = Library.WEBCLIENT)
          @DisplayName(
              "When `serializationLibrary` is `jackson` Then `getValue()`-method IS annotated with `@JsonValue`")
          @DisabledIf("io.github.chrimle.o2jrm.tests.GeneratedEnumImplTests#isSpringGenerator")
          void whenSerializationLibraryIsJacksonThenGetValueMethodIsAnnotatedWithJsonValue(
              final GeneratedSource generatedSource) {
            CustomAssertions.assertMethodIsAnnotatedWith(
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(), "getValue"),
                JsonValue.class);
          }

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(isOneOfLibraries = {Library.OKHTTP_GSON, Library.SPRING_BOOT})
          @DisplayName(
              "When `serializationLibrary` is NOT `jackson` Then `getValue()`-method is NOT annotated with `@JsonValue`")
          void whenSerializationLibraryIsNotJacksonThenGetValueMethodIsNotAnnotatedWithJsonValue(
              final GeneratedSource generatedSource) {
            CustomAssertions.assertMethodIsNotAnnotatedWith(
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(), "getValue"),
                JsonValue.class);
          }
        }

        @Nested
        @DisplayName("Testing `components.schemas.{schema}.enum.{constants}`")
        class ConstantsTests {

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(disabledConfigOptions = ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE)
          @DisplayName("Generates an `enum` with expected number of constants")
          void whenEnumHasConstantsThenGeneratedEnumClassHasExpectedNumberOfConstants(
              final GeneratedSource generatedSource) {
            CustomAssertions.assertClassHasEnumConstants(
                generatedSource.getClassUnderTest(), generatedSource.generatedFields().length);
          }

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(disabledConfigOptions = ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE)
          @DisplayName("Generates `enum` constants with expected names")
          void whenEnumHasConstantsThenGeneratedEnumClassHasConstantsWithExpectedNames(
              final GeneratedSource generatedSource) {
            CustomAssertions.assertClassHasEnumConstantsWithNames(
                generatedSource.getClassUnderTest(),
                Arrays.stream(generatedSource.generatedFields())
                    .map(GeneratedField::name)
                    .toArray(String[]::new));
          }

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(disabledConfigOptions = ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE)
          @DisplayName(
              "OpenAPI `{schema}.enum.{constants}` -> Generates `enum` constants with expected values")
          void whenEnumHasConstantsThenGeneratedEnumClassHasConstantsWithExpectedValues(
              final GeneratedSource generatedSource) {
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
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(isDeprecated = Condition.FALSE)
          @DisplayName("Generated `enum` class is NOT annotated with `@Deprecated`")
          void whenEnumIsNotDeprecatedThenGeneratedEnumClassNotIsAnnotatedDeprecated(
              final GeneratedSource generatedSource) {
            CustomAssertions.assertClassIsNotAnnotatedWith(
                generatedSource.getClassUnderTest(), Deprecated.class);
          }
        }

        @Nested
        @DisplayName("Testing `components.schemas.{schema}.deprecated: true`")
        class DeprecatedTrueTests {
          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(isDeprecated = Condition.TRUE)
          @DisplayName("Generated `enum` class is annotated with `@Deprecated`")
          void whenEnumIsDeprecatedThenGeneratedEnumClassIsAnnotatedDeprecated(
              final GeneratedSource generatedSource) {
            CustomAssertions.assertClassIsAnnotatedWith(
                generatedSource.getClassUnderTest(), Deprecated.class);
          }
        }
      }

      @Nested
      @DisplayName("Testing `components.schemas.{schema}.x-implements`")
      class XImplementsTests {
        @ParameterizedTest
        @ArgumentsSource(GeneratedEnumProvider.class)
        @AssumptionFilter(hasXImplements = Condition.FALSE)
        @DisplayName("Generated `enum` class does NOT `implements` any interfaces")
        void whenEnumHasNoXImplementsThenGeneratedEnumClassDoesNotImplementInterfaces(
            final GeneratedSource generatedSource) {
          CustomAssertions.assertClassDoesNotImplementInterface(
              generatedSource.getClassUnderTest(), TestInterfaceOne.class);
          CustomAssertions.assertClassDoesNotImplementInterface(
              generatedSource.getClassUnderTest(), TestInterfaceTwo.class);
        }

        @ParameterizedTest
        @ArgumentsSource(GeneratedEnumProvider.class)
        @AssumptionFilter(hasXImplements = Condition.TRUE)
        @DisplayName("Generated `enum` class DOES `implements` expected interfaces")
        void whenEnumHasXImplementsThenGeneratedEnumClassImplementInterfaces(
            final GeneratedSource generatedSource) {
          for (final var expectedInterface : generatedSource.getXImplementsInterfaces()) {
            CustomAssertions.assertClassImplementsInterface(
                generatedSource.getClassUnderTest(), expectedInterface);
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
        @ArgumentsSource(GeneratedEnumProvider.class)
        @AssumptionFilter(isOneOfLibraries = {Library.OKHTTP_GSON, Library.SPRING_BOOT})
        @DisplayName("Generated `enum` HAS `validateJsonElement`-method")
        void whenLibraryIsOkHttpGsonThenGeneratedEnumHasValidateJsonElementMethod(
            final GeneratedSource generatedSource) {
          CustomAssertions.assertClassHasMethod(
              generatedSource.getClassUnderTest(), "validateJsonElement", JsonElement.class);
        }

        @ParameterizedTest
        @ArgumentsSource(GeneratedEnumProvider.class)
        @AssumptionFilter(
            isOneOfLibraries = {Library.OKHTTP_GSON, Library.SPRING_BOOT},
            enumValueClass = String.class)
        @DisplayName("Generated `validateJsonElement`-method can be invoked with `String`")
        void whenLibraryIsOkHttpGsonThenGeneratedValidateJsonElementMethodCanBeInvokedWithString(
            final GeneratedSource generatedSource) {
          final Method validateJsonElementMethod =
              CustomAssertions.assertClassHasMethod(
                  generatedSource.getClassUnderTest(), "validateJsonElement", JsonElement.class);
          for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
            final JsonElement jsonObject =
                JsonParser.parseString("{'testArg': '" + generatedField.enumValue() + "'}");
            CustomAssertions.assertStaticMethodCanBeInvoked(
                validateJsonElementMethod, jsonObject.getAsJsonObject().get("testArg"));
          }
        }

        @ParameterizedTest
        @ArgumentsSource(GeneratedEnumProvider.class)
        @AssumptionFilter(
            isOneOfLibraries = {Library.OKHTTP_GSON, Library.SPRING_BOOT},
            enumValueClass = Integer.class)
        @DisplayName("Generated `validateJsonElement`-method can be invoked with `Integer`")
        void whenLibraryIsOkHttpGsonThenGeneratedValidateJsonElementMethodCanBeInvokedWithInteger(
            final GeneratedSource generatedSource) {
          final Method validateJsonElementMethod =
              CustomAssertions.assertClassHasMethod(
                  generatedSource.getClassUnderTest(), "validateJsonElement", JsonElement.class);
          for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
            final JsonElement jsonObject =
                JsonParser.parseString("{'testArg': " + generatedField.enumValue() + "}");
            CustomAssertions.assertStaticMethodCanBeInvoked(
                validateJsonElementMethod, jsonObject.getAsJsonObject().get("testArg"));
          }
        }

        @ParameterizedTest
        @ArgumentsSource(GeneratedEnumProvider.class)
        @AssumptionFilter(
            isOneOfLibraries = {Library.OKHTTP_GSON, Library.SPRING_BOOT},
            enumValueClass = URI.class)
        @DisplayName("Generated `validateJsonElement`-method can be invoked with `URI`")
        @DisabledIf("io.github.chrimle.o2jrm.tests.GeneratedEnumImplTests#isSpringGenerator")
        void whenLibraryIsOkHttpGsonThenGeneratedValidateJsonElementMethodCanBeInvokedWithUri(
            final GeneratedSource generatedSource) {
          final Method validateJsonElementMethod =
              CustomAssertions.assertClassHasMethod(
                  generatedSource.getClassUnderTest(), "validateJsonElement", JsonElement.class);
          for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
            final JsonElement jsonObject =
                JsonParser.parseString("{'testArg': '" + generatedField.enumValue() + "'}");
            CustomAssertions.assertStaticMethodCanBeInvoked(
                validateJsonElementMethod, jsonObject.getAsJsonObject().get("testArg"));
          }
        }

        @Nested
        @DisplayName("Testing the `Adapter` inner-class")
        class AdapterInnerClassTests {

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(isOneOfLibraries = {Library.OKHTTP_GSON, Library.SPRING_BOOT})
          @DisplayName("Generated `enum` has `Adapter` inner-class")
          void whenLibraryIsOkHttpGsonThenGeneratedEnumHasAdapterInnerClass(
              final GeneratedSource generatedSource) {
            CustomAssertions.assertClassHasInnerClass(
                generatedSource.getClassUnderTest(), "Adapter");
          }

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(isOneOfLibraries = {Library.OKHTTP_GSON, Library.SPRING_BOOT})
          @DisplayName("Generated `enum` is annotated `@JsonAdapter`")
          void whenLibraryIsOkHttpGsonThenGeneratedEnumIsAnnotatedWithJsonAdapter(
              final GeneratedSource generatedSource) {
            final JsonAdapter jsonAdapter =
                CustomAssertions.assertClassIsAnnotatedWith(
                    generatedSource.getClassUnderTest(), JsonAdapter.class);
            Assertions.assertEquals(
                CustomAssertions.assertClassHasInnerClass(
                    generatedSource.getClassUnderTest(), "Adapter"),
                jsonAdapter.value());
          }

          @Nested
          @DisplayName("Testing the `write(JsonWriter, T)`-method")
          class WriteMethodTests {

            @ParameterizedTest
            @ArgumentsSource(GeneratedEnumProvider.class)
            @AssumptionFilter(isOneOfLibraries = {Library.OKHTTP_GSON, Library.SPRING_BOOT})
            @DisplayName("when `JsonWriter` is `null` Then `NullPointerException` is thrown")
            void whenJsonWriterIsNullThenNullPointerExceptionIsThrown(
                final GeneratedSource generatedSource) {
              final Class<?> adapterClass =
                  CustomAssertions.assertClassHasInnerClass(
                      generatedSource.getClassUnderTest(), "Adapter");
              final Object adapterObject =
                  CustomAssertions.assertConstructorCanInstantiateObject(
                      CustomAssertions.assertClassHasConstructor(adapterClass));
              final Method writeMethod =
                  CustomAssertions.assertClassHasMethod(
                      adapterObject.getClass(),
                      "write",
                      JsonWriter.class,
                      generatedSource.getClassUnderTest());
              writeMethod.setAccessible(true);
              CustomAssertions.assertInstanceMethodThrowsWhenInvoked(
                  writeMethod,
                  NullPointerException.class,
                  adapterObject,
                  (JsonWriter) null,
                  generatedSource.getClassUnderTest().getEnumConstants()[0]);
            }

            @ParameterizedTest
            @ArgumentsSource(GeneratedEnumProvider.class)
            @AssumptionFilter(isOneOfLibraries = {Library.OKHTTP_GSON, Library.SPRING_BOOT})
            @DisplayName("when `JsonWriter` is NOT `null` Then nothing is thrown")
            void whenJsonWriterIsNotNullThenNothingIsThrown(final GeneratedSource generatedSource) {
              final Class<?> adapterClass =
                  CustomAssertions.assertClassHasInnerClass(
                      generatedSource.getClassUnderTest(), "Adapter");
              final Object adapterObject =
                  CustomAssertions.assertConstructorCanInstantiateObject(
                      CustomAssertions.assertClassHasConstructor(adapterClass));
              final Method writeMethod =
                  CustomAssertions.assertClassHasMethod(
                      adapterObject.getClass(),
                      "write",
                      JsonWriter.class,
                      generatedSource.getClassUnderTest());
              writeMethod.setAccessible(true);
              CustomAssertions.assertInstanceMethodCanBeInvoked(
                  writeMethod,
                  adapterObject,
                  new JsonWriter(
                      new OutputStreamWriter(
                          OutputStream.nullOutputStream(), StandardCharsets.UTF_8)),
                  generatedSource.getClassUnderTest().getEnumConstants()[0]);
            }
          }

          @Nested
          @DisplayName("Testing the `read(JsonReader)`-method")
          class ReadMethodTests {

            @ParameterizedTest
            @ArgumentsSource(GeneratedEnumProvider.class)
            @AssumptionFilter(isOneOfLibraries = {Library.OKHTTP_GSON, Library.SPRING_BOOT})
            @DisplayName("when `JsonReader` is `null` Then `NullPointerException` is thrown")
            void whenJsonReaderIsNullThenNullPointerExceptionIsThrown(
                final GeneratedSource generatedSource) {
              final Class<?> adapterClass =
                  CustomAssertions.assertClassHasInnerClass(
                      generatedSource.getClassUnderTest(), "Adapter");
              final Object adapterObject =
                  CustomAssertions.assertConstructorCanInstantiateObject(
                      CustomAssertions.assertClassHasConstructor(adapterClass));
              final Method readMethod =
                  CustomAssertions.assertClassHasMethod(
                      adapterObject.getClass(), "read", JsonReader.class);
              readMethod.setAccessible(true);
              CustomAssertions.assertInstanceMethodThrowsWhenInvoked(
                  readMethod, NullPointerException.class, adapterObject, (JsonReader) null);
            }

            @ParameterizedTest
            @ArgumentsSource(GeneratedEnumProvider.class)
            @AssumptionFilter(isOneOfLibraries = {Library.OKHTTP_GSON, Library.SPRING_BOOT})
            @DisplayName("when `jsonString` is invalid Then `IllegalArgumentException` is thrown")
            void whenJsonReaderIsInvalidThenIllegalArgumentExceptionIsThrown(
                final GeneratedSource generatedSource) {
              final Class<?> adapterClass =
                  CustomAssertions.assertClassHasInnerClass(
                      generatedSource.getClassUnderTest(), "Adapter");
              final Object adapterObject =
                  CustomAssertions.assertConstructorCanInstantiateObject(
                      CustomAssertions.assertClassHasConstructor(adapterClass));
              final Method readMethod =
                  CustomAssertions.assertClassHasMethod(
                      adapterObject.getClass(), "read", JsonReader.class);
              readMethod.setAccessible(true);

              if (generatedSource.enumUnknownDefaultCase()) {
                CustomAssertions.assertInstanceMethodReturnsNonNull(
                    readMethod, adapterObject, new JsonReader(new StringReader("\"42\"")));
              } else {
                CustomAssertions.assertInstanceMethodThrowsWhenInvoked(
                    readMethod,
                    IllegalArgumentException.class,
                    adapterObject,
                    new JsonReader(new StringReader("\"invalid\"")));
              }
            }

            @ParameterizedTest
            @ArgumentsSource(GeneratedEnumProvider.class)
            @AssumptionFilter(isOneOfLibraries = {Library.OKHTTP_GSON, Library.SPRING_BOOT})
            @DisplayName("when `JsonReader` is valid Then nothing is thrown")
            void whenJsonReaderIsValidThenNothingIsThrown(final GeneratedSource generatedSource) {
              final Class<?> adapterClass =
                  CustomAssertions.assertClassHasInnerClass(
                      generatedSource.getClassUnderTest(), "Adapter");
              final Object adapterObject =
                  CustomAssertions.assertConstructorCanInstantiateObject(
                      CustomAssertions.assertClassHasConstructor(adapterClass));
              final Method readMethod =
                  CustomAssertions.assertClassHasMethod(
                      adapterObject.getClass(), "read", JsonReader.class);
              readMethod.setAccessible(true);
              for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
                CustomAssertions.assertInstanceMethodReturnsNonNull(
                    readMethod,
                    adapterObject,
                    new JsonReader(
                        new StringReader("\"" + generatedField.enumValue().toString() + "\"")));
              }
            }
          }
        }
      }

      @Nested
      @DisplayName("Testing `<library>webclient</library>`")
      @DisabledIf("io.github.chrimle.o2jrm.tests.GeneratedEnumImplTests#isSpringGenerator")
      class WebClientTests {

        @ParameterizedTest
        @ArgumentsSource(GeneratedEnumProvider.class)
        @AssumptionFilter(isOneOfLibraries = {Library.WEBCLIENT})
        @DisplayName("Generated `enum` does NOT have `validateJsonElement`-method")
        void whenLibraryIsWebClientThenGeneratedEnumDoesNotHaveValidateJsonElementMethod(
            final GeneratedSource generatedSource) {
          CustomAssertions.assertClassDoesNotHaveMethod(
              generatedSource.getClassUnderTest(), "validateJsonElement", JsonElement.class);
        }

        @ParameterizedTest
        @ArgumentsSource(GeneratedEnumProvider.class)
        @AssumptionFilter(isOneOfLibraries = {Library.WEBCLIENT})
        @DisplayName("Generated `enum` does NOT have `Adapter` inner-class")
        void whenLibraryIsWebClientThenGeneratedEnumDoesNotHaveAdapterInnerClass(
            final GeneratedSource generatedSource) {
          CustomAssertions.assertClassDoesNotHaveInnerClass(
              generatedSource.getClassUnderTest(), "Adapter");
        }

        @ParameterizedTest
        @ArgumentsSource(GeneratedEnumProvider.class)
        @AssumptionFilter(isOneOfLibraries = {Library.WEBCLIENT})
        @DisplayName("Generated `enum` is NOT annotated `@JsonAdapter`")
        void whenLibraryIsWebClientThenGeneratedEnumIsNotAnnotatedWithJsonAdapter(
            final GeneratedSource generatedSource) {
          CustomAssertions.assertClassIsNotAnnotatedWith(
              generatedSource.getClassUnderTest(), JsonAdapter.class);
        }
      }
    }

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
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(hasAdditionalEnumTypeAnnotations = Condition.FALSE)
          @DisplayName("Generated `enum` class is NOT annotated with additional annotations")
          void
              whenConfigOptionAdditionalEnumTypeAnnotationsIsUnsetThenGeneratedEnumDoesNotHaveAdditionalAnnotations(
                  final GeneratedSource generatedSource) {
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
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(hasAdditionalEnumTypeAnnotations = Condition.TRUE)
          @DisplayName("Generated `enum` class is annotated with additional annotations")
          void
              whenConfigOptionAdditionalEnumTypeAnnotationsIsSetThenGeneratedEnumHasAdditionalAnnotations(
                  final GeneratedSource generatedSource) {
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
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(disabledConfigOptions = ConfigOption.SERIALIZABLE_MODEL)
          @DisplayName("Generated `enum` does NOT implement `Serializable`")
          void
              whenConfigOptionSerializableModelIsFalseThenGeneratedEnumClassDoesNotImplementSerializable(
                  final GeneratedSource generatedSource) {
            CustomAssertions.assertClassDoesNotImplementInterface(
                generatedSource.getClassUnderTest(), Serializable.class);
          }
        }

        @Nested
        @DisplayName("Testing `<serializableModel>true</serializableModel>`")
        class SerializableModelTrueTests {

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(
              isInnerEnum = Condition.FALSE,
              enabledConfigOptions = ConfigOption.SERIALIZABLE_MODEL)
          @DisplayName("Generated OUTER `enum` implement `Serializable`")
          void
              whenConfigOptionSerializableModelIsTrueThenOuterGeneratedEnumClassImplementsSerializable(
                  final GeneratedSource generatedSource) {
            CustomAssertions.assertClassImplementsInterface(
                generatedSource.getClassUnderTest(), Serializable.class);
          }

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(
              isInnerEnum = Condition.TRUE,
              enabledConfigOptions = ConfigOption.SERIALIZABLE_MODEL)
          @DisplayName("Generated INNER `enum` does NOT implement `Serializable`")
          void
              whenConfigOptionSerializableModelIsTrueThenInnerGeneratedEnumClassDoesNotImplementsSerializable(
                  final GeneratedSource generatedSource) {
            CustomAssertions.assertClassDoesNotImplementInterface(
                generatedSource.getClassUnderTest(), Serializable.class);
          }
        }
      }

      @Nested
      @DisplayName("Testing `<useEnumCaseInsensitive>`")
      class UseEnumCaseInsensitiveTests {

        @ParameterizedTest
        @ArgumentsSource(GeneratedEnumProvider.class)
        @DisplayName("Generated `enum` class ALWAYS has a `static fromValue(T)` method")
        void alwaysGenerateEnumClassWithStaticFromValueMethod(
            final GeneratedSource generatedSource) {
          CustomAssertions.assertClassHasMethod(
              generatedSource.getClassUnderTest(), "fromValue", generatedSource.fieldClasses()[0]);
        }

        @ParameterizedTest
        @ArgumentsSource(GeneratedEnumProvider.class)
        @AssumptionFilter(isOneOfLibraries = Library.WEBCLIENT)
        @DisplayName(
            "When `serializationLibrary` is `jackson` Then generated `fromValue(T)` method is annotated with `@JsonCreator`")
        @DisabledIf("io.github.chrimle.o2jrm.tests.GeneratedEnumImplTests#isSpringGenerator")
        void whenSerializationLibraryIsJacksonThenFromValueMethodIsAnnotatedWithJsonCreator(
            final GeneratedSource generatedSource) {
          CustomAssertions.assertMethodIsAnnotatedWith(
              CustomAssertions.assertClassHasMethod(
                  generatedSource.getClassUnderTest(),
                  "fromValue",
                  generatedSource.fieldClasses()[0]),
              JsonCreator.class);
        }

        @ParameterizedTest
        @ArgumentsSource(GeneratedEnumProvider.class)
        @AssumptionFilter(isOneOfLibraries = {Library.OKHTTP_GSON, Library.SPRING_BOOT})
        @DisplayName(
            "When `serializationLibrary` is NOT `jackson` Then generated `fromValue(T)` method is NOT annotated with `@JsonCreator`")
        void whenSerializationLibraryIsNotJacksonThenFromValueMethodIsNotAnnotatedWithJsonCreator(
            final GeneratedSource generatedSource) {
          CustomAssertions.assertMethodIsNotAnnotatedWith(
              CustomAssertions.assertClassHasMethod(
                  generatedSource.getClassUnderTest(),
                  "fromValue",
                  generatedSource.fieldClasses()[0]),
              JsonCreator.class);
        }

        @ParameterizedTest
        @ArgumentsSource(GeneratedEnumProvider.class)
        @AssumptionFilter(disabledConfigOptions = ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE)
        @DisplayName(
            "Generated `static fromValue(T)` method ALWAYS `throw IllegalArgumentException` when `null` is given")
        void alwaysThrowIllegalArgumentExceptionWhenProvidingNullAsArgumentToStaticFromValueMethod(
            final GeneratedSource generatedSource) {
          CustomAssertions.assertStaticMethodThrowsWhenInvoked(
              CustomAssertions.assertClassHasMethod(
                  generatedSource.getClassUnderTest(),
                  "fromValue",
                  generatedSource.fieldClasses()[0]),
              IllegalArgumentException.class,
              (Object) null);
        }

        @ParameterizedTest
        @ArgumentsSource(GeneratedEnumProvider.class)
        @AssumptionFilter(
            disabledConfigOptions = ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE,
            enumValueClass = String.class)
        @DisplayName(
            "Generated `static fromValue(T)` method ALWAYS `throw IllegalArgumentException` when non-matching string `value` is given")
        void
            alwaysThrowIllegalArgumentExceptionWhenProvidingNonMatchingStringValueAsArgumentToStaticFromValueMethod(
                final GeneratedSource generatedSource) {
          CustomAssertions.assertStaticMethodThrowsWhenInvoked(
              CustomAssertions.assertClassHasMethod(
                  generatedSource.getClassUnderTest(),
                  "fromValue",
                  generatedSource.fieldClasses()[0]),
              IllegalArgumentException.class,
              "invalid");
        }

        @ParameterizedTest
        @ArgumentsSource(GeneratedEnumProvider.class)
        @AssumptionFilter(
            disabledConfigOptions = ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE,
            enumValueClass = Integer.class)
        @DisplayName(
            "Generated `static fromValue(T)` method ALWAYS `throw IllegalArgumentException` when non-matching integer `value` is given")
        void
            alwaysThrowIllegalArgumentExceptionWhenProvidingNonMatchingIntegerValueAsArgumentToStaticFromValueMethod(
                final GeneratedSource generatedSource) {
          CustomAssertions.assertStaticMethodThrowsWhenInvoked(
              CustomAssertions.assertClassHasMethod(
                  generatedSource.getClassUnderTest(),
                  "fromValue",
                  generatedSource.fieldClasses()[0]),
              IllegalArgumentException.class,
              42);
        }

        @ParameterizedTest
        @ArgumentsSource(GeneratedEnumProvider.class)
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
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(
              disabledConfigOptions = {
                ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE,
                ConfigOption.USE_ENUM_CASE_INSENSITIVE
              },
              enumValueClass = String.class)
          @DisplayName(
              "Generated `static fromValue(T)` method throws `IllegalArgumentException` when string `value` has wrong case")
          @DisabledIf(
              "io.github.chrimle.o2jrm.tests.GeneratedEnumImplTests#isSpringGenerator") // not sure
          // why...
          void
              whenConfigOptionUseEnumCaseInsensitiveIsFalseThenFromValueMethodThrowsIllegalArgumentExceptionWhenGivenValueHasWrongCase(
                  final GeneratedSource generatedSource) {
            final Method fromValueMethod =
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(),
                    "fromValue",
                    generatedSource.fieldClasses()[0]);
            for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
              final Object enumValue =
                  ((String) generatedField.enumValue()).toLowerCase(Locale.ROOT);
              CustomAssertions.assertStaticMethodThrowsWhenInvoked(
                  fromValueMethod, IllegalArgumentException.class, enumValue);
            }
          }
        }

        @Nested
        @DisplayName("Testing `<useEnumCaseInsensitive>true</useEnumCaseInsensitive>`")
        @DisabledIf("io.github.chrimle.o2jrm.tests.GeneratedEnumImplTests#isSpringGenerator")
        class UseEnumCaseInsensitiveTrueTests {

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(
              enabledConfigOptions = ConfigOption.USE_ENUM_CASE_INSENSITIVE,
              enumValueClass = String.class)
          @DisplayName(
              "Generated `static fromValue(T)` method returns `enum`-constant when string `value` has different case")
          void
              whenConfigOptionUseEnumCaseInsensitiveIsTrueThenFromValueMethodReturnsEnumConstantWithDifferentCase(
                  final GeneratedSource generatedSource) {
            final Method fromValueMethod =
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(),
                    "fromValue",
                    generatedSource.fieldClasses()[0]);
            for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
              final Object enumValue =
                  ((String) generatedField.enumValue()).toLowerCase(Locale.ROOT);
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
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(disabledConfigOptions = ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE)
          @DisplayName("Generates an `enum` with expected number of constants")
          void
              whenConfigOptionEnumUnknownDefaultCaseIsFalseThenGeneratedEnumClassHasExpectedNumberOfConstants(
                  final GeneratedSource generatedSource) {
            CustomAssertions.assertClassHasEnumConstants(
                generatedSource.getClassUnderTest(), generatedSource.generatedFields().length);
          }

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(
              disabledConfigOptions = ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE,
              enumValueClass = String.class)
          @DisplayName(
              "Generated `enum`-class with `String` values does NOT have `\"UNKNOWN_DEFAULT_OPEN_API\"` as a constant")
          void
              whenConfigOptionEnumUnknownDefaultCaseIsFalseThenGeneratedEnumClassDoesNotHaveUnknownDefaultOpenApiEnumConstant(
                  final GeneratedSource generatedSource) {
            CustomAssertions.assertClassDoesNotHaveEnumConstantWithName(
                generatedSource.getClassUnderTest(), "UNKNOWN_DEFAULT_OPEN_API");
          }

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(
              disabledConfigOptions = ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE,
              enumValueClass = Integer.class)
          @DisplayName(
              "Generated `enum`-class with `Integer` values does NOT have `\"NUMBER_unknown_default_open_api\"` as a constant")
          void
              whenConfigOptionEnumUnknownDefaultCaseIsFalseThenGeneratedEnumClassDoesNotHaveNumberUnknownDefaultOpenApiEnumConstant(
                  final GeneratedSource generatedSource) {
            CustomAssertions.assertClassDoesNotHaveEnumConstantWithName(
                generatedSource.getClassUnderTest(), "NUMBER_unknown_default_open_api");
          }

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(
              disabledConfigOptions = ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE,
              enumValueClass = URI.class)
          @DisplayName(
              "Generated `enum`-class with `URI` values does NOT have `\"UNKNOWN_DEFAULT_OPEN_API\"` as a constant")
          @DisabledIf("io.github.chrimle.o2jrm.tests.GeneratedEnumImplTests#isSpringGenerator")
          void
              whenConfigOptionEnumUnknownDefaultCaseIsFalseThenGeneratedEnumClassDoesNotHaveUriUnknownDefaultOpenApiEnumConstant(
                  final GeneratedSource generatedSource) {
            CustomAssertions.assertClassDoesNotHaveEnumConstantWithName(
                generatedSource.getClassUnderTest(), "UNKNOWN_DEFAULT_OPEN_API");
          }

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(disabledConfigOptions = ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE)
          @DisplayName(
              "Generated `static fromValue(T)` method ALWAYS `throw IllegalArgumentException` when `null` is given")
          void
              alwaysThrowIllegalArgumentExceptionWhenProvidingNullAsArgumentToStaticFromValueMethod(
                  final GeneratedSource generatedSource) {
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
        @DisabledIf("io.github.chrimle.o2jrm.tests.GeneratedEnumImplTests#isSpringGenerator")
        class EnumUnknownDefaultCaseTrueTests {

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(enabledConfigOptions = ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE)
          @DisplayName(
              "Generates an `enum` with expected number of constants PLUS an additional one constant")
          void
              whenConfigOptionEnumUnknownDefaultCaseIsTrueThenGeneratedEnumClassHasExpectedNumberOfConstantsPlusOne(
                  final GeneratedSource generatedSource) {
            CustomAssertions.assertClassHasEnumConstants(
                generatedSource.getClassUnderTest(), generatedSource.generatedFields().length + 1);
          }

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(
              enabledConfigOptions = ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE,
              enumValueClass = String.class)
          @DisplayName(
              "Generated `enum`-class with `String` values HAS `\"UNKNOWN_DEFAULT_OPEN_API\"` as a constant")
          void
              whenConfigOptionEnumUnknownDefaultCaseIsTrueThenGeneratedEnumClassHasUnknownDefaultOpenApiEnumConstant(
                  final GeneratedSource generatedSource) {
            CustomAssertions.assertClassHasEnumConstantWithName(
                generatedSource.getClassUnderTest(), "UNKNOWN_DEFAULT_OPEN_API");
          }

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(
              enabledConfigOptions = ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE,
              enumValueClass = String.class)
          @DisplayName(
              "Generated `enum`-class with `String` values HAS `\"UNKNOWN_DEFAULT_OPEN_API\"` constant with `value` as `\"unknown_default_open_api\"`")
          void
              whenConfigOptionEnumUnknownDefaultCaseIsTrueThenGeneratedEnumClassHasUnknownDefaultOpenApiEnumConstantWithExpectedStringValue(
                  final GeneratedSource generatedSource) {
            CustomAssertions.assertClassHasEnumConstantWithValue(
                generatedSource.getClassUnderTest(), "unknown_default_open_api");
          }

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(
              enabledConfigOptions = ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE,
              enumValueClass = URI.class)
          @DisplayName(
              "Generated `enum`-class with `URI` values HAS `\"UNKNOWN_DEFAULT_OPEN_API\"` as a constant")
          void
              whenConfigOptionEnumUnknownDefaultCaseIsTrueThenGeneratedEnumClassHasUriUnknownDefaultOpenApiEnumConstant(
                  final GeneratedSource generatedSource) {
            CustomAssertions.assertClassHasEnumConstantWithName(
                generatedSource.getClassUnderTest(), "UNKNOWN_DEFAULT_OPEN_API");
          }

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(
              enabledConfigOptions = ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE,
              enumValueClass = URI.class)
          @DisplayName(
              "Generated `enum`-class with `URI` values HAS `\"UNKNOWN_DEFAULT_OPEN_API\"` constant with `value` as `URI.create(\"11184809\")`")
          void
              whenConfigOptionEnumUnknownDefaultCaseIsTrueThenGeneratedEnumClassHasUnknownDefaultOpenApiEnumConstantWithExpectedUriValue(
                  final GeneratedSource generatedSource) {
            CustomAssertions.assertClassHasEnumConstantWithValue(
                generatedSource.getClassUnderTest(), URI.create("11184809"));
          }

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(
              enabledConfigOptions = ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE,
              enumValueClass = Integer.class)
          @DisplayName(
              "Generated `enum`-class with `Integer` values HAS `\"NUMBER_unknown_default_open_api\"` as a constant")
          void
              whenConfigOptionEnumUnknownDefaultCaseIsTrueThenGeneratedEnumClassHasNumberUnknownDefaultOpenApiEnumConstant(
                  final GeneratedSource generatedSource) {
            CustomAssertions.assertClassHasEnumConstantWithName(
                generatedSource.getClassUnderTest(), "NUMBER_unknown_default_open_api");
          }

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(
              enabledConfigOptions = ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE,
              enumValueClass = Integer.class)
          @DisplayName(
              "Generated `enum`-class with `Integer` values HAS `\"NUMBER_unknown_default_open_api\"` constant with `value` as `11184809`")
          void
              whenConfigOptionEnumUnknownDefaultCaseIsTrueThenGeneratedEnumClassHasUnknownDefaultOpenApiEnumConstantWithExpectedIntegerValue(
                  final GeneratedSource generatedSource) {
            CustomAssertions.assertClassHasEnumConstantWithValue(
                generatedSource.getClassUnderTest(), 11184809);
          }

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(
              enabledConfigOptions = ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE,
              enumValueClass = Integer.class)
          @DisplayName(
              "Generated `static fromValue(T)` method returns `NUMBER_unknown_default_open_api` when `null` is given")
          @DisabledIf("io.github.chrimle.o2jrm.tests.GeneratedEnumImplTests#isSpringGenerator")
          void whenConfigOptionEnumUnknownDefaultCaseIsTrueThenFromValueReturnsIntegerDefaultValue(
              final GeneratedSource generatedSource) {
            CustomAssertions.assertStaticMethodReturnsNonNull(
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(),
                    "fromValue",
                    generatedSource.fieldClasses()[0]),
                (Object) null);
          }

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(
              enabledConfigOptions = ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE,
              enumValueClass = String.class)
          @DisplayName(
              "Generated `static fromValue(T)` method returns `\"NUMBER_unknown_default_open_api\"` when `null` is given")
          void whenConfigOptionEnumUnknownDefaultCaseIsTrueThenFromValueReturnsStringDefaultValue(
              final GeneratedSource generatedSource) {
            CustomAssertions.assertStaticMethodReturnsNonNull(
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(),
                    "fromValue",
                    generatedSource.fieldClasses()[0]),
                (Object) null);
          }

          @ParameterizedTest
          @ArgumentsSource(GeneratedEnumProvider.class)
          @AssumptionFilter(
              enabledConfigOptions = ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE,
              enumValueClass = URI.class)
          @DisplayName(
              "Generated `static fromValue(T)` method returns `\"UNKNOWN_DEFAULT_OPEN_API\"` when `null` is given")
          void whenConfigOptionEnumUnknownDefaultCaseIsTrueThenFromValueReturnsUriDefaultValue(
              final GeneratedSource generatedSource) {
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
