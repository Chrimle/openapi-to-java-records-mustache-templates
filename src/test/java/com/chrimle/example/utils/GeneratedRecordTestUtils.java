package com.chrimle.example.utils;

import java.math.BigDecimal;
import java.util.List;

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

  public static void assertExampleRecord(
      final Class<?> classUnderTest,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel
  ) {
    assertRecord(
        classUnderTest,
        false,
        hasAdditionalTypeAnnotations,
        isSerializableModel,
        Boolean.class
    );
  }

  public static void assertDeprecatedExampleRecord(
      final Class<?> classUnderTest,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel
  ) {
    assertRecord(
        classUnderTest,
        true,
        hasAdditionalTypeAnnotations,
        isSerializableModel,
        Boolean.class
    );
  }

  public static void assertExampleRecordWithArrayFields(
      final Class<?> classUnderTest,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel
  ) {
    assertRecord(
        classUnderTest,
        false,
        hasAdditionalTypeAnnotations,
        isSerializableModel,
        List.class,
        List.class,
        List.class
    );
  }

  public static void assertExampleRecordWithBooleanFields(
      final Class<?> classUnderTest,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel
  ) {
    assertRecord(
        classUnderTest,
        false,
        hasAdditionalTypeAnnotations,
        isSerializableModel,
        Boolean.class,
        Boolean.class,
        Boolean.class
    );
  }

  public static void assertExampleRecordWithNumberFields(
      final Class<?> classUnderTest,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel
  ) {
    assertRecord(
        classUnderTest,
        false,
        hasAdditionalTypeAnnotations,
        isSerializableModel,
        BigDecimal.class,
        BigDecimal.class,
        BigDecimal.class
    );
  }

  public static void assertExampleRecordWithStringFields(
      final Class<?> classUnderTest,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel
  ) {
    assertRecord(
        classUnderTest,
        false,
        hasAdditionalTypeAnnotations,
        isSerializableModel,
        String.class,
        String.class,
        String.class
    );
  }


}
