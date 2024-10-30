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
package com.chrimle.example;

public enum GeneratedClass {
  DEPRECATED_EXAMPLE_ENUM("DeprecatedExampleEnum", true, true),
  TEMP_ENUM("TempEnum", false, true),
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
  EXAMPLE_INNER_TWO_ENUM("RecordWithInnerEnums$ExampleInnerTwoEnum", false, true);

  public static final String PACKAGE_NAME = "io.github.chrimle.example";
  public final String simpleClassName;
  public final boolean isDeprecated;
  public final boolean isEnum;

  GeneratedClass(final String simpleClassName, final boolean isDeprecated, final boolean isEnum) {
    this.simpleClassName = simpleClassName;
    this.isDeprecated = isDeprecated;
    this.isEnum = isEnum;
  }

  public String getCanonicalClassName(final PluginExecution pluginExecution) {
    return getCanonicalClassName(pluginExecution.packageName, this);
  }

  public static String getCanonicalClassName(
      final String moduleName, final GeneratedClass generatedClass) {
    return String.join(".", PACKAGE_NAME, moduleName, generatedClass.simpleClassName);
  }
}
