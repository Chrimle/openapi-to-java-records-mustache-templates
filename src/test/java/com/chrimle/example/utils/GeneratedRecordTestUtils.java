package com.chrimle.example.utils;

import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Generalized Test-class for testing Generated Record-classes
 */
public class GeneratedRecordTestUtils {

  public static void assertRecord(
      final Class<?> classUnderTest,
      final boolean isDeprecated,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel,
      final boolean generateBuilders,
      final boolean isNullable,
      final boolean useJakartaEe,
      final Class<?>... fieldClasses) {
    AssertionUtils.assertIsRecord(classUnderTest);
    AssertionUtils.assertClassIsAnnotatedAsDeprecated(classUnderTest,
        isDeprecated);
    AssertionUtils.assertClassIsAnnotatedWithAdditionalTypeAnnotations(
        classUnderTest, hasAdditionalTypeAnnotations);
    AssertionUtils.assertModelIsSerializable(classUnderTest,
        isSerializableModel);
    AssertionUtils.assertRecordHasFieldsOfTypeWithNullableAnnotations(classUnderTest,
        isSerializableModel, isNullable, useJakartaEe, fieldClasses);
    AssertionUtils.assertClassImplementsSerializable(classUnderTest,
        isSerializableModel);
    AssertionUtils.assertRecordHasBuilderInnerClass(classUnderTest,
        generateBuilders, isNullable, fieldClasses);
    Constructor<?> constructor = AssertionUtils.assertRecordHasConstructor(classUnderTest,
        fieldClasses);
    AssertionUtils.assertRecordInstantiateWithArgs(classUnderTest,
        constructor, Arrays.stream(fieldClasses).map(x -> null).toArray());
  }

  public static void assertExampleRecord(
      final Class<?> classUnderTest,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel,
      final boolean generateBuilders,
      final boolean useJakartaEe
  ) {
    assertRecord(
        classUnderTest,
        false,
        hasAdditionalTypeAnnotations,
        isSerializableModel,
        generateBuilders,
        false,
        useJakartaEe,
        Boolean.class
    );
  }

  public static void assertDeprecatedExampleRecord(
      final Class<?> classUnderTest,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel,
      final boolean generateBuilders,
      final boolean useJakartaEe
  ) {
    assertRecord(
        classUnderTest,
        true,
        hasAdditionalTypeAnnotations,
        isSerializableModel,
        generateBuilders,
        false,
        useJakartaEe,
        Boolean.class
    );
  }

  public static void assertExampleRecordWithDefaultFields(
      final Class<?> classUnderTest,
      final boolean hasAdditionalModelTypeAnnotations,
      final boolean isSerializableModel,
      final boolean generateBuilders,
      final boolean useJakartaEe
  ) {
    assertRecord(
        classUnderTest,
        false,
        hasAdditionalModelTypeAnnotations,
        isSerializableModel,
        generateBuilders,
        false,
        useJakartaEe,
        String.class
    );

    final Constructor<?> constructor = AssertionUtils.assertRecordHasConstructor(
        classUnderTest, String.class);

    AssertionUtils.assertRecordFieldHasValue(
        AssertionUtils.assertRecordInstantiateWithArgs(
            classUnderTest,
            constructor,
            (Object) null
        ),
        "field1",
        "someDefaultValue"
    );

    AssertionUtils.assertRecordFieldHasValue(
        AssertionUtils.assertRecordInstantiateWithArgs(
            classUnderTest,
            constructor,
            "someValue"
        ),
        "field1",
        "someValue"
    );
  }

  public static void assertExampleRecordWithRequiredFieldsOfEachType(
      final Class<?> classUnderTest,
      final Class<?> recordClass,
      final Class<?> enumClass,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel,
      final boolean generateBuilders,
      final boolean useJakartaEe) {
    assertRecord(
        classUnderTest,
        false,
        hasAdditionalTypeAnnotations,
        isSerializableModel,
        generateBuilders,
        false,
        useJakartaEe,
        Boolean.class,
        String.class,
        Integer.class,
        BigDecimal.class,
        List.class,
        Set.class,
        recordClass,
        enumClass
    );
  }

  public static void assertExampleRecordWithNullableFieldsOfEachType(
      final Class<?> classUnderTest,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel,
      final boolean generateBuilders,
      final boolean useJakartaEe) {
    assertRecord(
        classUnderTest,
        false,
        hasAdditionalTypeAnnotations,
        isSerializableModel,
        generateBuilders,
        true,
        useJakartaEe,
        Boolean.class,
        String.class,
        Integer.class,
        BigDecimal.class,
        List.class,
        Set.class
    );
  }
}
