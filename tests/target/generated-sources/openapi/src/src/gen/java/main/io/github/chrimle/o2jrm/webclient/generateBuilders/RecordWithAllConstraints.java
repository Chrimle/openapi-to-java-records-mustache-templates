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
 * Generated with Version: 2.9.5
 *
 */

package io.github.chrimle.o2jrm.webclient.generateBuilders;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

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
    @javax.annotation.Nonnull String stringStandard,
    @javax.annotation.Nonnull String stringDefault,
    @javax.annotation.Nullable String stringNullable,
    @javax.annotation.Nonnull String stringRequired,
    @javax.annotation.Nullable String stringRequiredNullable,
    @javax.annotation.Nonnull String stringRequiredPattern,
    @javax.annotation.Nonnull String stringEmailFormat,
    @javax.annotation.Nonnull UUID stringUuidFormat,
    @javax.annotation.Nonnull String stringMinLength,
    @javax.annotation.Nonnull String stringMaxLength,
    @javax.annotation.Nonnull String stringMinAndMaxLength,
    @javax.annotation.Nonnull List<String> arrayMinItems,
    @javax.annotation.Nonnull List<String> arrayMaxItems,
    @javax.annotation.Nonnull List<String> arrayMinAndMaxItems,
    @javax.annotation.Nonnull Integer intMinimum,
    @javax.annotation.Nonnull Integer intMaximum,
    @javax.annotation.Nonnull Integer intMinimumAndMaximum,
    @javax.annotation.Nonnull Long longMinimum,
    @javax.annotation.Nonnull Long longMaximum,
    @javax.annotation.Nonnull Long longMinimumAndMaximum,
    @javax.annotation.Nonnull BigDecimal bigDecimalMinimum,
    @javax.annotation.Nonnull BigDecimal bigDecimalMaximum,
    @javax.annotation.Nonnull BigDecimal bigDecimalMinimumAndMaximum) {

  public RecordWithAllConstraints(
      @javax.annotation.Nonnull final String stringStandard,
      @javax.annotation.Nullable final String stringDefault,
      @javax.annotation.Nullable final String stringNullable,
      @javax.annotation.Nonnull final String stringRequired,
      @javax.annotation.Nullable final String stringRequiredNullable,
      @javax.annotation.Nonnull final String stringRequiredPattern,
      @javax.annotation.Nonnull final String stringEmailFormat,
      @javax.annotation.Nonnull final UUID stringUuidFormat,
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
    this.stringEmailFormat = stringEmailFormat;
    this.stringUuidFormat = stringUuidFormat;
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

  /** Builder class for {@link RecordWithAllConstraints }. */
  public static class Builder {

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
    private List<String> arrayMinItems;
    private List<String> arrayMaxItems;
    private List<String> arrayMinAndMaxItems;
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
     * Sets the value of {@link RecordWithAllConstraints#stringStandard }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param stringStandard sets the value of stringStandard.
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
     * @param stringDefault sets the value of stringDefault.
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
     * @param stringNullable sets the value of stringNullable.
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
     * @param stringRequired sets the value of stringRequired.
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
     * @param stringRequiredNullable sets the value of stringRequiredNullable.
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
     * @param stringRequiredPattern sets the value of stringRequiredPattern.
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
     * @param stringEmailFormat sets the value of stringEmailFormat.
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
     * @param stringUuidFormat sets the value of stringUuidFormat.
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
     * @param stringMinLength sets the value of stringMinLength.
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
     * @param stringMaxLength sets the value of stringMaxLength.
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
     * @param stringMinAndMaxLength sets the value of stringMinAndMaxLength.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder stringMinAndMaxLength(final String stringMinAndMaxLength) {
      this.stringMinAndMaxLength = stringMinAndMaxLength;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#arrayMinItems }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param arrayMinItems sets the value of arrayMinItems.
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
     * @param arrayMaxItems sets the value of arrayMaxItems.
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
     * @param arrayMinAndMaxItems sets the value of arrayMinAndMaxItems.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder arrayMinAndMaxItems(final List<String> arrayMinAndMaxItems) {
      this.arrayMinAndMaxItems = arrayMinAndMaxItems;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithAllConstraints#intMinimum }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param intMinimum sets the value of intMinimum.
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
     * @param intMaximum sets the value of intMaximum.
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
     * @param intMinimumAndMaximum sets the value of intMinimumAndMaximum.
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
     * @param longMinimum sets the value of longMinimum.
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
     * @param longMaximum sets the value of longMaximum.
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
     * @param longMinimumAndMaximum sets the value of longMinimumAndMaximum.
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
     * @param bigDecimalMinimum sets the value of bigDecimalMinimum.
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
     * @param bigDecimalMaximum sets the value of bigDecimalMaximum.
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
     * @param bigDecimalMinimumAndMaximum sets the value of bigDecimalMinimumAndMaximum.
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
          arrayMinItems,
          arrayMaxItems,
          arrayMinAndMaxItems,
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
