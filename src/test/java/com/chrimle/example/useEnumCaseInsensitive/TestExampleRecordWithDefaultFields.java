package com.chrimle.example.useEnumCaseInsensitive;

import com.chrimle.example.utils.AssertionUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing Record with default fields")
public class TestExampleRecordWithDefaultFields {

  private final Class<?> classUnderTest = ExampleRecordWithDefaultFields.class;

  @Test
  @DisplayName("Testing class generated is a Record")
  public void testClassGeneratedIsRecord() {
    AssertionUtils.assertIsRecord(classUnderTest);
  }

  @Test
  @DisplayName("Testing generated Record is not annotated as @Deprecated")
  public void testRecordIsNotAnnotatedAsDeprecated() {
    AssertionUtils.assertClassIsAnnotatedAsDeprecated(classUnderTest, false);
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