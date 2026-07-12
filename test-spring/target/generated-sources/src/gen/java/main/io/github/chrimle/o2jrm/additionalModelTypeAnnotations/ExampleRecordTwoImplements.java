package io.github.chrimle.o2jrm.additionalModelTypeAnnotations;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.chrimle.o2jrm.test.interfaces.TestInterfaceOne;
import io.github.chrimle.o2jrm.test.interfaces.TestInterfaceTwo;

/**
 * Example of an Record which implements two interfaces.
 *
 * @param field1 a boolean field
 */
@io.github.chrimle.o2jrm.test.annotations.TestAnnotationOne
@io.github.chrimle.o2jrm.test.annotations.TestAnnotationTwo
@io.github.chrimle.o2jrm.test.annotations.TestAnnotationThree
public record ExampleRecordTwoImplements(Boolean field1)
    implements TestInterfaceOne, TestInterfaceTwo {

  @JsonCreator
  public ExampleRecordTwoImplements(final Boolean field1) {
    this.field1 = field1;
  }
}
