package com.chrimle.example.useEnumCaseInsensitive;

import com.chrimle.example.utils.GeneratedEnumTestUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing Enum")
public class TestExampleEnum {

  private final Class<ExampleEnum> classUnderTest = ExampleEnum.class;

  @Test
  public void testEnum() {
    GeneratedEnumTestUtils.assertEnumClass(classUnderTest, false, false, true);
  }

}