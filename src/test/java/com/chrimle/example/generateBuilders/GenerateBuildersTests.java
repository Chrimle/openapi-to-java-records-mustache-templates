package com.chrimle.example.generateBuilders;

import com.chrimle.example.TestSuite;
import org.junit.jupiter.api.Test;

/**
 * Tests for the 'standard' plugin-execution.
 */
@SuppressWarnings("deprecation")
public class GenerateBuildersTests {

  final boolean HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS = false;
  final boolean HAS_ADDITIONAL_ENUM_TYPE_ANNOTATIONS = false;
  final boolean USE_ENUM_CASE_INSENSITIVE = false;
  final boolean IS_MODEL_SERIALIZABLE = false;
  final boolean GENERATE_BUILDERS = true;


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
        IS_MODEL_SERIALIZABLE,
        GENERATE_BUILDERS
    );
    testSuite.assertModels();
  }
}