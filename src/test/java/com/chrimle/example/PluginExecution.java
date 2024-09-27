package com.chrimle.example;

public enum PluginExecution {
  GENERATE_BUILDERS(
      "generateBuilders",
      true,
      false,
      false,
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
      false,
      false,
      false
  ),
  SERIALIZABLE_MODEL(
      "serializableModel",
      false,
      false,
      false,
      true,
      false,
      false,
      false
  ),
  STANDARD(
      "standard",
      false,
      false,
      false,
      false,
      false,
      false,
      false
  ),
  USE_BEAN_VALIDATION(
      "useBeanValidation",
      false,
      false,
      false,
      false,
      true,
      false,
      false
  ),
  USE_ENUM_CASE_INSENSITIVE(
      "useEnumCaseInsensitive",
      false,
      false,
      false,
      false,
      false,
      true,
      false
  ),
  USE_JAKARTA_EE(
      "useJakartaEe",
      false,
      false,
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
  private final boolean useBeanValidation;
  private final boolean useEnumCaseInsensitive;
  private final boolean useJakartaEe;

  PluginExecution(
      final String packageName,
      final boolean generateBuilders,
      final boolean hasAdditionalEnumTypeAnnotations,
      final boolean hasAdditionalModelTypeAnnotations,
      final boolean serializableModel,
      final boolean useBeanValidation,
      final boolean useEnumCaseInsensitive,
      final boolean useJakartaEe) {
    this.packageName = packageName;
    this.hasAdditionalEnumTypeAnnotations = hasAdditionalEnumTypeAnnotations;
    this.hasAdditionalModelTypeAnnotations = hasAdditionalModelTypeAnnotations;
    this.generateBuilders = generateBuilders;
    this.serializableModel = serializableModel;
    this.useBeanValidation = useBeanValidation;
    this.useEnumCaseInsensitive = useEnumCaseInsensitive;
    this.useJakartaEe = useJakartaEe;
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

  public boolean useJakartaEe() {
    return useJakartaEe;
  }

  public boolean useBeanValidation() {
    return useBeanValidation;
  }
}
