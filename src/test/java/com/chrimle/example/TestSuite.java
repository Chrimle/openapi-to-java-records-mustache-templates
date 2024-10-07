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
                    pluginExecution,
                    generatedClass,
                    new GeneratedField("field1", String.class, false)));

        case EXAMPLE_RECORD_WITH_REQUIRED_FIELDS_OF_EACH_TYPE ->
            GeneratedRecordTestUtils.assertRecord(
                new GeneratedSource(
                    pluginExecution,
                    generatedClass,
                    new GeneratedField("field1", Boolean.class, true),
                    new GeneratedField("field2", String.class, true),
                    new GeneratedField("field3", Integer.class, true),
                    new GeneratedField("field4", BigDecimal.class, true),
                    new GeneratedField("field5", List.class, true),
                    new GeneratedField("field6", Set.class, true),
                    new GeneratedField(
                        "field7",
                        AssertionUtils.assertClassExists(
                            GeneratedClass.EXAMPLE_RECORD.getCanonicalClassName(pluginExecution)),
                        false),
                    new GeneratedField(
                        "field8",
                        AssertionUtils.assertClassExists(
                            GeneratedClass.EXAMPLE_ENUM.getCanonicalClassName(pluginExecution)),
                        false)));
        case DEPRECATED_EXAMPLE_RECORD, EXAMPLE_RECORD ->
            GeneratedRecordTestUtils.assertRecord(
                new GeneratedSource(
                    pluginExecution,
                    generatedClass,
                    new GeneratedField("field1", Boolean.class, false)));
        case EXAMPLE_RECORD_WITH_NULLABLE_FIELDS_OF_EACH_TYPE ->
            GeneratedRecordTestUtils.assertRecord(
                new GeneratedSource(
                    pluginExecution,
                    generatedClass,
                    new GeneratedField("field1", Boolean.class, true),
                    new GeneratedField("field2", String.class, true),
                    new GeneratedField("field3", Integer.class, true),
                    new GeneratedField("field4", BigDecimal.class, true),
                    new GeneratedField("field5", List.class, true),
                    new GeneratedField("field6", Set.class, true)));
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
