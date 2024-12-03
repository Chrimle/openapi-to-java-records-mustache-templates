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
package io.github.chrimle.example.models;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/** Enum class listing all expected {@code record} classes to be generated from the OpenAPI spec. */
public enum GeneratedRecord implements GeneratedClass {
  DEPRECATED_EXAMPLE_RECORD(
      "DeprecatedExampleRecord", true, false, GeneratedField.of("field1", Boolean.class).build()),
  EXAMPLE_RECORD("ExampleRecord", false, false, GeneratedField.of("field1", Boolean.class).build()),
  EXAMPLE_RECORD_WITH_DEFAULT_FIELDS(
      "ExampleRecordWithDefaultFields",
      false,
      false,
      GeneratedField.of("field1", String.class).defaultValue("someDefaultValue").build()),
  EXAMPLE_RECORD_WITH_EXTRA_ANNOTATION(
      "ExampleRecordWithExtraAnnotation",
      false,
      true,
      GeneratedField.of("field1", Boolean.class).build()),
  EXAMPLE_RECORD_WITH_NULLABLE_FIELDS_OF_EACH_TYPE(
      "ExampleRecordWithNullableFieldsOfEachType",
      false,
      false,
      GeneratedField.of("field1", Boolean.class).isNullable(true).build(),
      GeneratedField.of("field2", String.class).isNullable(true).build(),
      GeneratedField.of("field3", Integer.class).isNullable(true).build(),
      GeneratedField.of("field4", BigDecimal.class).isNullable(true).build(),
      GeneratedField.of("field5", List.class).isNullable(true).build(),
      GeneratedField.of("field6", Set.class).isNullable(true).build()),
  /**
   * This class reference another class, which requires Reflection at runtime. Hence, this class
   * does not list all expected fields to be generated. This is done in {@link
   * io.github.chrimle.example.TestSuite}.
   */
  EXAMPLE_RECORD_WITH_REQUIRED_FIELDS_OF_EACH_TYPE(
      "ExampleRecordWithRequiredFieldsOfEachType", false, false),
  RECORD_WITH_ALL_CONSTRAINTS(
      "RecordWithAllConstraints",
      false,
      false,
      GeneratedField.of("stringStandard", String.class).build(),
      GeneratedField.of("stringDefault", String.class).defaultValue("someDefaultValue").build(),
      GeneratedField.of("stringNullable", String.class).isNullable(true).build(),
      GeneratedField.of("stringRequired", String.class).isBeanValidationNullable(false).build(),
      GeneratedField.of("stringRequiredNullable", String.class).isNullable(true).build(),
      GeneratedField.of("stringRequiredPattern", String.class)
          .isBeanValidationNullable(false)
          .pattern("^\\d{3}-\\d{2}-\\d{4}$")
          .build(),
      GeneratedField.of("stringEmailFormat", String.class).isEmail(true).build(),
      GeneratedField.of("stringUuidFormat", UUID.class).build(),
      GeneratedField.of("stringMinLength", String.class).minLength(3).build(),
      GeneratedField.of("stringMaxLength", String.class).maxLength(7).build(),
      GeneratedField.of("stringMinAndMaxLength", String.class).minLength(3).maxLength(7).build(),
      GeneratedField.of("arrayMinItems", List.class).minItems(1).build(),
      GeneratedField.of("arrayMaxItems", List.class).maxItems(10).build(),
      GeneratedField.of("arrayMinAndMaxItems", List.class).minItems(1).maxItems(10).build(),
      GeneratedField.of("intMinimum", Integer.class).minimum(18).build(),
      GeneratedField.of("intMaximum", Integer.class).maximum(100).build(),
      GeneratedField.of("intMinimumAndMaximum", Integer.class).minimum(0).maximum(100).build(),
      GeneratedField.of("longMinimum", Long.class).minimum(18).build(),
      GeneratedField.of("longMaximum", Long.class).maximum(100).build(),
      GeneratedField.of("longMinimumAndMaximum", Long.class).minimum(0).maximum(100).build(),
      GeneratedField.of("bigDecimalMinimum", BigDecimal.class).decimalMin("0").build(),
      GeneratedField.of("bigDecimalMaximum", BigDecimal.class).decimalMax("100").build(),
      GeneratedField.of("bigDecimalMinimumAndMaximum", BigDecimal.class)
          .decimalMin("0")
          .decimalMax("100")
          .build()),
  /**
   * This class reference another class, which requires Reflection at runtime. Hence, this class
   * does not list all expected fields to be generated. This is done in {@link
   * io.github.chrimle.example.TestSuite}.
   */
  RECORD_WITH_INNER_ENUMS("RecordWithInnerEnums", false, false);

  private final String simpleClassName;
  private final boolean isDeprecated;
  private final boolean hasExtraAnnotations;
  private final GeneratedField<?>[] generatedFields;

  GeneratedRecord(
      final String simpleClassName,
      final boolean isDeprecated,
      final boolean hasExtraAnnotations,
      final GeneratedField<?>... generatedFields) {
    this.simpleClassName = simpleClassName;
    this.isDeprecated = isDeprecated;
    this.hasExtraAnnotations = hasExtraAnnotations;
    this.generatedFields = generatedFields;
  }

  /**
   * {@inheritDoc}
   *
   * @return the class name as a {@link String}.
   */
  @Override
  public String getSimpleClassName() {
    return simpleClassName;
  }

  /**
   * {@inheritDoc}
   *
   * @return whether the class is deprecated.
   */
  @Override
  public boolean isDeprecated() {
    return isDeprecated;
  }

  /**
   * {@inheritDoc}
   *
   * @return whether the class is an {@code enum} class.
   */
  @Override
  public boolean isEnum() {
    return false;
  }

  /**
   * {@inheritDoc}
   *
   * @return the collection of generatedFields.
   */
  @Override
  public GeneratedField<?>[] getGeneratedFields() {
    return generatedFields;
  }

  /**
   * {@inheritDoc}
   *
   * @return whether the class has extra annotations.
   */
  @Override
  public boolean hasExtraAnnotations() {
    return hasExtraAnnotations;
  }
}
