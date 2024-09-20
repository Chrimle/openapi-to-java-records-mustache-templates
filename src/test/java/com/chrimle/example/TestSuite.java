package com.chrimle.example;

import com.chrimle.example.utils.GeneratedEnumTestUtils;
import com.chrimle.example.utils.GeneratedRecordTestUtils;

public record TestSuite<DeprecatedExampleEnum extends Enum<DeprecatedExampleEnum>, ExampleEnum extends Enum<ExampleEnum>>(
    Class<DeprecatedExampleEnum> deprecatedExampleEnum,
    Class<?> deprecatedExampleRecord,
    Class<ExampleEnum> exampleEnum,
    Class<?> exampleRecord,
    Class<?> exampleRecordWithArrayFields,
    Class<?> exampleRecordWithBooleanFields,
    Class<?> exampleRecordWithDefaultFields,
    Class<?> exampleRecordWithExampleEnumFields,
    Class<?> exampleRecordWithExampleRecordFields,
    Class<?> exampleRecordWithIntegerFields,
    Class<?> exampleRecordWithNumberFields,
    Class<?> exampleRecordWithStringFields,
    Class<?> exampleRecordWithSetFields,
    boolean hasAdditionalModelTypeAnnotations,
    boolean hasAdditionalEnumTypeAnnotations,
    boolean useEnumCaseInsensitive,
    boolean serializableModel,
    boolean generateBuilders
) {

  public void assertModels() {
    GeneratedEnumTestUtils.assertExampleEnum(
        exampleEnum,
        hasAdditionalEnumTypeAnnotations,
        useEnumCaseInsensitive
    );
    GeneratedEnumTestUtils.assertDeprecatedExampleEnum(
        deprecatedExampleEnum,
        hasAdditionalEnumTypeAnnotations,
        useEnumCaseInsensitive
    );
    GeneratedRecordTestUtils.assertExampleRecord(
        exampleRecord,
        hasAdditionalModelTypeAnnotations,
        serializableModel,
        generateBuilders
    );
    GeneratedRecordTestUtils.assertDeprecatedExampleRecord(
        deprecatedExampleRecord,
        hasAdditionalModelTypeAnnotations,
        serializableModel,
        generateBuilders
    );
    GeneratedRecordTestUtils.assertExampleRecordWithBooleanFields(
        exampleRecordWithBooleanFields,
        hasAdditionalModelTypeAnnotations,
        serializableModel,
        generateBuilders
    );
    GeneratedRecordTestUtils.assertExampleRecordWithExampleEnumFields(
        exampleRecordWithExampleEnumFields,
        exampleEnum,
        hasAdditionalModelTypeAnnotations,
        serializableModel,
        generateBuilders
    );
    GeneratedRecordTestUtils.assertExampleRecordWithExampleRecordFields(
        exampleRecordWithExampleRecordFields,
        exampleRecord,
        hasAdditionalModelTypeAnnotations,
        serializableModel,
        generateBuilders
    );
    GeneratedRecordTestUtils.assertExampleRecordWithIntegerFields(
        exampleRecordWithIntegerFields,
        hasAdditionalModelTypeAnnotations,
        serializableModel,
        generateBuilders
    );
    GeneratedRecordTestUtils.assertExampleRecordWithNumberFields(
        exampleRecordWithNumberFields,
        hasAdditionalModelTypeAnnotations,
        serializableModel,
        generateBuilders
    );
    GeneratedRecordTestUtils.assertExampleRecordWithStringFields(
        exampleRecordWithStringFields,
        hasAdditionalModelTypeAnnotations,
        serializableModel,
        generateBuilders
    );
    GeneratedRecordTestUtils.assertExampleRecordWithArrayFields(
        exampleRecordWithArrayFields,
        hasAdditionalModelTypeAnnotations,
        serializableModel,
        generateBuilders
    );
    GeneratedRecordTestUtils.assertExampleRecordWithSetFields(
        exampleRecordWithSetFields,
        hasAdditionalModelTypeAnnotations,
        serializableModel,
        generateBuilders
    );
    GeneratedRecordTestUtils.assertExampleRecordWithDefaultFields(
        exampleRecordWithDefaultFields,
        hasAdditionalModelTypeAnnotations,
        serializableModel,
        generateBuilders
    );
  }
}
