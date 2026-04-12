package io.github.chrimle.o2jrm.useOptional;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.chrimle.o2jrm.useOptional.ExampleRecord;
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
 * Example of a Record with collections of records.
 */

@Schema(name = "ExampleRecordWithCollectionsOfRecords", description = "Example of a Record with collections of records.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-12T22:13:42.341544900+02:00[Europe/Stockholm]", comments = "Generator version: 7.21.0")
public class ExampleRecordWithCollectionsOfRecords {

  @Valid
  private List<@Valid ExampleRecord> optionalRecordList = new ArrayList<>();

  @Valid
  private List<@Valid ExampleRecord> requiredRecordList = new ArrayList<>();

  @Valid
  private Set<@Valid ExampleRecord> optionalRecordSet = new LinkedHashSet<>();

  @Valid
  private Set<@Valid ExampleRecord> requiredRecordSet = new LinkedHashSet<>();

  public ExampleRecordWithCollectionsOfRecords() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ExampleRecordWithCollectionsOfRecords(List<@Valid ExampleRecord> requiredRecordList, Set<@Valid ExampleRecord> requiredRecordSet) {
    this.requiredRecordList = requiredRecordList;
    this.requiredRecordSet = requiredRecordSet;
  }

  public ExampleRecordWithCollectionsOfRecords optionalRecordList(List<@Valid ExampleRecord> optionalRecordList) {
    this.optionalRecordList = optionalRecordList;
    return this;
  }

  public ExampleRecordWithCollectionsOfRecords addOptionalRecordListItem(ExampleRecord optionalRecordListItem) {
    if (this.optionalRecordList == null) {
      this.optionalRecordList = new ArrayList<>();
    }
    this.optionalRecordList.add(optionalRecordListItem);
    return this;
  }

  /**
   * Optional field
   * @return optionalRecordList
   */
  @Valid 
  @Schema(name = "optionalRecordList", description = "Optional field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optionalRecordList")
  public List<@Valid ExampleRecord> getOptionalRecordList() {
    return optionalRecordList;
  }

  @JsonProperty("optionalRecordList")
  public void setOptionalRecordList(List<@Valid ExampleRecord> optionalRecordList) {
    this.optionalRecordList = optionalRecordList;
  }

  public ExampleRecordWithCollectionsOfRecords requiredRecordList(List<@Valid ExampleRecord> requiredRecordList) {
    this.requiredRecordList = requiredRecordList;
    return this;
  }

  public ExampleRecordWithCollectionsOfRecords addRequiredRecordListItem(ExampleRecord requiredRecordListItem) {
    if (this.requiredRecordList == null) {
      this.requiredRecordList = new ArrayList<>();
    }
    this.requiredRecordList.add(requiredRecordListItem);
    return this;
  }

  /**
   * Required field
   * @return requiredRecordList
   */
  @NotNull @Valid 
  @Schema(name = "requiredRecordList", description = "Required field", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requiredRecordList")
  public List<@Valid ExampleRecord> getRequiredRecordList() {
    return requiredRecordList;
  }

  @JsonProperty("requiredRecordList")
  public void setRequiredRecordList(List<@Valid ExampleRecord> requiredRecordList) {
    this.requiredRecordList = requiredRecordList;
  }

  public ExampleRecordWithCollectionsOfRecords optionalRecordSet(Set<@Valid ExampleRecord> optionalRecordSet) {
    this.optionalRecordSet = optionalRecordSet;
    return this;
  }

  public ExampleRecordWithCollectionsOfRecords addOptionalRecordSetItem(ExampleRecord optionalRecordSetItem) {
    if (this.optionalRecordSet == null) {
      this.optionalRecordSet = new LinkedHashSet<>();
    }
    this.optionalRecordSet.add(optionalRecordSetItem);
    return this;
  }

  /**
   * Another Optional field
   * @return optionalRecordSet
   */
  @Valid 
  @Schema(name = "optionalRecordSet", description = "Another Optional field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optionalRecordSet")
  public Set<@Valid ExampleRecord> getOptionalRecordSet() {
    return optionalRecordSet;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty("optionalRecordSet")
  public void setOptionalRecordSet(Set<@Valid ExampleRecord> optionalRecordSet) {
    this.optionalRecordSet = optionalRecordSet;
  }

  public ExampleRecordWithCollectionsOfRecords requiredRecordSet(Set<@Valid ExampleRecord> requiredRecordSet) {
    this.requiredRecordSet = requiredRecordSet;
    return this;
  }

  public ExampleRecordWithCollectionsOfRecords addRequiredRecordSetItem(ExampleRecord requiredRecordSetItem) {
    if (this.requiredRecordSet == null) {
      this.requiredRecordSet = new LinkedHashSet<>();
    }
    this.requiredRecordSet.add(requiredRecordSetItem);
    return this;
  }

  /**
   * Another required field
   * @return requiredRecordSet
   */
  @NotNull @Valid 
  @Schema(name = "requiredRecordSet", description = "Another required field", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requiredRecordSet")
  public Set<@Valid ExampleRecord> getRequiredRecordSet() {
    return requiredRecordSet;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty("requiredRecordSet")
  public void setRequiredRecordSet(Set<@Valid ExampleRecord> requiredRecordSet) {
    this.requiredRecordSet = requiredRecordSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExampleRecordWithCollectionsOfRecords exampleRecordWithCollectionsOfRecords = (ExampleRecordWithCollectionsOfRecords) o;
    return Objects.equals(this.optionalRecordList, exampleRecordWithCollectionsOfRecords.optionalRecordList) &&
        Objects.equals(this.requiredRecordList, exampleRecordWithCollectionsOfRecords.requiredRecordList) &&
        Objects.equals(this.optionalRecordSet, exampleRecordWithCollectionsOfRecords.optionalRecordSet) &&
        Objects.equals(this.requiredRecordSet, exampleRecordWithCollectionsOfRecords.requiredRecordSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionalRecordList, requiredRecordList, optionalRecordSet, requiredRecordSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExampleRecordWithCollectionsOfRecords {\n");
    sb.append("    optionalRecordList: ").append(toIndentedString(optionalRecordList)).append("\n");
    sb.append("    requiredRecordList: ").append(toIndentedString(requiredRecordList)).append("\n");
    sb.append("    optionalRecordSet: ").append(toIndentedString(optionalRecordSet)).append("\n");
    sb.append("    requiredRecordSet: ").append(toIndentedString(requiredRecordSet)).append("\n");
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

