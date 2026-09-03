package io.github.chrimle.o2jrm.standard;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.chrimle.o2jrm.standard.ExampleRecord;
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
 *
 * @param optionalRecordList Optional field
 * @param requiredRecordList Required field
 * @param optionalRecordSet Another Optional field
 * @param requiredRecordSet Another required field
 */
public record ExampleRecordWithCollectionsOfRecords(
    List<@Valid ExampleRecord> optionalRecordList,
    @NotNull List<@Valid ExampleRecord> requiredRecordList,
    Set<@Valid ExampleRecord> optionalRecordSet,
    @NotNull Set<@Valid ExampleRecord> requiredRecordSet) {

  @JsonCreator
  public ExampleRecordWithCollectionsOfRecords(
      final List<@Valid ExampleRecord> optionalRecordList,
      final List<@Valid ExampleRecord> requiredRecordList,
      final Set<@Valid ExampleRecord> optionalRecordSet,
      final Set<@Valid ExampleRecord> requiredRecordSet) {
    this.optionalRecordList = Objects.requireNonNullElseGet(optionalRecordList, () -> new ArrayList<>());
    this.requiredRecordList = Objects.requireNonNullElseGet(requiredRecordList, () -> new ArrayList<>());
    this.optionalRecordSet = Objects.requireNonNullElseGet(optionalRecordSet, () -> new LinkedHashSet<>());
    this.requiredRecordSet = Objects.requireNonNullElseGet(requiredRecordSet, () -> new LinkedHashSet<>());
  }
}
