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

import java.lang.annotation.Annotation;
import java.util.List;

/** Expected {@code enum} class to be generated from the OpenAPI spec. */
public interface GeneratedEnum extends GeneratedClass {

  /**
   * {@inheritDoc}
   *
   * @return whether the class is an {@code enum} class.
   */
  @Override
  default boolean isEnum() {
    return true;
  }

  /**
   * {@inheritDoc}
   *
   * @return whether the class has extra annotations.
   */
  @Override
  default boolean hasExtraAnnotations() {
    return false;
  }

  /**
   * {@inheritDoc}
   *
   * @return the collection of annotations.
   */
  @Override
  default List<Class<? extends Annotation>> getExtraAnnotations() {
    return List.of();
  }
}
