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
 * Represents a {@code <pluginExecution>} present in the Maven {@code <build>} step. This is used to
 * assert {@code <configuration>} or {@code <configOption>}-specific properties or behaviours of
 * generated classes.
 */
public interface PluginExecution {

  String getPackageName();

  Library getLibrary();

  List<ConfigOption> getConfigOptions();

  default boolean isLibraryOkHttpGson() {
    return Library.isLibraryOkHttpGson(getLibrary());
  }

  default boolean isLibraryWebClient() {
    return Library.isLibraryWebClient(getLibrary());
  }

  default boolean isSerializationLibraryJackson() {
    return switch (getLibrary()) {
      case OKHTTP_GSON -> false;
      case WEBCLIENT -> true;
    };
  }

  default boolean hasConfigOption(final ConfigOption configOption) {
    return getConfigOptions().contains(configOption);
  }

  default boolean useJakartaEe() {
    return hasConfigOption(ConfigOption.USE_JAKARTA_EE);
  }

  default boolean useEnumCaseInsensitive() {
    return hasConfigOption(ConfigOption.USE_ENUM_CASE_INSENSITIVE);
  }

  default boolean enumUnknownDefaultCase() {
    return hasConfigOption(ConfigOption.ENUM_UNKNOWN_DEFAULT_CASE);
  }

  default boolean useBeanValidation() {
    return hasConfigOption(ConfigOption.USE_BEAN_VALIDATION);
  }

  default boolean serializableModel() {
    return hasConfigOption(ConfigOption.SERIALIZABLE_MODEL);
  }

  default boolean hasAdditionalModelTypeAnnotations() {
    return hasConfigOption(ConfigOption.ADDITIONAL_MODEL_TYPE_ANNOTATIONS);
  }

  default boolean hasAdditionalEnumTypeAnnotations() {
    return hasConfigOption(ConfigOption.ADDITIONAL_ENUM_TYPE_ANNOTATIONS);
  }

  default boolean generateBuilders() {
    return hasConfigOption(ConfigOption.GENERATE_BUILDERS);
  }
}
