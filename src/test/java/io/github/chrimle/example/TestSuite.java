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

import io.github.chrimle.example.utils.AssertionUtils;
import io.github.chrimle.example.utils.GeneratedEnumTestUtils;
import io.github.chrimle.example.utils.GeneratedRecordTestUtils;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import java.util.UUID;
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
    return switch (generatedEnum) {
      case DEPRECATED_EXAMPLE_ENUM, EXAMPLE_ENUM, EXAMPLE_INNER_ENUM ->
          new GeneratedSource(
              pluginExecution,
              generatedEnum,
              GeneratedField.of("ENUM1", String.class, "ENUM1").build(),
              GeneratedField.of("ENUM2", String.class, "ENUM2").build(),
              GeneratedField.of("ENUM3", String.class, "ENUM3").build());
      case EXAMPLE_INNER_TWO_ENUM ->
          new GeneratedSource(
              pluginExecution,
              generatedEnum,
              GeneratedField.of("NUMBER_404", Integer.class, 404).build(),
              GeneratedField.of("NUMBER_501", Integer.class, 501).build(),
              GeneratedField.of("NUMBER_503", Integer.class, 503).build());
      case EXAMPLE_ENUM_WITH_INTEGER_VALUES ->
          new GeneratedSource(
              pluginExecution,
              generatedEnum,
              GeneratedField.of("NUMBER_100", Integer.class, 100).build(),
              GeneratedField.of("NUMBER_200", Integer.class, 200).build(),
              GeneratedField.of("NUMBER_300", Integer.class, 300).build(),
              GeneratedField.of("NUMBER_400", Integer.class, 400).build(),
              GeneratedField.of("NUMBER_500", Integer.class, 500).build());
    };
  }

  private static GeneratedSource getGeneratedSourceForGeneratedClass(
      final GeneratedRecord generatedRecord, final PluginExecution pluginExecution) {
    return switch (generatedRecord) {
      case DEPRECATED_EXAMPLE_RECORD, EXAMPLE_RECORD ->
          new GeneratedSource(
              pluginExecution, generatedRecord, GeneratedField.of("field1", Boolean.class).build());
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
      case EXAMPLE_RECORD_WITH_DEFAULT_FIELDS ->
          new GeneratedSource(
              pluginExecution,
              generatedRecord,
              GeneratedField.of("field1", String.class).defaultValue("someDefaultValue").build());
      case EXAMPLE_RECORD_WITH_NULLABLE_FIELDS_OF_EACH_TYPE ->
          new GeneratedSource(
              pluginExecution,
              generatedRecord,
              GeneratedField.of("field1", Boolean.class).isNullable(true).build(),
              GeneratedField.of("field2", String.class).isNullable(true).build(),
              GeneratedField.of("field3", Integer.class).isNullable(true).build(),
              GeneratedField.of("field4", BigDecimal.class).isNullable(true).build(),
              GeneratedField.of("field5", List.class).isNullable(true).build(),
              GeneratedField.of("field6", Set.class).isNullable(true).build());
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
      case RECORD_WITH_ALL_CONSTRAINTS ->
          new GeneratedSource(
              pluginExecution,
              generatedRecord,
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
              GeneratedField.of("stringEmailFormat", String.class).isEmail(true).build(),
              GeneratedField.of("stringUuidFormat", UUID.class).build(),
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

  private static Class<?> getGeneratedClass(
      final GeneratedClass generatedClass, final PluginExecution pluginExecution) {
    return AssertionUtils.assertClassExists(generatedClass.getCanonicalClassName(pluginExecution));
  }
}
