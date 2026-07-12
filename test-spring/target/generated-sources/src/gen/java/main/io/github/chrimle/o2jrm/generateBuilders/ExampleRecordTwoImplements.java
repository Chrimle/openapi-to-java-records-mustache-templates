package io.github.chrimle.o2jrm.generateBuilders;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.chrimle.o2jrm.test.interfaces.TestInterfaceOne;
import io.github.chrimle.o2jrm.test.interfaces.TestInterfaceTwo;

/**
 * Example of an Record which implements two interfaces.
 *
 * @param field1 a boolean field
 */
public record ExampleRecordTwoImplements(Boolean field1)
    implements TestInterfaceOne, TestInterfaceTwo {

  @JsonCreator
  public ExampleRecordTwoImplements(final Boolean field1) {
    this.field1 = field1;
  }

  /** Builder class for {@link ExampleRecordTwoImplements }. */
  public static class Builder {

    private Boolean field1;

    /**
     * Sets the value of {@link ExampleRecordTwoImplements#field1 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field1 a boolean field.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field1(final Boolean field1) {
      this.field1 = field1;
      return this;
    }

    /**
     * Builds a {@link ExampleRecordTwoImplements }-instance with the values provided in preceding
     * builder methods.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @return a new {@link ExampleRecordTwoImplements }-instance.
     */
    public ExampleRecordTwoImplements build() {
      return new ExampleRecordTwoImplements(
          field1);
    }
  }

  /** Creates a new {@link Builder}-instance. */
  public static ExampleRecordTwoImplements.Builder builder() {
    return new ExampleRecordTwoImplements.Builder();
  }
}
