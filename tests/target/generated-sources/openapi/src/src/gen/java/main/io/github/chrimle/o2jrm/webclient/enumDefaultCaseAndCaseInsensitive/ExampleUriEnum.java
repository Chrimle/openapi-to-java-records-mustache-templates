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
 * Generated with Version: 2.9.0
 *
 */

package io.github.chrimle.o2jrm.webclient.enumDefaultCaseAndCaseInsensitive;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.net.URI;

/**
 * Example of an Enum with URI values
 */
public enum ExampleUriEnum {
  GITHUB_COM_CHRIMLE_OPENAPI_TO_JAVA_RECORDS_MUSTACHE_TEMPLATES(URI.create("https://github.com/Chrimle/openapi-to-java-records-mustache-templates")),
  CHRIMLE_GITHUB_IO_OPENAPI_TO_JAVA_RECORDS_MUSTACHE_TEMPLATES_(URI.create("https://chrimle.github.io/openapi-to-java-records-mustache-templates/")),
  UNKNOWN_DEFAULT_OPEN_API(URI.create("11184809"));

  private final URI value;

  ExampleUriEnum(final URI value) {
    this.value = value;
  }

  /**
   * Gets the {@code value} of this enum.
   *
   * @return the value of this enum.
   */
  @JsonValue
  public URI getValue() {
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
   * @return a {@link ExampleUriEnum } with the matching value, or {@link
   *     #UNKNOWN_DEFAULT_OPEN_API } if no match is found.
   */
  @JsonCreator
  public static ExampleUriEnum fromValue(final URI value) {
    for (final ExampleUriEnum constant : ExampleUriEnum.values()) {
      if (constant.getValue().equals(value)) {
        return constant;
      }
    }
    return UNKNOWN_DEFAULT_OPEN_API;
  }
}
