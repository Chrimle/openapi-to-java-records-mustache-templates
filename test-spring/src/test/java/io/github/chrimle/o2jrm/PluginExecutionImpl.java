/*
 *   Copyright 2024-2026 Chrimle
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
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
@SuppressWarnings("ImmutableEnumChecker")
public enum PluginExecutionImpl implements PluginExecution {
  STANDARD("standard", Library.SPRING_BOOT),
  ADDITIONAL_ENUM_TYPE_ANNOTATIONS(
      "additionalEnumTypeAnnotations",
      Library.SPRING_BOOT,
      ConfigOption.ADDITIONAL_ENUM_TYPE_ANNOTATIONS),
  ADDITIONAL_MODEL_TYPE_ANNOTATIONS(
      "additionalModelTypeAnnotations",
      Library.SPRING_BOOT,
      ConfigOption.ADDITIONAL_MODEL_TYPE_ANNOTATIONS),
  ENUM_UNKNOWN_DEFAULT_CASE(
      "enumUnknownDefaultCase", Library.SPRING_BOOT, ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE),
  /**
   * This PluginExecution tests the compatibility of {@link ConfigOption#ENUM_UNKNOWN_DEFAULT_CASE}
   * and {@link ConfigOption#USE_ENUM_CASE_INSENSITIVE}.
   */
  ENUM_DEFAULT_CASE_AND_CASE_INSENSITIVE(
      "enumDefaultCaseAndCaseInsensitive",
      Library.SPRING_BOOT,
      ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE,
      ConfigOption.USE_ENUM_CASE_INSENSITIVE),
  GENERATE_BUILDERS("generateBuilders", Library.SPRING_BOOT, ConfigOption.GENERATE_BUILDERS),
  SERIALIZABLE_MODEL("serializableModel", Library.SPRING_BOOT, ConfigOption.SERIALIZABLE_MODEL),
  USE_BEAN_VALIDATION("useBeanValidation", Library.SPRING_BOOT, ConfigOption.USE_BEAN_VALIDATION),
  USE_ENUM_CASE_INSENSITIVE(
      "useEnumCaseInsensitive", Library.SPRING_BOOT, ConfigOption.USE_ENUM_CASE_INSENSITIVE);

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
