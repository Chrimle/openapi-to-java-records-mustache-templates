package io.github.chrimle.o2jrm.tests;

import com.fasterxml.jackson.annotation.JsonValue;
import io.github.chrimle.o2jrm.GeneratedSource;
import io.github.chrimle.o2jrm.models.GeneratedField;
import io.github.chrimle.o2jrm.tests.IGeneratedEnumTests.IOpenAPITests.ISchemaTests;
import io.github.chrimle.o2jrm.tests.IGeneratedEnumTests.IOpenAPITests.ISchemaTests.IDeprecatedTests;
import io.github.chrimle.o2jrm.tests.IGeneratedEnumTests.IOpenAPITests.ISchemaTests.IEnumTests;
import io.github.chrimle.o2jrm.tests.IGeneratedEnumTests.IOpenAPITests.ISchemaTests.IEnumTests.IConstantsTests;
import io.github.chrimle.o2jrm.utils.CustomAssertions;
import java.util.Arrays;
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
 * <p>{@link GeneratorConfigurationTests}
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
}
