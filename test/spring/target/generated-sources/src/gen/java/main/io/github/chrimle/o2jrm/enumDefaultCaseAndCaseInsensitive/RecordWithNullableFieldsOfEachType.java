package io.github.chrimle.o2jrm.enumDefaultCaseAndCaseInsensitive;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.chrimle.o2jrm.enumDefaultCaseAndCaseInsensitive.ExampleNullableEnum;
import io.github.chrimle.o2jrm.enumDefaultCaseAndCaseInsensitive.ExampleNullableRecord;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
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
 * @param field1 a Boolean field
 * @param field2 a String field
 * @param field3 an Integer field
 * @param field4 a Number field
 * @param field5 an Array of Boolean field
 * @param field6 a Set field
 * @param field7 ExampleNullableRecord.
 * @param field8 ExampleNullableEnum.
 */
public record RecordWithNullableFieldsOfEachType(
    Boolean field1,
    String field2,
    Integer field3,
    BigDecimal field4,
    List<Boolean> field5,
    Set<Boolean> field6,
    @Valid ExampleNullableRecord field7,
    ExampleNullableEnum field8) {

  @JsonCreator
  public RecordWithNullableFieldsOfEachType(
      final Boolean field1,
      final String field2,
      final Integer field3,
      final BigDecimal field4,
      final List<Boolean> field5,
      final Set<Boolean> field6,
      final ExampleNullableRecord field7,
      final ExampleNullableEnum field8) {
    this.field1 = field1;
    this.field2 = field2;
    this.field3 = field3;
    this.field4 = field4;
    this.field5 = field5;
    this.field6 = field6;
    this.field7 = field7;
    this.field8 = field8;
  }
}
