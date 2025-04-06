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
 * Generated with Version: 2.8.0
 *
 */

package io.github.chrimle.o2jrm.webclient.serializableModel;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.chrimle.o2jrm.webclient.serializableModel.ExampleRecord;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Example of a Record with collections of records.
 *
 * @param optionalRecordList Optional field
 * @param requiredRecordList Required field
 * @param optionalRecordSet Another Optional field
 * @param requiredRecordSet Another required field
 */
public record ExampleRecordWithCollectionsOfRecords(
    @javax.annotation.Nonnull List<ExampleRecord> optionalRecordList,
    @javax.annotation.Nonnull List<ExampleRecord> requiredRecordList,
    @javax.annotation.Nonnull Set<ExampleRecord> optionalRecordSet,
    @javax.annotation.Nonnull Set<ExampleRecord> requiredRecordSet
  ) implements Serializable {

  private static final long serialVersionUID = 1L;

  public ExampleRecordWithCollectionsOfRecords(
      @javax.annotation.Nullable final List<ExampleRecord> optionalRecordList,
      @javax.annotation.Nullable final List<ExampleRecord> requiredRecordList,
      @javax.annotation.Nullable final Set<ExampleRecord> optionalRecordSet,
      @javax.annotation.Nullable final Set<ExampleRecord> requiredRecordSet) { 
    this.optionalRecordList = Objects.requireNonNullElse(optionalRecordList, new ArrayList<>());
    this.requiredRecordList = Objects.requireNonNullElse(requiredRecordList, new ArrayList<>());
    this.optionalRecordSet = Objects.requireNonNullElse(optionalRecordSet, new LinkedHashSet<>());
    this.requiredRecordSet = Objects.requireNonNullElse(requiredRecordSet, new LinkedHashSet<>());
  }
}
