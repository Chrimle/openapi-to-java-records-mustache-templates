package com.chrimle.example.utils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public class AssertionUtils {

  public static void assertIsRecord(final Class<?> clazz) {
    Assertions.assertTrue(clazz.isRecord());
  }

  public static void assertIsEnum(final Class<?> clazz) {
    Assertions.assertTrue(clazz.isEnum());
  }

  public static void assertClassIsAnnotatedAsDeprecated(final Class<?> clazz) {
    Assertions.assertTrue(
        Arrays.stream(clazz.getAnnotations())
            .map(Annotation::annotationType)
            .anyMatch(annotation -> annotation.equals(Deprecated.class)));
  }

  public static void assertClassIsNotAnnotatedAsDeprecated(
      final Class<?> clazz) {
    Assertions.assertTrue(
        Arrays.stream(clazz.getAnnotations())
            .map(Annotation::annotationType)
            .noneMatch(annotation -> annotation.equals(Deprecated.class)));
  }

  public static void assertClassIsAnnotatedWith(final Class<?> clazz,
      final Class<?> annotation) {
    Assertions.assertTrue(
        Arrays.stream(clazz.getAnnotations())
            .map(Annotation::annotationType)
            .anyMatch(aClass -> aClass.equals(annotation))
    );
  }

  public static void assertClassIsNotAnnotatedWith(final Class<?> clazz,
      final Class<?> annotation) {
    Assertions.assertTrue(
        Arrays.stream(clazz.getAnnotations())
            .map(Annotation::annotationType)
            .noneMatch(aClass -> aClass.equals(annotation))
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

}
