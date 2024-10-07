package com.chrimle.example;

import com.chrimle.example.utils.AssertionUtils;
import com.chrimle.example.utils.GeneratedEnumTestUtils;
import com.chrimle.example.utils.GeneratedRecordTestUtils;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class TestSuite {

  @ParameterizedTest(name = "Testing: {0}")
  @EnumSource(PluginExecution.class)
  @DisplayName("Testing Plugin Executions...")
  public void testAll(final PluginExecution pluginExecution) {
    for (final GeneratedClass generatedClass : GeneratedClass.values()) {
      switch (generatedClass) {
        case EXAMPLE_RECORD_WITH_DEFAULT_FIELDS ->
            GeneratedRecordTestUtils.assertExampleRecordWithDefaultFields(
                new GeneratedSource(
                    pluginExecution, generatedClass, GeneratedField.of("field1", String.class)));

        case EXAMPLE_RECORD_WITH_REQUIRED_FIELDS_OF_EACH_TYPE ->
            GeneratedRecordTestUtils.assertRecord(
                new GeneratedSource(
                    pluginExecution,
                    generatedClass,
                    GeneratedField.of("field1", Boolean.class),
                    GeneratedField.of("field2", String.class),
                    GeneratedField.of("field3", Integer.class),
                    GeneratedField.of("field4", BigDecimal.class),
                    GeneratedField.of("field5", List.class),
                    GeneratedField.of("field6", Set.class),
                    GeneratedField.of("field7", getExampleRecordClass(pluginExecution)),
                    GeneratedField.of("field8", getExampleEnumClass(pluginExecution))));

        case DEPRECATED_EXAMPLE_RECORD, EXAMPLE_RECORD ->
            GeneratedRecordTestUtils.assertRecord(
                new GeneratedSource(
                    pluginExecution, generatedClass, GeneratedField.of("field1", Boolean.class)));

        case EXAMPLE_RECORD_WITH_NULLABLE_FIELDS_OF_EACH_TYPE ->
            GeneratedRecordTestUtils.assertRecord(
                new GeneratedSource(
                    pluginExecution,
                    generatedClass,
                    GeneratedField.of("field1", Boolean.class, true),
                    GeneratedField.of("field2", String.class, true),
                    GeneratedField.of("field3", Integer.class, true),
                    GeneratedField.of("field4", BigDecimal.class, true),
                    GeneratedField.of("field5", List.class, true),
                    GeneratedField.of("field6", Set.class, true)));

        default ->
            GeneratedEnumTestUtils.assertEnumClass(
                new GeneratedSource(pluginExecution, generatedClass));
      }
    }
  }

  private static Class<?> getExampleEnumClass(PluginExecution pluginExecution) {
    return AssertionUtils.assertClassExists(
        GeneratedClass.EXAMPLE_ENUM.getCanonicalClassName(pluginExecution));
  }

  private static Class<?> getExampleRecordClass(PluginExecution pluginExecution) {
    return AssertionUtils.assertClassExists(
        GeneratedClass.EXAMPLE_RECORD.getCanonicalClassName(pluginExecution));
  }

}
