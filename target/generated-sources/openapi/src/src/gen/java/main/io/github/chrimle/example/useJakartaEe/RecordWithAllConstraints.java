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

package io.github.chrimle.example.useJakartaEe;

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
 */
public record RecordWithAllConstraints(
    @jakarta.annotation.Nonnull String stringStandard,
    @jakarta.annotation.Nonnull String stringDefault,
    @jakarta.annotation.Nullable String stringNullable,
    @jakarta.annotation.Nonnull String stringRequired,
    @jakarta.annotation.Nullable String stringRequiredNullable,
    @jakarta.annotation.Nonnull String stringRequiredPattern) {

  public RecordWithAllConstraints(
      @jakarta.annotation.Nonnull final String stringStandard,
      @jakarta.annotation.Nullable final String stringDefault,
      @jakarta.annotation.Nullable final String stringNullable,
      @jakarta.annotation.Nonnull final String stringRequired,
      @jakarta.annotation.Nullable final String stringRequiredNullable,
      @jakarta.annotation.Nonnull final String stringRequiredPattern) { 
    this.stringStandard = stringStandard;
    this.stringDefault = Objects.requireNonNullElse(stringDefault, "someDefaultValue");
    this.stringNullable = stringNullable;
    this.stringRequired = stringRequired;
    this.stringRequiredNullable = stringRequiredNullable;
    this.stringRequiredPattern = stringRequiredPattern;
  }
}