/*
  Copyright 2024-2025 Chrimle

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.

*/
package io.github.chrimle.o2jrm;

import io.github.chrimle.o2jrm.models.GeneratedClass;
import io.github.chrimle.o2jrm.models.GeneratedField;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

/**
 * Represents a generated <i>source</i>, which contains:
 *
 * <ul>
 *   <li>{@code Class<?>} <b>classUnderTest</b> which is used to assert properties using Java
 *       Reflection API
 *   <li>{@code GeneratedField<?>[]} <b>generatedFields</b> which is the complete set of fields
 *       expected to have been generated for the <i>source</i>
 *   <li>{@code PluginExecution} <b>pluginExecution</b> which represent configuration options set
 *       for this {@code <pluginExecution>}
 *   <li>{@code GeneratedClass} <b>generatedClass</b> which represents the <i>class/source</i> with
 *       additional properties
 * </ul>
 *
 * <p>Essentially, this class contains all details in order to be able to assert generated classes,
 * with consideration for {@code <configuration>} properties
 */
public class GeneratedSource {

  private final Class<?> classUnderTest;
  private final GeneratedField<?>[] generatedFields;
  private final PluginExecution pluginExecution;
  private final GeneratedClass generatedClass;
  private final Class<? extends Annotation> nullableAnnotation;
  private final Class<? extends Annotation> nonnullAnnotation;
  private final List<Class<? extends Annotation>> beanValidationAnnotations;

  public Class<? extends Annotation> getNonnullAnnotation() {
    return nonnullAnnotation;
  }

  public GeneratedSource(
      final PluginExecution pluginExecution,
      final GeneratedClass generatedClass,
      final GeneratedField<?>[] generatedFields,
      final Class<?> classUnderTest,
      final Class<? extends Annotation> nullableAnnotation,
      final Class<? extends Annotation> nonnullAnnotation,
      final Class<? extends Annotation>... beanValidationAnnotations) {
    this.pluginExecution = pluginExecution;
    this.generatedClass = generatedClass;
    this.generatedFields = generatedFields;
    this.classUnderTest = classUnderTest;
    this.nullableAnnotation = nullableAnnotation;
    this.nonnullAnnotation = nonnullAnnotation;
    this.beanValidationAnnotations = Arrays.asList(beanValidationAnnotations);
  }

  public boolean generateBuilders() {
    return pluginExecution.generateBuilders();
  }

  public boolean hasAdditionalEnumTypeAnnotations() {
    return pluginExecution.hasAdditionalEnumTypeAnnotations();
  }

  public boolean hasAdditionalModelTypeAnnotations() {
    return pluginExecution.hasAdditionalModelTypeAnnotations();
  }

  public boolean serializableModel() {
    return pluginExecution.serializableModel();
  }

  public boolean useBeanValidation() {
    return pluginExecution.useBeanValidation();
  }

  public boolean useEnumCaseInsensitive() {
    return pluginExecution.useEnumCaseInsensitive();
  }

  public boolean enumUnknownDefaultCase() {
    return pluginExecution.enumUnknownDefaultCase();
  }

  public boolean useJakartaEe() {
    return pluginExecution.useJakartaEe();
  }

  public boolean isDeprecated() {
    return generatedClass.isDeprecated();
  }

  public boolean hasExtraAnnotations() {
    return generatedClass.hasExtraAnnotations();
  }

  public List<Class<? extends Annotation>> getExtraAnnotations() {
    return generatedClass.getExtraAnnotations();
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

  public boolean isLibraryOkHttpGson() {
    return pluginExecution.isLibraryOkHttpGson();
  }

  public boolean isLibraryWebClient() {
    return pluginExecution.isLibraryWebClient();
  }

  public boolean isSerializationLibraryJackson() {
    return pluginExecution.isSerializationLibraryJackson();
  }

  public String getClassAsJsonString() {
    StringBuilder jsonString = new StringBuilder("{");
    for (int i = 0; i < generatedFields.length; i++) {
      final GeneratedField<?> generatedField = generatedFields[i];
      jsonString.append("\n\t");
      jsonString.append(generatedField.getKeyAndValueAsJson());
      if (i + 1 < generatedFields.length) {
        jsonString.append(",");
      }
    }
    jsonString.append("\n}");
    return jsonString.toString();
  }

  @Override
  public String toString() {
    return "GeneratedSource{"
        + "pluginExecution="
        + pluginExecution
        + ", generatedClass="
        + generatedClass
        + ", classUnderTest="
        + classUnderTest.getName()
        + ", generatedFields="
        + Arrays.toString(generatedFields)
        + '}';
  }

  public Class<? extends Annotation> getNullableAnnotation() {
    return nullableAnnotation;
  }

  public List<Class<? extends Annotation>> getBeanValidationAnnotations() {
    return beanValidationAnnotations;
  }
}
