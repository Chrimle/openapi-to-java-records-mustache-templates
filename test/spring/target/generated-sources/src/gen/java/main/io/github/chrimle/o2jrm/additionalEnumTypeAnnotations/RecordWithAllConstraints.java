package io.github.chrimle.o2jrm.additionalEnumTypeAnnotations;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
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
 * @param booleanStandard Non-required, non-nullable Boolean field.
 * @param booleanDefault Non-required, non-nullable Boolean with a default value.
 * @param booleanNullable Non-required, nullable Boolean field.
 * @param booleanRequired Required, non-nullable Boolean field.
 * @param booleanRequiredDefault Required, non-nullable Boolean field with a default value.
 * @param booleanRequiredNullable Required, nullable Boolean field.
 * @param stringStandard Non-required, non-nullable String field.
 * @param stringDefault Non-required, non-nullable String field with a default value.
 * @param stringNullable Non-required, nullable String field.
 * @param stringRequired Required, non-nullable String field.
 * @param stringRequiredNullable Required, nullable String field.
 * @param stringRequiredPattern Required, non-nullable String field with a RegEx-pattern.
 * @param stringEmailFormat Non-required, non-nullable String field with Email format.
 * @param stringUuidFormat Non-required, non-nullable UUID field.
 * @param stringMinLength Non-required, non-nullable String field with minLength: 3.
 * @param stringMaxLength Non-required, non-nullable String field with maxLength: 7.
 * @param stringMinAndMaxLength Non-required, non-nullable String with minLength: 3 and maxLength: 7.
 * @param arrayNullable Non-required, nullable List.
 * @param arrayRequiredNullable Required, nullable List.
 * @param arrayMinItems Non-required, non-nullable List with minItems: 1.
 * @param arrayMaxItems Non-required, non-nullable List with maxItems: 10.
 * @param arrayMinAndMaxItems Non-required, non-nullable List with minItems: 1 and maxItems: 10.
 * @param arrayUniqueStandard Non-required, non-nullable Set.
 * @param arrayUniqueRequired Required, non-nullable Set.
 * @param arrayUniqueNullable Non-required, nullable Set.
 * @param arrayUniqueRequiredNullable Required, nullable Set.
 * @param intMinimum Non-required, non-nullable Integer with minimum: 18.
 * @param intMaximum Non-required, non-nullable Integer with maximum: 100.
 * @param intMinimumAndMaximum Non-required, non-nullable Integer with minimum: 0 and maximum: 100.
 * @param longStandard Non-required, non-nullable Long.
 * @param longNullable Non-required, nullable Long.
 * @param longRequired Required, non-nullable Long.
 * @param longRequiredNullable Required, nullable Long.
 * @param longMinimum Non-required, non-nullable Long with minimum: 18.
 * @param longMaximum Non-required, non-nullable Long with maximum: 100.
 * @param longMinimumAndMaximum Non-required, non-nullable Long with minimum: 0 and maximum: 100.
 * @param bigDecimalStandard Non-required, non-nullable BigDecimal.
 * @param bigDecimalNullable Non-required, nullable BigDecimal.
 * @param bigDecimalRequired Required, non-nullable BigDecimal.
 * @param bigDecimalRequiredNullable Required, nullable BigDecimal.
 * @param bigDecimalMinimum Non-required, non-nullable BigDecimal with minimum: 0.
 * @param bigDecimalMaximum Non-required, non-nullable BigDecimal with maximum: 100.
 * @param bigDecimalMinimumAndMaximum Non-required, non-nullable BigDecimal with minimum: 0 and maximum: 100.
 */
public record RecordWithAllConstraints(
    Boolean booleanStandard,
    Boolean booleanDefault,
    Boolean booleanNullable,
    @NotNull Boolean booleanRequired,
    @NotNull Boolean booleanRequiredDefault,
    Boolean booleanRequiredNullable,
    String stringStandard,
    String stringDefault,
    String stringNullable,
    @NotNull String stringRequired,
    String stringRequiredNullable,
    @NotNull @Pattern(regexp = "^\\d{3}-\\d{2}-\\d{4}$") String stringRequiredPattern,
    @Email String stringEmailFormat,
    UUID stringUuidFormat,
    @Size(min = 3) String stringMinLength,
    @Size(max = 7) String stringMaxLength,
    @Size(min = 3, max = 7) String stringMinAndMaxLength,
    List<String> arrayNullable,
    List<String> arrayRequiredNullable,
    @Size(min = 1) List<String> arrayMinItems,
    @Size(max = 10) List<String> arrayMaxItems,
    @Size(min = 1, max = 10) List<String> arrayMinAndMaxItems,
    Set<String> arrayUniqueStandard,
    @NotNull Set<String> arrayUniqueRequired,
    Set<String> arrayUniqueNullable,
    Set<String> arrayUniqueRequiredNullable,
    @Min(18) Integer intMinimum,
    @Max(100) Integer intMaximum,
    @Min(0) @Max(100) Integer intMinimumAndMaximum,
    Long longStandard,
    Long longNullable,
    @NotNull Long longRequired,
    Long longRequiredNullable,
    @Min(18L) Long longMinimum,
    @Max(100L) Long longMaximum,
    @Min(0L) @Max(100L) Long longMinimumAndMaximum,
    BigDecimal bigDecimalStandard,
    BigDecimal bigDecimalNullable,
    @NotNull BigDecimal bigDecimalRequired,
    BigDecimal bigDecimalRequiredNullable,
    @DecimalMin("0") BigDecimal bigDecimalMinimum,
    @DecimalMax("100") BigDecimal bigDecimalMaximum,
    @DecimalMin("0") @DecimalMax("100") BigDecimal bigDecimalMinimumAndMaximum) {

  @JsonCreator
  public RecordWithAllConstraints(
      final Boolean booleanStandard,
      final Boolean booleanDefault,
      final Boolean booleanNullable,
      final Boolean booleanRequired,
      final Boolean booleanRequiredDefault,
      final Boolean booleanRequiredNullable,
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
      final List<String> arrayNullable,
      final List<String> arrayRequiredNullable,
      final List<String> arrayMinItems,
      final List<String> arrayMaxItems,
      final List<String> arrayMinAndMaxItems,
      final Set<String> arrayUniqueStandard,
      final Set<String> arrayUniqueRequired,
      final Set<String> arrayUniqueNullable,
      final Set<String> arrayUniqueRequiredNullable,
      final Integer intMinimum,
      final Integer intMaximum,
      final Integer intMinimumAndMaximum,
      final Long longStandard,
      final Long longNullable,
      final Long longRequired,
      final Long longRequiredNullable,
      final Long longMinimum,
      final Long longMaximum,
      final Long longMinimumAndMaximum,
      final BigDecimal bigDecimalStandard,
      final BigDecimal bigDecimalNullable,
      final BigDecimal bigDecimalRequired,
      final BigDecimal bigDecimalRequiredNullable,
      final BigDecimal bigDecimalMinimum,
      final BigDecimal bigDecimalMaximum,
      final BigDecimal bigDecimalMinimumAndMaximum) {
    this.booleanStandard = booleanStandard;
    this.booleanDefault = Objects.requireNonNullElse(booleanDefault, true);
    this.booleanNullable = booleanNullable;
    this.booleanRequired = booleanRequired;
    this.booleanRequiredDefault = Objects.requireNonNullElse(booleanRequiredDefault, true);
    this.booleanRequiredNullable = booleanRequiredNullable;
    this.stringStandard = stringStandard;
    this.stringDefault = Objects.requireNonNullElse(stringDefault, "someDefaultValue");
    this.stringNullable = stringNullable;
    this.stringRequired = stringRequired;
    this.stringRequiredNullable = stringRequiredNullable;
    this.stringRequiredPattern = stringRequiredPattern;
    this.stringEmailFormat = stringEmailFormat;
    this.stringUuidFormat = stringUuidFormat;
    this.stringMinLength = stringMinLength;
    this.stringMaxLength = stringMaxLength;
    this.stringMinAndMaxLength = stringMinAndMaxLength;
    this.arrayNullable = arrayNullable;
    this.arrayRequiredNullable = arrayRequiredNullable;
    this.arrayMinItems = Objects.requireNonNullElseGet(arrayMinItems, () -> new ArrayList<>());
    this.arrayMaxItems = Objects.requireNonNullElseGet(arrayMaxItems, () -> new ArrayList<>());
    this.arrayMinAndMaxItems = Objects.requireNonNullElseGet(arrayMinAndMaxItems, () -> new ArrayList<>());
    this.arrayUniqueStandard = Objects.requireNonNullElseGet(arrayUniqueStandard, () -> new LinkedHashSet<>());
    this.arrayUniqueRequired = Objects.requireNonNullElseGet(arrayUniqueRequired, () -> new LinkedHashSet<>());
    this.arrayUniqueNullable = arrayUniqueNullable;
    this.arrayUniqueRequiredNullable = arrayUniqueRequiredNullable;
    this.intMinimum = intMinimum;
    this.intMaximum = intMaximum;
    this.intMinimumAndMaximum = intMinimumAndMaximum;
    this.longStandard = longStandard;
    this.longNullable = longNullable;
    this.longRequired = longRequired;
    this.longRequiredNullable = longRequiredNullable;
    this.longMinimum = longMinimum;
    this.longMaximum = longMaximum;
    this.longMinimumAndMaximum = longMinimumAndMaximum;
    this.bigDecimalStandard = bigDecimalStandard;
    this.bigDecimalNullable = bigDecimalNullable;
    this.bigDecimalRequired = bigDecimalRequired;
    this.bigDecimalRequiredNullable = bigDecimalRequiredNullable;
    this.bigDecimalMinimum = bigDecimalMinimum;
    this.bigDecimalMaximum = bigDecimalMaximum;
    this.bigDecimalMinimumAndMaximum = bigDecimalMinimumAndMaximum;
  }
}
