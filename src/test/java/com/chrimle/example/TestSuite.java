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

      final GeneratedSource generatedSource =
          getGeneratedSourceForGeneratedClass(generatedClass, pluginExecution);

      if (generatedSource.isEnum()) {
        GeneratedEnumTestUtils.assertEnumClass(generatedSource);
      } else {
        GeneratedRecordTestUtils.assertRecord(generatedSource);
      }
    }
  }

  private static GeneratedSource getGeneratedSourceForGeneratedClass(
      final GeneratedClass generatedClass, final PluginExecution pluginExecution) {
    return switch (generatedClass) {
      case DEPRECATED_EXAMPLE_ENUM, EXAMPLE_ENUM ->
          new GeneratedSource(pluginExecution, generatedClass);
      case DEPRECATED_EXAMPLE_RECORD, EXAMPLE_RECORD ->
          new GeneratedSource(
              pluginExecution, generatedClass, GeneratedField.of("field1", Boolean.class));
      case EXAMPLE_RECORD_WITH_DEFAULT_FIELDS ->
          new GeneratedSource(
              pluginExecution,
              generatedClass,
              GeneratedField.of("field1", String.class, false, "someDefaultValue"));
      case EXAMPLE_RECORD_WITH_NULLABLE_FIELDS_OF_EACH_TYPE ->
          new GeneratedSource(
              pluginExecution,
              generatedClass,
              GeneratedField.of("field1", Boolean.class, true),
              GeneratedField.of("field2", String.class, true),
              GeneratedField.of("field3", Integer.class, true),
              GeneratedField.of("field4", BigDecimal.class, true),
              GeneratedField.of("field5", List.class, true),
              GeneratedField.of("field6", Set.class, true));
      case EXAMPLE_RECORD_WITH_REQUIRED_FIELDS_OF_EACH_TYPE ->
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
              GeneratedField.of("field8", getExampleEnumClass(pluginExecution)));
      case RECORD_WITH_ALL_CONSTRAINTS ->
          new GeneratedSource(
              pluginExecution,
              generatedClass,
              GeneratedField.of("stringStandard", String.class),
              GeneratedField.of("stringDefault", String.class, false, "someDefaultValue"),
              GeneratedField.of("stringNullable", String.class, true),
              GeneratedField.of("stringRequired", String.class),
              GeneratedField.of("stringRequiredNullable", String.class, true),
              GeneratedField.of("stringRequiredPattern", String.class));
    };
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
