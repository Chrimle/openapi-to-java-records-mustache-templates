package io.github.chrimle.o2jrm.useOptional;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.chrimle.o2jrm.useOptional.ExampleEnum;
import io.github.chrimle.o2jrm.useOptional.ExampleRecord;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.springframework.lang.Nullable;
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

@Schema(name = "RecordWithRequiredFieldsOfEachType", description = "Example of a Record with fields of each type")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-12T22:13:42.341544900+02:00[Europe/Stockholm]", comments = "Generator version: 7.21.0")
public class RecordWithRequiredFieldsOfEachType {

  private Boolean field1;

  private String field2;

  private Integer field3;

  private BigDecimal field4;

  @Valid
  private List<Boolean> field5 = new ArrayList<>();

  @Valid
  private Set<Boolean> field6 = new LinkedHashSet<>();

  private ExampleRecord field7;

  private ExampleEnum field8;

  public RecordWithRequiredFieldsOfEachType() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RecordWithRequiredFieldsOfEachType(Boolean field1, String field2, Integer field3, BigDecimal field4, List<Boolean> field5, Set<Boolean> field6, ExampleRecord field7, ExampleEnum field8) {
    this.field1 = field1;
    this.field2 = field2;
    this.field3 = field3;
    this.field4 = field4;
    this.field5 = field5;
    this.field6 = field6;
    this.field7 = field7;
    this.field8 = field8;
  }

  public RecordWithRequiredFieldsOfEachType field1(Boolean field1) {
    this.field1 = field1;
    return this;
  }

  /**
   * a Boolean field
   * @return field1
   */
  @NotNull 
  @Schema(name = "field1", description = "a Boolean field", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field1")
  public Boolean getField1() {
    return field1;
  }

  @JsonProperty("field1")
  public void setField1(Boolean field1) {
    this.field1 = field1;
  }

  public RecordWithRequiredFieldsOfEachType field2(String field2) {
    this.field2 = field2;
    return this;
  }

  /**
   * a String field
   * @return field2
   */
  @NotNull 
  @Schema(name = "field2", description = "a String field", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field2")
  public String getField2() {
    return field2;
  }

  @JsonProperty("field2")
  public void setField2(String field2) {
    this.field2 = field2;
  }

  public RecordWithRequiredFieldsOfEachType field3(Integer field3) {
    this.field3 = field3;
    return this;
  }

  /**
   * an Integer field
   * @return field3
   */
  @NotNull 
  @Schema(name = "field3", description = "an Integer field", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field3")
  public Integer getField3() {
    return field3;
  }

  @JsonProperty("field3")
  public void setField3(Integer field3) {
    this.field3 = field3;
  }

  public RecordWithRequiredFieldsOfEachType field4(BigDecimal field4) {
    this.field4 = field4;
    return this;
  }

  /**
   * a Number field
   * @return field4
   */
  @NotNull @Valid 
  @Schema(name = "field4", description = "a Number field", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field4")
  public BigDecimal getField4() {
    return field4;
  }

  @JsonProperty("field4")
  public void setField4(BigDecimal field4) {
    this.field4 = field4;
  }

  public RecordWithRequiredFieldsOfEachType field5(List<Boolean> field5) {
    this.field5 = field5;
    return this;
  }

  public RecordWithRequiredFieldsOfEachType addField5Item(Boolean field5Item) {
    if (this.field5 == null) {
      this.field5 = new ArrayList<>();
    }
    this.field5.add(field5Item);
    return this;
  }

  /**
   * an Array of Boolean field
   * @return field5
   */
  @NotNull 
  @Schema(name = "field5", description = "an Array of Boolean field", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field5")
  public List<Boolean> getField5() {
    return field5;
  }

  @JsonProperty("field5")
  public void setField5(List<Boolean> field5) {
    this.field5 = field5;
  }

  public RecordWithRequiredFieldsOfEachType field6(Set<Boolean> field6) {
    this.field6 = field6;
    return this;
  }

  public RecordWithRequiredFieldsOfEachType addField6Item(Boolean field6Item) {
    if (this.field6 == null) {
      this.field6 = new LinkedHashSet<>();
    }
    this.field6.add(field6Item);
    return this;
  }

  /**
   * a Set field
   * @return field6
   */
  @NotNull 
  @Schema(name = "field6", description = "a Set field", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field6")
  public Set<Boolean> getField6() {
    return field6;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty("field6")
  public void setField6(Set<Boolean> field6) {
    this.field6 = field6;
  }

  public RecordWithRequiredFieldsOfEachType field7(ExampleRecord field7) {
    this.field7 = field7;
    return this;
  }

  /**
   * Get field7
   * @return field7
   */
  @NotNull @Valid 
  @Schema(name = "field7", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field7")
  public ExampleRecord getField7() {
    return field7;
  }

  @JsonProperty("field7")
  public void setField7(ExampleRecord field7) {
    this.field7 = field7;
  }

  public RecordWithRequiredFieldsOfEachType field8(ExampleEnum field8) {
    this.field8 = field8;
    return this;
  }

  /**
   * Get field8
   * @return field8
   */
  @NotNull @Valid 
  @Schema(name = "field8", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field8")
  public ExampleEnum getField8() {
    return field8;
  }

  @JsonProperty("field8")
  public void setField8(ExampleEnum field8) {
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
    RecordWithRequiredFieldsOfEachType recordWithRequiredFieldsOfEachType = (RecordWithRequiredFieldsOfEachType) o;
    return Objects.equals(this.field1, recordWithRequiredFieldsOfEachType.field1) &&
        Objects.equals(this.field2, recordWithRequiredFieldsOfEachType.field2) &&
        Objects.equals(this.field3, recordWithRequiredFieldsOfEachType.field3) &&
        Objects.equals(this.field4, recordWithRequiredFieldsOfEachType.field4) &&
        Objects.equals(this.field5, recordWithRequiredFieldsOfEachType.field5) &&
        Objects.equals(this.field6, recordWithRequiredFieldsOfEachType.field6) &&
        Objects.equals(this.field7, recordWithRequiredFieldsOfEachType.field7) &&
        Objects.equals(this.field8, recordWithRequiredFieldsOfEachType.field8);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field1, field2, field3, field4, field5, field6, field7, field8);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordWithRequiredFieldsOfEachType {\n");
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

