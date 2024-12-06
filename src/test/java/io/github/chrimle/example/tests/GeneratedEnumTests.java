package io.github.chrimle.example.tests;

import io.github.chrimle.example.GeneratedSource;
import io.github.chrimle.example.utils.AssertionUtils;
import io.github.chrimle.example.utils.GeneratedEnumTestUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/** Class for testing generated {@code enum} classes. */
@DisplayName("Test Generated `enum` classes")
final class GeneratedEnumTests implements GeneratedClassTests {

  @ParameterizedTest
  @MethodSource("allPluginExecutionsAndGeneratedEnumCombinations")
  @DisplayName("OpenAPI `{schema}.enum` -> Generates an `enum` class")
  void whenIsEnumThenGeneratedClassIsEnumClass(final GeneratedSource generatedSource) {
    AssertionUtils.assertIsEnum(generatedSource.getClassUnderTest());
  }

  @ParameterizedTest
  @MethodSource("allPluginExecutionsAndGeneratedEnumCombinations")
  @DisplayName(
      "OpenAPI `{schema}.enum.{constants}` -> Generates `enum` with expected number of constants")
  void whenEnumHasConstantsThenGeneratedEnumClassHasExpectedNumberOfConstants(
      final GeneratedSource generatedSource) {
    GeneratedEnumTestUtils.assertEnumHasNumberOfConstants(generatedSource);
  }

  @ParameterizedTest
  @MethodSource("allPluginExecutionsAndGeneratedEnumCombinations")
  @DisplayName(
      "OpenAPI `{schema}.enum.{constants}` -> Generates `enum` constants with expected names")
  void whenEnumHasConstantsThenGeneratedEnumClassHasConstantsWithExpectedNames(
      final GeneratedSource generatedSource) {
    GeneratedEnumTestUtils.assertEnumNames(generatedSource);
  }

  @ParameterizedTest
  @MethodSource("allPluginExecutionsAndGeneratedEnumCombinations")
  @DisplayName(
      "OpenAPI `{schema}.enum.{constants}` -> Generates `enum` constants with expected values")
  void whenEnumHasConstantsThenGeneratedEnumClassHasConstantsWithExpectedValues(
      final GeneratedSource generatedSource) {
    GeneratedEnumTestUtils.assertEnumValues(generatedSource);
  }

  @ParameterizedTest
  @MethodSource("allPluginExecutionsAndGeneratedEnumCombinations")
  @DisplayName(
      "OpenAPI `{schema}.enum.deprecated` -> Annotates generated `enum` class with `@Deprecated`")
  void whenEnumIsDeprecatedThenGeneratedEnumClassIsAnnotatedDeprecated(
      final GeneratedSource generatedSource) {
    GeneratedEnumTestUtils.assertIsAnnotatedAsDeprecated(generatedSource);
  }

  @ParameterizedTest
  @MethodSource("allPluginExecutionsAndGeneratedEnumCombinations")
  @DisplayName(
      "Configuration `configOptions.additionalEnumTypeAnnotations` -> Annotates generated `enum` class with additional annotations")
  void
      whenConfigOptionAdditionalEnumTypeAnnotationsIsSetThenGeneratedEnumClassHasAdditionalAnnotations(
          final GeneratedSource generatedSource) {
    GeneratedEnumTestUtils.assertHasAdditionalTypeAnnotations(generatedSource);
  }

  @ParameterizedTest
  @MethodSource("allPluginExecutionsAndGeneratedEnumCombinations")
  @DisplayName(
      "Configuration `configOptions.useEnumCaseInsensitive` -> Generated `enum` class has case-insensitive `fromValue(T)` method")
  void
      whenConfigOptionUseEnumCaseInsensitiveIsSetThenGeneratedEnumClassHasCaseInsensitiveFromValueMethod(
          final GeneratedSource generatedSource) {
    GeneratedEnumTestUtils.assertEnumHasCaseInsensitiveFromValueMethod(generatedSource);
  }
}
