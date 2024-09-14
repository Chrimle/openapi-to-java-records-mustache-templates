package com.chrimle.example.serializableModel;

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
  @DisplayName("Testing generated Record has field 'serialVersionUID'")
  public void testRecordHasFieldSerialVersionUID()
      throws NoSuchFieldException {
    Assertions.assertNotNull(classUnderTest.getDeclaredField("serialVersionUID"));
  }

}
