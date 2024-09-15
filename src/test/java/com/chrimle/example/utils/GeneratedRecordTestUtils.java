package com.chrimle.example.utils;

/**
 * Generalized Test-class for testing Generated Record-classes
 */
public class GeneratedRecordTestUtils {

  public static void assertRecord(
      final Class<?> classUnderTest,
      final boolean isDeprecated,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel,
      final Class<?>... fieldClasses) {
    AssertionUtils.assertIsRecord(classUnderTest);
    AssertionUtils.assertClassIsAnnotatedAsDeprecated(classUnderTest,
        isDeprecated);
    AssertionUtils.assertClassIsAnnotatedWithAdditionalTypeAnnotations(
        classUnderTest, hasAdditionalTypeAnnotations);
    AssertionUtils.assertModelIsSerializable(classUnderTest,
        isSerializableModel);
    AssertionUtils.assertRecordHasFieldsOfType(classUnderTest,
        isSerializableModel, fieldClasses);
  }

}
