package com.chrimle.example.standard;

import com.chrimle.example.utils.GeneratedEnumTestUtils;
import com.chrimle.example.utils.GeneratedRecordTestUtils;
import org.junit.jupiter.api.Test;

/**
 * Tests for the 'standard' plugin-execution.
 */
@SuppressWarnings("deprecation")
public class StandardTests {

  final Class<DeprecatedExampleEnum> deprecatedExampleEnum = DeprecatedExampleEnum.class;
  final Class<DeprecatedExampleRecord> deprecatedExampleRecord = DeprecatedExampleRecord.class;
  final Class<ExampleEnum> enumClass = ExampleEnum.class;
  final Class<ExampleRecord> exampleRecord = ExampleRecord.class;
  final Class<ExampleRecordWithArrayFields> recordWithArrayFieldsClass = ExampleRecordWithArrayFields.class;
  final Class<ExampleRecordWithBooleanFields> exampleRecordWithBooleanFields = ExampleRecordWithBooleanFields.class;
  final Class<ExampleRecordWithDefaultFields> exampleRecordWithDefaultFields = ExampleRecordWithDefaultFields.class;
  final Class<ExampleRecordWithExampleEnumFields> exampleRecordWithExampleEnumFields = ExampleRecordWithExampleEnumFields.class;
  final Class<ExampleRecordWithExampleRecordFields> exampleRecordWithExampleRecordFields = ExampleRecordWithExampleRecordFields.class;
  final Class<ExampleRecordWithIntegerFields> exampleRecordWithIntegerFields = ExampleRecordWithIntegerFields.class;
  final Class<ExampleRecordWithNumberFields> exampleRecordWithNumberFields = ExampleRecordWithNumberFields.class;
  final Class<ExampleRecordWithStringFields> exampleRecordWithStringFields = ExampleRecordWithStringFields.class;

  final boolean HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS = false;
  final boolean HAS_ADDITIONAL_ENUM_TYPE_ANNOTATIONS = false;
  final boolean USE_ENUM_CASE_INSENSITIVE = false;
  final boolean IS_MODEL_SERIALIZABLE = false;

  @Test
  public void testAllGeneratedClasses() {
    GeneratedEnumTestUtils.assertEnumClass(enumClass, false,
        HAS_ADDITIONAL_ENUM_TYPE_ANNOTATIONS, USE_ENUM_CASE_INSENSITIVE);
    GeneratedEnumTestUtils.assertEnumClass(deprecatedExampleEnum, true,
        HAS_ADDITIONAL_ENUM_TYPE_ANNOTATIONS, USE_ENUM_CASE_INSENSITIVE);
    GeneratedRecordTestUtils.assertRecord(exampleRecord, false,
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS, IS_MODEL_SERIALIZABLE);
    GeneratedRecordTestUtils.assertRecord(deprecatedExampleRecord, true,
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS, IS_MODEL_SERIALIZABLE);
  }
}
