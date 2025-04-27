package io.github.chrimle.o2jrm.tests;

import com.fasterxml.jackson.annotation.JsonValue;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.chrimle.o2jrm.GeneratedSource;
import io.github.chrimle.o2jrm.models.GeneratedField;
import io.github.chrimle.o2jrm.tests.IGeneratedEnumTests.IOpenAPITests.ISchemaTests;
import io.github.chrimle.o2jrm.tests.IGeneratedEnumTests.IOpenAPITests.ISchemaTests.IDeprecatedTests;
import io.github.chrimle.o2jrm.tests.IGeneratedEnumTests.IOpenAPITests.ISchemaTests.IEnumTests;
import io.github.chrimle.o2jrm.tests.IGeneratedEnumTests.IOpenAPITests.ISchemaTests.IEnumTests.IConstantsTests;
import io.github.chrimle.o2jrm.utils.CustomAssertions;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.lang.reflect.Method;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
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
 * <p>{@link IOpenAPITests}
 *
 * <ul>
 *   <li>{@link ISchemaTests `components.schemas.{schema}`}
 *   <li>{@link IDeprecatedTests `components.schemas.{schema}.deprecated`}
 *   <li>{@link IEnumTests `components.schemas.{schema}.enum`}
 *   <li>{@link IConstantsTests `components.schemas.{schema}.enum.{constants}`}
 * </ul>
 *
 * <p><b>`openapi-generator` Configurations</b>
 *
 * <p>{@link IGeneratorConfigurationTests}
 *
 * <ul>
 *   <li>{@link ConfigOptionsTests configOptions}
 *   <li>{@link AdditionalEnumTypeAnnotationsTests additionalEnumTypeAnnotations}
 *   <li>{@link UseEnumCaseInsensitiveTests useEnumCaseInsensitive}
 * </ul>
 */
@DisplayName("Test Generated `enum` classes")
public abstract class IGeneratedEnumTests {

  public static final String GENERATED_ENUM_TESTS_METHOD_SOURCE =
      "io.github.chrimle.o2jrm.tests.GeneratedEnumTests#allPluginExecutionsAndGeneratedEnumCombinations";

  @Nested
  @DisplayName("Testing OpenAPI Schemas & Properties")
  class IOpenAPITests {

    @Nested
    @DisplayName("Testing `components.schemas.{schema}`")
    class ISchemaTests {

      @Nested
      @DisplayName("Testing `components.schemas.{schema}.enum`")
      class IEnumTests {

        @ParameterizedTest
        @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
        @DisplayName("Generates an `enum` class")
        void whenIsEnumThenGeneratedClassIsEnumClass(final GeneratedSource generatedSource) {
          CustomAssertions.assertClassIsEnumClass(generatedSource.getClassUnderTest());
        }

        @Nested
        @DisplayName("Testing `getValue()` method")
        class IGetValueMethodTests {

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `enum` classes always has `getValue()`-method")
          void alwaysGenerateGetValueMethod(final GeneratedSource generatedSource) {
            CustomAssertions.assertClassHasMethod(generatedSource.getClassUnderTest(), "getValue");
          }

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName(
              "When `serializationLibrary` is `jackson` Then `getValue()`-method IS annotated with `@JsonValue`")
          void whenSerializationLibraryIsJacksonThenGetValueMethodIsAnnotatedWithJsonValue(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.isSerializationLibraryJackson());

            CustomAssertions.assertMethodIsAnnotatedWith(
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(), "getValue"),
                JsonValue.class);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName(
              "When `serializationLibrary` is NOT `jackson` Then `getValue()`-method is NOT annotated with `@JsonValue`")
          void whenSerializationLibraryIsNotJacksonThenGetValueMethodIsNotAnnotatedWithJsonValue(
              final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.isSerializationLibraryJackson());

            CustomAssertions.assertMethodIsNotAnnotatedWith(
                CustomAssertions.assertClassHasMethod(
                    generatedSource.getClassUnderTest(), "getValue"),
                JsonValue.class);
          }
        }

        @Nested
        @DisplayName("Testing `components.schemas.{schema}.enum.{constants}`")
        class IConstantsTests {

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
      class IDeprecatedTests {

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
  class IGeneratorConfigurationTests {

    @Nested
    @DisplayName("Testing `<library>`")
    class ILibraryTests {

      @Nested
      @DisplayName("Testing `<library>okhttp-gson</library>` (default)")
      class IOkHttpGsonTests {

        @ParameterizedTest
        @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
        @DisplayName("Generated `enum` HAS `validateJsonElement`-method")
        void whenLibraryIsOkHttpGsonThenGeneratedEnumHasValidateJsonElementMethod(
            final GeneratedSource generatedSource) {
          Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());

          CustomAssertions.assertClassHasMethod(
              generatedSource.getClassUnderTest(), "validateJsonElement", JsonElement.class);
        }

        @ParameterizedTest
        @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
        @DisplayName("Generated `validateJsonElement`-method can be invoked with `String`")
        void whenLibraryIsOkHttpGsonThenGeneratedValidateJsonElementMethodCanBeInvokedWithString(
            final GeneratedSource generatedSource) {
          Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());
          Assumptions.assumeTrue(String.class.equals(generatedSource.generatedFields()[0].type()));

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
        @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
        @DisplayName("Generated `validateJsonElement`-method can be invoked with `Integer`")
        void whenLibraryIsOkHttpGsonThenGeneratedValidateJsonElementMethodCanBeInvokedWithInteger(
            final GeneratedSource generatedSource) {
          Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());
          Assumptions.assumeTrue(Integer.class.equals(generatedSource.generatedFields()[0].type()));

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
        @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
        @DisplayName("Generated `validateJsonElement`-method can be invoked with `URI`")
        void whenLibraryIsOkHttpGsonThenGeneratedValidateJsonElementMethodCanBeInvokedWithUri(
            final GeneratedSource generatedSource) {
          Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());
          Assumptions.assumeTrue(URI.class.equals(generatedSource.generatedFields()[0].type()));

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
        class IAdapterInnerClassTests {

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `enum` has `Adapter` inner-class")
          void whenLibraryIsOkHttpGsonThenGeneratedEnumHasAdapterInnerClass(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());

            CustomAssertions.assertClassHasInnerClass(
                generatedSource.getClassUnderTest(), "Adapter");
          }

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `enum` is annotated `@JsonAdapter`")
          void whenLibraryisOkHttpGsonThenGeneratedEnumIsAnnotatedWithJsonAdapter(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());

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
          class IWriteMethodTests {

            @ParameterizedTest
            @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
            @DisplayName("when `JsonWriter` is `null` Then `NullPointerException` is thrown")
            void whenJsonWriterIsNullThenNullPointerExceptionIsThrown(
                final GeneratedSource generatedSource) {
              Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());

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
            @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
            @DisplayName("when `JsonWriter` is NOT `null` Then nothing is thrown")
            void whenJsonWriterIsNotNullThenNothingIsThrown(final GeneratedSource generatedSource) {
              Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());

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
          class IReadMethodTests {

            @ParameterizedTest
            @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
            @DisplayName("when `JsonReader` is `null` Then `NullPointerException` is thrown")
            void whenJsonReaderIsNullThenNullPointerExceptionIsThrown(
                final GeneratedSource generatedSource) {
              Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());

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
            @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
            @DisplayName("when `jsonString` is invalid Then `IllegalArgumentException` is thrown")
            void whenJsonReaderIsInvalidThenIllegalArgumentExceptionIsThrown(
                final GeneratedSource generatedSource) {
              Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());

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
            @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
            @DisplayName("when `JsonReader` is valid Then nothing is thrown")
            void whenJsonReaderIsValidThenNothingIsThrown(final GeneratedSource generatedSource) {
              Assumptions.assumeTrue(generatedSource.isLibraryOkHttpGson());

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
      class IWebClientTests {

        @ParameterizedTest
        @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
        @DisplayName("Generated `enum` does NOT have `validateJsonElement`-method")
        void whenLibraryIsWebClientThenGeneratedEnumDoesNotHaveValidateJsonElementMethod(
            final GeneratedSource generatedSource) {
          Assumptions.assumeTrue(generatedSource.isLibraryWebClient());

          CustomAssertions.assertClassDoesNotHaveMethod(
              generatedSource.getClassUnderTest(), "validateJsonElement", JsonElement.class);
        }

        @ParameterizedTest
        @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
        @DisplayName("Generated `enum` does NOT have `Adapter` inner-class")
        void whenLibraryIsWebClientThenGeneratedEnumDoesNotHaveAdapterInnerClass(
            final GeneratedSource generatedSource) {
          Assumptions.assumeTrue(generatedSource.isLibraryWebClient());

          CustomAssertions.assertClassDoesNotHaveInnerClass(
              generatedSource.getClassUnderTest(), "Adapter");
        }

        @ParameterizedTest
        @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
        @DisplayName("Generated `enum` is NOT annotated `@JsonAdapter`")
        void whenLibraryIsWebClientThenGeneratedEnumIsNotAnnotatedWithJsonAdapter(
            final GeneratedSource generatedSource) {
          Assumptions.assumeTrue(generatedSource.isLibraryWebClient());

          CustomAssertions.assertClassIsNotAnnotatedWith(
              generatedSource.getClassUnderTest(), JsonAdapter.class);
        }
      }
    }
  }
}
