package com.chrimle.example.useEnumCaseInsensitive;

import com.chrimle.example.utils.AssertionUtils;
import java.math.BigDecimal;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing Record with Number fields")
public class TestExampleRecordWithNumberFields {

  private final Class<?> classUnderTest = ExampleRecordWithNumberFields.class;

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
  @DisplayName("Testing generated Record has expected number of fields of expected types")
  public void testRecordHasNumberOfFieldsOfType() {
    AssertionUtils.assertRecordHasNumberOfFieldsOfType(
        classUnderTest, 3, BigDecimal.class);
  }

}
