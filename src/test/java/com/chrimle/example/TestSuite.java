package com.chrimle.example;

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
                new GeneratedSource(pluginExecution, generatedClass, String.class));
        case EXAMPLE_RECORD_WITH_REQUIRED_FIELDS_OF_EACH_TYPE ->
            GeneratedRecordTestUtils.assertRecord(
                new GeneratedSource(
                    pluginExecution,
                    generatedClass,
                    Boolean.class,
                    String.class,
                    Integer.class,
                    BigDecimal.class,
                    List.class,
                    Set.class,
                    new GeneratedSource(pluginExecution, GeneratedClass.EXAMPLE_RECORD)
                        .getClassUnderTest(),
                    new GeneratedSource(pluginExecution, GeneratedClass.EXAMPLE_ENUM)
                        .getClassUnderTest()));
        case DEPRECATED_EXAMPLE_RECORD, EXAMPLE_RECORD ->
            GeneratedRecordTestUtils.assertRecord(
                new GeneratedSource(pluginExecution, generatedClass, Boolean.class));
        case EXAMPLE_RECORD_WITH_NULLABLE_FIELDS_OF_EACH_TYPE ->
            GeneratedRecordTestUtils.assertRecord(
                new GeneratedSource(
                    pluginExecution,
                    generatedClass,
                    Boolean.class,
                    String.class,
                    Integer.class,
                    BigDecimal.class,
                    List.class,
                    Set.class));
        default -> assertGeneratedSource(new GeneratedSource(pluginExecution, generatedClass));
      }
    }
  }

  private static void assertGeneratedSource(final GeneratedSource generatedSource) {
    if (generatedSource.isEnum()) {
      GeneratedEnumTestUtils.assertEnumClass(generatedSource);
    } else {
      GeneratedRecordTestUtils.assertRecord(generatedSource);
    }
  }
}
