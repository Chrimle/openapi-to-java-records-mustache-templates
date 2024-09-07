package com.chrimle.example;

import com.chrimle.example.utils.AssertionUtils;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing Record with Array fields")
public class TestExampleRecordWithArrayFields {

  private final Class<?> classUnderTest = ExampleRecordWithArrayFields.class;

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
        classUnderTest, 3, List.class);
  }
}
