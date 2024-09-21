package com.chrimle.example;

import com.chrimle.example.utils.AssertionUtils;
import com.chrimle.example.utils.GeneratedEnumTestUtils;
import com.chrimle.example.utils.GeneratedRecordTestUtils;

public record TestSuite(
    boolean hasAdditionalModelTypeAnnotations,
    boolean hasAdditionalEnumTypeAnnotations,
    boolean useEnumCaseInsensitive,
    boolean serializableModel,
    boolean generateBuilders,
    PluginExecution pluginExecution
) {


  private void assertModel(final GeneratedClass generatedClass) {

    final Class<?> classUnderTest = AssertionUtils.assertClassExists(
        getCanonicalClassName(generatedClass)
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
                  getCanonicalClassName(GeneratedClass.EXAMPLE_ENUM)
              ),
              hasAdditionalModelTypeAnnotations,
              serializableModel,
              generateBuilders
          );
      case EXAMPLE_RECORD_WITH_EXAMPLE_RECORD_FIELDS ->
          GeneratedRecordTestUtils.assertExampleRecordWithExampleRecordFields(
              classUnderTest,
              AssertionUtils.assertClassExists(
                  getCanonicalClassName(GeneratedClass.EXAMPLE_RECORD)
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

  public void assertModels() {
    for (GeneratedClass generatedClass : GeneratedClass.values()) {
      assertModel(generatedClass);
    }
  }

  private String getCanonicalClassName(final GeneratedClass generatedClass) {
    return generatedClass.getCanonicalClassName(
        pluginExecution.getPackageName());
  }

}
