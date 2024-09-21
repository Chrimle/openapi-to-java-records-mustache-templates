package com.chrimle.example;

import com.chrimle.example.utils.AssertionUtils;
import com.chrimle.example.utils.GeneratedEnumTestUtils;
import com.chrimle.example.utils.GeneratedRecordTestUtils;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestSuite {

  @ParameterizedTest(name = "Testing: {0}")
  @MethodSource("provideTestArguments")
  @DisplayName("Testing Plugin Execution...")
  public void testAll(
      PluginExecution pluginExecution,
      boolean hasAdditionalModelTypeAnnotations,
      boolean hasAdditionalEnumTypeAnnotations,
      boolean useEnumCaseInsensitive,
      boolean isModelSerializable,
      boolean generateBuilders) {

    for (GeneratedClass generatedClass : GeneratedClass.values()) {
      assertModel(
          generatedClass,
          pluginExecution,
          hasAdditionalModelTypeAnnotations,
          hasAdditionalEnumTypeAnnotations,
          useEnumCaseInsensitive,
          isModelSerializable,
          generateBuilders
      );
    }
  }

  public static Stream<Arguments> provideTestArguments() {
    return Stream.of(
        Arguments.of(
            PluginExecution.ADDITIONAL_ENUM_TYPE_ANNOTATIONS,
            false,
            true,
            false,
            false,
            false
        ),
        Arguments.of(
            PluginExecution.ADDITIONAL_MODEL_TYPE_ANNOTATIONS,
            true,
            false,
            false,
            false,
            false
        ),
        Arguments.of(
            PluginExecution.GENERATE_BUILDERS,
            false,
            false,
            false,
            false,
            true
        ),
        Arguments.of(
            PluginExecution.SERIALIZABLE_MODEL,
            false,
            false,
            false,
            true,
            false
        ),
        Arguments.of(
            PluginExecution.STANDARD,
            false,
            false,
            false,
            false,
            false
        ),
        Arguments.of(
            PluginExecution.USE_ENUM_CASE_INSENSITIVE,
            false,
            false,
            true,
            false,
            false
        )
    );
  }


  private void assertModel(
      GeneratedClass generatedClass,
      PluginExecution pluginExecution,
      boolean hasAdditionalModelTypeAnnotations,
      boolean hasAdditionalEnumTypeAnnotations,
      boolean useEnumCaseInsensitive,
      boolean serializableModel,
      boolean generateBuilders
  ) {

    final Class<?> classUnderTest = AssertionUtils.assertClassExists(
        getCanonicalClassName(pluginExecution, generatedClass)
    );

    switch (generatedClass) {
      case EXAMPLE_ENUM -> GeneratedEnumTestUtils.assertExampleEnum(
          classUnderTest,
          hasAdditionalEnumTypeAnnotations,
          useEnumCaseInsensitive
      );
      case EXAMPLE_RECORD -> GeneratedRecordTestUtils.assertExampleRecord(
          classUnderTest,
          hasAdditionalModelTypeAnnotations,
          serializableModel,
          generateBuilders
      );
      case DEPRECATED_EXAMPLE_ENUM ->
          GeneratedEnumTestUtils.assertDeprecatedExampleEnum(
              classUnderTest,
              hasAdditionalEnumTypeAnnotations,
              useEnumCaseInsensitive
          );
      case DEPRECATED_EXAMPLE_RECORD ->
          GeneratedRecordTestUtils.assertDeprecatedExampleRecord(
              classUnderTest,
              hasAdditionalModelTypeAnnotations,
              serializableModel,
              generateBuilders
          );
      case EXAMPLE_RECORD_WITH_BOOLEAN_FIELDS ->
          GeneratedRecordTestUtils.assertExampleRecordWithBooleanFields(
              classUnderTest,
              hasAdditionalModelTypeAnnotations,
              serializableModel,
              generateBuilders
          );
      case EXAMPLE_RECORD_WITH_EXAMPLE_ENUM_FIELDS ->
          GeneratedRecordTestUtils.assertExampleRecordWithExampleEnumFields(
              classUnderTest,
              AssertionUtils.assertClassExists(
                  getCanonicalClassName(pluginExecution,
                      GeneratedClass.EXAMPLE_ENUM)
              ),
              hasAdditionalModelTypeAnnotations,
              serializableModel,
              generateBuilders
          );
      case EXAMPLE_RECORD_WITH_EXAMPLE_RECORD_FIELDS ->
          GeneratedRecordTestUtils.assertExampleRecordWithExampleRecordFields(
              classUnderTest,
              AssertionUtils.assertClassExists(
                  getCanonicalClassName(pluginExecution,
                      GeneratedClass.EXAMPLE_RECORD)
              ),
              hasAdditionalModelTypeAnnotations,
              serializableModel,
              generateBuilders
          );
      case EXAMPLE_RECORD_WITH_INTEGER_FIELDS ->
          GeneratedRecordTestUtils.assertExampleRecordWithIntegerFields(
              classUnderTest,
              hasAdditionalModelTypeAnnotations,
              serializableModel,
              generateBuilders
          );
      case EXAMPLE_RECORD_WITH_NUMBER_FIELDS ->
          GeneratedRecordTestUtils.assertExampleRecordWithNumberFields(
              classUnderTest,
              hasAdditionalModelTypeAnnotations,
              serializableModel,
              generateBuilders
          );
      case EXAMPLE_RECORD_WITH_STRING_FIELDS ->
          GeneratedRecordTestUtils.assertExampleRecordWithStringFields(
              classUnderTest,
              hasAdditionalModelTypeAnnotations,
              serializableModel,
              generateBuilders
          );
      case EXAMPLE_RECORD_WITH_ARRAY_FIELDS ->
          GeneratedRecordTestUtils.assertExampleRecordWithArrayFields(
              classUnderTest,
              hasAdditionalModelTypeAnnotations,
              serializableModel,
              generateBuilders
          );
      case EXAMPLE_RECORD_WITH_SET_FIELDS ->
          GeneratedRecordTestUtils.assertExampleRecordWithSetFields(
              classUnderTest,
              hasAdditionalModelTypeAnnotations,
              serializableModel,
              generateBuilders
          );
      case EXAMPLE_RECORD_WITH_DEFAULT_FIELDS ->
          GeneratedRecordTestUtils.assertExampleRecordWithDefaultFields(
              classUnderTest,
              hasAdditionalModelTypeAnnotations,
              serializableModel,
              generateBuilders
          );
    }
  }

  private String getCanonicalClassName(final PluginExecution pluginExecution,
      final GeneratedClass generatedClass) {
    return generatedClass.getCanonicalClassName(
        pluginExecution.getPackageName());
  }

}
