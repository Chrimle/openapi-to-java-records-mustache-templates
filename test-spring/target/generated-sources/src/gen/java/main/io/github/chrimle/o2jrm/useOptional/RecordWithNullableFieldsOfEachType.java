package io.github.chrimle.o2jrm.useOptional;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.chrimle.o2jrm.useOptional.ExampleNullableEnum;
import io.github.chrimle.o2jrm.useOptional.ExampleNullableRecord;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
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
 * Example of a Record with fields of each type
 */

@Schema(name = "RecordWithNullableFieldsOfEachType", description = "Example of a Record with fields of each type")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-12T22:13:42.341544900+02:00[Europe/Stockholm]", comments = "Generator version: 7.21.0")
public class RecordWithNullableFieldsOfEachType {

  private JsonNullable<Boolean> field1 = JsonNullable.<Boolean>undefined();

  private JsonNullable<String> field2 = JsonNullable.<String>undefined();

  private JsonNullable<Integer> field3 = JsonNullable.<Integer>undefined();

  private JsonNullable<BigDecimal> field4 = JsonNullable.<BigDecimal>undefined();

  @Valid
  private JsonNullable<List<Boolean>> field5 = JsonNullable.<List<Boolean>>undefined();

  @Valid
  private JsonNullable<Set<Boolean>> field6 = JsonNullable.<Set<Boolean>>undefined();

  private JsonNullable<ExampleNullableRecord> field7 = JsonNullable.<ExampleNullableRecord>undefined();

  private JsonNullable<ExampleNullableEnum> field8 = JsonNullable.<ExampleNullableEnum>undefined();

  public RecordWithNullableFieldsOfEachType() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RecordWithNullableFieldsOfEachType(Boolean field1, String field2, Integer field3, BigDecimal field4, List<Boolean> field5, Set<Boolean> field6) {
    this.field1 = JsonNullable.of(field1);
    this.field2 = JsonNullable.of(field2);
    this.field3 = JsonNullable.of(field3);
    this.field4 = JsonNullable.of(field4);
    this.field5 = JsonNullable.of(field5);
    this.field6 = JsonNullable.of(field6);
  }

  public RecordWithNullableFieldsOfEachType field1(Boolean field1) {
    this.field1 = JsonNullable.of(field1);
    return this;
  }

  /**
   * a Boolean field
   * @return field1
   */
  @NotNull 
  @Schema(name = "field1", description = "a Boolean field", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field1")
  public JsonNullable<Boolean> getField1() {
    return field1;
  }

  @JsonProperty("field1")
  public void setField1(JsonNullable<Boolean> field1) {
    this.field1 = field1;
  }

  public RecordWithNullableFieldsOfEachType field2(String field2) {
    this.field2 = JsonNullable.of(field2);
    return this;
  }

  /**
   * a String field
   * @return field2
   */
  @NotNull 
  @Schema(name = "field2", description = "a String field", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field2")
  public JsonNullable<String> getField2() {
    return field2;
  }

  @JsonProperty("field2")
  public void setField2(JsonNullable<String> field2) {
    this.field2 = field2;
  }

  public RecordWithNullableFieldsOfEachType field3(Integer field3) {
    this.field3 = JsonNullable.of(field3);
    return this;
  }

  /**
   * an Integer field
   * @return field3
   */
  @NotNull 
  @Schema(name = "field3", description = "an Integer field", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field3")
  public JsonNullable<Integer> getField3() {
    return field3;
  }

  @JsonProperty("field3")
  public void setField3(JsonNullable<Integer> field3) {
    this.field3 = field3;
  }

  public RecordWithNullableFieldsOfEachType field4(BigDecimal field4) {
    this.field4 = JsonNullable.of(field4);
    return this;
  }

  /**
   * a Number field
   * @return field4
   */
  @NotNull @Valid 
  @Schema(name = "field4", description = "a Number field", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field4")
  public JsonNullable<BigDecimal> getField4() {
    return field4;
  }

  @JsonProperty("field4")
  public void setField4(JsonNullable<BigDecimal> field4) {
    this.field4 = field4;
  }

  public RecordWithNullableFieldsOfEachType field5(List<Boolean> field5) {
    this.field5 = JsonNullable.of(field5);
    return this;
  }

  public RecordWithNullableFieldsOfEachType addField5Item(Boolean field5Item) {
    if (this.field5 == null || !this.field5.isPresent()) {
      this.field5 = JsonNullable.of(new ArrayList<>());
    }
    this.field5.get().add(field5Item);
    return this;
  }

  /**
   * an Array of Boolean field
   * @return field5
   */
  @NotNull 
  @Schema(name = "field5", description = "an Array of Boolean field", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field5")
  public JsonNullable<List<Boolean>> getField5() {
    return field5;
  }

  @JsonProperty("field5")
  public void setField5(JsonNullable<List<Boolean>> field5) {
    this.field5 = field5;
  }

  public RecordWithNullableFieldsOfEachType field6(Set<Boolean> field6) {
    this.field6 = JsonNullable.of(field6);
    return this;
  }

  public RecordWithNullableFieldsOfEachType addField6Item(Boolean field6Item) {
    if (this.field6 == null || !this.field6.isPresent()) {
      this.field6 = JsonNullable.of(new LinkedHashSet<>());
    }
    this.field6.get().add(field6Item);
    return this;
  }

  /**
   * a Set field
   * @return field6
   */
  @NotNull 
  @Schema(name = "field6", description = "a Set field", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field6")
  public JsonNullable<Set<Boolean>> getField6() {
    return field6;
  }

  @JsonProperty("field6")
  public void setField6(JsonNullable<Set<Boolean>> field6) {
    this.field6 = field6;
  }

  public RecordWithNullableFieldsOfEachType field7(ExampleNullableRecord field7) {
    this.field7 = JsonNullable.of(field7);
    return this;
  }

  /**
   * Get field7
   * @return field7
   */
  @Valid 
  @Schema(name = "field7", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("field7")
  public JsonNullable<ExampleNullableRecord> getField7() {
    return field7;
  }

  public void setField7(JsonNullable<ExampleNullableRecord> field7) {
    this.field7 = field7;
  }

  public RecordWithNullableFieldsOfEachType field8(ExampleNullableEnum field8) {
    this.field8 = JsonNullable.of(field8);
    return this;
  }

  /**
   * Get field8
   * @return field8
   */
  @Valid 
  @Schema(name = "field8", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("field8")
  public JsonNullable<ExampleNullableEnum> getField8() {
    return field8;
  }

  public void setField8(JsonNullable<ExampleNullableEnum> field8) {
    this.field8 = field8;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordWithNullableFieldsOfEachType recordWithNullableFieldsOfEachType = (RecordWithNullableFieldsOfEachType) o;
    return Objects.equals(this.field1, recordWithNullableFieldsOfEachType.field1) &&
        Objects.equals(this.field2, recordWithNullableFieldsOfEachType.field2) &&
        Objects.equals(this.field3, recordWithNullableFieldsOfEachType.field3) &&
        Objects.equals(this.field4, recordWithNullableFieldsOfEachType.field4) &&
        Objects.equals(this.field5, recordWithNullableFieldsOfEachType.field5) &&
        Objects.equals(this.field6, recordWithNullableFieldsOfEachType.field6) &&
        equalsNullable(this.field7, recordWithNullableFieldsOfEachType.field7) &&
        equalsNullable(this.field8, recordWithNullableFieldsOfEachType.field8);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(field1, field2, field3, field4, field5, field6, hashCodeNullable(field7), hashCodeNullable(field8));
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
    sb.append("class RecordWithNullableFieldsOfEachType {\n");
    sb.append("    field1: ").append(toIndentedString(field1)).append("\n");
    sb.append("    field2: ").append(toIndentedString(field2)).append("\n");
    sb.append("    field3: ").append(toIndentedString(field3)).append("\n");
    sb.append("    field4: ").append(toIndentedString(field4)).append("\n");
    sb.append("    field5: ").append(toIndentedString(field5)).append("\n");
    sb.append("    field6: ").append(toIndentedString(field6)).append("\n");
    sb.append("    field7: ").append(toIndentedString(field7)).append("\n");
    sb.append("    field8: ").append(toIndentedString(field8)).append("\n");
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

