/*
 *   Copyright 2024-2026 Chrimle
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package io.github.chrimle.o2jrm.tests.enums.configOptions;

import io.github.chrimle.o2jrm.GeneratedSource;
import io.github.chrimle.o2jrm.annotations.TestAnnotationOne;
import io.github.chrimle.o2jrm.annotations.TestAnnotationThree;
import io.github.chrimle.o2jrm.annotations.TestAnnotationTwo;
import io.github.chrimle.o2jrm.tests.AssumptionFilter;
import io.github.chrimle.o2jrm.tests.Condition;
import io.github.chrimle.o2jrm.tests.GeneratedEnumProvider;
import io.github.chrimle.o2jrm.utils.CustomAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

@DisplayName("Testing `<additionalEnumTypeAnnotations>`")
public abstract class AdditionalEnumTypeAnnotationsTests {

  @Nested
  @DisplayName("Testing `<additionalEnumTypeAnnotations></additionalEnumTypeAnnotations>`")
  class AdditionalEnumTypeAnnotationsUnsetTests {

    @ParameterizedTest
    @ArgumentsSource(GeneratedEnumProvider.class)
    @AssumptionFilter(hasAdditionalEnumTypeAnnotations = Condition.FALSE)
    @DisplayName("Generated `enum` class is NOT annotated with additional annotations")
    void
        whenConfigOptionAdditionalEnumTypeAnnotationsIsUnsetThenGeneratedEnumDoesNotHaveAdditionalAnnotations(
            final GeneratedSource generatedSource) {
      CustomAssertions.assertClassIsNotAnnotatedWith(
          generatedSource.getClassUnderTest(), TestAnnotationOne.class);
      CustomAssertions.assertClassIsNotAnnotatedWith(
          generatedSource.getClassUnderTest(), TestAnnotationTwo.class);
      CustomAssertions.assertClassIsNotAnnotatedWith(
          generatedSource.getClassUnderTest(), TestAnnotationThree.class);
    }
  }

  @Nested
  @DisplayName(
      "Testing `<additionalEnumTypeAnnotations>@TestAnnotationOne;@TestAnnotationTwo;@TestAnnotationThree</additionalEnumTypeAnnotations>`")
  class AdditionalEnumTypeAnnotationsSetTests {

    @ParameterizedTest
    @ArgumentsSource(GeneratedEnumProvider.class)
    @AssumptionFilter(hasAdditionalEnumTypeAnnotations = Condition.TRUE)
    @DisplayName("Generated `enum` class is annotated with additional annotations")
    void
        whenConfigOptionAdditionalEnumTypeAnnotationsIsSetThenGeneratedEnumHasAdditionalAnnotations(
            final GeneratedSource generatedSource) {
      CustomAssertions.assertClassIsAnnotatedWith(
          generatedSource.getClassUnderTest(), TestAnnotationOne.class);
      CustomAssertions.assertClassIsAnnotatedWith(
          generatedSource.getClassUnderTest(), TestAnnotationTwo.class);
      CustomAssertions.assertClassIsAnnotatedWith(
          generatedSource.getClassUnderTest(), TestAnnotationThree.class);
    }
  }
}
