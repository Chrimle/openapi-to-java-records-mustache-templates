/*
 * Example OpenAPI Spec.
 * An example OpenAPI-spec to generate example Java records.
 *
 * The version of the OpenAPI document: 0.0.1
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 * This class was generated using custom mustache templates from
 * openapi-to-java-records-mustache-templates. For further information,
 * questions, requesting features or reporting issues, please visit:
 * https://github.com/Chrimle/openapi-to-java-records-mustache-templates.
 * Generated with Version: 1.11.0
 *
 */

package io.github.chrimle.example.additionalEnumTypeAnnotations;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

/**
 * Example of an Enum
 */
@com.chrimle.example.annotations.TestAnnotationOne
@com.chrimle.example.annotations.TestAnnotationTwo
@com.chrimle.example.annotations.TestAnnotationThree
public enum ExampleEnum {
  ENUM1("ENUM1"),
  ENUM2("ENUM2"),
  ENUM3("ENUM3");

  private final String value;

  ExampleEnum(final String value) {
    this.value = value;
  }

  /**
   * Gets the {@code value} of this enum.
   *
   * @return value of this enum
   */
  public String getValue() {
    return value;
  }

  /**
   * Case-sensitively parses the given string to an enum constant whose {@link #getValue()}
   * matches the provided value.
   *
   * @param value of the Enum
   * @return a {@link ExampleEnum } with the matching value
   * @throws IllegalArgumentException if no enum has a value matching the given value
   */
  public static ExampleEnum fromValue(final String value) {
    for (final ExampleEnum constant : ExampleEnum.values()) {
      if (constant.getValue().equals(value)) {
        return constant;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
