package io.github.chrimle.o2jrm.enumUnknownDefaultCase;

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

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

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
  ENUM3("ENUM3"),
  UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

  private static final Map<String, ExampleEnum> VALUES;

  static {
    final var map = new HashMap<String, ExampleEnum>();
    for (final var e : values()) {
      map.putIfAbsent(e.getValue(), e);
    }
    VALUES = Collections.unmodifiableMap(map);
  }

  private final String value;

  ExampleEnum(final String value) {
    this.value = value;
  }

  /**
   * Gets the {@link #value} of this enum.
   *
   * @return the {@code value} of this enum.
   */
  @JsonValue
  public String getValue() {
    return value;
  }

  /**
   * Case-sensitively matches the given {@code value} to an enum constant using {@link #getValue()}.
   *
   * <p><b>NOTE:</b> if multiple enum constants have a matching {@link #value}, the first matching
   * enum constant is returned, by the order they are declared.
   *
   * @param value of the enum.
   * @return a {@link ExampleEnum } with the matching value, or {@link
   *     #UNKNOWN_DEFAULT_OPEN_API } if no match is found.
   */
  @JsonCreator
  public static ExampleEnum fromValue(final String value) {
    for (final ExampleEnum constant : ExampleEnum.values()) {
      if (constant.getValue().equals(value)) {
        return constant;
      }
    }
    return UNKNOWN_DEFAULT_OPEN_API;
  }
}
