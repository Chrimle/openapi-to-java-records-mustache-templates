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

import io.github.chrimle.o2jrm.configs.ConfigOption;
import java.util.List;

/**
 * Represents each {@code <pluginExecution>} present in the Maven {@code <build>} step. This is used
 * to assert {@code <configuration>} or {@code <configOption>}-specific properties or behaviours of
 * generated classes.
 */
public enum PluginExecution {
  GENERATE_BUILDERS("generateBuilders", ConfigOption.GENERATE_BUILDERS),
  ADDITIONAL_ENUM_TYPE_ANNOTATIONS(
      "additionalEnumTypeAnnotations", ConfigOption.ADDITIONAL_ENUM_TYPE_ANNOTATIONS),
  ADDITIONAL_MODEL_TYPE_ANNOTATIONS(
      "additionalModelTypeAnnotations", ConfigOption.ADDITIONAL_MODEL_TYPE_ANNOTATIONS),
  SERIALIZABLE_MODEL("serializableModel", ConfigOption.SERIALIZABLE_MODEL),
  STANDARD("standard"),
  USE_BEAN_VALIDATION("useBeanValidation", ConfigOption.USE_BEAN_VALIDATION),
  USE_ENUM_CASE_INSENSITIVE("useEnumCaseInsensitive", ConfigOption.USE_ENUM_CASE_INSENSITIVE),
  USE_JAKARTA_EE("useJakartaEe", ConfigOption.USE_JAKARTA_EE);

  private final String packageName;
  private final List<ConfigOption> configOptions;

  PluginExecution(final String packageName, final ConfigOption... configOptions) {
    this.packageName = packageName;
    this.configOptions = List.of(configOptions);
  }

  public boolean hasConfigOption(final ConfigOption configOption) {
    return configOptions.contains(configOption);
  }

  public boolean useJakartaEe() {
    return hasConfigOption(ConfigOption.USE_JAKARTA_EE);
  }

  public boolean useEnumCaseInsensitive() {
    return hasConfigOption(ConfigOption.USE_ENUM_CASE_INSENSITIVE);
  }

  public boolean useBeanValidation() {
    return hasConfigOption(ConfigOption.USE_BEAN_VALIDATION);
  }

  public boolean serializableModel() {
    return hasConfigOption(ConfigOption.SERIALIZABLE_MODEL);
  }

  public boolean hasAdditionalModelTypeAnnotations() {
    return hasConfigOption(ConfigOption.ADDITIONAL_MODEL_TYPE_ANNOTATIONS);
  }

  public boolean hasAdditionalEnumTypeAnnotations() {
    return hasConfigOption(ConfigOption.ADDITIONAL_ENUM_TYPE_ANNOTATIONS);
  }

  public boolean generateBuilders() {
    return hasConfigOption(ConfigOption.GENERATE_BUILDERS);
  }

  public String getPackageName() {
    return packageName;
  }
}
