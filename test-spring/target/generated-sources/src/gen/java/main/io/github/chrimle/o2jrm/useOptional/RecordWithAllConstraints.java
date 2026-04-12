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
 */

@Schema(name = "RecordWithAllConstraints", description = "Example of a Record which has fields with constraints")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-12T22:13:42.341544900+02:00[Europe/Stockholm]", comments = "Generator version: 7.21.0")
public class RecordWithAllConstraints {

  private Optional<String> stringStandard = Optional.empty();

  private Optional<String> stringDefault = Optional.of("someDefaultValue");

  private JsonNullable<String> stringNullable = JsonNullable.<String>undefined();

  private String stringRequired;

  private JsonNullable<String> stringRequiredNullable = JsonNullable.<String>undefined();

  private String stringRequiredPattern;

  private Optional<@jakarta.validation.constraints.Email String> stringEmailFormat = Optional.empty();

  private Optional<UUID> stringUuidFormat = Optional.empty();

  private Optional<@Size(min = 3) String> stringMinLength = Optional.empty();

  private Optional<@Size(max = 7) String> stringMaxLength = Optional.empty();

  private Optional<@Size(min = 3, max = 7) String> stringMinAndMaxLength = Optional.empty();

  @Valid
  private List<String> arrayMinItems = new ArrayList<>();

  @Valid
  private List<String> arrayMaxItems = new ArrayList<>();

  @Valid
  private List<String> arrayMinAndMaxItems = new ArrayList<>();

  private Optional<@Min(value = 18) Integer> intMinimum = Optional.empty();

  private Optional<@Max(value = 100) Integer> intMaximum = Optional.empty();

  private Optional<@Min(value = 0) @Max(value = 100) Integer> intMinimumAndMaximum = Optional.empty();

  private Optional<@Min(value = 18L) Long> longMinimum = Optional.empty();

  private Optional<@Max(value = 100L) Long> longMaximum = Optional.empty();

  private Optional<@Min(value = 0L) @Max(value = 100L) Long> longMinimumAndMaximum = Optional.empty();

  private Optional<@DecimalMin(value = "0") BigDecimal> bigDecimalMinimum = Optional.empty();

  private Optional<@DecimalMax(value = "100") BigDecimal> bigDecimalMaximum = Optional.empty();

  private Optional<@DecimalMin(value = "0") @DecimalMax(value = "100") BigDecimal> bigDecimalMinimumAndMaximum = Optional.empty();

  public RecordWithAllConstraints() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RecordWithAllConstraints(String stringRequired, String stringRequiredNullable, String stringRequiredPattern) {
    this.stringRequired = stringRequired;
    this.stringRequiredNullable = JsonNullable.of(stringRequiredNullable);
    this.stringRequiredPattern = stringRequiredPattern;
  }

  public RecordWithAllConstraints stringStandard(String stringStandard) {
    this.stringStandard = Optional.ofNullable(stringStandard);
    return this;
  }

  /**
   * Get stringStandard
   * @return stringStandard
   */
  
  @Schema(name = "stringStandard", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stringStandard")
  public Optional<String> getStringStandard() {
    return stringStandard;
  }

  @JsonProperty("stringStandard")
  public void setStringStandard(Optional<String> stringStandard) {
    this.stringStandard = stringStandard;
  }

  public RecordWithAllConstraints stringDefault(String stringDefault) {
    this.stringDefault = Optional.ofNullable(stringDefault);
    return this;
  }

  /**
   * Get stringDefault
   * @return stringDefault
   */
  
  @Schema(name = "stringDefault", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stringDefault")
  public Optional<String> getStringDefault() {
    return stringDefault;
  }

  @JsonProperty("stringDefault")
  public void setStringDefault(Optional<String> stringDefault) {
    this.stringDefault = stringDefault;
  }

  public RecordWithAllConstraints stringNullable(String stringNullable) {
    this.stringNullable = JsonNullable.of(stringNullable);
    return this;
  }

  /**
   * Get stringNullable
   * @return stringNullable
   */
  
  @Schema(name = "stringNullable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stringNullable")
  public JsonNullable<String> getStringNullable() {
    return stringNullable;
  }

  public void setStringNullable(JsonNullable<String> stringNullable) {
    this.stringNullable = stringNullable;
  }

  public RecordWithAllConstraints stringRequired(String stringRequired) {
    this.stringRequired = stringRequired;
    return this;
  }

  /**
   * Get stringRequired
   * @return stringRequired
   */
  @NotNull 
  @Schema(name = "stringRequired", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stringRequired")
  public String getStringRequired() {
    return stringRequired;
  }

  @JsonProperty("stringRequired")
  public void setStringRequired(String stringRequired) {
    this.stringRequired = stringRequired;
  }

  public RecordWithAllConstraints stringRequiredNullable(String stringRequiredNullable) {
    this.stringRequiredNullable = JsonNullable.of(stringRequiredNullable);
    return this;
  }

  /**
   * Get stringRequiredNullable
   * @return stringRequiredNullable
   */
  @NotNull 
  @Schema(name = "stringRequiredNullable", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stringRequiredNullable")
  public JsonNullable<String> getStringRequiredNullable() {
    return stringRequiredNullable;
  }

  @JsonProperty("stringRequiredNullable")
  public void setStringRequiredNullable(JsonNullable<String> stringRequiredNullable) {
    this.stringRequiredNullable = stringRequiredNullable;
  }

  public RecordWithAllConstraints stringRequiredPattern(String stringRequiredPattern) {
    this.stringRequiredPattern = stringRequiredPattern;
    return this;
  }

  /**
   * Get stringRequiredPattern
   * @return stringRequiredPattern
   */
  @NotNull @Pattern(regexp = "^\\d{3}-\\d{2}-\\d{4}$") 
  @Schema(name = "stringRequiredPattern", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stringRequiredPattern")
  public String getStringRequiredPattern() {
    return stringRequiredPattern;
  }

  @JsonProperty("stringRequiredPattern")
  public void setStringRequiredPattern(String stringRequiredPattern) {
    this.stringRequiredPattern = stringRequiredPattern;
  }

  public RecordWithAllConstraints stringEmailFormat(String stringEmailFormat) {
    this.stringEmailFormat = Optional.ofNullable(stringEmailFormat);
    return this;
  }

  /**
   * Get stringEmailFormat
   * @return stringEmailFormat
   */
  
  @Schema(name = "stringEmailFormat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stringEmailFormat")
  public Optional<@jakarta.validation.constraints.Email String> getStringEmailFormat() {
    return stringEmailFormat;
  }

  @JsonProperty("stringEmailFormat")
  public void setStringEmailFormat(Optional<String> stringEmailFormat) {
    this.stringEmailFormat = stringEmailFormat;
  }

  public RecordWithAllConstraints stringUuidFormat(UUID stringUuidFormat) {
    this.stringUuidFormat = Optional.ofNullable(stringUuidFormat);
    return this;
  }

  /**
   * Get stringUuidFormat
   * @return stringUuidFormat
   */
  @Valid 
  @Schema(name = "stringUuidFormat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stringUuidFormat")
  public Optional<UUID> getStringUuidFormat() {
    return stringUuidFormat;
  }

  @JsonProperty("stringUuidFormat")
  public void setStringUuidFormat(Optional<UUID> stringUuidFormat) {
    this.stringUuidFormat = stringUuidFormat;
  }

  public RecordWithAllConstraints stringMinLength(String stringMinLength) {
    this.stringMinLength = Optional.ofNullable(stringMinLength);
    return this;
  }

  /**
   * Get stringMinLength
   * @return stringMinLength
   */
  
  @Schema(name = "stringMinLength", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stringMinLength")
  public Optional<@Size(min = 3) String> getStringMinLength() {
    return stringMinLength;
  }

  @JsonProperty("stringMinLength")
  public void setStringMinLength(Optional<String> stringMinLength) {
    this.stringMinLength = stringMinLength;
  }

  public RecordWithAllConstraints stringMaxLength(String stringMaxLength) {
    this.stringMaxLength = Optional.ofNullable(stringMaxLength);
    return this;
  }

  /**
   * Get stringMaxLength
   * @return stringMaxLength
   */
  
  @Schema(name = "stringMaxLength", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stringMaxLength")
  public Optional<@Size(max = 7) String> getStringMaxLength() {
    return stringMaxLength;
  }

  @JsonProperty("stringMaxLength")
  public void setStringMaxLength(Optional<String> stringMaxLength) {
    this.stringMaxLength = stringMaxLength;
  }

  public RecordWithAllConstraints stringMinAndMaxLength(String stringMinAndMaxLength) {
    this.stringMinAndMaxLength = Optional.ofNullable(stringMinAndMaxLength);
    return this;
  }

  /**
   * Get stringMinAndMaxLength
   * @return stringMinAndMaxLength
   */
  
  @Schema(name = "stringMinAndMaxLength", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stringMinAndMaxLength")
  public Optional<@Size(min = 3, max = 7) String> getStringMinAndMaxLength() {
    return stringMinAndMaxLength;
  }

  @JsonProperty("stringMinAndMaxLength")
  public void setStringMinAndMaxLength(Optional<String> stringMinAndMaxLength) {
    this.stringMinAndMaxLength = stringMinAndMaxLength;
  }

  public RecordWithAllConstraints arrayMinItems(List<String> arrayMinItems) {
    this.arrayMinItems = arrayMinItems;
    return this;
  }

  public RecordWithAllConstraints addArrayMinItemsItem(String arrayMinItemsItem) {
    if (this.arrayMinItems == null) {
      this.arrayMinItems = new ArrayList<>();
    }
    this.arrayMinItems.add(arrayMinItemsItem);
    return this;
  }

  /**
   * Get arrayMinItems
   * @return arrayMinItems
   */
  @Size(min = 1) 
  @Schema(name = "arrayMinItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("arrayMinItems")
  public List<String> getArrayMinItems() {
    return arrayMinItems;
  }

  @JsonProperty("arrayMinItems")
  public void setArrayMinItems(List<String> arrayMinItems) {
    this.arrayMinItems = arrayMinItems;
  }

  public RecordWithAllConstraints arrayMaxItems(List<String> arrayMaxItems) {
    this.arrayMaxItems = arrayMaxItems;
    return this;
  }

  public RecordWithAllConstraints addArrayMaxItemsItem(String arrayMaxItemsItem) {
    if (this.arrayMaxItems == null) {
      this.arrayMaxItems = new ArrayList<>();
    }
    this.arrayMaxItems.add(arrayMaxItemsItem);
    return this;
  }

  /**
   * Get arrayMaxItems
   * @return arrayMaxItems
   */
  @Size(max = 10) 
  @Schema(name = "arrayMaxItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("arrayMaxItems")
  public List<String> getArrayMaxItems() {
    return arrayMaxItems;
  }

  @JsonProperty("arrayMaxItems")
  public void setArrayMaxItems(List<String> arrayMaxItems) {
    this.arrayMaxItems = arrayMaxItems;
  }

  public RecordWithAllConstraints arrayMinAndMaxItems(List<String> arrayMinAndMaxItems) {
    this.arrayMinAndMaxItems = arrayMinAndMaxItems;
    return this;
  }

  public RecordWithAllConstraints addArrayMinAndMaxItemsItem(String arrayMinAndMaxItemsItem) {
    if (this.arrayMinAndMaxItems == null) {
      this.arrayMinAndMaxItems = new ArrayList<>();
    }
    this.arrayMinAndMaxItems.add(arrayMinAndMaxItemsItem);
    return this;
  }

  /**
   * Get arrayMinAndMaxItems
   * @return arrayMinAndMaxItems
   */
  @Size(min = 1, max = 10) 
  @Schema(name = "arrayMinAndMaxItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("arrayMinAndMaxItems")
  public List<String> getArrayMinAndMaxItems() {
    return arrayMinAndMaxItems;
  }

  @JsonProperty("arrayMinAndMaxItems")
  public void setArrayMinAndMaxItems(List<String> arrayMinAndMaxItems) {
    this.arrayMinAndMaxItems = arrayMinAndMaxItems;
  }

  public RecordWithAllConstraints intMinimum(Integer intMinimum) {
    this.intMinimum = Optional.ofNullable(intMinimum);
    return this;
  }

  /**
   * Get intMinimum
   * minimum: 18
   * @return intMinimum
   */
  
  @Schema(name = "intMinimum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("intMinimum")
  public Optional<@Min(value = 18) Integer> getIntMinimum() {
    return intMinimum;
  }

  @JsonProperty("intMinimum")
  public void setIntMinimum(Optional<Integer> intMinimum) {
    this.intMinimum = intMinimum;
  }

  public RecordWithAllConstraints intMaximum(Integer intMaximum) {
    this.intMaximum = Optional.ofNullable(intMaximum);
    return this;
  }

  /**
   * Get intMaximum
   * maximum: 100
   * @return intMaximum
   */
  
  @Schema(name = "intMaximum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("intMaximum")
  public Optional<@Max(value = 100) Integer> getIntMaximum() {
    return intMaximum;
  }

  @JsonProperty("intMaximum")
  public void setIntMaximum(Optional<Integer> intMaximum) {
    this.intMaximum = intMaximum;
  }

  public RecordWithAllConstraints intMinimumAndMaximum(Integer intMinimumAndMaximum) {
    this.intMinimumAndMaximum = Optional.ofNullable(intMinimumAndMaximum);
    return this;
  }

  /**
   * Get intMinimumAndMaximum
   * minimum: 0
   * maximum: 100
   * @return intMinimumAndMaximum
   */
  
  @Schema(name = "intMinimumAndMaximum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("intMinimumAndMaximum")
  public Optional<@Min(value = 0) @Max(value = 100) Integer> getIntMinimumAndMaximum() {
    return intMinimumAndMaximum;
  }

  @JsonProperty("intMinimumAndMaximum")
  public void setIntMinimumAndMaximum(Optional<Integer> intMinimumAndMaximum) {
    this.intMinimumAndMaximum = intMinimumAndMaximum;
  }

  public RecordWithAllConstraints longMinimum(Long longMinimum) {
    this.longMinimum = Optional.ofNullable(longMinimum);
    return this;
  }

  /**
   * Get longMinimum
   * minimum: 18
   * @return longMinimum
   */
  
  @Schema(name = "longMinimum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longMinimum")
  public Optional<@Min(value = 18L) Long> getLongMinimum() {
    return longMinimum;
  }

  @JsonProperty("longMinimum")
  public void setLongMinimum(Optional<Long> longMinimum) {
    this.longMinimum = longMinimum;
  }

  public RecordWithAllConstraints longMaximum(Long longMaximum) {
    this.longMaximum = Optional.ofNullable(longMaximum);
    return this;
  }

  /**
   * Get longMaximum
   * maximum: 100
   * @return longMaximum
   */
  
  @Schema(name = "longMaximum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longMaximum")
  public Optional<@Max(value = 100L) Long> getLongMaximum() {
    return longMaximum;
  }

  @JsonProperty("longMaximum")
  public void setLongMaximum(Optional<Long> longMaximum) {
    this.longMaximum = longMaximum;
  }

  public RecordWithAllConstraints longMinimumAndMaximum(Long longMinimumAndMaximum) {
    this.longMinimumAndMaximum = Optional.ofNullable(longMinimumAndMaximum);
    return this;
  }

  /**
   * Get longMinimumAndMaximum
   * minimum: 0
   * maximum: 100
   * @return longMinimumAndMaximum
   */
  
  @Schema(name = "longMinimumAndMaximum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longMinimumAndMaximum")
  public Optional<@Min(value = 0L) @Max(value = 100L) Long> getLongMinimumAndMaximum() {
    return longMinimumAndMaximum;
  }

  @JsonProperty("longMinimumAndMaximum")
  public void setLongMinimumAndMaximum(Optional<Long> longMinimumAndMaximum) {
    this.longMinimumAndMaximum = longMinimumAndMaximum;
  }

  public RecordWithAllConstraints bigDecimalMinimum(BigDecimal bigDecimalMinimum) {
    this.bigDecimalMinimum = Optional.ofNullable(bigDecimalMinimum);
    return this;
  }

  /**
   * Get bigDecimalMinimum
   * minimum: 0
   * @return bigDecimalMinimum
   */
  @Valid 
  @Schema(name = "bigDecimalMinimum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bigDecimalMinimum")
  public Optional<@DecimalMin(value = "0") BigDecimal> getBigDecimalMinimum() {
    return bigDecimalMinimum;
  }

  @JsonProperty("bigDecimalMinimum")
  public void setBigDecimalMinimum(Optional<BigDecimal> bigDecimalMinimum) {
    this.bigDecimalMinimum = bigDecimalMinimum;
  }

  public RecordWithAllConstraints bigDecimalMaximum(BigDecimal bigDecimalMaximum) {
    this.bigDecimalMaximum = Optional.ofNullable(bigDecimalMaximum);
    return this;
  }

  /**
   * Get bigDecimalMaximum
   * maximum: 100
   * @return bigDecimalMaximum
   */
  @Valid 
  @Schema(name = "bigDecimalMaximum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bigDecimalMaximum")
  public Optional<@DecimalMax(value = "100") BigDecimal> getBigDecimalMaximum() {
    return bigDecimalMaximum;
  }

  @JsonProperty("bigDecimalMaximum")
  public void setBigDecimalMaximum(Optional<BigDecimal> bigDecimalMaximum) {
    this.bigDecimalMaximum = bigDecimalMaximum;
  }

  public RecordWithAllConstraints bigDecimalMinimumAndMaximum(BigDecimal bigDecimalMinimumAndMaximum) {
    this.bigDecimalMinimumAndMaximum = Optional.ofNullable(bigDecimalMinimumAndMaximum);
    return this;
  }

  /**
   * Get bigDecimalMinimumAndMaximum
   * minimum: 0
   * maximum: 100
   * @return bigDecimalMinimumAndMaximum
   */
  @Valid 
  @Schema(name = "bigDecimalMinimumAndMaximum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bigDecimalMinimumAndMaximum")
  public Optional<@DecimalMin(value = "0") @DecimalMax(value = "100") BigDecimal> getBigDecimalMinimumAndMaximum() {
    return bigDecimalMinimumAndMaximum;
  }

  @JsonProperty("bigDecimalMinimumAndMaximum")
  public void setBigDecimalMinimumAndMaximum(Optional<BigDecimal> bigDecimalMinimumAndMaximum) {
    this.bigDecimalMinimumAndMaximum = bigDecimalMinimumAndMaximum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordWithAllConstraints recordWithAllConstraints = (RecordWithAllConstraints) o;
    return Objects.equals(this.stringStandard, recordWithAllConstraints.stringStandard) &&
        Objects.equals(this.stringDefault, recordWithAllConstraints.stringDefault) &&
        equalsNullable(this.stringNullable, recordWithAllConstraints.stringNullable) &&
        Objects.equals(this.stringRequired, recordWithAllConstraints.stringRequired) &&
        Objects.equals(this.stringRequiredNullable, recordWithAllConstraints.stringRequiredNullable) &&
        Objects.equals(this.stringRequiredPattern, recordWithAllConstraints.stringRequiredPattern) &&
        Objects.equals(this.stringEmailFormat, recordWithAllConstraints.stringEmailFormat) &&
        Objects.equals(this.stringUuidFormat, recordWithAllConstraints.stringUuidFormat) &&
        Objects.equals(this.stringMinLength, recordWithAllConstraints.stringMinLength) &&
        Objects.equals(this.stringMaxLength, recordWithAllConstraints.stringMaxLength) &&
        Objects.equals(this.stringMinAndMaxLength, recordWithAllConstraints.stringMinAndMaxLength) &&
        Objects.equals(this.arrayMinItems, recordWithAllConstraints.arrayMinItems) &&
        Objects.equals(this.arrayMaxItems, recordWithAllConstraints.arrayMaxItems) &&
        Objects.equals(this.arrayMinAndMaxItems, recordWithAllConstraints.arrayMinAndMaxItems) &&
        Objects.equals(this.intMinimum, recordWithAllConstraints.intMinimum) &&
        Objects.equals(this.intMaximum, recordWithAllConstraints.intMaximum) &&
        Objects.equals(this.intMinimumAndMaximum, recordWithAllConstraints.intMinimumAndMaximum) &&
        Objects.equals(this.longMinimum, recordWithAllConstraints.longMinimum) &&
        Objects.equals(this.longMaximum, recordWithAllConstraints.longMaximum) &&
        Objects.equals(this.longMinimumAndMaximum, recordWithAllConstraints.longMinimumAndMaximum) &&
        Objects.equals(this.bigDecimalMinimum, recordWithAllConstraints.bigDecimalMinimum) &&
        Objects.equals(this.bigDecimalMaximum, recordWithAllConstraints.bigDecimalMaximum) &&
        Objects.equals(this.bigDecimalMinimumAndMaximum, recordWithAllConstraints.bigDecimalMinimumAndMaximum);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringStandard, stringDefault, hashCodeNullable(stringNullable), stringRequired, stringRequiredNullable, stringRequiredPattern, stringEmailFormat, stringUuidFormat, stringMinLength, stringMaxLength, stringMinAndMaxLength, arrayMinItems, arrayMaxItems, arrayMinAndMaxItems, intMinimum, intMaximum, intMinimumAndMaximum, longMinimum, longMaximum, longMinimumAndMaximum, bigDecimalMinimum, bigDecimalMaximum, bigDecimalMinimumAndMaximum);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordWithAllConstraints {\n");
    sb.append("    stringStandard: ").append(toIndentedString(stringStandard)).append("\n");
    sb.append("    stringDefault: ").append(toIndentedString(stringDefault)).append("\n");
    sb.append("    stringNullable: ").append(toIndentedString(stringNullable)).append("\n");
    sb.append("    stringRequired: ").append(toIndentedString(stringRequired)).append("\n");
    sb.append("    stringRequiredNullable: ").append(toIndentedString(stringRequiredNullable)).append("\n");
    sb.append("    stringRequiredPattern: ").append(toIndentedString(stringRequiredPattern)).append("\n");
    sb.append("    stringEmailFormat: ").append(toIndentedString(stringEmailFormat)).append("\n");
    sb.append("    stringUuidFormat: ").append(toIndentedString(stringUuidFormat)).append("\n");
    sb.append("    stringMinLength: ").append(toIndentedString(stringMinLength)).append("\n");
    sb.append("    stringMaxLength: ").append(toIndentedString(stringMaxLength)).append("\n");
    sb.append("    stringMinAndMaxLength: ").append(toIndentedString(stringMinAndMaxLength)).append("\n");
    sb.append("    arrayMinItems: ").append(toIndentedString(arrayMinItems)).append("\n");
    sb.append("    arrayMaxItems: ").append(toIndentedString(arrayMaxItems)).append("\n");
    sb.append("    arrayMinAndMaxItems: ").append(toIndentedString(arrayMinAndMaxItems)).append("\n");
    sb.append("    intMinimum: ").append(toIndentedString(intMinimum)).append("\n");
    sb.append("    intMaximum: ").append(toIndentedString(intMaximum)).append("\n");
    sb.append("    intMinimumAndMaximum: ").append(toIndentedString(intMinimumAndMaximum)).append("\n");
    sb.append("    longMinimum: ").append(toIndentedString(longMinimum)).append("\n");
    sb.append("    longMaximum: ").append(toIndentedString(longMaximum)).append("\n");
    sb.append("    longMinimumAndMaximum: ").append(toIndentedString(longMinimumAndMaximum)).append("\n");
    sb.append("    bigDecimalMinimum: ").append(toIndentedString(bigDecimalMinimum)).append("\n");
    sb.append("    bigDecimalMaximum: ").append(toIndentedString(bigDecimalMaximum)).append("\n");
    sb.append("    bigDecimalMinimumAndMaximum: ").append(toIndentedString(bigDecimalMinimumAndMaximum)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

