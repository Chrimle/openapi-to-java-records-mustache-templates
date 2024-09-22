package com.chrimle.example;

public enum PluginExecution {
  ADDITIONAL_ENUM_TYPE_ANNOTATIONS(
      "additionalEnumTypeAnnotations",
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
      true,
      false,
      false,
      false,
      false
  ),
  GENERATE_BUILDERS(
      "generateBuilders",
      false,
      false,
      true,
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
      false
  ),
  STANDARD(
      "standard",
      false,
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
      true
  );

  public final String packageName;
  public final boolean additionalEnumTypeAnnotations;
  public final boolean additionalModelTypeAnnotations;
  public final boolean generateBuilders;
  public final boolean serializableModel;
  public final boolean useEnumCaseInsensitive;
  public final boolean useJakartaEe;

  PluginExecution(
      final String packageName,
      final boolean additionalEnumTypeAnnotations,
      final boolean additionalModelTypeAnnotations,
      final boolean generateBuilders,
      final boolean serializableModel,
      final boolean useEnumCaseInsensitive,
      final boolean useJakartaEe
  ) {
    this.packageName = packageName;
    this.additionalEnumTypeAnnotations = additionalEnumTypeAnnotations;
    this.additionalModelTypeAnnotations = additionalModelTypeAnnotations;
    this.generateBuilders = generateBuilders;
    this.serializableModel = serializableModel;
    this.useEnumCaseInsensitive = useEnumCaseInsensitive;
    this.useJakartaEe = useJakartaEe;
  }
}
