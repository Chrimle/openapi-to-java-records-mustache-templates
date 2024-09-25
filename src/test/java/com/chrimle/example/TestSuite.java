package com.chrimle.example;

import com.chrimle.example.utils.AssertionUtils;
import com.chrimle.example.utils.GeneratedEnumTestUtils;
import com.chrimle.example.utils.GeneratedRecordTestUtils;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

public class TestSuite {

  @ParameterizedTest(name = "Testing: {0}")
  @EnumSource(PluginExecution.class)
  @DisplayName("Testing Plugin Executions...")
  public void testAll(final PluginExecution pluginExecution) {
    for (final GeneratedClass generatedClass : GeneratedClass.values()) {
      assertModel(
          generatedClass,
          pluginExecution,
          pluginExecution.hasAdditionalModelTypeAnnotations(),
          pluginExecution.hasAdditionalEnumTypeAnnotations(),
          pluginExecution.useEnumCaseInsensitive(),
          pluginExecution.serializableModel(),
          pluginExecution.generateBuilders()
      );
    }
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
      case EXAMPLE_RECORD_WITH_REQUIRED_FIELDS_OF_EACH_TYPE ->
        GeneratedRecordTestUtils.assertExampleRecordWithRequiredFieldsOfEachType(
            classUnderTest,
            AssertionUtils.assertClassExists(
                getCanonicalClassName(pluginExecution,
                    GeneratedClass.EXAMPLE_RECORD)
            ),
            AssertionUtils.assertClassExists(
                getCanonicalClassName(pluginExecution,
                    GeneratedClass.EXAMPLE_ENUM)
            ),
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
