/*
 * Example OpenAPI Spec.
 * An example OpenAPI-spec to generate example Java records.
 *
 * The version of the OpenAPI document: 0.0.1
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 * This class was generated using custom mustache templates from
 * openapi-to-java-records-mustache-templates. For further information,
 * questions, requesting features or reporting issues, please visit:
 * https://github.com/Chrimle/openapi-to-java-records-mustache-templates.
 * Generated with Version: 2.1.0
 *
 */

package io.github.chrimle.example.useBeanValidation;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

/**
 * Example of a Record which has fields with constraints
 *
 * @param stringStandard String
 * @param stringDefault String
 * @param stringNullable String
 * @param stringRequired String
 * @param stringRequiredNullable String
 * @param stringRequiredPattern String
 * @param stringMinLength String
 * @param stringMaxLength String
 * @param stringMinAndMaxLength String
 * @param arrayMinItems List<String>
 * @param arrayMaxItems List<String>
 * @param arrayMinAndMaxItems List<String>
 * @param intMinimum Integer
 * @param intMaximum Integer
 * @param intMinimumAndMaximum Integer
 * @param longMinimum Long
 * @param longMaximum Long
 * @param longMinimumAndMaximum Long
 * @param bigDecimalMinimum BigDecimal
 * @param bigDecimalMaximum BigDecimal
 * @param bigDecimalMinimumAndMaximum BigDecimal
 */
public record RecordWithAllConstraints(
    @javax.annotation.Nonnull String stringStandard,
    @javax.annotation.Nonnull String stringDefault,
    @javax.annotation.Nullable String stringNullable,
    @javax.annotation.Nonnull @NotNull String stringRequired,
    @javax.annotation.Nullable String stringRequiredNullable,
    @javax.annotation.Nonnull @NotNull @Pattern(regexp = "^\\d{3}-\\d{2}-\\d{4}$") String stringRequiredPattern,
    @javax.annotation.Nonnull @Size(min = 3) String stringMinLength,
    @javax.annotation.Nonnull @Size(max = 7) String stringMaxLength,
    @javax.annotation.Nonnull @Size(min = 3, max = 7) String stringMinAndMaxLength,
    @javax.annotation.Nonnull @Size(min = 1) List<String> arrayMinItems,
    @javax.annotation.Nonnull @Size(max = 10) List<String> arrayMaxItems,
    @javax.annotation.Nonnull @Size(min = 1, max = 10) List<String> arrayMinAndMaxItems,
    @javax.annotation.Nonnull @Min(18) Integer intMinimum,
    @javax.annotation.Nonnull @Max(100) Integer intMaximum,
    @javax.annotation.Nonnull @Min(0) @Max(100) Integer intMinimumAndMaximum,
    @javax.annotation.Nonnull @Min(18L) Long longMinimum,
    @javax.annotation.Nonnull @Max(100L) Long longMaximum,
    @javax.annotation.Nonnull @Min(0L) @Max(100L) Long longMinimumAndMaximum,
    @javax.annotation.Nonnull @DecimalMin("0") BigDecimal bigDecimalMinimum,
    @javax.annotation.Nonnull @DecimalMax("100") BigDecimal bigDecimalMaximum,
    @javax.annotation.Nonnull @DecimalMin("0") @DecimalMax("100") BigDecimal bigDecimalMinimumAndMaximum) {

  public RecordWithAllConstraints(
      @javax.annotation.Nonnull final String stringStandard,
      @javax.annotation.Nullable final String stringDefault,
      @javax.annotation.Nullable final String stringNullable,
      @javax.annotation.Nonnull final String stringRequired,
      @javax.annotation.Nullable final String stringRequiredNullable,
      @javax.annotation.Nonnull final String stringRequiredPattern,
      @javax.annotation.Nonnull final String stringMinLength,
      @javax.annotation.Nonnull final String stringMaxLength,
      @javax.annotation.Nonnull final String stringMinAndMaxLength,
      @javax.annotation.Nullable final List<String> arrayMinItems,
      @javax.annotation.Nullable final List<String> arrayMaxItems,
      @javax.annotation.Nullable final List<String> arrayMinAndMaxItems,
      @javax.annotation.Nonnull final Integer intMinimum,
      @javax.annotation.Nonnull final Integer intMaximum,
      @javax.annotation.Nonnull final Integer intMinimumAndMaximum,
      @javax.annotation.Nonnull final Long longMinimum,
      @javax.annotation.Nonnull final Long longMaximum,
      @javax.annotation.Nonnull final Long longMinimumAndMaximum,
      @javax.annotation.Nonnull final BigDecimal bigDecimalMinimum,
      @javax.annotation.Nonnull final BigDecimal bigDecimalMaximum,
      @javax.annotation.Nonnull final BigDecimal bigDecimalMinimumAndMaximum) { 
    this.stringStandard = stringStandard;
    this.stringDefault = Objects.requireNonNullElse(stringDefault, "someDefaultValue");
    this.stringNullable = stringNullable;
    this.stringRequired = stringRequired;
    this.stringRequiredNullable = stringRequiredNullable;
    this.stringRequiredPattern = stringRequiredPattern;
    this.stringMinLength = stringMinLength;
    this.stringMaxLength = stringMaxLength;
    this.stringMinAndMaxLength = stringMinAndMaxLength;
    this.arrayMinItems = Objects.requireNonNullElse(arrayMinItems, new ArrayList<>());
    this.arrayMaxItems = Objects.requireNonNullElse(arrayMaxItems, new ArrayList<>());
    this.arrayMinAndMaxItems = Objects.requireNonNullElse(arrayMinAndMaxItems, new ArrayList<>());
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
}
