package io.github.chrimle.o2jrm.generateBuilders;

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
 * @param longMinimum Non-required, non-nullable Long with minimum: 18.
 * @param longMaximum Non-required, non-nullable Long with maximum: 100.
 * @param longMinimumAndMaximum Non-required, non-nullable Long with minimum: 0 and maximum: 100.
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
    @Min(18L) Long longMinimum,
    @Max(100L) Long longMaximum,
    @Min(0L) @Max(100L) Long longMinimumAndMaximum,
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
      final Long longMinimum,
      final Long longMaximum,
      final Long longMinimumAndMaximum,
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
    this.longMinimum = longMinimum;
    this.longMaximum = longMaximum;
    this.longMinimumAndMaximum = longMinimumAndMaximum;
    this.bigDecimalMinimum = bigDecimalMinimum;
    this.bigDecimalMaximum = bigDecimalMaximum;
    this.bigDecimalMinimumAndMaximum = bigDecimalMinimumAndMaximum;
  }

  /** Builder class for {@link RecordWithAllConstraints }. */
  public static class Builder {

    private Boolean booleanStandard;
    private Boolean booleanDefault;
    private Boolean booleanNullable;
    private Boolean booleanRequired;
    private Boolean booleanRequiredDefault;
    private Boolean booleanRequiredNullable;
    private String stringStandard;
    private String stringDefault;
    private String stringNullable;
    private String stringRequired;
    private String stringRequiredNullable;
    private String stringRequiredPattern;
    private String stringEmailFormat;
    private UUID stringUuidFormat;
    private String stringMinLength;
    private String stringMaxLength;
    private String stringMinAndMaxLength;
    private List<String> arrayNullable;
    private List<String> arrayRequiredNullable;
    private List<String> arrayMinItems;
    private List<String> arrayMaxItems;
    private List<String> arrayMinAndMaxItems;
    private Set<String> arrayUniqueStandard;
    private Set<String> arrayUniqueRequired;
    private Set<String> arrayUniqueNullable;
    private Set<String> arrayUniqueRequiredNullable;
    private Integer intMinimum;
    private Integer intMaximum;
    private Integer intMinimumAndMaximum;
    private Long longMinimum;
    private Long longMaximum;
    private Long longMinimumAndMaximum;
    private BigDecimal bigDecimalMinimum;
    private BigDecimal bigDecimalMaximum;
    private BigDecimal bigDecimalMinimumAndMaximum;

    /**
     * Sets the value of {@link RecordWithAllConstraints#booleanStandard }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param booleanStandard Non-required, non-nullable Boolean field..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder booleanStandard(final Boolean booleanStandard) {
      this.booleanStandard = booleanStandard;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#booleanDefault }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param booleanDefault Non-required, non-nullable Boolean with a default value..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder booleanDefault(final Boolean booleanDefault) {
      this.booleanDefault = booleanDefault;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#booleanNullable }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param booleanNullable Non-required, nullable Boolean field..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder booleanNullable(final Boolean booleanNullable) {
      this.booleanNullable = booleanNullable;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#booleanRequired }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param booleanRequired Required, non-nullable Boolean field..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder booleanRequired(final Boolean booleanRequired) {
      this.booleanRequired = booleanRequired;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#booleanRequiredDefault }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param booleanRequiredDefault Required, non-nullable Boolean field with a default value..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder booleanRequiredDefault(final Boolean booleanRequiredDefault) {
      this.booleanRequiredDefault = booleanRequiredDefault;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#booleanRequiredNullable }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param booleanRequiredNullable Required, nullable Boolean field..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder booleanRequiredNullable(final Boolean booleanRequiredNullable) {
      this.booleanRequiredNullable = booleanRequiredNullable;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#stringStandard }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param stringStandard Non-required, non-nullable String field..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder stringStandard(final String stringStandard) {
      this.stringStandard = stringStandard;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#stringDefault }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param stringDefault Non-required, non-nullable String field with a default value..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder stringDefault(final String stringDefault) {
      this.stringDefault = stringDefault;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#stringNullable }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param stringNullable Non-required, nullable String field..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder stringNullable(final String stringNullable) {
      this.stringNullable = stringNullable;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#stringRequired }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param stringRequired Required, non-nullable String field..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder stringRequired(final String stringRequired) {
      this.stringRequired = stringRequired;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#stringRequiredNullable }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param stringRequiredNullable Required, nullable String field..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder stringRequiredNullable(final String stringRequiredNullable) {
      this.stringRequiredNullable = stringRequiredNullable;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#stringRequiredPattern }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param stringRequiredPattern Required, non-nullable String field with a RegEx-pattern..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder stringRequiredPattern(final String stringRequiredPattern) {
      this.stringRequiredPattern = stringRequiredPattern;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#stringEmailFormat }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param stringEmailFormat Non-required, non-nullable String field with Email format..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder stringEmailFormat(final String stringEmailFormat) {
      this.stringEmailFormat = stringEmailFormat;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#stringUuidFormat }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param stringUuidFormat Non-required, non-nullable UUID field..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder stringUuidFormat(final UUID stringUuidFormat) {
      this.stringUuidFormat = stringUuidFormat;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#stringMinLength }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param stringMinLength Non-required, non-nullable String field with minLength: 3..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder stringMinLength(final String stringMinLength) {
      this.stringMinLength = stringMinLength;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#stringMaxLength }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param stringMaxLength Non-required, non-nullable String field with maxLength: 7..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder stringMaxLength(final String stringMaxLength) {
      this.stringMaxLength = stringMaxLength;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#stringMinAndMaxLength }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param stringMinAndMaxLength Non-required, non-nullable String with minLength: 3 and maxLength: 7..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder stringMinAndMaxLength(final String stringMinAndMaxLength) {
      this.stringMinAndMaxLength = stringMinAndMaxLength;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#arrayNullable }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param arrayNullable Non-required, nullable List..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder arrayNullable(final List<String> arrayNullable) {
      this.arrayNullable = arrayNullable;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#arrayRequiredNullable }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param arrayRequiredNullable Required, nullable List..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder arrayRequiredNullable(final List<String> arrayRequiredNullable) {
      this.arrayRequiredNullable = arrayRequiredNullable;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#arrayMinItems }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param arrayMinItems Non-required, non-nullable List with minItems: 1..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder arrayMinItems(final List<String> arrayMinItems) {
      this.arrayMinItems = arrayMinItems;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#arrayMaxItems }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param arrayMaxItems Non-required, non-nullable List with maxItems: 10..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder arrayMaxItems(final List<String> arrayMaxItems) {
      this.arrayMaxItems = arrayMaxItems;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#arrayMinAndMaxItems }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param arrayMinAndMaxItems Non-required, non-nullable List with minItems: 1 and maxItems: 10..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder arrayMinAndMaxItems(final List<String> arrayMinAndMaxItems) {
      this.arrayMinAndMaxItems = arrayMinAndMaxItems;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#arrayUniqueStandard }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param arrayUniqueStandard Non-required, non-nullable Set..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder arrayUniqueStandard(final Set<String> arrayUniqueStandard) {
      this.arrayUniqueStandard = arrayUniqueStandard;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#arrayUniqueRequired }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param arrayUniqueRequired Required, non-nullable Set..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder arrayUniqueRequired(final Set<String> arrayUniqueRequired) {
      this.arrayUniqueRequired = arrayUniqueRequired;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#arrayUniqueNullable }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param arrayUniqueNullable Non-required, nullable Set..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder arrayUniqueNullable(final Set<String> arrayUniqueNullable) {
      this.arrayUniqueNullable = arrayUniqueNullable;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#arrayUniqueRequiredNullable }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param arrayUniqueRequiredNullable Required, nullable Set..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder arrayUniqueRequiredNullable(final Set<String> arrayUniqueRequiredNullable) {
      this.arrayUniqueRequiredNullable = arrayUniqueRequiredNullable;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#intMinimum }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param intMinimum Non-required, non-nullable Integer with minimum: 18..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder intMinimum(final Integer intMinimum) {
      this.intMinimum = intMinimum;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#intMaximum }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param intMaximum Non-required, non-nullable Integer with maximum: 100..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder intMaximum(final Integer intMaximum) {
      this.intMaximum = intMaximum;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#intMinimumAndMaximum }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param intMinimumAndMaximum Non-required, non-nullable Integer with minimum: 0 and maximum: 100..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder intMinimumAndMaximum(final Integer intMinimumAndMaximum) {
      this.intMinimumAndMaximum = intMinimumAndMaximum;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#longMinimum }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param longMinimum Non-required, non-nullable Long with minimum: 18..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder longMinimum(final Long longMinimum) {
      this.longMinimum = longMinimum;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#longMaximum }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param longMaximum Non-required, non-nullable Long with maximum: 100..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder longMaximum(final Long longMaximum) {
      this.longMaximum = longMaximum;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#longMinimumAndMaximum }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param longMinimumAndMaximum Non-required, non-nullable Long with minimum: 0 and maximum: 100..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder longMinimumAndMaximum(final Long longMinimumAndMaximum) {
      this.longMinimumAndMaximum = longMinimumAndMaximum;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#bigDecimalMinimum }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param bigDecimalMinimum Non-required, non-nullable BigDecimal with minimum: 0..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder bigDecimalMinimum(final BigDecimal bigDecimalMinimum) {
      this.bigDecimalMinimum = bigDecimalMinimum;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#bigDecimalMaximum }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param bigDecimalMaximum Non-required, non-nullable BigDecimal with maximum: 100..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder bigDecimalMaximum(final BigDecimal bigDecimalMaximum) {
      this.bigDecimalMaximum = bigDecimalMaximum;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#bigDecimalMinimumAndMaximum }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param bigDecimalMinimumAndMaximum Non-required, non-nullable BigDecimal with minimum: 0 and maximum: 100..
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder bigDecimalMinimumAndMaximum(final BigDecimal bigDecimalMinimumAndMaximum) {
      this.bigDecimalMinimumAndMaximum = bigDecimalMinimumAndMaximum;
      return this;
    }

    /**
     * Builds a {@link RecordWithAllConstraints }-instance with the values provided in preceding
     * builder methods.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @return a new {@link RecordWithAllConstraints }-instance.
     */
    public RecordWithAllConstraints build() {
      return new RecordWithAllConstraints(
          booleanStandard,
          booleanDefault,
          booleanNullable,
          booleanRequired,
          booleanRequiredDefault,
          booleanRequiredNullable,
          stringStandard,
          stringDefault,
          stringNullable,
          stringRequired,
          stringRequiredNullable,
          stringRequiredPattern,
          stringEmailFormat,
          stringUuidFormat,
          stringMinLength,
          stringMaxLength,
          stringMinAndMaxLength,
          arrayNullable,
          arrayRequiredNullable,
          arrayMinItems,
          arrayMaxItems,
          arrayMinAndMaxItems,
          arrayUniqueStandard,
          arrayUniqueRequired,
          arrayUniqueNullable,
          arrayUniqueRequiredNullable,
          intMinimum,
          intMaximum,
          intMinimumAndMaximum,
          longMinimum,
          longMaximum,
          longMinimumAndMaximum,
          bigDecimalMinimum,
          bigDecimalMaximum,
          bigDecimalMinimumAndMaximum);
    }
  }

  /** Creates a new {@link Builder}-instance. */
  public static RecordWithAllConstraints.Builder builder() {
    return new RecordWithAllConstraints.Builder();
  }
}
