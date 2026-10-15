package io.github.chrimle.o2jrm.useEnumCaseInsensitive;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.chrimle.o2jrm.useEnumCaseInsensitive.ExampleEnum;
import io.github.chrimle.o2jrm.useEnumCaseInsensitive.ExampleRecord;
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
 *
 * @param field3 an Integer field
 * @param field7 ExampleRecord.
 * @param field8 ExampleEnum.
 */
public record RecordWithRequiredFieldsOfEachType(
    @NotNull Integer field3,
    @Valid @NotNull ExampleRecord field7,
    @NotNull ExampleEnum field8) {

  @JsonCreator
  public RecordWithRequiredFieldsOfEachType(
      final Integer field3,
      final ExampleRecord field7,
      final ExampleEnum field8) {
    this.field3 = field3;
    this.field7 = field7;
    this.field8 = field8;
  }
}
