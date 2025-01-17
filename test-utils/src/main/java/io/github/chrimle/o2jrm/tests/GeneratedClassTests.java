package io.github.chrimle.o2jrm.tests;

import io.github.chrimle.o2jrm.models.GeneratedSource;
import io.github.chrimle.o2jrm.utils.CustomAssertions;
import org.junit.jupiter.api.Assumptions;

public class GeneratedClassTests {

  /**
   * Assuming that the {@code generatedSource} is an {@code enum}, the {@code classUnderTest} should
   * be an {@code enum} class.
   */
  public static void whenIsEnumThenGeneratedClassIsEnumClass(
      final GeneratedSource generatedSource) {
    Assumptions.assumeTrue(generatedSource.isEnum());
    CustomAssertions.assertClassIsEnumClass(generatedSource.getClassUnderTest());
  }

  /**
   * Assuming that the {@code generatedSource} is an {@code enum}, with constants, the {@code
   * classUnderTest} should have an equal number of enum constants.
   */
  public static void whenEnumHasConstantsThenGeneratedEnumClassHasExpectedNumberOfConstants(
      final GeneratedSource generatedSource) {
    Assumptions.assumeTrue(generatedSource.isEnum());
    Assumptions.assumeTrue(generatedSource.generatedFields().length > 0);
    CustomAssertions.assertClassHasEnumConstants(
        generatedSource.getClassUnderTest(), generatedSource.generatedFields().length);
  }
}
