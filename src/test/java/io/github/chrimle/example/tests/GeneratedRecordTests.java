package io.github.chrimle.example.tests;

import io.github.chrimle.example.GeneratedSource;
import io.github.chrimle.example.annotations.TestAnnotationOne;
import io.github.chrimle.example.annotations.TestAnnotationThree;
import io.github.chrimle.example.annotations.TestAnnotationTwo;
import io.github.chrimle.example.tests.GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests;
import io.github.chrimle.example.tests.GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests.AdditionalModelTypeAnnotationsTests;
import io.github.chrimle.example.tests.GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests.GenerateBuildersTests;
import io.github.chrimle.example.tests.GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests.SerializableModelTests;
import io.github.chrimle.example.tests.GeneratedRecordTests.OpenAPITests.SchemaTests;
import io.github.chrimle.example.tests.GeneratedRecordTests.OpenAPITests.SchemaTests.DeprecatedTests;
import io.github.chrimle.example.tests.GeneratedRecordTests.OpenAPITests.SchemaTests.PropertiesTests;
import io.github.chrimle.example.tests.GeneratedRecordTests.OpenAPITests.SchemaTests.PropertiesTests.PropertyTests;
import io.github.chrimle.example.tests.GeneratedRecordTests.OpenAPITests.SchemaTests.TypeTests;
import io.github.chrimle.example.tests.GeneratedRecordTests.OpenAPITests.SchemaTests.XClassExtraAnnotationTests;
import io.github.chrimle.example.utils.AssertionUtils;
import io.github.chrimle.example.utils.GeneratedRecordTestUtils;
import java.io.Serializable;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Tests for <b>all</b> generated {@code record} classes. Tests are grouped by the <i>method of
 * configuring</i> the resulting {@code record}.
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
 *   <li>{@code components.schemas.{schema}}
 *       <p>{@link SchemaTests}
 *   <li>{@code components.schemas.{schema}.type}
 *       <p>{@link TypeTests}
 *   <li>{@code components.schemas.{schema}.deprecated}
 *       <p>{@link DeprecatedTests}
 *   <li>{@code components.schemas.{schema}.x-class-extra-annotation}
 *       <p>{@link XClassExtraAnnotationTests}
 *   <li>{@code components.schemas.{schema}.properties}
 *       <p>{@link PropertiesTests}
 *   <li>{@code components.schemas.{schema}.properties.{property}}
 *       <p>{@link PropertyTests}
 * </ul>
 *
 * <p><b>`openapi-generator` Configurations</b>
 *
 * <p>{@link GeneratorConfigurationTests}
 *
 * <ul>
 *   <li>{@code <configOptions>}
 *       <p>{@link ConfigOptionsTests}
 *   <li>{@code <additionalModelTypeAnnotations>}
 *       <p>{@link AdditionalModelTypeAnnotationsTests}
 *   <li>{@code <serializableModel>}
 *       <p>{@link SerializableModelTests}
 *   <li>{@code <generateBuilders>}
 *       <p>{@link GenerateBuildersTests}
 * </ul>
 */
final class GeneratedRecordTests implements GeneratedClassTests {

  @Nested
  @DisplayName("Testing OpenAPI Schemas & Properties")
  class OpenAPITests {

    @Nested
    @DisplayName("Testing `components.schemas.{schema}`")
    class SchemaTests {

      @Nested
      @DisplayName("Testing `components.schemas.{schema}.type`")
      class TypeTests {

        @ParameterizedTest
        @MethodSource(
            "io.github.chrimle.example.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedRecordCombinations")
        @DisplayName("OpenAPI `{schema}.type: object` -> Generates a `record` class")
        public void whenIsObjectThenGeneratedClassIsRecordClass(
            final GeneratedSource generatedSource) {
          AssertionUtils.assertIsRecord(generatedSource.getClassUnderTest());
        }
      }

      @Nested
      @DisplayName("Testing `components.schemas.{schema}.deprecated`")
      class DeprecatedTests {
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
      }

      @Nested
      @DisplayName("Testing `components.schemas.{schema}.x-class-extra-annotation`")
      class XClassExtraAnnotationTests {

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

      @Nested
      @DisplayName("Testing `components.schemas.{schema}.properties`")
      class PropertiesTests {

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

        @Nested
        @DisplayName("Testing `components.schemas.{schema}.properties.{property}`")
        class PropertyTests {

          @ParameterizedTest
          @MethodSource(
              "io.github.chrimle.example.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedRecordCombinations")
          @DisplayName(
              "OpenAPI `{schema}.properties.{property}.default` -> Instantiating the `record` with `null` will set fields to `null` or `default`")
          public void
              whenPropertyHasDefaultSetThenFieldIsSetToDefaultValueWhenInstantiatingWithNull(
                  final GeneratedSource generatedSource) {
            GeneratedRecordTestUtils
                .assertInstantiatingRecordWithNullSetsFieldsToNullOrDefaultValue(generatedSource);
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
      @DisplayName("Testing `<additionalModelTypeAnnotations>`")
      class AdditionalModelTypeAnnotationsTests {

        @Nested
        @DisplayName("Testing `<additionalModelTypeAnnotations></additionalModelTypeAnnotations>`")
        class AdditionalModelTypeAnnotationsUnsetTests {
          @ParameterizedTest
          @MethodSource(
              "io.github.chrimle.example.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedRecordCombinations")
          @DisplayName("Generated `record` does NOT have additional annotations")
          void
          whenAdditionalModelTypeAnnotationsIsNotSetThenGeneratedRecordClassDoesNotHaveAdditionalAnnotations(
              final GeneratedSource generatedSource) {

            Assumptions.assumeFalse(generatedSource.hasAdditionalModelTypeAnnotations());

            AssertionUtils.assertClassIsNotAnnotatedWith(generatedSource.getClassUnderTest(), TestAnnotationOne.class);
            AssertionUtils.assertClassIsNotAnnotatedWith(generatedSource.getClassUnderTest(), TestAnnotationTwo.class);
            AssertionUtils.assertClassIsNotAnnotatedWith(generatedSource.getClassUnderTest(), TestAnnotationThree.class);
          }
        }

        @Nested
        @DisplayName("Testing `<additionalModelTypeAnnotations>@TestAnnotationOne;@TestAnnotationTwo;@TestAnnotationThree</additionalModelTypeAnnotations>`")
        class AdditionalModelTypeAnnotationsSetTests {
          @ParameterizedTest
          @MethodSource(
              "io.github.chrimle.example.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedRecordCombinations")
          @DisplayName("Generated `record` has additional annotations")
          void
          whenConfigOptionAdditionalModelTypeAnnotationsIsSetThenGeneratedRecordClassHasAdditionalAnnotations(
              final GeneratedSource generatedSource) {

            Assumptions.assumeTrue(generatedSource.hasAdditionalModelTypeAnnotations());

            AssertionUtils.assertClassIsAnnotatedWith(generatedSource.getClassUnderTest(), TestAnnotationOne.class);
            AssertionUtils.assertClassIsAnnotatedWith(generatedSource.getClassUnderTest(), TestAnnotationTwo.class);
            AssertionUtils.assertClassIsAnnotatedWith(generatedSource.getClassUnderTest(), TestAnnotationThree.class);
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
          @MethodSource(
              "io.github.chrimle.example.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedRecordCombinations")
          @DisplayName("Generated `record` does NOT implement `Serializable`")
          void whenConfigOptionSerializableModelIsFalseThenGeneratedRecordClassDoesNotImplementSerializable(
              final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.serializableModel());

            AssertionUtils.assertClassDoesNotImplementsInterface(generatedSource.getClassUnderTest(), Serializable.class);
          }

          @ParameterizedTest
          @MethodSource(
              "io.github.chrimle.example.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedRecordCombinations")
          @DisplayName("Generated `record` does NOT have `serialVersionUID`-field")
          void whenConfigOptionSerializableModelIsFalseThenGeneratedRecordClassDoesNotHaveSerialVersionUidField(
              final GeneratedSource generatedSource) {
            Assumptions.assumeFalse(generatedSource.serializableModel());

            AssertionUtils.assertRecordDoesNotHaveField(generatedSource.getClassUnderTest(), "serialVersionUID");
          }

        }

        @Nested
        @DisplayName("Testing `<serializableModel>true</serializableModel>`")
        class SerializableModelTrueTests {

          @ParameterizedTest
          @MethodSource(
              "io.github.chrimle.example.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedRecordCombinations")
          @DisplayName("Generated `record` implement `Serializable`")
          void whenConfigOptionSerializableModelIsTrueThenGeneratedRecordClassImplementsSerializable(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.serializableModel());

            AssertionUtils.assertClassImplementsInterface(generatedSource.getClassUnderTest(), Serializable.class);
          }

          @ParameterizedTest
          @MethodSource(
              "io.github.chrimle.example.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedRecordCombinations")
          @DisplayName("Generated `record` has `serialVersionUID`-field")
          void whenConfigOptionSerializableModelIsTrueThenGeneratedRecordClassHasSerialVersionUidField(
              final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.serializableModel());

            AssertionUtils.assertRecordHasField(generatedSource.getClassUnderTest(), "serialVersionUID", long.class);
          }
        }
      }

      @Nested
      @DisplayName("Testing `<generateBuilders>`")
      class GenerateBuildersTests {

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
  }
}
