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
 * Generated with Version: 1.7.6
 *
 */

package io.github.chrimle.example.standard;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Example of a Record which has fields with constraints
 * @param stringStandard String
 * @param stringDefault String
 * @param stringNullable String
 * @param stringRequired String
 * @param stringRequiredNullable String
 * @param stringRequiredPattern String
 * @param stringMinLength String
 * @param stringMaxLength String
 * @param stringMinAndMaxLength String
 */
public record RecordWithAllConstraints(
    @javax.annotation.Nonnull String stringStandard,
    @javax.annotation.Nonnull String stringDefault,
    @javax.annotation.Nullable String stringNullable,
    @javax.annotation.Nonnull String stringRequired,
    @javax.annotation.Nullable String stringRequiredNullable,
    @javax.annotation.Nonnull String stringRequiredPattern,
    @javax.annotation.Nonnull String stringMinLength,
    @javax.annotation.Nonnull String stringMaxLength,
    @javax.annotation.Nonnull String stringMinAndMaxLength) {

  public RecordWithAllConstraints(
      @javax.annotation.Nonnull final String stringStandard,
      @javax.annotation.Nullable final String stringDefault,
      @javax.annotation.Nullable final String stringNullable,
      @javax.annotation.Nonnull final String stringRequired,
      @javax.annotation.Nullable final String stringRequiredNullable,
      @javax.annotation.Nonnull final String stringRequiredPattern,
      @javax.annotation.Nonnull final String stringMinLength,
      @javax.annotation.Nonnull final String stringMaxLength,
      @javax.annotation.Nonnull final String stringMinAndMaxLength) { 
    this.stringStandard = stringStandard;
    this.stringDefault = Objects.requireNonNullElse(stringDefault, "someDefaultValue");
    this.stringNullable = stringNullable;
    this.stringRequired = stringRequired;
    this.stringRequiredNullable = stringRequiredNullable;
    this.stringRequiredPattern = stringRequiredPattern;
    this.stringMinLength = stringMinLength;
    this.stringMaxLength = stringMaxLength;
    this.stringMinAndMaxLength = stringMinAndMaxLength;
  }
}
