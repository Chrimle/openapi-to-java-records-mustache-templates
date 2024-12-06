package io.github.chrimle.example.tests;

import io.github.chrimle.example.GeneratedSource;
import io.github.chrimle.example.utils.GeneratedRecordTestUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/** Class for testing generated {@code record} classes. */
final class GeneratedRecordTests implements GeneratedClassTests {

  @ParameterizedTest
  @MethodSource("allPluginExecutionsAndGeneratedRecordCombinations")
  @DisplayName("Testing Plugin Executions...")
  public void testAll(final GeneratedSource generatedSource) {
    GeneratedRecordTestUtils.assertRecord(generatedSource);
  }
}
