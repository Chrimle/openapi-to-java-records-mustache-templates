/*
  Copyright 2024 Chrimle

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.

*/
package io.github.chrimle.example;

import io.github.chrimle.example.models.GeneratedClass;
import io.github.chrimle.example.models.GeneratedEnum;
import io.github.chrimle.example.models.GeneratedField;
import io.github.chrimle.example.models.GeneratedRecord;
import io.github.chrimle.example.utils.AssertionUtils;
import io.github.chrimle.example.utils.GeneratedEnumTestUtils;
import io.github.chrimle.example.utils.GeneratedRecordTestUtils;
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
    // Asserting all generated record classes
    for (final GeneratedRecord generatedRecord : GeneratedRecord.values()) {
      final GeneratedSource generatedSource =
          getGeneratedSourceForGeneratedClass(generatedRecord, pluginExecution);
      GeneratedRecordTestUtils.assertRecord(generatedSource);
    }
    // Asserting all generated enum classes
    for (final GeneratedEnum generatedEnum : GeneratedEnum.values()) {
      final GeneratedSource generatedSource =
          getGeneratedSourceForGeneratedClass(generatedEnum, pluginExecution);
      GeneratedEnumTestUtils.assertEnumClass(generatedSource);
    }
  }

  private static GeneratedSource getGeneratedSourceForGeneratedClass(
      final GeneratedEnum generatedEnum, final PluginExecution pluginExecution) {
    return new GeneratedSource(pluginExecution, generatedEnum);
  }

  private static GeneratedSource getGeneratedSourceForGeneratedClass(
      final GeneratedRecord generatedRecord, final PluginExecution pluginExecution) {
    return switch (generatedRecord) {
      case RECORD_WITH_INNER_ENUMS ->
          new GeneratedSource(
              pluginExecution,
              generatedRecord,
              GeneratedField.of(
                      "exampleInner",
                      getGeneratedClass(GeneratedEnum.EXAMPLE_INNER_ENUM, pluginExecution))
                  .build(),
              GeneratedField.of(
                      "exampleInnerTwo",
                      getGeneratedClass(GeneratedEnum.EXAMPLE_INNER_TWO_ENUM, pluginExecution))
                  .build());
      case EXAMPLE_RECORD_WITH_REQUIRED_FIELDS_OF_EACH_TYPE ->
          new GeneratedSource(
              pluginExecution,
              generatedRecord,
              GeneratedField.of("field1", Boolean.class).isBeanValidationNullable(false).build(),
              GeneratedField.of("field2", String.class).isBeanValidationNullable(false).build(),
              GeneratedField.of("field3", Integer.class).isBeanValidationNullable(false).build(),
              GeneratedField.of("field4", BigDecimal.class).isBeanValidationNullable(false).build(),
              GeneratedField.of("field5", List.class).isBeanValidationNullable(false).build(),
              GeneratedField.of("field6", Set.class).isBeanValidationNullable(false).build(),
              GeneratedField.of(
                      "field7", getGeneratedClass(GeneratedRecord.EXAMPLE_RECORD, pluginExecution))
                  .isBeanValidationNullable(false)
                  .isCustomClass(true)
                  .build(),
              GeneratedField.of(
                      "field8", getGeneratedClass(GeneratedEnum.EXAMPLE_ENUM, pluginExecution))
                  .isBeanValidationNullable(false)
                  .build());
      default -> new GeneratedSource(pluginExecution, generatedRecord);
    };
  }

  private static Class<?> getGeneratedClass(
      final GeneratedClass generatedClass, final PluginExecution pluginExecution) {
    return AssertionUtils.assertClassExists(generatedClass.getCanonicalClassName(pluginExecution));
  }
}
