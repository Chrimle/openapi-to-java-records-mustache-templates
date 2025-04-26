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
import io.github.chrimle.o2jrm.PluginExecution;
import io.github.chrimle.o2jrm.models.GeneratedEnum;
import io.github.chrimle.o2jrm.models.GeneratedRecord;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

public sealed interface GeneratedClassTests permits GeneratedEnumTests, GeneratedRecordTests {

  /** Refers to {@link #allPluginExecutionsAndGeneratedRecordCombinations()} */
  String GENERATED_RECORD_TESTS_METHOD_SOURCE =
      "io.github.chrimle.o2jrm.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedRecordCombinations";

  /** Refers to {@link #allPluginExecutionsAndGeneratedEnumCombinations()} */
  String GENERATED_ENUM_TESTS_METHOD_SOURCE =
      "io.github.chrimle.o2jrm.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedEnumCombinations";

  /**
   * Generates a {@link GeneratedSource} for every possible combination of {@link PluginExecution}
   * and {@link GeneratedEnum}.
   *
   * @return a stream of {@code GeneratedSource}s.
   */
  @SuppressWarnings("unused")
  static Stream<Arguments> allPluginExecutionsAndGeneratedEnumCombinations() {
    return Stream.of(PluginExecution.values())
        .flatMap(
            pluginExecution ->
                Stream.of(GeneratedEnum.values())
                    .map(generatedEnum -> new GeneratedSource(pluginExecution, generatedEnum)))
        .map(Arguments::of);
  }

  /**
   * Generates a {@link GeneratedSource} for every possible combination of {@link PluginExecution}
   * and {@link GeneratedRecord}.
   *
   * @return a stream of {@code GeneratedSource}s.
   */
  @SuppressWarnings("unused")
  static Stream<Arguments> allPluginExecutionsAndGeneratedRecordCombinations() {
    return Stream.of(PluginExecution.values())
        .flatMap(
            pluginExecution ->
                Stream.of(GeneratedRecord.values())
                    .map(generatedRecord -> new GeneratedSource(pluginExecution, generatedRecord)))
        .map(Arguments::of);
  }
}
