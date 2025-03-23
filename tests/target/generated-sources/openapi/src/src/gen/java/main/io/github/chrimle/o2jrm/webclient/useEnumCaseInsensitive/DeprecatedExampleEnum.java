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
 * Generated with Version: 2.7.1
 *
 */

package io.github.chrimle.o2jrm.webclient.useEnumCaseInsensitive;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Example of a deprecated Enum
 *
 * @deprecated
 */
@Deprecated
public enum DeprecatedExampleEnum {
  ENUM1("ENUM1"),
  ENUM2("ENUM2"),
  ENUM3("ENUM3");

  private final String value;

  DeprecatedExampleEnum(final String value) {
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
   * @return a {@link DeprecatedExampleEnum } with the matching value.
   * @throws IllegalArgumentException if no enum has a value matching the given value.
   */
  public static DeprecatedExampleEnum fromValue(final String value) {
    for (final DeprecatedExampleEnum constant : DeprecatedExampleEnum.values()) {
      if (constant.getValue().equalsIgnoreCase(value)) {
        return constant;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
