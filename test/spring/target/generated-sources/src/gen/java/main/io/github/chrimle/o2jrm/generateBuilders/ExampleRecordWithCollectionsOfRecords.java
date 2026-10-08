package io.github.chrimle.o2jrm.generateBuilders;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.chrimle.o2jrm.generateBuilders.ExampleRecord;
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

  /** Builder class for {@link ExampleRecordWithCollectionsOfRecords }. */
  public static class Builder {

    private List<@Valid ExampleRecord> optionalRecordList;
    private List<@Valid ExampleRecord> requiredRecordList;
    private Set<@Valid ExampleRecord> optionalRecordSet;
    private Set<@Valid ExampleRecord> requiredRecordSet;

    /**
     * Sets the value of {@link ExampleRecordWithCollectionsOfRecords#optionalRecordList }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param optionalRecordList Optional field.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder optionalRecordList(final List<@Valid ExampleRecord> optionalRecordList) {
      this.optionalRecordList = optionalRecordList;
      return this;
    }

    /**
     * Sets the value of {@link ExampleRecordWithCollectionsOfRecords#requiredRecordList }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param requiredRecordList Required field.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder requiredRecordList(final List<@Valid ExampleRecord> requiredRecordList) {
      this.requiredRecordList = requiredRecordList;
      return this;
    }

    /**
     * Sets the value of {@link ExampleRecordWithCollectionsOfRecords#optionalRecordSet }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param optionalRecordSet Another Optional field.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder optionalRecordSet(final Set<@Valid ExampleRecord> optionalRecordSet) {
      this.optionalRecordSet = optionalRecordSet;
      return this;
    }

    /**
     * Sets the value of {@link ExampleRecordWithCollectionsOfRecords#requiredRecordSet }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param requiredRecordSet Another required field.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder requiredRecordSet(final Set<@Valid ExampleRecord> requiredRecordSet) {
      this.requiredRecordSet = requiredRecordSet;
      return this;
    }

    /**
     * Builds a {@link ExampleRecordWithCollectionsOfRecords }-instance with the values provided in preceding
     * builder methods.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @return a new {@link ExampleRecordWithCollectionsOfRecords }-instance.
     */
    public ExampleRecordWithCollectionsOfRecords build() {
      return new ExampleRecordWithCollectionsOfRecords(
          optionalRecordList,
          requiredRecordList,
          optionalRecordSet,
          requiredRecordSet);
    }
  }

  /** Creates a new {@link Builder}-instance. */
  public static ExampleRecordWithCollectionsOfRecords.Builder builder() {
    return new ExampleRecordWithCollectionsOfRecords.Builder();
  }
}
