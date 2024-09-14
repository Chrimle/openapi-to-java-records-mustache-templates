package com.chrimle.example.useEnumCaseInsensitive;

import com.chrimle.example.utils.AssertionUtils;
import java.util.List;
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
    AssertionUtils.assertClassIsAnnotatedAsDeprecated(classUnderTest, false);
  }

  @Test
  @DisplayName("Testing generated Enum values are named as expected")
  public void testEnumValueNames() {
    for (int i = 1; i <= 3; i++) {
      Assertions.assertEquals("ENUM" + i, ExampleEnum.values()[i - 1].name());
    }
  }

  @Test
  @DisplayName("Testing generated fromValue()-method is case-insensitive")
  public void testFromValueIsCaseInsensitive() {
    for (final String name : List.of("enum", "Enum", "EnUm", "ENUM", "eNuM")) {
      for (int i = 1; i <= 3; i++) {
        Assertions.assertEquals(ExampleEnum.values()[i - 1], ExampleEnum.fromValue(name+i));
      }
    }
  }

  @Test
  @DisplayName("Testing generated fromValue()-method throws if name does not match")
  public void testFromValueThrowsIllegalArgumentIfNameDoesNotMatch() {
    Assertions.assertThrows(IllegalArgumentException.class,
        () -> ExampleEnum.fromValue("invalid"));
  }
}