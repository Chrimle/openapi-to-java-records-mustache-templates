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
  public void testAll(PluginExecution pluginExecution) {
    for (GeneratedClass generatedClass : GeneratedClass.values()) {
      assertModel(generatedClass, pluginExecution);
    }
  }

  public static Stream<Arguments> provideTestArguments() {
    return Stream.of(
        Arguments.of(PluginExecution.ADDITIONAL_ENUM_TYPE_ANNOTATIONS),
        Arguments.of(PluginExecution.ADDITIONAL_MODEL_TYPE_ANNOTATIONS),
        Arguments.of(PluginExecution.GENERATE_BUILDERS),
        Arguments.of(PluginExecution.SERIALIZABLE_MODEL),
        Arguments.of(PluginExecution.STANDARD),
        Arguments.of(PluginExecution.USE_ENUM_CASE_INSENSITIVE),
        Arguments.of(PluginExecution.USE_JAKARTA_EE)
    );
  }


  private void assertModel(GeneratedClass generatedClass, PluginExecution pluginExecution) {

    final Class<?> classUnderTest = AssertionUtils.assertClassExists(
        getCanonicalClassName(pluginExecution, generatedClass)
    );

    switch (generatedClass) {
      case EXAMPLE_ENUM -> GeneratedEnumTestUtils.assertExampleEnum(
          classUnderTest,
          pluginExecution.additionalEnumTypeAnnotations,
          pluginExecution.useEnumCaseInsensitive
      );
      case EXAMPLE_RECORD -> GeneratedRecordTestUtils.assertExampleRecord(
          classUnderTest,
          pluginExecution.additionalModelTypeAnnotations,
          pluginExecution.serializableModel,
          pluginExecution.generateBuilders
      );
      case DEPRECATED_EXAMPLE_ENUM -> GeneratedEnumTestUtils.assertDeprecatedExampleEnum(
          classUnderTest,
          pluginExecution.additionalEnumTypeAnnotations,
          pluginExecution.useEnumCaseInsensitive
      );
      case DEPRECATED_EXAMPLE_RECORD -> GeneratedRecordTestUtils.assertDeprecatedExampleRecord(
          classUnderTest,
          pluginExecution.additionalModelTypeAnnotations,
          pluginExecution.serializableModel,
          pluginExecution.generateBuilders
      );
      case EXAMPLE_RECORD_WITH_BOOLEAN_FIELDS ->
          GeneratedRecordTestUtils.assertExampleRecordWithBooleanFields(
              classUnderTest,
              pluginExecution.additionalModelTypeAnnotations,
              pluginExecution.serializableModel,
              pluginExecution.generateBuilders
          );
      case EXAMPLE_RECORD_WITH_EXAMPLE_ENUM_FIELDS ->
          GeneratedRecordTestUtils.assertExampleRecordWithExampleEnumFields(
              classUnderTest,
              AssertionUtils.assertClassExists(
                  getCanonicalClassName(pluginExecution,
                      GeneratedClass.EXAMPLE_ENUM)
              ),
              pluginExecution.additionalModelTypeAnnotations,
              pluginExecution.serializableModel,
              pluginExecution.generateBuilders
          );
      case EXAMPLE_RECORD_WITH_EXAMPLE_RECORD_FIELDS ->
          GeneratedRecordTestUtils.assertExampleRecordWithExampleRecordFields(
              classUnderTest,
              AssertionUtils.assertClassExists(
                  getCanonicalClassName(pluginExecution,
                      GeneratedClass.EXAMPLE_RECORD)
              ),
              pluginExecution.additionalModelTypeAnnotations,
              pluginExecution.serializableModel,
              pluginExecution.generateBuilders
          );
      case EXAMPLE_RECORD_WITH_INTEGER_FIELDS ->
          GeneratedRecordTestUtils.assertExampleRecordWithIntegerFields(
              classUnderTest,
              pluginExecution.additionalModelTypeAnnotations,
              pluginExecution.serializableModel,
              pluginExecution.generateBuilders
          );
      case EXAMPLE_RECORD_WITH_NUMBER_FIELDS ->
          GeneratedRecordTestUtils.assertExampleRecordWithNumberFields(
              classUnderTest,
              pluginExecution.additionalModelTypeAnnotations,
              pluginExecution.serializableModel,
              pluginExecution.generateBuilders
          );
      case EXAMPLE_RECORD_WITH_STRING_FIELDS ->
          GeneratedRecordTestUtils.assertExampleRecordWithStringFields(
              classUnderTest,
              pluginExecution.additionalModelTypeAnnotations,
              pluginExecution.serializableModel,
              pluginExecution.generateBuilders
          );
      case EXAMPLE_RECORD_WITH_ARRAY_FIELDS ->
          GeneratedRecordTestUtils.assertExampleRecordWithArrayFields(
              classUnderTest,
              pluginExecution.additionalModelTypeAnnotations,
              pluginExecution.serializableModel,
              pluginExecution.generateBuilders
          );
      case EXAMPLE_RECORD_WITH_SET_FIELDS ->
          GeneratedRecordTestUtils.assertExampleRecordWithSetFields(
              classUnderTest,
              pluginExecution.additionalModelTypeAnnotations,
              pluginExecution.serializableModel,
              pluginExecution.generateBuilders
          );
      case EXAMPLE_RECORD_WITH_DEFAULT_FIELDS ->
          GeneratedRecordTestUtils.assertExampleRecordWithDefaultFields(
              classUnderTest,
              pluginExecution.additionalModelTypeAnnotations,
              pluginExecution.serializableModel,
              pluginExecution.generateBuilders
          );
    }
  }

  private String getCanonicalClassName(final PluginExecution pluginExecution,
      final GeneratedClass generatedClass) {
    return generatedClass.getCanonicalClassName(pluginExecution.packageName);
  }

}
