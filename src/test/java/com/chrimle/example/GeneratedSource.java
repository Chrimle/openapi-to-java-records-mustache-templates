package com.chrimle.example;

import com.chrimle.example.utils.AssertionUtils;

public class GeneratedSource {

  private final Class<?> classUnderTest;
  private final Class<?>[] fieldClasses;
  private final PluginExecution pluginExecution;
  private final GeneratedClass generatedClass;

  public GeneratedSource(
      final PluginExecution pluginExecution,
      final GeneratedClass generatedClass,
      final Class<?>... fieldClasses) {
    this.pluginExecution = pluginExecution;
    this.generatedClass = generatedClass;
    this.fieldClasses = fieldClasses;
    classUnderTest =
        AssertionUtils.assertClassExists(generatedClass.getCanonicalClassName(pluginExecution));
  }

  public boolean generateBuilders() {
    return pluginExecution.generateBuilders;
  }

  public boolean hasAdditionalEnumTypeAnnotations() {
    return pluginExecution.hasAdditionalEnumTypeAnnotations;
  }

  public boolean hasAdditionalModelTypeAnnotations() {
    return pluginExecution.hasAdditionalModelTypeAnnotations;
  }

  public boolean serializableModel() {
    return pluginExecution.serializableModel;
  }

  public boolean useEnumCaseInsensitive() {
    return pluginExecution.useEnumCaseInsensitive;
  }

  public boolean useJakartaEe() {
    return pluginExecution.useJakartaEe;
  }

  public boolean isDeprecated() {
    return generatedClass.isDeprecated;
  }

  public boolean isNullable() {
    return generatedClass.isNullable;
  }

  public Class<?>[] fieldClasses() {
    return fieldClasses;
  }

  public Class<?> getClassUnderTest() {
    return classUnderTest;
  }
}
