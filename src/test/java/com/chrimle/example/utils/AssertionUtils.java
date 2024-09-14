package com.chrimle.example.utils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public class AssertionUtils {

  public static void assertIsRecord(final Class<?> clazz) {
    Assertions.assertTrue(clazz.isRecord(),
        clazz.getCanonicalName() + " is NOT a record class!");
  }

  public static void assertIsEnum(final Class<?> clazz) {
    Assertions.assertTrue(clazz.isEnum(),
        clazz.getCanonicalName() + " is NOT an enum class!");
  }

  public static void assertClassIsAnnotatedWithAdditionalTypeAnnotations(
      final Class<?> classUnderTest,
      final boolean hasAdditionalTypeAnnotations) {
    assertClassIsAnnotatedWith(classUnderTest,
        com.chrimle.example.annotations.TestAnnotationOne.class,
        hasAdditionalTypeAnnotations);
    assertClassIsAnnotatedWith(classUnderTest,
        com.chrimle.example.annotations.TestAnnotationTwo.class,
        hasAdditionalTypeAnnotations);
    assertClassIsAnnotatedWith(classUnderTest,
        com.chrimle.example.annotations.TestAnnotationThree.class,
        hasAdditionalTypeAnnotations);

  }

  public static void assertClassIsAnnotatedAsDeprecated(
      final Class<?> classUnderTest, final boolean isDeprecated) {
    assertClassIsAnnotatedWith(classUnderTest, Deprecated.class, isDeprecated);
  }

  private static void assertClassIsAnnotatedWith(final Class<?> classUnderTest,
      final Class<?> annotation, final boolean hasAnnotation) {
    if (hasAnnotation) {
      assertClassIsAnnotatedWith(classUnderTest, annotation);
    } else {
      assertClassIsNotAnnotatedWith(classUnderTest, annotation);
    }
  }


  private static void assertClassIsAnnotatedWith(final Class<?> clazz,
      final Class<?> annotation) {
    Assertions.assertTrue(
        Arrays.stream(clazz.getAnnotations())
            .map(Annotation::annotationType)
            .anyMatch(aClass -> aClass.equals(annotation)),
        clazz.getCanonicalName() + " is NOT annotated with "
            + annotation.getCanonicalName()
    );
  }

  private static void assertClassIsNotAnnotatedWith(final Class<?> clazz,
      final Class<?> annotation) {
    Assertions.assertTrue(
        Arrays.stream(clazz.getAnnotations())
            .map(Annotation::annotationType)
            .noneMatch(aClass -> aClass.equals(annotation)),
        clazz.getCanonicalName() + " IS annotated with "
            + annotation.getCanonicalName()
    );
  }


  public static void assertRecordHasNumberOfFieldsOfType(final Class<?> clazz,
      final int count, final Class<?> type) {
    for (int i = 1; i <= count; i++) {
      final Field field = clazz.getDeclaredFields()[
          i - 1];
      Assertions.assertEquals("field" + i, field.getName());
      Assertions.assertEquals(type, field.getType());
    }
  }

  public static void assertModelIsSerializable(final Class<?> classUnderTest,
      final boolean isModelSerializable) {
    if (isModelSerializable) {
      assertModelHasSerialVersionField(classUnderTest);
    } else {
      assertModelDoesNotHaveSerialVersionField(classUnderTest);
    }
  }

  private static void assertModelDoesNotHaveSerialVersionField(
      final Class<?> classUnderTest) {
    Assertions.assertThrows(NoSuchFieldException.class,
        () -> classUnderTest.getDeclaredField("serialVersionUID"),
        classUnderTest.getCanonicalName() + " HAS 'serialVersionUID'-field!"
    );
  }


  private static void assertModelHasSerialVersionField(
      final Class<?> classUnderTest) {
    Assertions.assertDoesNotThrow(
        () -> classUnderTest.getDeclaredField("serialVersionUID"),
        classUnderTest.getCanonicalName()
            + " does NOT have 'serialVersionUID'-field!");
  }

}
