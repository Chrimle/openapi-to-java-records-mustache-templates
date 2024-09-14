package com.chrimle.example.standard;

import com.chrimle.example.utils.AssertionUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing Enum")
public class TestExampleEnum {

  private final Class<?> classUnderTest = ExampleEnum.class;

  @Test
  @DisplayName("Testing class generated is an Enum")
  public void testClassGeneratedIsRecord() {
    AssertionUtils.assertIsEnum(classUnderTest);
  }

  @Test
  @DisplayName("Testing generated Enum is not annotated as @Deprecated")
  public void testEnumIsNotAnnotatedAsDeprecated() {
    AssertionUtils.assertClassIsNotAnnotatedAsDeprecated(classUnderTest);
  }

  @Test
  @DisplayName("Testing generated Enum values are named as expected")
  public void testEnumValueNames() {
    for (int i = 1; i <= 3; i++) {
      Assertions.assertEquals("ENUM" + i, ExampleEnum.values()[i - 1].name());
    }
  }

  @Test
  public void testEnumIsNotAnnotatedWithAdditionalEnumTypeAnnotations() {
    AssertionUtils.assertClassIsNotAnnotatedWith(classUnderTest, com.chrimle.example.annotations.TestAnnotationOne.class);
    AssertionUtils.assertClassIsNotAnnotatedWith(classUnderTest, com.chrimle.example.annotations.TestAnnotationTwo.class);
    AssertionUtils.assertClassIsNotAnnotatedWith(classUnderTest, com.chrimle.example.annotations.TestAnnotationThree.class);
  }
}