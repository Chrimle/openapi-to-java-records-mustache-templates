package com.chrimle.example.useEnumCaseInsensitive;

import com.chrimle.example.TestSuite;
import com.chrimle.example.utils.PluginExecution;
import org.junit.jupiter.api.Test;

/**
 * Tests for the 'useEnumCaseInsensitive' plugin-execution.
 */
public class UseEnumCaseInsensitiveTests {

  final boolean HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS = false;
  final boolean HAS_ADDITIONAL_ENUM_TYPE_ANNOTATIONS = false;
  final boolean USE_ENUM_CASE_INSENSITIVE = true;
  final boolean IS_MODEL_SERIALIZABLE = false;
  final boolean GENERATE_BUILDERS = false;


  @Test
  public void testAllGeneratedClasses() {
    final TestSuite testSuite = new TestSuite(
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
        HAS_ADDITIONAL_ENUM_TYPE_ANNOTATIONS,
        USE_ENUM_CASE_INSENSITIVE,
        IS_MODEL_SERIALIZABLE,
        GENERATE_BUILDERS,
        PluginExecution.USE_ENUM_CASE_INSENSITIVE
    );
    testSuite.assertModels();
  }
}
