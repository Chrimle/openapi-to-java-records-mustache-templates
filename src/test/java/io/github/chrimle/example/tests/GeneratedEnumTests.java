package io.github.chrimle.example.tests;

import io.github.chrimle.example.GeneratedSource;
import io.github.chrimle.example.utils.AssertionUtils;
import io.github.chrimle.example.utils.GeneratedEnumTestUtils;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/** Class for testing generated {@code enum} classes. */
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
          AssertionUtils.assertIsEnum(generatedSource.getClassUnderTest());
        }

        @Nested
        @DisplayName("Testing `components.schemas.{schema}.enum.{constants}`")
        class ConstantsTests {
          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName("Generates an `enum` with expected number of constants")
          void whenEnumHasConstantsThenGeneratedEnumClassHasExpectedNumberOfConstants(
              final GeneratedSource generatedSource) {
            GeneratedEnumTestUtils.assertEnumHasNumberOfConstants(generatedSource);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName("Generates `enum` constants with expected names")
          void whenEnumHasConstantsThenGeneratedEnumClassHasConstantsWithExpectedNames(
              final GeneratedSource generatedSource) {
            GeneratedEnumTestUtils.assertEnumNames(generatedSource);
          }

          @ParameterizedTest
          @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
          @DisplayName(
              "OpenAPI `{schema}.enum.{constants}` -> Generates `enum` constants with expected values")
          void whenEnumHasConstantsThenGeneratedEnumClassHasConstantsWithExpectedValues(
              final GeneratedSource generatedSource) {
            GeneratedEnumTestUtils.assertEnumValues(generatedSource);
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
            AssertionUtils.assertClassIsNotAnnotatedWith(
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
            AssertionUtils.assertClassIsAnnotatedWith(
                generatedSource.getClassUnderTest(), Deprecated.class);
          }
        }
      }
    }
  }

  @ParameterizedTest
  @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
  @DisplayName(
      "Configuration `configOptions.additionalEnumTypeAnnotations` -> Annotates generated `enum` class with additional annotations")
  void
      whenConfigOptionAdditionalEnumTypeAnnotationsIsSetThenGeneratedEnumClassHasAdditionalAnnotations(
          final GeneratedSource generatedSource) {
    GeneratedEnumTestUtils.assertHasAdditionalTypeAnnotations(generatedSource);
  }

  @ParameterizedTest
  @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
  @DisplayName(
      "Configuration `configOptions.useEnumCaseInsensitive` -> Generated `enum` class has case-insensitive `fromValue(T)` method")
  void
      whenConfigOptionUseEnumCaseInsensitiveIsSetThenGeneratedEnumClassHasCaseInsensitiveFromValueMethod(
          final GeneratedSource generatedSource) {
    GeneratedEnumTestUtils.assertEnumHasCaseInsensitiveFromValueMethod(generatedSource);
  }
}
