package io.github.chrimle.o2jrm.standard;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.chrimle.o2jrm.test.interfaces.TestInterfaceOne;

/**
 * Example of an Record which implements an interface.
 *
 * @param field1 a boolean field
 */
public record ExampleRecordOneImplements(Boolean field1)
    implements TestInterfaceOne {

  @JsonCreator
  public ExampleRecordOneImplements(final Boolean field1) {
    this.field1 = field1;
  }
}
