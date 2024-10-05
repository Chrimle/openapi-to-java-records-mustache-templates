package com.chrimle.example.utils;

import com.chrimle.example.GeneratedSource;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/** Generalized Test-class for testing Generated Record-classes */
public class GeneratedRecordTestUtils {

  public static void assertRecord(final GeneratedSource generatedSource) {
    assertRecord(generatedSource, generatedSource.fieldClasses());
  }

  public static void assertRecord(
      final GeneratedSource generatedSource, final Class<?>... fieldClasses) {

    final Class<?> classUnderTest = generatedSource.getClassUnderTest();

    AssertionUtils.assertIsRecord(classUnderTest);
    AssertionUtils.assertClassIsAnnotatedAsDeprecated(
        classUnderTest, generatedSource.isDeprecated());
    AssertionUtils.assertClassIsAnnotatedWithAdditionalTypeAnnotations(
        classUnderTest, generatedSource.hasAdditionalModelTypeAnnotations());
    AssertionUtils.assertModelIsSerializable(generatedSource);
    AssertionUtils.assertRecordHasFieldsOfTypeWithNullableAnnotations(
        generatedSource, fieldClasses);
    AssertionUtils.assertClassImplementsSerializable(generatedSource);
    AssertionUtils.assertRecordHasBuilderInnerClass(
        classUnderTest, generatedSource.generateBuilders(), fieldClasses);
    Constructor<?> constructor =
        AssertionUtils.assertRecordHasConstructor(classUnderTest, fieldClasses);
    AssertionUtils.assertRecordInstantiateWithArgs(
        classUnderTest, constructor, Arrays.stream(fieldClasses).map(x -> null).toArray());
  }

  public static void assertExampleRecordWithDefaultFields(final GeneratedSource generatedSource) {

    final Class<?> classUnderTest = generatedSource.getClassUnderTest();

    assertRecord(generatedSource, generatedSource.fieldClasses());

    final Constructor<?> constructor =
        AssertionUtils.assertRecordHasConstructor(classUnderTest, generatedSource.fieldClasses());

    AssertionUtils.assertRecordFieldHasValue(
        AssertionUtils.assertRecordInstantiateWithArgs(classUnderTest, constructor, (Object) null),
        "field1",
        "someDefaultValue");

    AssertionUtils.assertRecordFieldHasValue(
        AssertionUtils.assertRecordInstantiateWithArgs(classUnderTest, constructor, "someValue"),
        "field1",
        "someValue");
  }
}
