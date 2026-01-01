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
package io.github.chrimle.o2jrm.models;

import io.github.chrimle.o2jrm.PluginExecution;
import java.lang.annotation.Annotation;
import java.util.List;

/** Expected class ({@code record} or {@code enum}) to be generated from the OpenAPI spec. */
public interface GeneratedClass {

  /** The default package name of all generated classes. */
  String PACKAGE_NAME = "io.github.chrimle.o2jrm";

  /**
   * Returns the simple name of the class - excluding the package name.
   *
   * @return the class name as a {@link String}.
   */
  String getSimpleClassName();

  /**
   * Whether the class is marked as deprecated, set by the property {@code deprecated}. If {@code
   * true}, the class should be annotated with {@link Deprecated}.
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
   * Whether the class has extra {@link Annotation}s, set by the {@code x-class-extra-annotation}
   * property.
   *
   * <p><b>NOTE:</b> this property does not support {@code enum} classes.
   *
   * @return whether the class has extra annotations.
   */
  boolean hasExtraAnnotations();

  /**
   * Returns the collection of extra {@link Annotation}s, set by the {@code
   * x-class-extra-annotation} property.
   *
   * <p><b>NOTE:</b> this property does not support {@code enum} classes.
   *
   * @return the collection of annotations.
   */
  List<Class<? extends Annotation>> getExtraAnnotations();

  /**
   * Returns the collection of {@link GeneratedField}s which are expected to be generated within the
   * class. Corresponds to each {@code properties}-item.
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
    return GeneratedClass.getCanonicalClassName(pluginExecution.getPackageName(), this);
  }

  /**
   * Returns the {@link Class}, <i>resolved via Java Reflection API</i>, with the package name
   * provided by {@code pluginExecution}.
   *
   * @param pluginExecution containing the package name.
   * @return the loaded {@code Class}.
   */
  default Class<?> getClass(final PluginExecution pluginExecution) {
    return getClass(this, pluginExecution);
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

  /**
   * Returns the {@link Class}, <i>resolved via Java Reflection API</i>, with the class name
   * provided by {@code generatedClass} and the package name provided by {@code pluginExecution}.
   *
   * @param generatedClass containing the class name.
   * @param pluginExecution containing the package name.
   * @return the loaded {@code Class}.
   */
  static Class<?> getClass(
      final GeneratedClass generatedClass, final PluginExecution pluginExecution) {
    try {
      return Class.forName(getCanonicalClassName(pluginExecution.getPackageName(), generatedClass));
    } catch (ClassNotFoundException e) {
      throw new IllegalArgumentException(e);
    }
  }
}
