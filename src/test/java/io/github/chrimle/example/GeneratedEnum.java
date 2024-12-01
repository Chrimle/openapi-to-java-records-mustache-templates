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
package io.github.chrimle.example;

/** Enum class listing all expected {@code enum} classes to be generated from the OpenAPI spec. */
public enum GeneratedEnum implements GeneratedClass {
  DEPRECATED_EXAMPLE_ENUM("DeprecatedExampleEnum", true),
  EXAMPLE_ENUM("ExampleEnum", false),
  EXAMPLE_ENUM_WITH_INTEGER_VALUES("ExampleEnumWithIntegerValues", false),
  EXAMPLE_INNER_ENUM("RecordWithInnerEnums$ExampleInnerEnum", false),
  EXAMPLE_INNER_TWO_ENUM("RecordWithInnerEnums$ExampleInnerTwoEnum", false);

  private final String simpleClassName;
  private final boolean isDeprecated;

  GeneratedEnum(final String simpleClassName, final boolean isDeprecated) {
    this.simpleClassName = simpleClassName;
    this.isDeprecated = isDeprecated;
  }

  /**
   * {@inheritDoc}
   *
   * @return the class name as a {@link String}.
   */
  @Override
  public String getSimpleClassName() {
    return simpleClassName;
  }

  /**
   * {@inheritDoc}
   *
   * @return whether the class is deprecated.
   */
  @Override
  public boolean isDeprecated() {
    return isDeprecated;
  }

  /**
   * {@inheritDoc}
   *
   * @return whether the class is an {@code enum} class.
   */
  @Override
  public boolean isEnum() {
    return true;
  }
}
