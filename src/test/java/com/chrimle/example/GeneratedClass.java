package com.chrimle.example;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

public enum GeneratedClass {
  DEPRECATED_EXAMPLE_ENUM("DeprecatedExampleEnum", true, false),
  DEPRECATED_EXAMPLE_RECORD("DeprecatedExampleRecord", true, false, Boolean.class),
  EXAMPLE_ENUM("ExampleEnum", false, false),
  EXAMPLE_RECORD("ExampleRecord", false, false, Boolean.class),
  EXAMPLE_RECORD_WITH_DEFAULT_FIELDS("ExampleRecordWithDefaultFields", false, false, String.class),
  EXAMPLE_RECORD_WITH_REQUIRED_FIELDS_OF_EACH_TYPE(
      "ExampleRecordWithRequiredFieldsOfEachType", false, false),
  EXAMPLE_RECORD_WITH_NULLABLE_FIELDS_OF_EACH_TYPE(
      "ExampleRecordWithNullableFieldsOfEachType",
      false,
      true,
      Boolean.class,
      String.class,
      Integer.class,
      BigDecimal.class,
      List.class,
      Set.class);

  public static final String PACKAGE_NAME = "io.github.chrimle.example";
  public final String simpleClassName;
  public final boolean isDeprecated;
  public final boolean isNullable;
  public final Class<?>[] fieldClasses;

  GeneratedClass(
      final String simpleClassName,
      final boolean isDeprecated,
      final boolean isNullable,
      final Class<?>... fieldClasses) {
    this.simpleClassName = simpleClassName;
    this.isDeprecated = isDeprecated;
    this.isNullable = isNullable;
    this.fieldClasses = fieldClasses;
  }

  public String getCanonicalClassName(final PluginExecution pluginExecution) {
    return getCanonicalClassName(pluginExecution.packageName, this);
  }

  public static String getCanonicalClassName(
      final String moduleName, final GeneratedClass generatedClass) {
    return String.format("%s.%s.%s", PACKAGE_NAME, moduleName, generatedClass.simpleClassName);
  }
}
