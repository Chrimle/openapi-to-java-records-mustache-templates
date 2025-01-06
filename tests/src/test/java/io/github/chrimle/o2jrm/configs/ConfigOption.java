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
package io.github.chrimle.o2jrm.configs;

/** Represents a {@code <configOption>}-property in the Maven {@code <configuration>}. */
public enum ConfigOption {
  /**
   * {@code <additionalEnumTypeAnnotations>}
   *
   * <p>Annotates generated {@code enum} classes with the provided annotations.
   */
  ADDITIONAL_ENUM_TYPE_ANNOTATIONS,
  /**
   * {@code <additionalModelTypeAnnotations>}
   *
   * <p>Annotates generated {@code record} classes with the provided annotations.
   */
  ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
  /**
   * {@code <generateBuilders>}
   *
   * <p>Generates inner <i>Builder</i>-classes to sequentially construct each generated {@code
   * record} class.
   */
  GENERATE_BUILDERS,
  /**
   * {@code <serializableModel>}
   *
   * <p>Generated {@code record} classes {@code implements} {@link java.io.Serializable}, and adds a
   * class field {@code serialVersionUID}.
   */
  SERIALIZABLE_MODEL,
  /**
   * {@code <useBeanValidation>}
   *
   * <p>Annotates the fields of generated {@code record} classes with <a
   * href="https://jakarta.ee/specifications/bean-validation/3.0/jakarta-bean-validation-spec-3.0.html#builtinconstraints">Jakarta
   * Bean Validation annotations</a>.
   */
  USE_BEAN_VALIDATION,
  /**
   * {@code <useEnumCaseInsensitive>}
   *
   * <p>Modifies the {@code fromValue(T value)} method in generated {@code enum} classes, to
   * <i>case-insensitively</i> match against the {@code value} of enum constants, if {@code T} is of
   * type {@link String}.
   */
  USE_ENUM_CASE_INSENSITIVE,
  /**
   * {@code <useJakartaEe>}
   *
   * <p>Replaces all {@link javax.annotation.Nullable} and {@link javax.annotation.Nonnull}
   * annotations with {@link jakarta.annotation.Nullable} and {@link jakarta.annotation.Nonnull},
   * respectively.
   */
  USE_JAKARTA_EE
}
