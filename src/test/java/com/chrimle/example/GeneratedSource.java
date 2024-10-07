package com.chrimle.example;

import com.chrimle.example.utils.AssertionUtils;
import java.util.Arrays;

public class GeneratedSource {

  private final Class<?> classUnderTest;
  private final GeneratedField<?>[] generatedFields;
  private final PluginExecution pluginExecution;
  private final GeneratedClass generatedClass;

  public GeneratedSource(
      final PluginExecution pluginExecution,
      final GeneratedClass generatedClass,
      final GeneratedField<?>... generatedFields) {
    this.pluginExecution = pluginExecution;
    this.generatedClass = generatedClass;
    this.generatedFields = generatedFields;
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

  public boolean isEnum() {
    return generatedClass.isEnum;
  }

  public Class<?>[] fieldClasses() {
    return Arrays.stream(generatedFields).map(GeneratedField::type).toArray(Class<?>[]::new);
  }

  public GeneratedField<?>[] generatedFields() {
    return generatedFields;
  }

  public Class<?> getClassUnderTest() {
    return classUnderTest;
  }
}
