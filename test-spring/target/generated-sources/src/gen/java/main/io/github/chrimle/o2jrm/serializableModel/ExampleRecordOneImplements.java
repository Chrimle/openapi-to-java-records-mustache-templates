package io.github.chrimle.o2jrm.serializableModel;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.chrimle.o2jrm.test.interfaces.TestInterfaceOne;

import java.io.Serializable;

/**
 * Example of an Record which implements an interface.
 *
 * @param field1 a boolean field
 */
public record ExampleRecordOneImplements(Boolean field1)
    implements TestInterfaceOne, Serializable {

  @JsonCreator
  public ExampleRecordOneImplements(final Boolean field1) {
    this.field1 = field1;
  }
}
