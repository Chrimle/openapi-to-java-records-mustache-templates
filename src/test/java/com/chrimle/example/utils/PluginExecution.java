package com.chrimle.example.utils;

public enum PluginExecution {
  ADDITIONAL_ENUM_TYPE_ANNOTATIONS("additionalEnumTypeAnnotations"),
  ADDITIONAL_MODEL_TYPE_ANNOTATIONS("additionalModelTypeAnnotations"),
  GENERATE_BUILDERS("generateBuilders"),
  SERIALIZABLE_MODEL("serializableModel"),
  STANDARD("standard"),
  USE_ENUM_CASE_INSENSITIVE("useEnumCaseInsensitive");

  private final String packageName;

  PluginExecution(final String packageName) {
    this.packageName = packageName;
  }

  public String getPackageName() {
    return packageName;
  }
}
