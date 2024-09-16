package com.chrimle.example.serializableModel;

import com.chrimle.example.utils.GeneratedEnumTestUtils;
import com.chrimle.example.utils.GeneratedRecordTestUtils;
import java.math.BigDecimal;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Tests for the 'serializableModel' plugin-execution.
 */
@SuppressWarnings("deprecation")
public class SerializableModelTests {

  final Class<DeprecatedExampleEnum> deprecatedExampleEnum = DeprecatedExampleEnum.class;
  final Class<DeprecatedExampleRecord> deprecatedExampleRecord = DeprecatedExampleRecord.class;
  final Class<ExampleEnum> exampleEnum = ExampleEnum.class;
  final Class<ExampleRecord> exampleRecord = ExampleRecord.class;
  final Class<ExampleRecordWithArrayFields> exampleRecordWithArrayFields = ExampleRecordWithArrayFields.class;
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
  final boolean IS_MODEL_SERIALIZABLE = true;

  @Test
  public void testAllGeneratedClasses() {
    GeneratedEnumTestUtils.assertExampleEnum(
        exampleEnum,
        HAS_ADDITIONAL_ENUM_TYPE_ANNOTATIONS,
        USE_ENUM_CASE_INSENSITIVE
    );
    GeneratedEnumTestUtils.assertDeprecatedExampleEnum(
        deprecatedExampleEnum,
        HAS_ADDITIONAL_ENUM_TYPE_ANNOTATIONS,
        USE_ENUM_CASE_INSENSITIVE
    );
    GeneratedRecordTestUtils.assertExampleRecord(
        exampleRecord,
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
        IS_MODEL_SERIALIZABLE
    );
    GeneratedRecordTestUtils.assertDeprecatedExampleRecord(
        deprecatedExampleRecord,
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
        IS_MODEL_SERIALIZABLE
    );
    GeneratedRecordTestUtils.assertExampleRecordWithBooleanFields(
        exampleRecordWithBooleanFields,
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
        IS_MODEL_SERIALIZABLE
    );
    GeneratedRecordTestUtils.assertExampleRecordWithExampleEnumFields(
        exampleRecordWithExampleEnumFields,
        exampleEnum,
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
        IS_MODEL_SERIALIZABLE
    );
    GeneratedRecordTestUtils.assertExampleRecordWithExampleRecordFields(
        exampleRecordWithExampleRecordFields,
        exampleRecord,
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
        IS_MODEL_SERIALIZABLE
    );
    GeneratedRecordTestUtils.assertExampleRecordWithIntegerFields(
        exampleRecordWithIntegerFields,
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
        IS_MODEL_SERIALIZABLE
    );
    GeneratedRecordTestUtils.assertExampleRecordWithNumberFields(
        exampleRecordWithNumberFields,
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
        IS_MODEL_SERIALIZABLE
    );
    GeneratedRecordTestUtils.assertExampleRecordWithStringFields(
        exampleRecordWithStringFields,
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
        IS_MODEL_SERIALIZABLE
    );
    GeneratedRecordTestUtils.assertExampleRecordWithArrayFields(
        exampleRecordWithArrayFields,
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
        IS_MODEL_SERIALIZABLE
    );
    GeneratedRecordTestUtils.assertRecord(
        exampleRecordWithDefaultFields,
        false,
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
        IS_MODEL_SERIALIZABLE,
        String.class,
        String.class
    );
  }

}
