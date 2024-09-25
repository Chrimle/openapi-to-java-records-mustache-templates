package com.chrimle.example;

public enum PluginExecution {
  GENERATE_BUILDERS(
      "generateBuilders",
      true,
      false,
      false,
      false,
      false
  ),
  ADDITIONAL_ENUM_TYPE_ANNOTATIONS(
      "additionalEnumTypeAnnotations",
      false,
      true,
      false,
      false,
      false
  ),
  ADDITIONAL_MODEL_TYPE_ANNOTATIONS(
      "additionalModelTypeAnnotations",
      false,
      false,
      true,
      false,
      false
  ),
  SERIALIZABLE_MODEL(
      "serializableModel",
      false,
      false,
      false,
      true,
      false
  ),
  STANDARD(
      "standard",
      false,
      false,
      false,
      false,
      false
  ),
  USE_ENUM_CASE_INSENSITIVE(
      "useEnumCaseInsensitive",
      false,
      false,
      false,
      false,
      true
  );

  private final String packageName;
  private final boolean generateBuilders;
  private final boolean hasAdditionalEnumTypeAnnotations;
  private final boolean hasAdditionalModelTypeAnnotations;
  private final boolean serializableModel;
  private final boolean useEnumCaseInsensitive;

  PluginExecution(
      final String packageName,
      final boolean generateBuilders,
      final boolean hasAdditionalEnumTypeAnnotations,
      final boolean hasAdditionalModelTypeAnnotations,
      final boolean serializableModel,
      final boolean useEnumCaseInsensitive) {
    this.packageName = packageName;
    this.hasAdditionalEnumTypeAnnotations = hasAdditionalEnumTypeAnnotations;
    this.hasAdditionalModelTypeAnnotations = hasAdditionalModelTypeAnnotations;
    this.generateBuilders = generateBuilders;
    this.serializableModel = serializableModel;
    this.useEnumCaseInsensitive = useEnumCaseInsensitive;
  }

  public String getPackageName() {
    return packageName;
  }

  public boolean generateBuilders() {
    return generateBuilders;
  }

  public boolean hasAdditionalEnumTypeAnnotations() {
    return hasAdditionalEnumTypeAnnotations;
  }

  public boolean hasAdditionalModelTypeAnnotations() {
    return hasAdditionalModelTypeAnnotations;
  }

  public boolean serializableModel() {
    return serializableModel;
  }

  public boolean useEnumCaseInsensitive() {
    return useEnumCaseInsensitive;
  }
}
