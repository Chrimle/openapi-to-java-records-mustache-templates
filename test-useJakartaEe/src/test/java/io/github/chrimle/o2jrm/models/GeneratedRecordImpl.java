/*
  Copyright 2024-2025 Chrimle

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
package io.github.chrimle.o2jrm.models;

import io.github.chrimle.o2jrm.PluginExecution;
import io.github.chrimle.o2jrm.annotations.TestExtraAnnotation;
import io.github.chrimle.o2jrm.annotations.TestExtraAnnotationTwo;
import io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne;
import io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationTwo;
import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/** Enum class listing all expected {@code record} classes to be generated from the OpenAPI spec. */
public enum GeneratedRecordImpl implements GeneratedRecord, GeneratedClassImpl {
  DEPRECATED_EXAMPLE_RECORD(
      "DeprecatedExampleRecord",
      true,
      List.of(),
      GeneratedField.of("field1", Boolean.class).build()),
  EXAMPLE_RECORD(
      "ExampleRecord", false, List.of(), GeneratedField.of("field1", Boolean.class).build()),
  EXAMPLE_NULLABLE_RECORD(
      "ExampleNullableRecord",
      false,
      List.of(),
      GeneratedField.of("field1", Boolean.class).build()),
  EXAMPLE_RECORD_WITH_DEFAULT_FIELDS(
      "ExampleRecordWithDefaultFields",
      false,
      List.of(),
      GeneratedField.of("field1", String.class).defaultValue("someDefaultValue").build()),
  EXAMPLE_RECORD_WITH_ONE_EXTRA_ANNOTATION(
      "ExampleRecordWithOneExtraAnnotation",
      false,
      List.of(TestExtraAnnotation.class),
      GeneratedField.of("field1", Boolean.class)
          .withExtraFieldAnnotations(TestFieldExtraAnnotationOne.class)
          .build(),
      GeneratedField.of("field2", Boolean.class)
          .withExtraFieldAnnotations(
              TestFieldExtraAnnotationOne.class, TestFieldExtraAnnotationTwo.class)
          .build()),
  EXAMPLE_RECORD_WITH_TWO_EXTRA_ANNOTATIONS(
      "ExampleRecordWithTwoExtraAnnotations",
      false,
      List.of(TestExtraAnnotation.class, TestExtraAnnotationTwo.class),
      GeneratedField.of("field1", Boolean.class).build()),
  /**
   * This class reference another class, which requires Reflection at runtime. Hence, this class
   * does not list all expected fields to be generated. This is done in {@link
   * #getGeneratedFields(GeneratedClass, PluginExecution)}.
   */
  RECORD_WITH_NULLABLE_FIELDS_OF_EACH_TYPE("RecordWithNullableFieldsOfEachType", false, List.of()),
  /**
   * This class reference another class, which requires Reflection at runtime. Hence, this class
   * does not list all expected fields to be generated. This is done in {@link
   * #getGeneratedFields(GeneratedClass, PluginExecution)}.
   */
  RECORD_WITH_REQUIRED_FIELDS_OF_EACH_TYPE("RecordWithRequiredFieldsOfEachType", false, List.of()),
  RECORD_WITH_ALL_CONSTRAINTS(
      "RecordWithAllConstraints",
      false,
      List.of(),
      GeneratedField.of("stringStandard", String.class).build(),
      GeneratedField.of("stringDefault", String.class).defaultValue("someDefaultValue").build(),
      GeneratedField.of("stringNullable", String.class).isNullable(true).build(),
      GeneratedField.of("stringRequired", String.class)
          .isBeanValidationNullable(false)
          .isRequired(true)
          .build(),
      GeneratedField.of("stringRequiredNullable", String.class)
          .isNullable(true)
          .isRequired(true)
          .build(),
      GeneratedField.of("stringRequiredPattern", String.class)
          .isRequired(true)
          .isBeanValidationNullable(false)
          .pattern("^\\d{3}-\\d{2}-\\d{4}$")
          .build(),
      GeneratedField.of("stringEmailFormat", String.class).isEmail(true).build(),
      GeneratedField.of("stringUuidFormat", UUID.class).build(),
      GeneratedField.of("stringMinLength", String.class).minLength(3).build(),
      GeneratedField.of("stringMaxLength", String.class).maxLength(7).build(),
      GeneratedField.of("stringMinAndMaxLength", String.class).minLength(3).maxLength(7).build(),
      GeneratedField.of("arrayMinItems", List.class, String.class).minItems(1).build(),
      GeneratedField.of("arrayMaxItems", List.class, String.class).maxItems(10).build(),
      GeneratedField.of("arrayMinAndMaxItems", List.class, String.class)
          .minItems(1)
          .maxItems(10)
          .build(),
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
   * #getGeneratedFields(GeneratedClass, PluginExecution)}.
   */
  RECORD_WITH_INNER_ENUMS("RecordWithInnerEnums", false, List.of()),
  /**
   * This class reference another class, which requires Reflection at runtime. Hence, this class
   * does not list all expected fields to be generated. This is done in {@link
   * #getGeneratedFields(GeneratedClass, PluginExecution)}.
   */
  RECORD_WITH_COLLECTIONS_OF_RECORDS("ExampleRecordWithCollectionsOfRecords", false, List.of());

  private final String simpleClassName;
  private final boolean isDeprecated;
  private final boolean hasExtraAnnotations;
  private final List<Class<? extends Annotation>> extraAnnotations;
  private final GeneratedField<?>[] generatedFields;

  GeneratedRecordImpl(
      final String simpleClassName,
      final boolean isDeprecated,
      final List<Class<? extends Annotation>> extraAnnotations,
      final GeneratedField<?>... generatedFields) {
    this.simpleClassName = simpleClassName;
    this.isDeprecated = isDeprecated;
    this.hasExtraAnnotations = !extraAnnotations.isEmpty();
    this.extraAnnotations = extraAnnotations;
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

  /**
   * {@inheritDoc}
   *
   * @return the collection of annotations.
   */
  @Override
  public List<Class<? extends Annotation>> getExtraAnnotations() {
    return extraAnnotations;
  }

  public static GeneratedField<?>[] getGeneratedFields(
      final GeneratedRecordImpl generatedRecord, final PluginExecution pluginExecution) {
    return switch (generatedRecord) {
      case RECORD_WITH_INNER_ENUMS ->
          List.of(
                  GeneratedField.of(
                          "exampleInner",
                          GeneratedEnumImpl.EXAMPLE_INNER_ENUM.getClass(pluginExecution))
                      .build(),
                  GeneratedField.of(
                          "exampleInnerTwo",
                          GeneratedEnumImpl.EXAMPLE_INNER_TWO_ENUM.getClass(pluginExecution))
                      .build(),
                  GeneratedField.of(
                          "exampleInnerThree",
                          GeneratedEnumImpl.EXAMPLE_INNER_THREE_ENUM.getClass(pluginExecution))
                      .build())
              .toArray(new GeneratedField[] {});
      case RECORD_WITH_REQUIRED_FIELDS_OF_EACH_TYPE ->
          List.of(
                  GeneratedField.of("field1", Boolean.class)
                      .isRequired(true)
                      .isBeanValidationNullable(false)
                      .build(),
                  GeneratedField.of("field2", String.class)
                      .isRequired(true)
                      .isBeanValidationNullable(false)
                      .build(),
                  GeneratedField.of("field3", Integer.class)
                      .isRequired(true)
                      .isBeanValidationNullable(false)
                      .build(),
                  GeneratedField.of("field4", BigDecimal.class)
                      .isRequired(true)
                      .isBeanValidationNullable(false)
                      .build(),
                  GeneratedField.of("field5", List.class, Boolean.class)
                      .isRequired(true)
                      .isBeanValidationNullable(false)
                      .build(),
                  GeneratedField.of("field6", Set.class, Boolean.class)
                      .isRequired(true)
                      .isBeanValidationNullable(false)
                      .build(),
                  GeneratedField.of(
                          "field7", GeneratedRecordImpl.EXAMPLE_RECORD.getClass(pluginExecution))
                      .isRequired(true)
                      .isBeanValidationNullable(false)
                      .isCustomClass(true)
                      .build(),
                  GeneratedField.of(
                          "field8", GeneratedEnumImpl.EXAMPLE_ENUM.getClass(pluginExecution))
                      .isRequired(true)
                      .isBeanValidationNullable(false)
                      .build())
              .toArray(new GeneratedField[] {});
      case RECORD_WITH_NULLABLE_FIELDS_OF_EACH_TYPE ->
          List.of(
                  GeneratedField.of("field1", Boolean.class)
                      .isNullable(true)
                      .isRequired(true)
                      .build(),
                  GeneratedField.of("field2", String.class)
                      .isNullable(true)
                      .isRequired(true)
                      .build(),
                  GeneratedField.of("field3", Integer.class)
                      .isNullable(true)
                      .isRequired(true)
                      .build(),
                  GeneratedField.of("field4", BigDecimal.class)
                      .isNullable(true)
                      .isRequired(true)
                      .build(),
                  GeneratedField.of("field5", List.class, Boolean.class)
                      .isNullable(true)
                      .isRequired(true)
                      .build(),
                  GeneratedField.of("field6", Set.class, Boolean.class)
                      .isNullable(true)
                      .isRequired(true)
                      .build(),
                  GeneratedField.of(
                          "field7",
                          GeneratedRecordImpl.EXAMPLE_NULLABLE_RECORD.getClass(pluginExecution))
                      .isRequired(false)
                      .isNullable(true)
                      .isCustomClass(true)
                      .build(),
                  GeneratedField.of(
                          "field8",
                          GeneratedEnumImpl.EXAMPLE_NULLABLE_ENUM.getClass(pluginExecution))
                      .isRequired(false)
                      .isNullable(true)
                      .build())
              .toArray(new GeneratedField[] {});
      case RECORD_WITH_COLLECTIONS_OF_RECORDS ->
          List.of(
                  GeneratedField.of(
                          "optionalRecordList",
                          List.class,
                          GeneratedRecordImpl.EXAMPLE_RECORD.getClass(pluginExecution))
                      .build(),
                  GeneratedField.of(
                          "requiredRecordList",
                          List.class,
                          GeneratedRecordImpl.EXAMPLE_RECORD.getClass(pluginExecution))
                      .isBeanValidationNullable(false)
                      .isRequired(true)
                      .build(),
                  GeneratedField.of(
                          "optionalRecordSet",
                          Set.class,
                          GeneratedRecordImpl.EXAMPLE_RECORD.getClass(pluginExecution))
                      .build(),
                  GeneratedField.of(
                          "requiredRecordSet",
                          Set.class,
                          GeneratedRecordImpl.EXAMPLE_RECORD.getClass(pluginExecution))
                      .isBeanValidationNullable(false)
                      .isRequired(true)
                      .build())
              .toArray(new GeneratedField[] {});
      default -> generatedRecord.getGeneratedFields();
    };
  }
}
