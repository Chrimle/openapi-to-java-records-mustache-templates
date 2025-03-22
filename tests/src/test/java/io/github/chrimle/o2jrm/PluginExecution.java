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
import io.github.chrimle.o2jrm.configs.Library;
import java.util.List;

/**
 * Represents each {@code <pluginExecution>} present in the Maven {@code <build>} step. This is used
 * to assert {@code <configuration>} or {@code <configOption>}-specific properties or behaviours of
 * generated classes.
 */
public enum PluginExecution {
  GENERATE_BUILDERS("generateBuilders", Library.OKHTTP_GSON, ConfigOption.GENERATE_BUILDERS),
  ADDITIONAL_ENUM_TYPE_ANNOTATIONS(
      "additionalEnumTypeAnnotations",
      Library.OKHTTP_GSON,
      ConfigOption.ADDITIONAL_ENUM_TYPE_ANNOTATIONS),
  ADDITIONAL_MODEL_TYPE_ANNOTATIONS(
      "additionalModelTypeAnnotations",
      Library.OKHTTP_GSON,
      ConfigOption.ADDITIONAL_MODEL_TYPE_ANNOTATIONS),
  SERIALIZABLE_MODEL("serializableModel", Library.OKHTTP_GSON, ConfigOption.SERIALIZABLE_MODEL),
  STANDARD("standard", Library.OKHTTP_GSON),
  USE_BEAN_VALIDATION("useBeanValidation", Library.OKHTTP_GSON, ConfigOption.USE_BEAN_VALIDATION),
  USE_ENUM_CASE_INSENSITIVE(
      "useEnumCaseInsensitive", Library.OKHTTP_GSON, ConfigOption.USE_ENUM_CASE_INSENSITIVE),
  ENUM_UNKNOWN_DEFAULT_CASE(
      "enumUnknownDefaultCase", Library.OKHTTP_GSON, ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE),
  /**
   * This PluginExecution tests the compatibility of {@link ConfigOption#ENUM_UNKNOWN_DEFAULT_CASE}
   * and {@link ConfigOption#USE_ENUM_CASE_INSENSITIVE}.
   */
  ENUM_DEFAULT_CASE_AND_CASE_INSENSITIVE(
      "enumDefaultCaseAndCaseInsensitive",
      Library.OKHTTP_GSON,
      ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE,
      ConfigOption.USE_ENUM_CASE_INSENSITIVE),
  USE_JAKARTA_EE("useJakartaEe", Library.OKHTTP_GSON, ConfigOption.USE_JAKARTA_EE);

  private final String packageName;
  private final Library library;
  private final List<ConfigOption> configOptions;

  PluginExecution(final String packageName, Library library, final ConfigOption... configOptions) {
    this.packageName = packageName;
    this.library = library;
    this.configOptions = List.of(configOptions);
  }

  public boolean isLibraryOkHttpGson() {
    return Library.isLibraryOkHttpGson(library);
  }

  public boolean isLibraryWebClient() {
    return Library.isLibraryWebClient(library);
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

  public boolean enumUnknownDefaultCase() {
    return hasConfigOption(ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE);
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
