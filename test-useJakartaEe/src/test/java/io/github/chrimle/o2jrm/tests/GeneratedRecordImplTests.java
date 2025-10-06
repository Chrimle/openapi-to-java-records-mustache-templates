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

import io.github.chrimle.o2jrm.GeneratedSource;
import io.github.chrimle.o2jrm.PluginExecutionImpl;
import io.github.chrimle.o2jrm.models.GeneratedClass;
import io.github.chrimle.o2jrm.models.GeneratedClassImpl;
import io.github.chrimle.o2jrm.models.GeneratedRecordImpl;
import io.github.chrimle.o2jrm.utils.AssertionUtilsImpl;
import java.util.stream.Stream;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Testing Generated `record` classes")
final class GeneratedRecordImplTests extends GeneratedRecordTests {

  /**
   * Generates a {@link GeneratedSource} for every possible combination of {@link
   * PluginExecutionImpl} and {@link GeneratedRecordImpl}.
   *
   * @return a stream of {@code GeneratedSource}s.
   */
  @SuppressWarnings("unused")
  static Stream<Arguments> allPluginExecutionsAndGeneratedRecordCombinations() {
    return Stream.of(PluginExecutionImpl.values())
        .flatMap(
            pluginExecution ->
                Stream.of(GeneratedRecordImpl.values())
                    .map(
                        generatedRecord ->
                            new GeneratedSource(
                                pluginExecution,
                                generatedRecord,
                                GeneratedClassImpl.getGeneratedFields(
                                    generatedRecord, pluginExecution),
                                GeneratedClass.getClass(generatedRecord, pluginExecution),
                                jakarta.validation.Valid.class,
                                jakarta.validation.constraints.NotNull.class,
                                jakarta.validation.constraints.Pattern.class,
                                jakarta.validation.constraints.Size.class,
                                jakarta.validation.constraints.Min.class,
                                jakarta.validation.constraints.Max.class,
                                jakarta.validation.constraints.DecimalMin.class,
                                jakarta.validation.constraints.DecimalMax.class,
                                jakarta.validation.constraints.Email.class)))
        .map(Arguments::of);
  }

  @Nested
  @DisplayName("Testing `openapi-generator` Configurations & ConfigOptions")
  class GeneratorConfigurationTests extends GeneratedRecordTests.GeneratorConfigurationTests {

    @Nested
    @DisplayName("Testing `<configOptions>`")
    class ConfigOptionsTests
        extends GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests {

      @Nested
      @DisplayName("Testing `<useBeanValidation>`")
      class UseBeanValidationTests
          extends GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests
              .UseBeanValidationTests {

        @Nested
        @DisplayName("Testing `<useBeanValidation>true</useBeanValidation>`")
        class UseBeanValidationTrueTests
            extends GeneratedRecordTests.GeneratorConfigurationTests.ConfigOptionsTests
                .UseBeanValidationTests.UseBeanValidationTrueTests {

          @Override
          @ParameterizedTest
          @MethodSource(GENERATED_RECORD_TESTS_METHOD_SOURCE)
          @DisplayName("Generated `record` use Jakarta Bean Validation annotations on fields")
          void
              whenUseBeanValidationIsTrueThenFieldsAreAnnotatedWithJakartaBeanValidationAnnotations(
                  final GeneratedSource generatedSource) {
            Assumptions.assumeTrue(generatedSource.useBeanValidation());
            AssertionUtilsImpl.assertRecordHasFieldsOfTypeWithNullableAnnotations(generatedSource);
          }
        }
      }
    }
  }
}
