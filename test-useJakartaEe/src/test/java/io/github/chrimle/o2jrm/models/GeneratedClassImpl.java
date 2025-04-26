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
package io.github.chrimle.o2jrm.models;

import io.github.chrimle.o2jrm.PluginExecution;

/**
 * Enum class listing all expected classes ({@code record}s and {@code enum}s) to be generated from
 * the OpenAPI spec.
 */
public interface GeneratedClassImpl extends GeneratedClass {

  /**
   * Returns the collection of {@link GeneratedField}s which are expected to be generated within the
   * {@link GeneratedClassImpl}. Corresponds to each {@code properties}-item.
   *
   * @return the collection of generatedFields.
   */
  static GeneratedField<?>[] getGeneratedFields(
      final GeneratedClass generatedClass, final PluginExecution pluginExecution) {
    if (generatedClass instanceof final GeneratedRecordImpl generatedRecord) {
      return GeneratedRecordImpl.getGeneratedFields(generatedRecord, pluginExecution);
    }
    if (generatedClass instanceof final GeneratedEnumImpl generatedEnum) {
      return generatedEnum.getGeneratedFields();
    }
    throw new IllegalArgumentException("Unsupported `GeneratedClass`:" + generatedClass);
  }
}
