package com.chrimle.example.standard;

import com.chrimle.example.utils.AssertionUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@SuppressWarnings("deprecation")
@DisplayName("Testing Deprecated Enum")
class TestDeprecatedExampleEnum {

  private final Class<?> classUnderTest = DeprecatedExampleEnum.class;

  @Test
  @DisplayName("Testing class generated is an Enum")
  public void testClassGeneratedIsRecord() {
    AssertionUtils.assertIsEnum(classUnderTest);
  }

  @Test
  @DisplayName("Testing generated Enum is annotated as @Deprecated")
  public void testEnumIsAnnotatedAsDeprecated() {
    AssertionUtils.assertClassIsAnnotatedAsDeprecated(classUnderTest);
  }

  @Test
  @DisplayName("Testing generated Enum values are named as expected")
  public void testEnumValueNames() {
    for (int i = 1; i <= 3; i++) {
      Assertions.assertEquals("ENUM" + i,
          DeprecatedExampleEnum.values()[i - 1].name());
    }
  }

}