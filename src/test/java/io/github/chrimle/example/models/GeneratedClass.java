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
package io.github.chrimle.example.models;

import io.github.chrimle.example.PluginExecution;

/**
 * Enum class listing all expected classes ({@code record}s and {@code enum}s) to be generated from
 * the OpenAPI spec.
 */
public interface GeneratedClass {

  /** The default package name of all generated classes. */
  String PACKAGE_NAME = "io.github.chrimle.example";

  /**
   * Returns the simple name of the class - excluding the package name.
   *
   * @return the class name as a {@link String}.
   */
  String getSimpleClassName();

  /**
   * Whether the class is marked as deprecated. If {@code true}, the class should be annotated with
   * {@link Deprecated}.
   *
   * @return whether the class is deprecated.
   */
  boolean isDeprecated();

  /**
   * Whether the class is an {@code enum} class. If {@code false}, the class is a {@code record}
   * class.
   *
   * @return whether the class is an {@code enum} class.
   */
  boolean isEnum();

  /**
   * Returns the collection of {@link GeneratedField}s which are expected to be generated within the
   * class.
   *
   * @return the collection of generatedFields.
   */
  GeneratedField<?>[] getGeneratedFields();

  /**
   * Returns the canonical class name of this instance - including the package name.
   *
   * @param pluginExecution from which the package name is retrieved.
   * @return the canonical class name.
   */
  default String getCanonicalClassName(final PluginExecution pluginExecution) {
    return GeneratedClass.getCanonicalClassName(pluginExecution.packageName, this);
  }

  /**
   * Returns the canonical class name of the provided {@code generatedClass} - including the package
   * name.
   *
   * @param moduleName to be pre-appended to the class name.
   * @param generatedClass for which the canonical class name is derived.
   * @return the canonical class name.
   */
  static String getCanonicalClassName(
      final String moduleName, final GeneratedClass generatedClass) {
    return String.join(".", PACKAGE_NAME, moduleName, generatedClass.getSimpleClassName());
  }
}
