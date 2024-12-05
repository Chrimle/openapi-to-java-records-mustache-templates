package io.github.chrimle.example.tests;

import io.github.chrimle.example.GeneratedSource;
import io.github.chrimle.example.PluginExecution;
import io.github.chrimle.example.models.GeneratedEnum;
import io.github.chrimle.example.utils.AssertionUtils;
import io.github.chrimle.example.utils.GeneratedEnumTestUtils;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** Class for testing generated {@code enum} classes. */
@DisplayName("Test Generated `enum` classes")
public class GeneratedEnumTests {

  /**
   * Generates a {@link GeneratedSource} for every possible combination of {@link PluginExecution}
   * and {@link GeneratedEnum}.
   *
   * @return a stream of {@code GeneratedSource}s.
   */
  static Stream<Arguments> allPluginExecutionsAndGeneratedEnumCombinations() {
    return Stream.of(PluginExecution.values())
        .flatMap(
            pluginExecution ->
                Stream.of(GeneratedEnum.values())
                    .map(generatedEnum -> new GeneratedSource(pluginExecution, generatedEnum)))
        .map(Arguments::of);
  }

  @ParameterizedTest
  @MethodSource("allPluginExecutionsAndGeneratedEnumCombinations")
  @DisplayName("OpenAPI `{schema}.enum` -> Generates an `enum` class")
  public void whenIsEnumThenGeneratedClassIsEnumClass(final GeneratedSource generatedSource) {
    AssertionUtils.assertIsEnum(generatedSource.getClassUnderTest());
  }

  @ParameterizedTest
  @MethodSource("allPluginExecutionsAndGeneratedEnumCombinations")
  @DisplayName(
      "OpenAPI `{schema}.enum.{constants}` -> Generates `enum` constants with expected names")
  public void whenEnumHasConstantsThenGeneratedEnumClassHasConstantsWithExpectedNames(
      final GeneratedSource generatedSource) {
    GeneratedEnumTestUtils.assertEnumNames(generatedSource);
  }

  @ParameterizedTest
  @MethodSource("allPluginExecutionsAndGeneratedEnumCombinations")
  @DisplayName(
      "OpenAPI `{schema}.enum.{constants}` -> Generates `enum` constants with expected values")
  public void whenEnumHasConstantsThenGeneratedEnumClassHasConstantsWithExpectedValues(
      final GeneratedSource generatedSource) {
    GeneratedEnumTestUtils.assertEnumValues(generatedSource);
  }

  @ParameterizedTest
  @MethodSource("allPluginExecutionsAndGeneratedEnumCombinations")
  @DisplayName(
      "OpenAPI `{schema}.enum.deprecated` -> Annotates generated `enum` class with `@Deprecated`")
  public void whenEnumIsDeprecatedThenGeneratedEnumClassIsAnnotatedDeprecated(
      final GeneratedSource generatedSource) {
    GeneratedEnumTestUtils.assertIsAnnotatedAsDeprecated(generatedSource);
  }

  @ParameterizedTest
  @MethodSource("allPluginExecutionsAndGeneratedEnumCombinations")
  @DisplayName(
      "Configuration `configOptions.additionalEnumTypeAnnotations` -> Annotates generated `enum` class with additional annotations")
  public void
      whenConfigOptionAdditionalEnumTypeAnnotationsIsSetThenGeneratedEnumClassHasAdditionalAnnotations(
          final GeneratedSource generatedSource) {
    GeneratedEnumTestUtils.assertHasAdditionalTypeAnnotations(generatedSource);
  }

  @ParameterizedTest
  @MethodSource("allPluginExecutionsAndGeneratedEnumCombinations")
  @DisplayName(
      "Configuration `configOptions.useEnumCaseInsensitive` -> Generated `enum` class has case-insensitive `fromValue(T)` method")
  public void
      whenConfigOptionUseEnumCaseInsensitiveIsSetThenGeneratedEnumClassHasCaseInsensitiveFromValueMethod(
          final GeneratedSource generatedSource) {
    GeneratedEnumTestUtils.assertEnumHasCaseInsensitiveFromValueMethod(generatedSource);
  }
}
