package com.chrimle.example;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ExecutionTests {

  @ParameterizedTest(name = "Testing: {0}")
  @MethodSource("provideTestArguments")
  @DisplayName("Testing Plugin Execution...")
  public void testAll(
      PluginExecution pluginExecution,
      boolean hasAdditionalModelTypeAnnotations,
      boolean hasAdditionalEnumTypeAnnotations,
      boolean useEnumCaseInsensitive,
      boolean isModelSerializable,
      boolean generateBuilders) {

    TestSuite testSuite = new TestSuite(
        hasAdditionalModelTypeAnnotations,
        hasAdditionalEnumTypeAnnotations,
        useEnumCaseInsensitive,
        isModelSerializable,
        generateBuilders,
        pluginExecution
    );
    testSuite.assertModels();
  }

  public static Stream<Arguments> provideTestArguments() {
    return Stream.of(
        Arguments.of(
            PluginExecution.ADDITIONAL_ENUM_TYPE_ANNOTATIONS,
            false,
            true,
            false,
            false,
            false
        ),
        Arguments.of(
            PluginExecution.ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
            true,
            false,
            false,
            false,
            false
        ),
        Arguments.of(
            PluginExecution.GENERATE_BUILDERS,
            false,
            false,
            false,
            false,
            true
        ),
        Arguments.of(
            PluginExecution.SERIALIZABLE_MODEL,
            false,
            false,
            false,
            true,
            false
        ),
        Arguments.of(
            PluginExecution.STANDARD,
            false,
            false,
            false,
            false,
            false
        ),
        Arguments.of(
            PluginExecution.USE_ENUM_CASE_INSENSITIVE,
            false,
            false,
            true,
            false,
            false
        )
    );
  }

}
