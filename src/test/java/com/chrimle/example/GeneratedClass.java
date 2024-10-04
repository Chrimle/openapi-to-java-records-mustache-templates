package com.chrimle.example;

public enum GeneratedClass {
  DEPRECATED_EXAMPLE_ENUM("DeprecatedExampleEnum", true),
  DEPRECATED_EXAMPLE_RECORD("DeprecatedExampleRecord", true),
  EXAMPLE_ENUM("ExampleEnum", false),
  EXAMPLE_RECORD("ExampleRecord", false),
  EXAMPLE_RECORD_WITH_DEFAULT_FIELDS("ExampleRecordWithDefaultFields", false),
  EXAMPLE_RECORD_WITH_REQUIRED_FIELDS_OF_EACH_TYPE(
      "ExampleRecordWithRequiredFieldsOfEachType", false),
  EXAMPLE_RECORD_WITH_NULLABLE_FIELDS_OF_EACH_TYPE(
      "ExampleRecordWithNullableFieldsOfEachType", false);

  public static final String PACKAGE_NAME = "io.github.chrimle.example";
  public final String simpleClassName;
  public final boolean isDeprecated;

  GeneratedClass(final String simpleClassName, final boolean isDeprecated) {
    this.simpleClassName = simpleClassName;
    this.isDeprecated = isDeprecated;
  }

  public String getCanonicalClassName(final String moduleName) {
    return String.format("%s.%s.%s", PACKAGE_NAME, moduleName, simpleClassName);
  }
}
