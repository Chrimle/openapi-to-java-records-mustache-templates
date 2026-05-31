package io.github.chrimle.o2jrm.useOptional;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Example of a Record which has fields with constraints
 *
 * @param stringStandard String.
 * @param stringDefault String.
 * @param stringNullable String.
 * @param stringRequired String.
 * @param stringRequiredNullable String.
 * @param stringRequiredPattern String.
 * @param stringEmailFormat String.
 * @param stringUuidFormat UUID.
 * @param stringMinLength String.
 * @param stringMaxLength String.
 * @param stringMinAndMaxLength String.
 * @param arrayMinItems List<String>.
 * @param arrayMaxItems List<String>.
 * @param arrayMinAndMaxItems List<String>.
 * @param intMinimum Integer.
 * @param intMaximum Integer.
 * @param intMinimumAndMaximum Integer.
 * @param longMinimum Long.
 * @param longMaximum Long.
 * @param longMinimumAndMaximum Long.
 * @param bigDecimalMinimum BigDecimal.
 * @param bigDecimalMaximum BigDecimal.
 * @param bigDecimalMinimumAndMaximum BigDecimal.
 */
public record RecordWithAllConstraints(
    Optional<String> stringStandard,
    Optional<String> stringDefault,
    Optional<String> stringNullable,
    @NotNull String stringRequired,
    String stringRequiredNullable,
    @NotNull @Pattern(regexp = "^\\d{3}-\\d{2}-\\d{4}$") String stringRequiredPattern,
    Optional<@Email String> stringEmailFormat,
    Optional<UUID> stringUuidFormat,
    Optional<@Size(min = 3) String> stringMinLength,
    Optional<@Size(max = 7) String> stringMaxLength,
    Optional<@Size(min = 3, max = 7) String> stringMinAndMaxLength,
    Optional<@Size(min = 1) List<String>> arrayMinItems,
    Optional<@Size(max = 10) List<String>> arrayMaxItems,
    Optional<@Size(min = 1, max = 10) List<String>> arrayMinAndMaxItems,
    Optional<@Min(18) Integer> intMinimum,
    Optional<@Max(100) Integer> intMaximum,
    Optional<@Min(0) @Max(100) Integer> intMinimumAndMaximum,
    Optional<@Min(18L) Long> longMinimum,
    Optional<@Max(100L) Long> longMaximum,
    Optional<@Min(0L) @Max(100L) Long> longMinimumAndMaximum,
    Optional<@DecimalMin("0") BigDecimal> bigDecimalMinimum,
    Optional<@DecimalMax("100") BigDecimal> bigDecimalMaximum,
    Optional<@DecimalMin("0") @DecimalMax("100") BigDecimal> bigDecimalMinimumAndMaximum) {

  @JsonCreator
  public RecordWithAllConstraints(
      final String stringStandard,
      final String stringDefault,
      final String stringNullable,
      final String stringRequired,
      final String stringRequiredNullable,
      final String stringRequiredPattern,
      final String stringEmailFormat,
      final UUID stringUuidFormat,
      final String stringMinLength,
      final String stringMaxLength,
      final String stringMinAndMaxLength,
      final List<String> arrayMinItems,
      final List<String> arrayMaxItems,
      final List<String> arrayMinAndMaxItems,
      final Integer intMinimum,
      final Integer intMaximum,
      final Integer intMinimumAndMaximum,
      final Long longMinimum,
      final Long longMaximum,
      final Long longMinimumAndMaximum,
      final BigDecimal bigDecimalMinimum,
      final BigDecimal bigDecimalMaximum,
      final BigDecimal bigDecimalMinimumAndMaximum) {
    this(Optional.ofNullable(stringStandard),
        Optional.ofNullable(stringDefault),
        Optional.ofNullable(stringNullable),
        stringRequired,
        stringRequiredNullable,
        stringRequiredPattern,
        Optional.ofNullable(stringEmailFormat),
        Optional.ofNullable(stringUuidFormat),
        Optional.ofNullable(stringMinLength),
        Optional.ofNullable(stringMaxLength),
        Optional.ofNullable(stringMinAndMaxLength),
        Optional.ofNullable(arrayMinItems),
        Optional.ofNullable(arrayMaxItems),
        Optional.ofNullable(arrayMinAndMaxItems),
        Optional.ofNullable(intMinimum),
        Optional.ofNullable(intMaximum),
        Optional.ofNullable(intMinimumAndMaximum),
        Optional.ofNullable(longMinimum),
        Optional.ofNullable(longMaximum),
        Optional.ofNullable(longMinimumAndMaximum),
        Optional.ofNullable(bigDecimalMinimum),
        Optional.ofNullable(bigDecimalMaximum),
        Optional.ofNullable(bigDecimalMinimumAndMaximum));
  }
}
