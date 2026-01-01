/*
  Copyright 2024-2026 Chrimle

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
public enum PluginExecutionImpl implements PluginExecution {
  OKHTTP_GSON_STANDARD("standard", Library.OKHTTP_GSON),
  WEBCLIENT_STANDARD("webclient.standard", Library.WEBCLIENT),
  OKHTTP_GSON_USE_ENUM_CASE_INSENSITIVE(
      "useEnumCaseInsensitive", Library.OKHTTP_GSON, ConfigOption.USE_ENUM_CASE_INSENSITIVE),
  WEBCLIENT_USE_ENUM_CASE_INSENSITIVE(
      "webclient.useEnumCaseInsensitive",
      Library.WEBCLIENT,
      ConfigOption.USE_ENUM_CASE_INSENSITIVE),
  OKHTTP_GSON_ADDITIONAL_MODEL_TYPE_ANNOTATIONS(
      "additionalModelTypeAnnotations",
      Library.OKHTTP_GSON,
      ConfigOption.ADDITIONAL_MODEL_TYPE_ANNOTATIONS),
  WEBCLIENT_ADDITIONAL_MODEL_TYPE_ANNOTATIONS(
      "webclient.additionalModelTypeAnnotations",
      Library.WEBCLIENT,
      ConfigOption.ADDITIONAL_MODEL_TYPE_ANNOTATIONS),
  OKHTTP_GSON_ADDITIONAL_ENUM_TYPE_ANNOTATIONS(
      "additionalEnumTypeAnnotations",
      Library.OKHTTP_GSON,
      ConfigOption.ADDITIONAL_ENUM_TYPE_ANNOTATIONS),
  WEBCLIENT_ADDITIONAL_ENUM_TYPE_ANNOTATIONS(
      "webclient.additionalEnumTypeAnnotations",
      Library.WEBCLIENT,
      ConfigOption.ADDITIONAL_ENUM_TYPE_ANNOTATIONS),
  OKHTTP_GSON_SERIALIZABLE_MODEL(
      "serializableModel", Library.OKHTTP_GSON, ConfigOption.SERIALIZABLE_MODEL),
  WEBCLIENT_SERIALIZABLE_MODEL(
      "webclient.serializableModel", Library.WEBCLIENT, ConfigOption.SERIALIZABLE_MODEL),
  OKHTTP_GSON_GENERATE_BUILDERS(
      "generateBuilders", Library.OKHTTP_GSON, ConfigOption.GENERATE_BUILDERS),
  WEBCLIENT_GENERATE_BUILDERS(
      "webclient.generateBuilders", Library.WEBCLIENT, ConfigOption.GENERATE_BUILDERS),
  OKHTTP_GSON_USE_BEAN_VALIDATION(
      "useBeanValidation", Library.OKHTTP_GSON, ConfigOption.USE_BEAN_VALIDATION),
  WEBCLIENT_USE_BEAN_VALIDATION(
      "webclient.useBeanValidation", Library.WEBCLIENT, ConfigOption.USE_BEAN_VALIDATION),
  OKHTTP_GSON_ENUM_UNKNOWN_DEFAULT_CASE(
      "enumUnknownDefaultCase", Library.OKHTTP_GSON, ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE),
  WEBCLIENT_ENUM_UNKNOWN_DEFAULT_CASE(
      "webclient.enumUnknownDefaultCase",
      Library.WEBCLIENT,
      ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE),
  /**
   * This PluginExecution tests the compatibility of {@link ConfigOption#ENUM_UNKNOWN_DEFAULT_CASE}
   * and {@link ConfigOption#USE_ENUM_CASE_INSENSITIVE}.
   */
  OKHTTP_GSON_ENUM_DEFAULT_CASE_AND_CASE_INSENSITIVE(
      "enumDefaultCaseAndCaseInsensitive",
      Library.OKHTTP_GSON,
      ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE,
      ConfigOption.USE_ENUM_CASE_INSENSITIVE),
  /**
   * This PluginExecution tests the compatibility of {@link ConfigOption#ENUM_UNKNOWN_DEFAULT_CASE}
   * and {@link ConfigOption#USE_ENUM_CASE_INSENSITIVE}.
   */
  WEBCLIENT_ENUM_DEFAULT_CASE_AND_CASE_INSENSITIVE(
      "webclient.enumDefaultCaseAndCaseInsensitive",
      Library.WEBCLIENT,
      ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE,
      ConfigOption.USE_ENUM_CASE_INSENSITIVE);

  private final String packageName;
  private final Library library;
  private final List<ConfigOption> configOptions;

  PluginExecutionImpl(
      final String packageName, final Library library, final ConfigOption... configOptions) {
    this.packageName = packageName;
    this.library = library;
    this.configOptions = List.of(configOptions);
  }

  @Override
  public String getPackageName() {
    return packageName;
  }

  @Override
  public Library getLibrary() {
    return library;
  }

  @Override
  public List<ConfigOption> getConfigOptions() {
    return configOptions;
  }
}
