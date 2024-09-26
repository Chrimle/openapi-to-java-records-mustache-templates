package com.chrimle.example;

public enum GeneratedClass {
  DEPRECATED_EXAMPLE_ENUM("DeprecatedExampleEnum"),
  DEPRECATED_EXAMPLE_RECORD("DeprecatedExampleRecord"),
  EXAMPLE_ENUM("ExampleEnum"),
  EXAMPLE_RECORD("ExampleRecord"),
  EXAMPLE_RECORD_WITH_DEFAULT_FIELDS("ExampleRecordWithDefaultFields"),
  EXAMPLE_RECORD_WITH_REQUIRED_FIELDS_OF_EACH_TYPE("ExampleRecordWithRequiredFieldsOfEachType");

  public static final String PACKAGE_NAME = "io.github.chrimle.example";
  private final String simpleClassName;

  GeneratedClass(final String simpleClassName) {
    this.simpleClassName = simpleClassName;
  }

  public String getCanonicalClassName(final String moduleName) {
    return String.format("%s.%s.%s", PACKAGE_NAME, moduleName, simpleClassName);
  }
}
