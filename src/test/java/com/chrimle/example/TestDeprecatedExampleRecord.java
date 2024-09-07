package com.chrimle.example;

import com.chrimle.example.utils.AssertionUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@SuppressWarnings("deprecation")
@DisplayName("Testing Deprecated Record")
public class TestDeprecatedExampleRecord {

  private final Class<?> classUnderTest = DeprecatedExampleRecord.class;

  @Test
  @DisplayName("Testing class generated is a Record")
  public void testClassGeneratedIsRecord() {
    AssertionUtils.assertIsRecord(classUnderTest);
  }

  @Test
  @DisplayName("Testing generated Record is annotated as @Deprecated")
  public void testRecordIsAnnotatedAsDeprecated() {
    AssertionUtils.assertClassIsAnnotatedAsDeprecated(classUnderTest);
  }

}
