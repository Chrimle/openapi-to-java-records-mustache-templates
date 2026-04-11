package io.github.chrimle.o2jrm.useEnumCaseInsensitive;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.net.URI;

/**
 * Example of an Enum with URI values
 */
public enum ExampleUriEnum {
  HTTPS_GITHUB_COM_CHRIMLE_OPENAPI_TO_JAVA_RECORDS_MUSTACHE_TEMPLATES(URI.create("https://github.com/Chrimle/openapi-to-java-records-mustache-templates")),
  HTTPS_CHRIMLE_GITHUB_IO_OPENAPI_TO_JAVA_RECORDS_MUSTACHE_TEMPLATES_(URI.create("https://chrimle.github.io/openapi-to-java-records-mustache-templates/"));

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
   * Matches the given {@code value} to an enum constant using {@link #getValue()}.
   *
   * <p><b>NOTE:</b> if multiple enum constants have a matching value, the first enum constant is
   * returned, by the order they are declared.
   *
   * @param value of the enum.
   * @return a {@link ExampleUriEnum } with the matching value.
   * @throws IllegalArgumentException if no enum has a value matching the given value.
   */
  @JsonCreator
  public static ExampleUriEnum fromValue(final URI value) {
    for (final ExampleUriEnum constant : ExampleUriEnum.values()) {
      if (constant.getValue().equals(value)) {
        return constant;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
