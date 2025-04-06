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
 * Generated with Version: 2.8.1
 *
 */

package io.github.chrimle.o2jrm.webclient.enumDefaultCaseAndCaseInsensitive;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Example of an Enum with integer values
 */
public enum ExampleEnumWithIntegerValues {
  NUMBER_100(100),
  NUMBER_200(200),
  NUMBER_300(300),
  NUMBER_400(400),
  NUMBER_500(500),
  NUMBER_unknown_default_open_api(11184809);

  private final Integer value;

  ExampleEnumWithIntegerValues(final Integer value) {
    this.value = value;
  }

  /**
   * Gets the {@code value} of this enum.
   *
   * @return the value of this enum.
   */
  @JsonValue
  public Integer getValue() {
    return value;
  }

  /**
   * Matches the given {@code value} to an enum constant using {@link
   * #getValue()}.
   *
   * <p><b>NOTE:</b> if multiple enum constants have a matching value, the first enum constant is
   * returned, by the order they are declared.
   *
   * @param value of the enum.
   * @return a {@link ExampleEnumWithIntegerValues } with the matching value, or {@link
   *     #NUMBER_unknown_default_open_api } if no match is found.
   */
  @JsonCreator
  public static ExampleEnumWithIntegerValues fromValue(final Integer value) {
    for (final ExampleEnumWithIntegerValues constant : ExampleEnumWithIntegerValues.values()) {
      if (constant.getValue().equals(value)) {
        return constant;
      }
    }
    return NUMBER_unknown_default_open_api;
  }
}
