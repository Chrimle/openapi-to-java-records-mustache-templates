package io.github.chrimle.o2jrm.serializableModel;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.chrimle.o2jrm.test.interfaces.TestInterfaceOne;
import io.github.chrimle.o2jrm.test.interfaces.TestInterfaceTwo;

import java.io.Serializable;

/**
 * Example of an Record which implements two interfaces.
 *
 * @param field1 a boolean field
 */
public record ExampleRecordTwoImplements(Boolean field1)
    implements TestInterfaceOne, TestInterfaceTwo, Serializable {

  @JsonCreator
  public ExampleRecordTwoImplements(final Boolean field1) {
    this.field1 = field1;
  }
}
