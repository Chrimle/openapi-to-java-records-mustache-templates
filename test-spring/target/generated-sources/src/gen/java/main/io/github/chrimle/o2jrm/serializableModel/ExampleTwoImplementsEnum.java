package io.github.chrimle.o2jrm.serializableModel;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Example of an Enum which implements two interfaces.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-11T01:30:33.650718900+02:00[Europe/Stockholm]", comments = "Generator version: 7.21.0")
public enum ExampleTwoImplementsEnum implements io.github.chrimle.o2jrm.interfaces.TestInterfaceOne, io.github.chrimle.o2jrm.interfaces.TestInterfaceTwo, Serializable {
  
  ENUM1("ENUM1"),
  
  ENUM2("ENUM2"),
  
  ENUM3("ENUM3");

  private final String value;

  ExampleTwoImplementsEnum(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ExampleTwoImplementsEnum fromValue(String value) {
    for (ExampleTwoImplementsEnum b : ExampleTwoImplementsEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

