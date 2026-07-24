package io.github.chrimle.o2jrm.useEnumCaseInsensitive;

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
 * Example of a Record with inner enum classes
 *
 * @param exampleInner Example of an inner enum class
 * @param exampleInnerTwo Example of another inner enum class with integer values
 * @param exampleInnerThree Example of another inner enum class with URI values
 * @param exampleEnumArray Example of an array of enums
 */
public record RecordWithInnerEnums(
    ExampleInnerEnum exampleInner,
    ExampleInnerTwoEnum exampleInnerTwo,
    ExampleInnerThreeEnum exampleInnerThree,
    List<ExampleEnumArrayEnum> exampleEnumArray) {

  @JsonCreator
  public RecordWithInnerEnums(
      final ExampleInnerEnum exampleInner,
      final ExampleInnerTwoEnum exampleInnerTwo,
      final ExampleInnerThreeEnum exampleInnerThree,
      final List<ExampleEnumArrayEnum> exampleEnumArray) {
    this.exampleInner = exampleInner;
    this.exampleInnerTwo = exampleInnerTwo;
    this.exampleInnerThree = exampleInnerThree;
    this.exampleEnumArray = Objects.requireNonNullElseGet(exampleEnumArray, () -> new ArrayList<>());
  }

  /**
   * Example of an inner enum class
   */
  public enum ExampleInnerEnum {
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

    private static final java.util.Map<String, ExampleInnerEnum> VALUE_MAP;

    static {
      final var map =
          new java.util.TreeMap<String, ExampleInnerEnum>(
              java.util.Comparator.nullsFirst(String.CASE_INSENSITIVE_ORDER));
      for (final var e : values()) map.putIfAbsent(e.getValue(), e);
      VALUE_MAP = java.util.Collections.unmodifiableMap(map);
    }

    private final String value;

    ExampleInnerEnum(final String value) {
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
     * @return a {@link ExampleInnerEnum } with the matching value.
     * @throws IllegalArgumentException if no enum has a value matching the given value.
     */
    @JsonCreator
    public static ExampleInnerEnum fromValue(final String value) {
      final var result = VALUE_MAP.get(value);
      if (result != null) return result;
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  /**
   * Example of another inner enum class with integer values
   */
  public enum ExampleInnerTwoEnum {
    NUMBER_404(404),
    NUMBER_501(501),
    NUMBER_503(503);

    private static final java.util.Map<Integer, ExampleInnerTwoEnum> VALUE_MAP;

    static {
      final var map = new java.util.HashMap<Integer, ExampleInnerTwoEnum>();
      for (final var e : values()) map.putIfAbsent(e.getValue(), e);
      VALUE_MAP = java.util.Collections.unmodifiableMap(map);
    }

    private final Integer value;

    ExampleInnerTwoEnum(final Integer value) {
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
     * @return a {@link ExampleInnerTwoEnum } with the matching value.
     * @throws IllegalArgumentException if no enum has a value matching the given value.
     */
    @JsonCreator
    public static ExampleInnerTwoEnum fromValue(final Integer value) {
      final var result = VALUE_MAP.get(value);
      if (result != null) return result;
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  /**
   * Example of another inner enum class with URI values
   */
  public enum ExampleInnerThreeEnum {
    HTTPS_GITHUB_COM_CHRIMLE_OPENAPI_TO_JAVA_RECORDS_MUSTACHE_TEMPLATES(URI.create("https://github.com/Chrimle/openapi-to-java-records-mustache-templates")),
    HTTPS_CHRIMLE_GITHUB_IO_OPENAPI_TO_JAVA_RECORDS_MUSTACHE_TEMPLATES_(URI.create("https://chrimle.github.io/openapi-to-java-records-mustache-templates/"));

    private static final java.util.Map<URI, ExampleInnerThreeEnum> VALUE_MAP;

    static {
      final var map = new java.util.HashMap<URI, ExampleInnerThreeEnum>();
      for (final var e : values()) map.putIfAbsent(e.getValue(), e);
      VALUE_MAP = java.util.Collections.unmodifiableMap(map);
    }

    private final URI value;

    ExampleInnerThreeEnum(final URI value) {
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
     * Case-insensitively matches the given {@code value} to an enum constant using {@link
     * #getValue()}.
     *
     * <p><b>NOTE:</b> if multiple enum constants have a matching {@link #value}, the first matching
     * enum constant is returned, by the order they are declared.
     *
     * @param value of the enum.
     * @return a {@link ExampleInnerThreeEnum } with the matching value.
     * @throws IllegalArgumentException if no enum has a value matching the given value.
     */
    @JsonCreator
    public static ExampleInnerThreeEnum fromValue(final URI value) {
      final var result = VALUE_MAP.get(value);
      if (result != null) return result;
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  /**
   * Example of an array of enums
   */
  public enum ExampleEnumArrayEnum {
    ENUM1("ENUM1"),
    ENUM2("ENUM2"),
    ENUM3("ENUM3");

    private static final java.util.Map<String, ExampleEnumArrayEnum> VALUE_MAP;

    static {
      final var map = new java.util.HashMap<String, ExampleEnumArrayEnum>();
      for (final var e : values()) map.putIfAbsent(e.getValue(), e);
      VALUE_MAP = java.util.Collections.unmodifiableMap(map);
    }

    private final String value;

    ExampleEnumArrayEnum(final String value) {
      this.value = value;
    }

    /**
     * Gets the {@link #value} of this enum.
     *
     * @return the {@code value} of this enum.
     */
    @JsonValue
    public List<String> getValue() {
      return value;
    }

    /**
     * Matches the given {@code value} to an enum constant using {@link #getValue()}.
     *
     * <p><b>NOTE:</b> if multiple enum constants have a matching {@link #value}, the first matching
     * enum constant is returned, by the order they are declared.
     *
     * @param value of the enum.
     * @return a {@link List&lt;ExampleEnumArrayEnum&gt; } with the matching value.
     * @throws IllegalArgumentException if no enum has a value matching the given value.
     */
    @JsonCreator
    public static List&lt;ExampleEnumArrayEnum&gt; fromValue(final List<String> value) {
      final var result = VALUE_MAP.get(value);
      if (result != null) return result;
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
}
