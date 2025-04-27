package io.github.chrimle.o2jrm.utils;

import io.github.chrimle.o2jrm.GeneratedSource;
import io.github.chrimle.o2jrm.models.GeneratedField;
import org.junit.jupiter.api.Assertions;

public class AssertionUtils {

  public static void assertInnerBuilderClassExistsAndCanBuildRecord(
      final GeneratedSource generatedSource) {
    // Assert Builder can be instantiated from builder()-method
    final Object builderObject =
        CustomAssertions.assertStaticMethodReturnsNonNull(
            CustomAssertions.assertClassHasMethod(generatedSource.getClassUnderTest(), "builder"));
    for (GeneratedField<?> generatedField : generatedSource.generatedFields()) {
      CustomAssertions.assertInstanceMethodReturnsValue(
          CustomAssertions.assertClassHasMethod(
              builderObject.getClass(), generatedField.name(), generatedField.type()),
          builderObject,
          builderObject,
          (Object) null);
    }
    Assertions.assertInstanceOf(
        generatedSource.getClassUnderTest(),
        CustomAssertions.assertInstanceMethodReturnsNonNull(
            CustomAssertions.assertClassHasMethod(builderObject.getClass(), "build"),
            builderObject));
  }
}
