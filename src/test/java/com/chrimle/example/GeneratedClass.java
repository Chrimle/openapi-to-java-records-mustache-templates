package com.chrimle.example;

public enum GeneratedClass {
  DEPRECATED_EXAMPLE_ENUM("DeprecatedExampleEnum", true, false, true),
  DEPRECATED_EXAMPLE_RECORD("DeprecatedExampleRecord", true, false, false),
  EXAMPLE_ENUM("ExampleEnum", false, false, true),
  EXAMPLE_RECORD("ExampleRecord", false, false, false),
  EXAMPLE_RECORD_WITH_DEFAULT_FIELDS("ExampleRecordWithDefaultFields", false, false, false),
  EXAMPLE_RECORD_WITH_REQUIRED_FIELDS_OF_EACH_TYPE(
      "ExampleRecordWithRequiredFieldsOfEachType", false, false, false),
  EXAMPLE_RECORD_WITH_NULLABLE_FIELDS_OF_EACH_TYPE(
      "ExampleRecordWithNullableFieldsOfEachType", false, true, false);

  public static final String PACKAGE_NAME = "io.github.chrimle.example";
  public final String simpleClassName;
  public final boolean isDeprecated;
  public final boolean isNullable;
  public final boolean isEnum;

  GeneratedClass(
      final String simpleClassName,
      final boolean isDeprecated,
      final boolean isNullable,
      final boolean isEnum) {
    this.simpleClassName = simpleClassName;
    this.isDeprecated = isDeprecated;
    this.isNullable = isNullable;
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
