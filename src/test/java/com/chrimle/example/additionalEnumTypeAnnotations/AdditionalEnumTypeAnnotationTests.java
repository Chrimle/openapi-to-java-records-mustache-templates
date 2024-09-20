package com.chrimle.example.additionalEnumTypeAnnotations;

import com.chrimle.example.TestSuite;
import com.chrimle.example.utils.PluginExecution;
import org.junit.jupiter.api.Test;

/**
 * Tests for the 'additionalEnumTypeAnnotations' plugin-execution.
 */
public class AdditionalEnumTypeAnnotationTests {

  final boolean HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS = false;
  final boolean HAS_ADDITIONAL_ENUM_TYPE_ANNOTATIONS = true;
  final boolean USE_ENUM_CASE_INSENSITIVE = false;
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
        PluginExecution.ADDITIONAL_ENUM_TYPE_ANNOTATIONS
    );
    testSuite.assertModels();
  }
}
