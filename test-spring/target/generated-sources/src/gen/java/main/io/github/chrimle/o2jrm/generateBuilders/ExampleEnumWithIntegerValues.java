package io.github.chrimle.o2jrm.generateBuilders;

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
 * Example of an Enum with integer values
 */
public enum ExampleEnumWithIntegerValues {
  NUMBER_100(100),
  NUMBER_200(200),
  NUMBER_300(300),
  NUMBER_400(400),
  NUMBER_500(500);

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
   * Matches the given {@code value} to an enum constant using {@link #getValue()}.
   *
   * <p><b>NOTE:</b> if multiple enum constants have a matching value, the first enum constant is
   * returned, by the order they are declared.
   *
   * @param value of the enum.
   * @return a {@link ExampleEnumWithIntegerValues } with the matching value.
   * @throws IllegalArgumentException if no enum has a value matching the given value.
   */
  @JsonCreator
  public static ExampleEnumWithIntegerValues fromValue(final Integer value) {
    for (final ExampleEnumWithIntegerValues constant : ExampleEnumWithIntegerValues.values()) {
      if (constant.getValue().equals(value)) {
        return constant;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
