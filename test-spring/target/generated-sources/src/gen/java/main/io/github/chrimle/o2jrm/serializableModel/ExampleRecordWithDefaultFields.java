package io.github.chrimle.o2jrm.serializableModel;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Example of a Record with default fields
 *
 * @param field1 a String field with a default value
 */
public record ExampleRecordWithDefaultFields(
    String field1)
    implements Serializable {

  @JsonCreator
  public ExampleRecordWithDefaultFields(
      final String field1) {
    this.field1 = Objects.requireNonNullElse(field1, "someDefaultValue");
  }
}
