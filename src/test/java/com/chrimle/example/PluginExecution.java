package com.chrimle.example;

public enum PluginExecution {
  GENERATE_BUILDERS("generateBuilders", true, false, false, false, false, false, false),
  ADDITIONAL_ENUM_TYPE_ANNOTATIONS(
      "additionalEnumTypeAnnotations", false, true, false, false, false, false, false),
  ADDITIONAL_MODEL_TYPE_ANNOTATIONS(
      "additionalModelTypeAnnotations", false, false, true, false, false, false, false),
  SERIALIZABLE_MODEL("serializableModel", false, false, false, true, false, false, false),
  STANDARD("standard", false, false, false, false, false, false, false),
  USE_BEAN_VALIDATION("useBeanValidation", false, false, false, false, false, false, false),
  USE_ENUM_CASE_INSENSITIVE(
      "useEnumCaseInsensitive", false, false, false, false, false, true, false),
  USE_JAKARTA_EE("useJakartaEe", false, false, false, false, false, false, true);

  public final String packageName;
  public final boolean generateBuilders;
  public final boolean hasAdditionalEnumTypeAnnotations;
  public final boolean hasAdditionalModelTypeAnnotations;
  public final boolean serializableModel;
  public final boolean useBeanValidation;
  public final boolean useEnumCaseInsensitive;
  public final boolean useJakartaEe;

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
}
