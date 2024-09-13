package com.chrimle.example.standard;

import com.chrimle.example.utils.AssertionUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing Record with ExampleRecord fields")
public class TestExampleRecordWithExampleRecordFields {

  private final Class<?> classUnderTest = ExampleRecordWithExampleRecordFields.class;

  @Test
  @DisplayName("Testing class generated is a Record")
  public void testClassGeneratedIsRecord() {
    AssertionUtils.assertIsRecord(classUnderTest);
  }

  @Test
  @DisplayName("Testing generated Record is not annotated as @Deprecated")
  public void testRecordIsNotAnnotatedAsDeprecated() {
    AssertionUtils.assertClassIsNotAnnotatedAsDeprecated(classUnderTest);
  }

  @Test
  @DisplayName("Testing generated Record has expected number of fields of expected types")
  public void testRecordHasNumberOfFieldsOfType() {
    AssertionUtils.assertRecordHasNumberOfFieldsOfType(
        classUnderTest, 3, ExampleRecord.class);
  }
}
