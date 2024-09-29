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

package io.github.chrimle.example.generateBuilders;

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
    @javax.annotation.Nonnull String stringStandard,
    @javax.annotation.Nonnull String stringDefault,
    @javax.annotation.Nullable String stringNullable,
    @javax.annotation.Nonnull String stringRequired,
    @javax.annotation.Nullable String stringRequiredNullable,
    @javax.annotation.Nonnull String stringRequiredPattern) {

  public RecordWithAllConstraints(
      @javax.annotation.Nonnull final String stringStandard,
      @javax.annotation.Nullable final String stringDefault,
      @javax.annotation.Nullable final String stringNullable,
      @javax.annotation.Nonnull final String stringRequired,
      @javax.annotation.Nullable final String stringRequiredNullable,
      @javax.annotation.Nonnull final String stringRequiredPattern) { 
    this.stringStandard = stringStandard;
    this.stringDefault = Objects.requireNonNullElse(stringDefault, "someDefaultValue");
    this.stringNullable = stringNullable;
    this.stringRequired = stringRequired;
    this.stringRequiredNullable = stringRequiredNullable;
    this.stringRequiredPattern = stringRequiredPattern;
  }

  /** Builder class for {@link RecordWithAllConstraints } */
  public static class Builder {

    private String stringStandard;
    private String stringDefault;
    private String stringNullable;
    private String stringRequired;
    private String stringRequiredNullable;
    private String stringRequiredPattern;

    /**
     * Sets the value of {@link RecordWithAllConstraints#stringStandard }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     * @param stringStandard sets the value of stringStandard
     * @return this {@link Builder}-instance for method-chaining
     */
    public Builder stringStandard(final String stringStandard) {
      this.stringStandard = stringStandard;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#stringDefault }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     * @param stringDefault sets the value of stringDefault
     * @return this {@link Builder}-instance for method-chaining
     */
    public Builder stringDefault(final String stringDefault) {
      this.stringDefault = stringDefault;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#stringNullable }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     * @param stringNullable sets the value of stringNullable
     * @return this {@link Builder}-instance for method-chaining
     */
    public Builder stringNullable(final String stringNullable) {
      this.stringNullable = stringNullable;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#stringRequired }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     * @param stringRequired sets the value of stringRequired
     * @return this {@link Builder}-instance for method-chaining
     */
    public Builder stringRequired(final String stringRequired) {
      this.stringRequired = stringRequired;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#stringRequiredNullable }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     * @param stringRequiredNullable sets the value of stringRequiredNullable
     * @return this {@link Builder}-instance for method-chaining
     */
    public Builder stringRequiredNullable(final String stringRequiredNullable) {
      this.stringRequiredNullable = stringRequiredNullable;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#stringRequiredPattern }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     * @param stringRequiredPattern sets the value of stringRequiredPattern
     * @return this {@link Builder}-instance for method-chaining
     */
    public Builder stringRequiredPattern(final String stringRequiredPattern) {
      this.stringRequiredPattern = stringRequiredPattern;
      return this;
    }

    /**
     * Builds a {@link RecordWithAllConstraints }-instance with the values provided in preceding
     * builder methods.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     * @return a new {@link RecordWithAllConstraints }-instance
     */
    public RecordWithAllConstraints build() {
      return new RecordWithAllConstraints(
        stringStandard,
        stringDefault,
        stringNullable,
        stringRequired,
        stringRequiredNullable,
        stringRequiredPattern
      );
    }
  }

  /** Creates a {@link Builder}-instance. */
  public static RecordWithAllConstraints.Builder builder() {
    return new RecordWithAllConstraints.Builder();
  }
}
