package com.chrimle.example.additionalEnumTypeAnnotations;

import com.chrimle.example.TestSuite;
import org.junit.jupiter.api.Test;

/**
 * Tests for the 'additionalEnumTypeAnnotations' plugin-execution.
 */
@SuppressWarnings("deprecation")
public class AdditionalEnumTypeAnnotationTests {

  final boolean HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS = false;
  final boolean HAS_ADDITIONAL_ENUM_TYPE_ANNOTATIONS = true;
  final boolean USE_ENUM_CASE_INSENSITIVE = false;
  final boolean IS_MODEL_SERIALIZABLE = false;

  @Test
  public void testAllGeneratedClasses() {
    final TestSuite testSuite = new TestSuite(
        DeprecatedExampleEnum.class,
        DeprecatedExampleRecord.class,
        ExampleEnum.class,
        ExampleRecord.class,
        ExampleRecordWithArrayFields.class,
        ExampleRecordWithBooleanFields.class,
        ExampleRecordWithDefaultFields.class,
        ExampleRecordWithExampleEnumFields.class,
        ExampleRecordWithExampleRecordFields.class,
        ExampleRecordWithIntegerFields.class,
        ExampleRecordWithNumberFields.class,
        ExampleRecordWithStringFields.class,
        ExampleRecordWithSetFields.class,
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
        HAS_ADDITIONAL_ENUM_TYPE_ANNOTATIONS,
        USE_ENUM_CASE_INSENSITIVE,
        IS_MODEL_SERIALIZABLE
    );
    testSuite.assertModels();
  }
}
