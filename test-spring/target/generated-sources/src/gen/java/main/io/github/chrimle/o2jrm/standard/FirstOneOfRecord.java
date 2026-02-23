package io.github.chrimle.o2jrm.standard;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FirstOneOfRecord.
 *
 * @param field1 Boolean.
 */
public record FirstOneOfRecord(Boolean field1)
    implements ParentOneOfRecord {

  @JsonCreator
  public FirstOneOfRecord(final Boolean field1) {
    this.field1 = field1;
  }
}
