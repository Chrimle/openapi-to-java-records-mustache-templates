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
 * Generated with Version: 2.8.2
 *
 */

package io.github.chrimle.o2jrm.useEnumCaseInsensitive;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.JsonElement;

/**
 * Example of an Enum
 */
public enum ExampleEnum {
  /**
   * Some description of ENUM1
   */
  ENUM1("ENUM1"),
  /**
   * Some description of ENUM2
   */
  ENUM2("ENUM2"),
  /**
   * Some description of ENUM3
   */
  ENUM3("ENUM3");

  private final String value;

  ExampleEnum(final String value) {
    this.value = value;
  }

  /**
   * Gets the {@code value} of this enum.
   *
   * @return the value of this enum.
   */
  public String getValue() {
    return value;
  }

  /**
   * Case-insensitively matches the given {@code value} to an enum constant using {@link
   * #getValue()}.
   *
   * <p><b>NOTE:</b> if multiple enum constants have a matching value, the first enum constant is
   * returned, by the order they are declared.
   *
   * @param value of the enum.
   * @return a {@link ExampleEnum } with the matching value.
   * @throws IllegalArgumentException if no enum has a value matching the given value.
   */
  public static ExampleEnum fromValue(final String value) {
    for (final ExampleEnum constant : ExampleEnum.values()) {
      if (constant.getValue().equalsIgnoreCase(value)) {
        return constant;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  /**
   * Validates the JSON Element and throws an exception if issues are found.
   *
   * @param jsonElement to validate.
   * @throws IOException if the JSON Element is not a valid ExampleEnum object.
   */
  public static void validateJsonElement(final JsonElement jsonElement) throws IOException {
    final String value = jsonElement.getAsString();
    ExampleEnum.fromValue(value);
  }
}
