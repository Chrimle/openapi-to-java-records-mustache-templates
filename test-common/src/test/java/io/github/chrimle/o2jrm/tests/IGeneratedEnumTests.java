package io.github.chrimle.o2jrm.tests;

import io.github.chrimle.o2jrm.GeneratedSource;
import io.github.chrimle.o2jrm.utils.CustomAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test Generated `enum` classes")
public abstract class IGeneratedEnumTests {

  public static final String GENERATED_ENUM_TESTS_METHOD_SOURCE =
      "io.github.chrimle.o2jrm.tests.GeneratedEnumTests#allPluginExecutionsAndGeneratedEnumCombinations";

  @Nested
  @DisplayName("Testing OpenAPI Schemas & Properties")
  class IOpenAPITests {

    @Nested
    @DisplayName("Testing `components.schemas.{schema}`")
    class ISchemaTests {

      @Nested
      @DisplayName("Testing `components.schemas.{schema}.enum`")
      class IEnumTests {

        @ParameterizedTest
        @MethodSource(GENERATED_ENUM_TESTS_METHOD_SOURCE)
        @DisplayName("Generates an `enum` class")
        void whenIsEnumThenGeneratedClassIsEnumClass(final GeneratedSource generatedSource) {
          CustomAssertions.assertClassIsEnumClass(generatedSource.getClassUnderTest());
        }
      }
    }
  }
}
