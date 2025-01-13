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

/**
 * Represents a {@code record} class, which is expected to have been generated. This object contains
 * further properties that are expected to hold true for the generated class. These properties
 * originate from the input OpenAPI Specification.
 */
public sealed interface GeneratedRecordClass extends GeneratedClass permits GeneratedRecord {

  /**
   * Whether the class is an {@code enum} class.
   *
   * @return whether the class is an {@code enum} class. Always returns {@code false}.
   */
  @Override
  default boolean isEnum() {
    return false;
  }

  /**
   * {@inheritDoc}
   *
   * @return whether the class is a {@code record} class. Always returns {@code true}.
   */
  @Override
  default boolean isRecord() {
    return true;
  }
}
