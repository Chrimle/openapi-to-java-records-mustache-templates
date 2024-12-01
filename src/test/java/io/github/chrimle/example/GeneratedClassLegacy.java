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

/**
 * Enum class listing all expected classes ({@code record}s and {@code enum}s) to be generated from
 * the OpenAPI spec.
 */
public enum GeneratedClassLegacy implements GeneratedClass {
  DEPRECATED_EXAMPLE_ENUM("DeprecatedExampleEnum", true, true),
  DEPRECATED_EXAMPLE_RECORD("DeprecatedExampleRecord", true, false),
  EXAMPLE_ENUM("ExampleEnum", false, true),
  EXAMPLE_RECORD("ExampleRecord", false, false),
  EXAMPLE_RECORD_WITH_DEFAULT_FIELDS("ExampleRecordWithDefaultFields", false, false),
  EXAMPLE_RECORD_WITH_REQUIRED_FIELDS_OF_EACH_TYPE(
      "ExampleRecordWithRequiredFieldsOfEachType", false, false),
  EXAMPLE_RECORD_WITH_NULLABLE_FIELDS_OF_EACH_TYPE(
      "ExampleRecordWithNullableFieldsOfEachType", false, false),
  RECORD_WITH_ALL_CONSTRAINTS("RecordWithAllConstraints", false, false),
  RECORD_WITH_INNER_ENUMS("RecordWithInnerEnums", false, false),
  EXAMPLE_INNER_ENUM("RecordWithInnerEnums$ExampleInnerEnum", false, true),
  EXAMPLE_INNER_TWO_ENUM("RecordWithInnerEnums$ExampleInnerTwoEnum", false, true),
  EXAMPLE_ENUM_WITH_INTEGER_VALUES("ExampleEnumWithIntegerValues", false, true);

  private final String simpleClassName;
  private final boolean isDeprecated;
  private final boolean isEnum;

  GeneratedClassLegacy(
      final String simpleClassName, final boolean isDeprecated, final boolean isEnum) {
    this.simpleClassName = simpleClassName;
    this.isDeprecated = isDeprecated;
    this.isEnum = isEnum;
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
    return isEnum;
  }
}
