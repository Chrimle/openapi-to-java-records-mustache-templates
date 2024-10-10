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
              pluginExecution, generatedClass, GeneratedField.of("field1", Boolean.class).build());
      case EXAMPLE_RECORD_WITH_DEFAULT_FIELDS ->
          new GeneratedSource(
              pluginExecution,
              generatedClass,
              GeneratedField.of("field1", String.class).defaultValue("someDefaultValue").build());
      case EXAMPLE_RECORD_WITH_NULLABLE_FIELDS_OF_EACH_TYPE ->
          new GeneratedSource(
              pluginExecution,
              generatedClass,
              GeneratedField.of("field1", Boolean.class).isNullable(true).build(),
              GeneratedField.of("field2", String.class).isNullable(true).build(),
              GeneratedField.of("field3", Integer.class).isNullable(true).build(),
              GeneratedField.of("field4", BigDecimal.class).isNullable(true).build(),
              GeneratedField.of("field5", List.class).isNullable(true).build(),
              GeneratedField.of("field6", Set.class).isNullable(true).build());
      case EXAMPLE_RECORD_WITH_REQUIRED_FIELDS_OF_EACH_TYPE ->
          new GeneratedSource(
              pluginExecution,
              generatedClass,
              GeneratedField.of("field1", Boolean.class).isBeanValidationNullable(false).build(),
              GeneratedField.of("field2", String.class).isBeanValidationNullable(false).build(),
              GeneratedField.of("field3", Integer.class).isBeanValidationNullable(false).build(),
              GeneratedField.of("field4", BigDecimal.class).isBeanValidationNullable(false).build(),
              GeneratedField.of("field5", List.class).isBeanValidationNullable(false).build(),
              GeneratedField.of("field6", Set.class).isBeanValidationNullable(false).build(),
              GeneratedField.of("field7", getExampleRecordClass(pluginExecution))
                  .isBeanValidationNullable(false)
                  .build(),
              GeneratedField.of("field8", getExampleEnumClass(pluginExecution))
                  .isBeanValidationNullable(false)
                  .build());
      case RECORD_WITH_ALL_CONSTRAINTS ->
          new GeneratedSource(
              pluginExecution,
              generatedClass,
              GeneratedField.of("stringStandard", String.class).build(),
              GeneratedField.of("stringDefault", String.class)
                  .defaultValue("someDefaultValue")
                  .build(),
              GeneratedField.of("stringNullable", String.class).isNullable(true).build(),
              GeneratedField.of("stringRequired", String.class)
                  .isBeanValidationNullable(false)
                  .build(),
              GeneratedField.of("stringRequiredNullable", String.class).isNullable(true).build(),
              GeneratedField.of("stringRequiredPattern", String.class)
                  .isBeanValidationNullable(false)
                  .pattern("^\\d{3}-\\d{2}-\\d{4}$")
                  .build(),
              GeneratedField.of("stringMinLength", String.class).minLength(3).build(),
              GeneratedField.of("stringMaxLength", String.class).maxLength(7).build(),
              GeneratedField.of("stringMinAndMaxLength", String.class)
                  .minLength(3)
                  .maxLength(7)
                  .build(),
              GeneratedField.of("arrayMinItems", List.class).minItems(1).build(),
              GeneratedField.of("arrayMaxItems", List.class).maxItems(10).build(),
              GeneratedField.of("arrayMinAndMaxItems", List.class).minItems(1).maxItems(10).build(),
              GeneratedField.of("intMinimum", Integer.class).minimum(18).build(),
              GeneratedField.of("intMaximum", Integer.class).maximum(100).build(),
              GeneratedField.of("intMinimumAndMaximum", Integer.class)
                  .minimum(0)
                  .maximum(100)
                  .build(),
              GeneratedField.of("longMinimum", Long.class).minimum(18).build(),
              GeneratedField.of("longMaximum", Long.class).maximum(100).build(),
              GeneratedField.of("longMinimumAndMaximum", Long.class)
                  .minimum(0)
                  .maximum(100)
                  .build(),
              GeneratedField.of("bigDecimalMinimum", BigDecimal.class).decimalMin("0").build(),
              GeneratedField.of("bigDecimalMaximum", BigDecimal.class).decimalMax("100").build(),
              GeneratedField.of("bigDecimalMinimumAndMaximum", BigDecimal.class)
                  .decimalMin("0")
                  .decimalMax("100")
                  .build());
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
