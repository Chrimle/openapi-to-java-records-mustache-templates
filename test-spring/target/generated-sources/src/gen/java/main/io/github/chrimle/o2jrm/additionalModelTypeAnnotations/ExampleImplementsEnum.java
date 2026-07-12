package io.github.chrimle.o2jrm.additionalModelTypeAnnotations;

import com.fasterxml.jackson.annotation.JsonValue;
import io.github.chrimle.o2jrm.test.interfaces.TestInterfaceOne;


import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Example of an Enum which implements an interface.
 */
public enum ExampleImplementsEnum implements TestInterfaceOne {
  ENUM1("ENUM1"),
  ENUM2("ENUM2"),
  ENUM3("ENUM3");

  private final String value;

  ExampleImplementsEnum(final String value) {
    this.value = value;
  }

  /**
   * Gets the {@link #value} of this enum.
   *
   * @return the {@code value} of this enum.
   */
  @JsonValue
  public String getValue() {
    return value;
  }

  /**
   * Case-sensitively matches the given {@code value} to an enum constant using {@link #getValue()}.
   *
   * <p><b>NOTE:</b> if multiple enum constants have a matching {@link #value}, the first matching
   * enum constant is returned, by the order they are declared.
   *
   * @param value of the enum.
   * @return a {@link ExampleImplementsEnum } with the matching value.
   * @throws IllegalArgumentException if no enum has a value matching the given value.
   */
  @JsonCreator
  public static ExampleImplementsEnum fromValue(final String value) {
    for (final ExampleImplementsEnum constant : ExampleImplementsEnum.values()) {
      if (constant.getValue().equals(value)) {
        return constant;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
