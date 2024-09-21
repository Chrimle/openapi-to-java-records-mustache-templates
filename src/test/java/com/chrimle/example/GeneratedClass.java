package com.chrimle.example;

public enum GeneratedClass {
  DEPRECATED_EXAMPLE_ENUM("DeprecatedExampleEnum"),
  DEPRECATED_EXAMPLE_RECORD("DeprecatedExampleRecord"),
  EXAMPLE_ENUM("ExampleEnum"),
  EXAMPLE_RECORD("ExampleRecord"),
  EXAMPLE_RECORD_WITH_ARRAY_FIELDS("ExampleRecordWithArrayFields"),
  EXAMPLE_RECORD_WITH_BOOLEAN_FIELDS("ExampleRecordWithBooleanFields"),
  EXAMPLE_RECORD_WITH_DEFAULT_FIELDS("ExampleRecordWithDefaultFields"),
  EXAMPLE_RECORD_WITH_EXAMPLE_ENUM_FIELDS("ExampleRecordWithExampleEnumFields"),
  EXAMPLE_RECORD_WITH_EXAMPLE_RECORD_FIELDS(
      "ExampleRecordWithExampleRecordFields"),
  EXAMPLE_RECORD_WITH_INTEGER_FIELDS("ExampleRecordWithIntegerFields"),
  EXAMPLE_RECORD_WITH_NUMBER_FIELDS("ExampleRecordWithNumberFields"),
  EXAMPLE_RECORD_WITH_SET_FIELDS("ExampleRecordWithSetFields"),
  EXAMPLE_RECORD_WITH_STRING_FIELDS("ExampleRecordWithStringFields");


  private final String simpleClassName;

  private GeneratedClass(final String simpleClassName) {
    this.simpleClassName = simpleClassName;
  }

  public String getSimpleClassName() {
    return simpleClassName;
  }

  public String getCanonicalClassName(final String moduleName) {
    return "com.chrimle.example." + moduleName + "." + simpleClassName;
  }
}
