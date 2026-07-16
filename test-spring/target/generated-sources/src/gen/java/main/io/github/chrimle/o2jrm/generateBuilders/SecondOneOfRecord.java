package io.github.chrimle.o2jrm.generateBuilders;

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
 * SecondOneOfRecord.
 *
 * @param field1 Boolean.
 */
public record SecondOneOfRecord(Boolean field1)
    implements ParentOneOfRecord {

  @JsonCreator
  public SecondOneOfRecord(final Boolean field1) {
    this.field1 = field1;
  }

  /** Builder class for {@link SecondOneOfRecord }. */
  public static class Builder {

    private Boolean field1;

    /**
     * Sets the value of {@link SecondOneOfRecord#field1 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field1 sets the value of field1.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field1(final Boolean field1) {
      this.field1 = field1;
      return this;
    }

    /**
     * Builds a {@link SecondOneOfRecord }-instance with the values provided in preceding
     * builder methods.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @return a new {@link SecondOneOfRecord }-instance.
     */
    public SecondOneOfRecord build() {
      return new SecondOneOfRecord(
          field1);
    }
  }

  /** Creates a new {@link Builder}-instance. */
  public static SecondOneOfRecord.Builder builder() {
    return new SecondOneOfRecord.Builder();
  }
}
