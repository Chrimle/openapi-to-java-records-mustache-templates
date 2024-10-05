package com.chrimle.example;

public enum GeneratedClass {
  DEPRECATED_EXAMPLE_ENUM("DeprecatedExampleEnum", true, false),
  DEPRECATED_EXAMPLE_RECORD("DeprecatedExampleRecord", true, false),
  EXAMPLE_ENUM("ExampleEnum", false, false),
  EXAMPLE_RECORD("ExampleRecord", false, false),
  EXAMPLE_RECORD_WITH_DEFAULT_FIELDS("ExampleRecordWithDefaultFields", false, false),
  EXAMPLE_RECORD_WITH_REQUIRED_FIELDS_OF_EACH_TYPE(
      "ExampleRecordWithRequiredFieldsOfEachType", false, false),
  EXAMPLE_RECORD_WITH_NULLABLE_FIELDS_OF_EACH_TYPE(
      "ExampleRecordWithNullableFieldsOfEachType", false, true);

  public static final String PACKAGE_NAME = "io.github.chrimle.example";
  public final String simpleClassName;
  public final boolean isDeprecated;
  public final boolean isNullable;

  GeneratedClass(
      final String simpleClassName, final boolean isDeprecated, final boolean isNullable) {
    this.simpleClassName = simpleClassName;
    this.isDeprecated = isDeprecated;
    this.isNullable = isNullable;
  }

  public String getCanonicalClassName(final PluginExecution pluginExecution) {
    return getCanonicalClassName(pluginExecution.packageName, this);
  }

  public static String getCanonicalClassName(
      final String moduleName, final GeneratedClass generatedClass) {
    return String.join(".", PACKAGE_NAME, moduleName, generatedClass.simpleClassName);
  }
}
