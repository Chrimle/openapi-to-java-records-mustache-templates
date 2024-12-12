package io.github.chrimle.example.tests;

import io.github.chrimle.example.GeneratedSource;
import io.github.chrimle.example.PluginExecution;
import io.github.chrimle.example.models.GeneratedEnum;
import io.github.chrimle.example.models.GeneratedRecord;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

public sealed interface GeneratedClassTests permits GeneratedEnumTests, GeneratedRecordTests {

  /** Refers to {@link #allPluginExecutionsAndGeneratedRecordCombinations()} */
  String GENERATED_RECORD_TESTS_METHOD_SOURCE =
      "io.github.chrimle.example.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedRecordCombinations";

  /** Refers to {@link #allPluginExecutionsAndGeneratedEnumCombinations()} */
  String GENERATED_ENUM_TESTS_METHOD_SOURCE =
      "io.github.chrimle.example.tests.GeneratedClassTests#allPluginExecutionsAndGeneratedEnumCombinations";

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
                    .map(generatedEnum -> new GeneratedSource(pluginExecution, generatedEnum)))
        .map(Arguments::of);
  }
}
