package io.github.chrimle.o2jrm.enumDefaultCaseAndCaseInsensitive;

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

/**
 * Example of an Enum which implements an interface.
 */
public enum ExampleImplementsEnum implements io.github.chrimle.o2jrm.interfaces.TestInterfaceOne {
  ENUM1("ENUM1"),
  ENUM2("ENUM2"),
  ENUM3("ENUM3"),
  UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

  private final String value;

  ExampleImplementsEnum(final String value) {
    this.value = value;
  }

  /**
   * Gets the {@code value} of this enum.
   *
   * @return the value of this enum.
   */
  @JsonValue
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
   * @return a {@link ExampleImplementsEnum } with the matching value, or {@link
   *     #UNKNOWN_DEFAULT_OPEN_API } if no match is found.
   */
  @JsonCreator
  public static ExampleImplementsEnum fromValue(final String value) {
    for (final ExampleImplementsEnum constant : ExampleImplementsEnum.values()) {
      if (constant.getValue().equalsIgnoreCase(value)) {
        return constant;
      }
    }
    return UNKNOWN_DEFAULT_OPEN_API;
  }
}
