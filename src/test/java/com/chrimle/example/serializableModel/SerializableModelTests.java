package com.chrimle.example.serializableModel;

import com.chrimle.example.utils.GeneratedEnumTestUtils;
import com.chrimle.example.utils.GeneratedRecordTestUtils;
import java.math.BigDecimal;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Tests for the 'serializableModel' plugin-execution.
 */
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
    GeneratedEnumTestUtils.assertEnumClass(
        exampleEnum,
        false,
        HAS_ADDITIONAL_ENUM_TYPE_ANNOTATIONS,
        USE_ENUM_CASE_INSENSITIVE
    );
    GeneratedEnumTestUtils.assertEnumClass(
        deprecatedExampleEnum,
        true,
        HAS_ADDITIONAL_ENUM_TYPE_ANNOTATIONS,
        USE_ENUM_CASE_INSENSITIVE
    );
    GeneratedRecordTestUtils.assertRecord(
        exampleRecord,
        false,
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
        IS_MODEL_SERIALIZABLE,
        Boolean.class
    );
    GeneratedRecordTestUtils.assertRecord(
        deprecatedExampleRecord,
        true,
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
        IS_MODEL_SERIALIZABLE,
        Boolean.class
    );
    GeneratedRecordTestUtils.assertRecord(
        exampleRecordWithBooleanFields,
        false,
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
        IS_MODEL_SERIALIZABLE,
        Boolean.class,
        Boolean.class,
        Boolean.class
    );
    GeneratedRecordTestUtils.assertRecord(
        exampleRecordWithExampleEnumFields,
        false,
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
        IS_MODEL_SERIALIZABLE,
        exampleEnum,
        exampleEnum,
        exampleEnum
    );
    GeneratedRecordTestUtils.assertRecord(
        exampleRecordWithExampleRecordFields,
        false,
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
        IS_MODEL_SERIALIZABLE,
        exampleRecord,
        exampleRecord,
        exampleRecord
    );
    GeneratedRecordTestUtils.assertRecord(
        exampleRecordWithIntegerFields,
        false,
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
        IS_MODEL_SERIALIZABLE,
        Integer.class,
        Integer.class,
        Integer.class
    );
    GeneratedRecordTestUtils.assertRecord(
        exampleRecordWithNumberFields,
        false,
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
        IS_MODEL_SERIALIZABLE,
        BigDecimal.class,
        BigDecimal.class,
        BigDecimal.class
    );
    GeneratedRecordTestUtils.assertRecord(
        exampleRecordWithStringFields,
        false,
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
        IS_MODEL_SERIALIZABLE,
        String.class,
        String.class,
        String.class
    );
    GeneratedRecordTestUtils.assertRecord(
        exampleRecordWithArrayFields,
        false,
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
        IS_MODEL_SERIALIZABLE,
        List.class,
        List.class,
        List.class
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
