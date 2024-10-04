package com.chrimle.example;

import com.chrimle.example.utils.AssertionUtils;
import com.chrimle.example.utils.GeneratedEnumTestUtils;
import com.chrimle.example.utils.GeneratedRecordTestUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class TestSuite {

  @ParameterizedTest(name = "Testing: {0}")
  @EnumSource(PluginExecution.class)
  @DisplayName("Testing Plugin Executions...")
  public void testAll(final PluginExecution pluginExecution) {
    for (final GeneratedClass generatedClass : GeneratedClass.values()) {
      assertModel(generatedClass, pluginExecution);
    }
  }

  private void assertModel(
      final GeneratedClass generatedClass, final PluginExecution pluginExecution) {

    final Class<?> classUnderTest =
        AssertionUtils.assertClassExists(getCanonicalClassName(pluginExecution, generatedClass));

    switch (generatedClass) {
      case EXAMPLE_ENUM ->
          GeneratedEnumTestUtils.assertExampleEnum(pluginExecution, classUnderTest);
      case DEPRECATED_EXAMPLE_ENUM ->
          GeneratedEnumTestUtils.assertDeprecatedExampleEnum(pluginExecution, classUnderTest);
      case EXAMPLE_RECORD_WITH_DEFAULT_FIELDS ->
          GeneratedRecordTestUtils.assertExampleRecordWithDefaultFields(pluginExecution);
      case EXAMPLE_RECORD_WITH_REQUIRED_FIELDS_OF_EACH_TYPE ->
          GeneratedRecordTestUtils.assertExampleRecordWithRequiredFieldsOfEachType(pluginExecution);
      default ->
          GeneratedRecordTestUtils.assertRecord(
              pluginExecution, generatedClass, generatedClass.fieldClasses);
    }
  }

  private String getCanonicalClassName(
      final PluginExecution pluginExecution, final GeneratedClass generatedClass) {
    return generatedClass.getCanonicalClassName(pluginExecution.getPackageName());
  }
}
