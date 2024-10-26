/*
  Copyright 2024 Chrimle

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
package com.chrimle.example;

public enum PluginExecution {
  GENERATE_BUILDERS("generateBuilders", true, false, false, false, false, false, false),
  ADDITIONAL_ENUM_TYPE_ANNOTATIONS(
      "additionalEnumTypeAnnotations", false, true, false, false, false, false, false),
  ADDITIONAL_MODEL_TYPE_ANNOTATIONS(
      "additionalModelTypeAnnotations", false, false, true, false, false, false, false),
  SERIALIZABLE_MODEL("serializableModel", false, false, false, true, false, false, false),
  STANDARD("standard", false, false, false, false, false, false, false),
  USE_BEAN_VALIDATION("useBeanValidation", false, false, false, false, true, false, false),
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
