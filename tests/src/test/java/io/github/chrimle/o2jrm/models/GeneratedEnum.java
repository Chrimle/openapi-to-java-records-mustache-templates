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

import java.lang.annotation.Annotation;
import java.net.URI;
import java.util.List;

/** Enum class listing all expected {@code enum} classes to be generated from the OpenAPI spec. */
public enum GeneratedEnum implements GeneratedClass {
  DEPRECATED_EXAMPLE_ENUM(
      "DeprecatedExampleEnum",
      true,
      GeneratedField.of("ENUM1", String.class, "ENUM1").build(),
      GeneratedField.of("ENUM2", String.class, "ENUM2").build(),
      GeneratedField.of("ENUM3", String.class, "ENUM3").build()),
  EXAMPLE_ENUM(
      "ExampleEnum",
      false,
      GeneratedField.of("ENUM1", String.class, "ENUM1").build(),
      GeneratedField.of("ENUM2", String.class, "ENUM2").build(),
      GeneratedField.of("ENUM3", String.class, "ENUM3").build()),
  EXAMPLE_URI_ENUM(
      "ExampleUriEnum",
      false,
      GeneratedField.of(
              "GITHUB_COM_CHRIMLE_OPENAPI_TO_JAVA_RECORDS_MUSTACHE_TEMPLATES",
              URI.class,
              URI.create("https://github.com/Chrimle/openapi-to-java-records-mustache-templates"))
          .build(),
      GeneratedField.of(
              "CHRIMLE_GITHUB_IO_OPENAPI_TO_JAVA_RECORDS_MUSTACHE_TEMPLATES_",
              URI.class,
              URI.create("https://chrimle.github.io/openapi-to-java-records-mustache-templates/"))
          .build()),
  EXAMPLE_ENUM_WITH_INTEGER_VALUES(
      "ExampleEnumWithIntegerValues",
      false,
      GeneratedField.of("NUMBER_100", Integer.class, 100).build(),
      GeneratedField.of("NUMBER_200", Integer.class, 200).build(),
      GeneratedField.of("NUMBER_300", Integer.class, 300).build(),
      GeneratedField.of("NUMBER_400", Integer.class, 400).build(),
      GeneratedField.of("NUMBER_500", Integer.class, 500).build()),
  EXAMPLE_INNER_ENUM(
      "RecordWithInnerEnums$ExampleInnerEnum",
      false,
      GeneratedField.of("ENUM1", String.class, "ENUM1").build(),
      GeneratedField.of("ENUM2", String.class, "ENUM2").build(),
      GeneratedField.of("ENUM3", String.class, "ENUM3").build()),
  EXAMPLE_INNER_TWO_ENUM(
      "RecordWithInnerEnums$ExampleInnerTwoEnum",
      false,
      GeneratedField.of("NUMBER_404", Integer.class, 404).build(),
      GeneratedField.of("NUMBER_501", Integer.class, 501).build(),
      GeneratedField.of("NUMBER_503", Integer.class, 503).build()),
  EXAMPLE_INNER_THREE_ENUM(
      "RecordWithInnerEnums$ExampleInnerThreeEnum",
      false,
      GeneratedField.of(
              "GITHUB_COM_CHRIMLE_OPENAPI_TO_JAVA_RECORDS_MUSTACHE_TEMPLATES",
              URI.class,
              URI.create("https://github.com/Chrimle/openapi-to-java-records-mustache-templates"))
          .build(),
      GeneratedField.of(
              "CHRIMLE_GITHUB_IO_OPENAPI_TO_JAVA_RECORDS_MUSTACHE_TEMPLATES_",
              URI.class,
              URI.create("https://chrimle.github.io/openapi-to-java-records-mustache-templates/"))
          .build());

  private final String simpleClassName;
  private final boolean isDeprecated;
  private final GeneratedField<?>[] generatedFields;

  GeneratedEnum(
      final String simpleClassName,
      final boolean isDeprecated,
      final GeneratedField<?>... generatedFields) {
    this.simpleClassName = simpleClassName;
    this.isDeprecated = isDeprecated;
    this.generatedFields = generatedFields;
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

  /**
   * {@inheritDoc}
   *
   * @return whether the class has extra annotations.
   */
  @Override
  public boolean hasExtraAnnotations() {
    return false;
  }

  /**
   * {@inheritDoc}
   *
   * @return the collection of annotations.
   */
  @Override
  public List<Class<? extends Annotation>> getExtraAnnotations() {
    return List.of();
  }

  /**
   * {@inheritDoc}
   *
   * @return the collection of generatedFields.
   */
  @Override
  public GeneratedField<?>[] getGeneratedFields() {
    return generatedFields;
  }
}
