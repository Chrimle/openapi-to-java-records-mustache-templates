package io.github.chrimle.example.tests;

import io.github.chrimle.example.GeneratedSource;
import io.github.chrimle.example.utils.AssertionUtils;
import io.github.chrimle.example.utils.GeneratedRecordTestUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/** Class for testing generated {@code record} classes. */
final class GeneratedRecordTests implements GeneratedClassTests {

  /**
   * Test-class for asserting functionalities, properties and behaviours configured via OpenAPI
   * Specifications.
   */
  @Nested
  @DisplayName("Testing OpenAPI Schemas & Properties")
  class OpenAPITests {

    @ParameterizedTest
    @MethodSource(
        "io.github.chrimle.example.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedRecordCombinations")
    @DisplayName("OpenAPI `{schema}.type: object` -> Generates a `record` class")
    public void whenIsObjectThenGeneratedClassIsRecordClass(final GeneratedSource generatedSource) {
      AssertionUtils.assertIsRecord(generatedSource.getClassUnderTest());
    }

    @ParameterizedTest
    @MethodSource(
        "io.github.chrimle.example.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedRecordCombinations")
    @DisplayName(
        "OpenAPI `{schema}.properties` -> Generates a constructor with properties as method arguments")
    public void whenObjectHasPropertiesThenGeneratedConstructorHasMethodArguments(
        final GeneratedSource generatedSource) {
      AssertionUtils.assertRecordHasConstructor(
          generatedSource.getClassUnderTest(), generatedSource.fieldClasses());
    }

    @ParameterizedTest
    @MethodSource(
        "io.github.chrimle.example.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedRecordCombinations")
    @DisplayName(
        "OpenAPI `{schema}.properties.{property}` -> Instantiating the `record` will set fields to provided values")
    public void whenObjectHasPropertiesThenFieldIsSetToProvidedValueWhenInstantiatingRecord(
        final GeneratedSource generatedSource) {
      GeneratedRecordTestUtils.assertInstantiatingRecordWithValuesSetsFieldsToProvidedValue(
          generatedSource);
    }

    @ParameterizedTest
    @MethodSource(
        "io.github.chrimle.example.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedRecordCombinations")
    @DisplayName(
        "OpenAPI `{schema}.properties.{property}.default` -> Instantiating the `record` with `null` will set fields to `null` or `default`")
    public void whenPropertyHasDefaultSetThenFieldIsSetToDefaultValueWhenInstantiatingWithNull(
        final GeneratedSource generatedSource) {
      GeneratedRecordTestUtils.assertInstantiatingRecordWithNullSetsFieldsToNullOrDefaultValue(
          generatedSource);
    }

    @ParameterizedTest
    @MethodSource(
        "io.github.chrimle.example.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedRecordCombinations")
    @DisplayName(
        "OpenAPI `{schema}.properties.{property}.nullable` -> Fields of generated `record` are annotated with `@Nullable` and `@Nonnull`")
    public void whenPropertyHasNullableSetThenFieldIsAnnotatedWithNullableOrNonnull(
        final GeneratedSource generatedSource) {
      AssertionUtils.assertRecordHasFieldsOfTypeWithNullableAnnotations(generatedSource);
    }

    @ParameterizedTest
    @MethodSource(
        "io.github.chrimle.example.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedRecordCombinations")
    @DisplayName(
        "OpenAPI `{schema}.deprecated` -> Annotates generated `record` class with `@Deprecated`")
    public void whenRecordIsDeprecatedThenGeneratedRecordClassIsAnnotatedDeprecated(
        final GeneratedSource generatedSource) {
      AssertionUtils.assertClassIsAnnotatedAsDeprecated(
          generatedSource.getClassUnderTest(), generatedSource.isDeprecated());
    }

    @ParameterizedTest
    @MethodSource(
        "io.github.chrimle.example.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedRecordCombinations")
    @DisplayName(
        "OpenAPI `{schema}.x-class-extra-annotation` -> Annotates generated `record` class with extra annotations")
    public void
        whenRecordHasExtraClassAnnotationsThenGeneratedRecordClassIsAnnotatedWithExtraAnnotations(
            final GeneratedSource generatedSource) {
      GeneratedRecordTestUtils.assertClassIsAnnotatedWithExtraAnnotation(generatedSource);
    }
  }

  /**
   * Test-class for asserting functionalities, properties and behaviours configured via
   * `openapi-generator`'s {@code <configuration>} and {@code <configOptions>}.
   */
  @Nested
  @DisplayName("Testing `openapi-generator` Configurations & ConfigOptions")
  class GeneratorConfigurationTests {

    @ParameterizedTest
    @MethodSource(
        "io.github.chrimle.example.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedRecordCombinations")
    @DisplayName(
        "Configuration `configOptions.additionalModelTypeAnnotations` -> Annotates generated `record` class with additional annotations")
    void
        whenConfigOptionAdditionalModelTypeAnnotationsIsSetThenGeneratedRecordClassHasAdditionalAnnotations(
            final GeneratedSource generatedSource) {
      AssertionUtils.assertClassIsAnnotatedWithAdditionalTypeAnnotations(
          generatedSource.getClassUnderTest(), generatedSource.hasAdditionalModelTypeAnnotations());
    }

    @ParameterizedTest
    @MethodSource(
        "io.github.chrimle.example.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedRecordCombinations")
    @DisplayName(
        "Configuration `configOptions.serializableModel` -> Generated `record` has `serialVersionUID`-field")
    void whenConfigOptionSerializableModelIsSetThenGeneratedRecordClassHasSerialVersionUidField(
        final GeneratedSource generatedSource) {
      AssertionUtils.assertModelIsSerializable(generatedSource);
    }

    @ParameterizedTest
    @MethodSource(
        "io.github.chrimle.example.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedRecordCombinations")
    @DisplayName(
        "Configuration `configOptions.serializableModel` -> Generated `record` implements `Serializable`")
    void whenConfigOptionSerializableModelIsSetThenGeneratedRecordClassImplementsSerializable(
        final GeneratedSource generatedSource) {
      AssertionUtils.assertClassImplementsSerializable(generatedSource);
    }

    @ParameterizedTest
    @MethodSource(
        "io.github.chrimle.example.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedRecordCombinations")
    @DisplayName(
        "Configuration `configOptions.generateBuilders` -> Generated `record` has inner `Builder`-class")
    void whenConfigOptionGenerateBuildersIsSetThenGeneratedRecordHasInnerBuilderClass(
        final GeneratedSource generatedSource) {
      AssertionUtils.assertRecordHasBuilderInnerClass(generatedSource);
    }
  }
}
