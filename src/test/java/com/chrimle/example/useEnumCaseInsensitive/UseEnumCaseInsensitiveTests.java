package com.chrimle.example.useEnumCaseInsensitive;

import com.chrimle.example.TestSuite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Tests for the 'useEnumCaseInsensitive' plugin-execution.
 */
@SuppressWarnings("deprecation")
public class UseEnumCaseInsensitiveTests {

  final boolean HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS = false;
  final boolean HAS_ADDITIONAL_ENUM_TYPE_ANNOTATIONS = false;
  final boolean USE_ENUM_CASE_INSENSITIVE = true;
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
        HAS_ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
        HAS_ADDITIONAL_ENUM_TYPE_ANNOTATIONS,
        USE_ENUM_CASE_INSENSITIVE,
        IS_MODEL_SERIALIZABLE
    );
    testSuite.assertModels();
  }

  @Test
  @DisplayName("Testing nullable field is null after instantiation")
  public void testNullableFieldIsNullAfterInstantiation() {
    ExampleRecordWithDefaultFields record = new ExampleRecordWithDefaultFields(
        null, "ignore");
    Assertions.assertNull(record.field1());
  }

  @Test
  @DisplayName("Testing field with default value is set to default if null is provided")
  public void testFieldWithDefaultValueIsSetToDefaultIfProvidedValueIsNull() {
    ExampleRecordWithDefaultFields record = new ExampleRecordWithDefaultFields(
        "ignore", null);
    Assertions.assertEquals("someDefaultValue", record.field2());
  }

  @Test
  @DisplayName("Testing field with default value is set to provided value if not null")
  public void testFieldWithDefaultValueIsSetToProvidedValueIfProvidedValueIsNotNull() {
    ExampleRecordWithDefaultFields record = new ExampleRecordWithDefaultFields(
        "ignore", "someValue");
    Assertions.assertEquals("someValue", record.field2());
  }

}
