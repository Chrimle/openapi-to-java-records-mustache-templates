/*
  Copyright 2024-2026 Chrimle

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.

*/
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
