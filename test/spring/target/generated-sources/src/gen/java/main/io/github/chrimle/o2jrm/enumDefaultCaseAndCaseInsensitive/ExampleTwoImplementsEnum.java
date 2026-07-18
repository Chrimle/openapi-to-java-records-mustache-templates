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

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * Example of an Enum which implements two interfaces.
 */
public enum ExampleTwoImplementsEnum implements io.github.chrimle.o2jrm.test.interfaces.TestInterfaceOne, io.github.chrimle.o2jrm.test.interfaces.TestInterfaceTwo {
  ENUM1("ENUM1"),
  ENUM2("ENUM2"),
  ENUM3("ENUM3"),
  UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

  private static final Map<String, ExampleTwoImplementsEnum> VALUES;

  static {
    final var map = new TreeMap<String, ExampleTwoImplementsEnum>(String.CASE_INSENSITIVE_ORDER);
    for (final var e : values()) {
      map.putIfAbsent(e.getValue(), e);
    }
    VALUES = Collections.unmodifiableMap(map);
  }

  private final String value;

  ExampleTwoImplementsEnum(final String value) {
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
   * Case-insensitively matches the given {@code value} to an enum constant using {@link
   * #getValue()}.
   *
   * <p><b>NOTE:</b> if multiple enum constants have a matching {@link #value}, the first matching
   * enum constant is returned, by the order they are declared.
   *
   * @param value of the enum.
   * @return a {@link ExampleTwoImplementsEnum } with the matching value, or {@link
   *     #UNKNOWN_DEFAULT_OPEN_API } if no match is found.
   */
  @JsonCreator
  public static ExampleTwoImplementsEnum fromValue(final String value) {
    for (final ExampleTwoImplementsEnum constant : ExampleTwoImplementsEnum.values()) {
      if (constant.getValue().equalsIgnoreCase(value)) {
        return constant;
      }
    }
    return UNKNOWN_DEFAULT_OPEN_API;
  }
}
