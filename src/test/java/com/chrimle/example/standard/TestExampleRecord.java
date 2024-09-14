package com.chrimle.example.standard;

import com.chrimle.example.utils.AssertionUtils;
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
    AssertionUtils.assertClassIsAnnotatedAsDeprecated(classUnderTest, false);
  }

  @Test
  @DisplayName("Testing generated Record is not annotated with AdditionalModelTypeAnnotations")
  public void testRecordIsNotAnnotatedWithAdditionalModelTypeAnnotations() {
    AssertionUtils.assertClassIsNotAnnotatedWith(classUnderTest, com.chrimle.example.annotations.TestAnnotationOne.class);
    AssertionUtils.assertClassIsNotAnnotatedWith(classUnderTest, com.chrimle.example.annotations.TestAnnotationTwo.class);
    AssertionUtils.assertClassIsNotAnnotatedWith(classUnderTest, com.chrimle.example.annotations.TestAnnotationThree.class);
  }

  @Test
  @DisplayName("Testing generated Record does not have field 'serialVersionUID'")
  public void testRecordDoesNotHaveFieldSerialVersionUID() {
    AssertionUtils.assertModelIsSerializable(classUnderTest, false);
  }
}
