package io.github.chrimle.o2jrm.enumUnknownDefaultCase;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Example of a Record with arrays of inner enums
 *
 * @param stringEnumArray Example of an array of string enums
 * @param integerEnumArray Example of an array of number enums
 * @param uriEnumArray Example of an array of URI enums
 */
public record RecordWithInnerEnumArrays(
    List<StringEnumArrayEnum> stringEnumArray,
    List<IntegerEnumArrayEnum> integerEnumArray,
    List<UriEnumArrayEnum> uriEnumArray) {

  @JsonCreator
  public RecordWithInnerEnumArrays(
      final List<StringEnumArrayEnum> stringEnumArray,
      final List<IntegerEnumArrayEnum> integerEnumArray,
      final List<UriEnumArrayEnum> uriEnumArray) {
    this.stringEnumArray = Objects.requireNonNullElseGet(stringEnumArray, () -> new ArrayList<>());
    this.integerEnumArray = Objects.requireNonNullElseGet(integerEnumArray, () -> new ArrayList<>());
    this.uriEnumArray = Objects.requireNonNullElseGet(uriEnumArray, () -> new ArrayList<>());
  }

  /**
   * Example of an array of string enums
   */
  public enum StringEnumArrayEnum {
    ENUM1("ENUM1"),
    ENUM2("ENUM2"),
    ENUM3("ENUM3"),
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private static final java.util.Map<String, StringEnumArrayEnum> VALUE_MAP;

    static {
      final var map = new java.util.HashMap<String, StringEnumArrayEnum>();
      for (final var e : values()) map.putIfAbsent(e.getValue(), e);
      VALUE_MAP = java.util.Collections.unmodifiableMap(map);
    }

    private final String value;

    StringEnumArrayEnum(final String value) {
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
     * Matches the given {@code value} to an enum constant using {@link #getValue()}.
     *
     * <p><b>NOTE:</b> if multiple enum constants have a matching {@link #value}, the first matching
     * enum constant is returned, by the order they are declared.
     *
     * @param value of the enum.
     * @return a {@link StringEnumArrayEnum } with the matching value, or
     *     {@link #UNKNOWN_DEFAULT_OPEN_API } if no match is found.
     */
    @JsonCreator
    public static StringEnumArrayEnum fromValue(final String value) {
      final var result = VALUE_MAP.get(value);
      if (result != null) return result;
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  /**
   * Example of an array of number enums
   */
  public enum IntegerEnumArrayEnum {
    NUMBER_404(404),
    NUMBER_501(501),
    NUMBER_503(503),
    NUMBER_unknown_default_open_api(11184809);

    private static final java.util.Map<Integer, IntegerEnumArrayEnum> VALUE_MAP;

    static {
      final var map = new java.util.HashMap<Integer, IntegerEnumArrayEnum>();
      for (final var e : values()) map.putIfAbsent(e.getValue(), e);
      VALUE_MAP = java.util.Collections.unmodifiableMap(map);
    }

    private final Integer value;

    IntegerEnumArrayEnum(final Integer value) {
      this.value = value;
    }

    /**
     * Gets the {@link #value} of this enum.
     *
     * @return the {@code value} of this enum.
     */
    @JsonValue
    public Integer getValue() {
      return value;
    }

    /**
     * Matches the given {@code value} to an enum constant using {@link #getValue()}.
     *
     * <p><b>NOTE:</b> if multiple enum constants have a matching {@link #value}, the first matching
     * enum constant is returned, by the order they are declared.
     *
     * @param value of the enum.
     * @return a {@link IntegerEnumArrayEnum } with the matching value, or
     *     {@link #NUMBER_unknown_default_open_api } if no match is found.
     */
    @JsonCreator
    public static IntegerEnumArrayEnum fromValue(final Integer value) {
      final var result = VALUE_MAP.get(value);
      if (result != null) return result;
      return NUMBER_unknown_default_open_api;
    }
  }

  /**
   * Example of an array of URI enums
   */
  public enum UriEnumArrayEnum {
    HTTPS_GITHUB_COM_CHRIMLE_OPENAPI_TO_JAVA_RECORDS_MUSTACHE_TEMPLATES(URI.create("https://github.com/Chrimle/openapi-to-java-records-mustache-templates")),
    HTTPS_CHRIMLE_GITHUB_IO_OPENAPI_TO_JAVA_RECORDS_MUSTACHE_TEMPLATES_(URI.create("https://chrimle.github.io/openapi-to-java-records-mustache-templates/")),
    UNKNOWN_DEFAULT_OPEN_API(URI.create("11184809"));

    private static final java.util.Map<URI, UriEnumArrayEnum> VALUE_MAP;

    static {
      final var map = new java.util.HashMap<URI, UriEnumArrayEnum>();
      for (final var e : values()) map.putIfAbsent(e.getValue(), e);
      VALUE_MAP = java.util.Collections.unmodifiableMap(map);
    }

    private final URI value;

    UriEnumArrayEnum(final URI value) {
      this.value = value;
    }

    /**
     * Gets the {@link #value} of this enum.
     *
     * @return the {@code value} of this enum.
     */
    @JsonValue
    public URI getValue() {
      return value;
    }

    /**
     * Matches the given {@code value} to an enum constant using {@link #getValue()}.
     *
     * <p><b>NOTE:</b> if multiple enum constants have a matching {@link #value}, the first matching
     * enum constant is returned, by the order they are declared.
     *
     * @param value of the enum.
     * @return a {@link UriEnumArrayEnum } with the matching value, or
     *     {@link #UNKNOWN_DEFAULT_OPEN_API } if no match is found.
     */
    @JsonCreator
    public static UriEnumArrayEnum fromValue(final URI value) {
      final var result = VALUE_MAP.get(value);
      if (result != null) return result;
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }
}
