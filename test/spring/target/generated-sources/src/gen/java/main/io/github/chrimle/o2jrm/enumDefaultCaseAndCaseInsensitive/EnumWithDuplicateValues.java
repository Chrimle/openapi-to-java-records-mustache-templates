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
 * Example of an Enum with duplicate values
 */
public enum EnumWithDuplicateValues {
  EXAMPLE("EXAMPLE"),
  EXAMPLE2("Example"),
  UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

  private static final java.util.Map<String, EnumWithDuplicateValues> VALUE_MAP;

  static {
    final var map = new java.util.TreeMap<String, EnumWithDuplicateValues>(java.util.Comparator.nullsFirst(String.CASE_INSENSITIVE_ORDER));
    for (final var e : values()) {
      map.putIfAbsent(e.getValue(), e);
    }
    VALUE_MAP = java.util.Collections.unmodifiableMap(map);
  }

  private final String value;

  EnumWithDuplicateValues(final String value) {
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
   * @return a {@link EnumWithDuplicateValues } with the matching value, or {@link
   *     #UNKNOWN_DEFAULT_OPEN_API } if no match is found.
   */
  @JsonCreator
  public static EnumWithDuplicateValues fromValue(final String value) {
    final var result = VALUE_MAP.get(value);
    if (result != null) return result;
    return UNKNOWN_DEFAULT_OPEN_API;
  }
}
