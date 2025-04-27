package io.github.chrimle.o2jrm.tests;

import com.fasterxml.jackson.annotation.JsonValue;
import io.github.chrimle.o2jrm.GeneratedSource;
import io.github.chrimle.o2jrm.utils.CustomAssertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

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
      }
    }
  }
}
