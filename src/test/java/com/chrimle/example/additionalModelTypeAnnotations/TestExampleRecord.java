package com.chrimle.example.additionalModelTypeAnnotations;

import com.chrimle.example.utils.AssertionUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing Record")
public class TestExampleRecord {

  private final Class<?> classUnderTest = ExampleRecord.class;

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
  @DisplayName("Testing generated Record is annotated with AdditionalModelTypeAnnotations")
  public void testRecordIsAnnotatedWithAdditionalModelTypeAnnotations() {
    AssertionUtils.assertClassIsAnnotatedWith(classUnderTest, com.chrimle.example.annotations.TestAnnotationOne.class);
    AssertionUtils.assertClassIsAnnotatedWith(classUnderTest, com.chrimle.example.annotations.TestAnnotationTwo.class);
    AssertionUtils.assertClassIsAnnotatedWith(classUnderTest, com.chrimle.example.annotations.TestAnnotationThree.class);

  }

}