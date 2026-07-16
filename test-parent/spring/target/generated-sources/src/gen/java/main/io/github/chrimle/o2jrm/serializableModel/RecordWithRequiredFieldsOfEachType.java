package io.github.chrimle.o2jrm.serializableModel;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.chrimle.o2jrm.serializableModel.ExampleEnum;
import io.github.chrimle.o2jrm.serializableModel.ExampleRecord;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Example of a Record with fields of each type
 *
 * @param field1 a Boolean field
 * @param field2 a String field
 * @param field3 an Integer field
 * @param field4 a Number field
 * @param field5 an Array of Boolean field
 * @param field6 a Set field
 * @param field7 ExampleRecord.
 * @param field8 ExampleEnum.
 */
public record RecordWithRequiredFieldsOfEachType(
    @NotNull Boolean field1,
    @NotNull String field2,
    @NotNull Integer field3,
    @NotNull BigDecimal field4,
    @NotNull List<Boolean> field5,
    @NotNull Set<Boolean> field6,
    @Valid @NotNull ExampleRecord field7,
    @NotNull ExampleEnum field8)
    implements Serializable {

  @JsonCreator
  public RecordWithRequiredFieldsOfEachType(
      final Boolean field1,
      final String field2,
      final Integer field3,
      final BigDecimal field4,
      final List<Boolean> field5,
      final Set<Boolean> field6,
      final ExampleRecord field7,
      final ExampleEnum field8) {
    this.field1 = field1;
    this.field2 = field2;
    this.field3 = field3;
    this.field4 = field4;
    this.field5 = Objects.requireNonNullElseGet(field5, () -> new ArrayList<>());
    this.field6 = Objects.requireNonNullElseGet(field6, () -> new LinkedHashSet<>());
    this.field7 = field7;
    this.field8 = field8;
  }
}
