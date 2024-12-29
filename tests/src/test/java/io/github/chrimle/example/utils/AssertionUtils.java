/*
  Copyright 2024 Chrimle

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.

*/
package io.github.chrimle.example.utils;

import io.github.chrimle.example.GeneratedSource;
import io.github.chrimle.example.models.GeneratedField;
import jakarta.validation.Valid;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public class AssertionUtils {

  public static void assertIsRecord(final Class<?> clazz) {
    Assertions.assertTrue(clazz.isRecord(), clazz.getCanonicalName() + " is NOT a record class!");
  }

  public static void assertIsEnum(final Class<?> clazz) {
    Assertions.assertTrue(clazz.isEnum(), clazz.getCanonicalName() + " is NOT an enum class!");
  }

  public static void assertClassIsAnnotatedWith(final Class<?> clazz, final Class<?> annotation) {
    Assertions.assertTrue(
        Arrays.stream(clazz.getAnnotations())
            .map(Annotation::annotationType)
            .anyMatch(annotation::equals),
        () -> clazz.getCanonicalName() + " is NOT annotated with " + annotation.getCanonicalName());
  }

  public static void assertClassIsNotAnnotatedWith(
      final Class<?> clazz, final Class<?> annotation) {
    Assertions.assertTrue(
        Arrays.stream(clazz.getAnnotations())
            .map(Annotation::annotationType)
            .noneMatch(annotation::equals),
        () -> clazz.getCanonicalName() + " IS annotated with " + annotation.getCanonicalName());
  }

  public static void assertRecordHasFieldsOfTypeWithNullableAnnotations(
      final GeneratedSource generatedSource) {

    final Class<?> classUnderTest = generatedSource.getClassUnderTest();

    for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
      final Field field =
          assertRecordHasField(classUnderTest, generatedField.name(), generatedField.type());

      final Class<Valid> validAnnotation = Valid.class;
      if (generatedField.isCustomClass()) {
        assertHasAnnotation(classUnderTest, field, validAnnotation);
      } else {
        assertDoesNotHaveAnnotation(classUnderTest, field, validAnnotation);
      }
      final Class<NotNull> notNullAnnotation = NotNull.class;
      if (generatedField.isBeanValidationNullable()) {
        assertDoesNotHaveAnnotation(classUnderTest, field, notNullAnnotation);
      } else {
        assertHasAnnotation(classUnderTest, field, notNullAnnotation);
      }
      final Class<Pattern> patternAnnotation = Pattern.class;
      if (generatedField.pattern().isPresent()) {
        final Pattern actualPatternAnnotation =
            assertHasAnnotation(classUnderTest, field, patternAnnotation);
        Assertions.assertEquals(generatedField.pattern().get(), actualPatternAnnotation.regexp());
      } else {
        assertDoesNotHaveAnnotation(classUnderTest, field, patternAnnotation);
      }
      final Class<Size> sizeAnnotation = Size.class;
      if (generatedField.minLength().isPresent() || generatedField.maxLength().isPresent()) {
        final Size actualSizeAnnotation =
            assertHasAnnotation(classUnderTest, field, sizeAnnotation);
        Assertions.assertEquals(generatedField.minLength().orElse(0), actualSizeAnnotation.min());
        Assertions.assertEquals(
            generatedField.maxLength().orElse(Integer.MAX_VALUE), actualSizeAnnotation.max());
      } else if (generatedField.minItems().isPresent() || generatedField.maxItems().isPresent()) {
        final Size actualSizeAnnotation =
            assertHasAnnotation(classUnderTest, field, sizeAnnotation);
        Assertions.assertEquals(generatedField.minItems().orElse(0), actualSizeAnnotation.min());
        Assertions.assertEquals(
            generatedField.maxItems().orElse(Integer.MAX_VALUE), actualSizeAnnotation.max());
      } else {
        assertDoesNotHaveAnnotation(classUnderTest, field, sizeAnnotation);
      }
      final Class<Min> minAnnotation = Min.class;
      if (generatedField.minimum().isPresent()) {
        final Min min = assertHasAnnotation(classUnderTest, field, minAnnotation);
        Assertions.assertEquals(generatedField.minimum().get(), min.value());
      } else {
        assertDoesNotHaveAnnotation(classUnderTest, field, minAnnotation);
      }
      final Class<Max> maxAnnotation = Max.class;
      if (generatedField.maximum().isPresent()) {
        final Max max = assertHasAnnotation(classUnderTest, field, maxAnnotation);
        Assertions.assertEquals(generatedField.maximum().get(), max.value());
      } else {
        assertDoesNotHaveAnnotation(classUnderTest, field, maxAnnotation);
      }
      final Class<DecimalMin> decimalMinAnnotation = DecimalMin.class;
      if (generatedField.decimalMin().isPresent()) {
        final DecimalMin decimalMin =
            assertHasAnnotation(classUnderTest, field, decimalMinAnnotation);
        Assertions.assertEquals(generatedField.decimalMin().get(), decimalMin.value());
      } else {
        assertDoesNotHaveAnnotation(classUnderTest, field, decimalMinAnnotation);
      }
      final Class<DecimalMax> decimalMaxAnnotation = DecimalMax.class;
      if (generatedField.decimalMax().isPresent()) {
        final DecimalMax decimalMax =
            assertHasAnnotation(classUnderTest, field, decimalMaxAnnotation);
        Assertions.assertEquals(generatedField.decimalMax().get(), decimalMax.value());
      } else {
        assertDoesNotHaveAnnotation(classUnderTest, field, decimalMaxAnnotation);
      }
      final Class<Email> emailAnnotation = Email.class;
      if (generatedField.isEmail()) {
        assertHasAnnotation(classUnderTest, field, emailAnnotation);
      } else {
        assertDoesNotHaveAnnotation(classUnderTest, field, emailAnnotation);
      }
    }
  }

  public static void assertRecordHasExpectedNumberOfFields(
      final Class<?> classUnderTest, final int expectedCount) {
    Assertions.assertEquals(
        expectedCount,
        classUnderTest.getDeclaredFields().length,
        () -> classUnderTest.getCanonicalName() + " does not have the expected number of fields!");
  }

  public static <T extends Annotation> T assertHasAnnotation(
      final Class<?> classUnderTest,
      final AnnotatedElement annotatedElement,
      final Class<T> annotation) {
    final T actualAnnotation = annotatedElement.getAnnotation(annotation);
    Assertions.assertNotNull(
        actualAnnotation,
        () ->
            classUnderTest.getCanonicalName()
                + "'s field "
                + annotatedElement
                + " is not annotated with "
                + annotation.getCanonicalName());
    return actualAnnotation;
  }

  public static <T extends Annotation> void assertDoesNotHaveAnnotation(
      final Class<?> classUnderTest,
      final AnnotatedElement annotatedElement,
      final Class<T> annotation) {
    Assertions.assertNull(
        annotatedElement.getAnnotation(annotation),
        () ->
            classUnderTest.getCanonicalName()
                + "'s field "
                + annotatedElement
                + " is annotated with "
                + annotation.getCanonicalName());
  }

  public static Object assertRecordInstantiateWithArgs(
      final Class<?> classUnderTest,
      final Constructor<?> constructorUnderTest,
      final Object... constructorArgs) {
    return Assertions.assertDoesNotThrow(
        () -> constructorUnderTest.newInstance(constructorArgs),
        () ->
            classUnderTest.getCanonicalName()
                + " could not be instantiated with constructorArgs: "
                + Arrays.toString(constructorArgs));
  }

  public static Constructor<?> assertRecordHasConstructor(
      final Class<?> classUnderTest, final Class<?>... constructorArgs) {
    return Assertions.assertDoesNotThrow(
        () -> classUnderTest.getDeclaredConstructor(constructorArgs),
        () ->
            classUnderTest.getCanonicalName()
                + " does not have the expected constructor with arguments: "
                + Arrays.toString(constructorArgs));
  }

  public static void assertInstanceMethodReturns(
      final Object objectUnderTest, final String methodName, final Object expectedValue) {
    final Class<?> classUnderTest = objectUnderTest.getClass();
    final Method method = assertClassHasMethod(classUnderTest, methodName);

    final Object actualValue =
        Assertions.assertDoesNotThrow(
            () -> method.invoke(objectUnderTest),
            () ->
                classUnderTest.getCanonicalName()
                    + " could not invoke method: "
                    + method.getName());
    Assertions.assertEquals(
        expectedValue,
        actualValue,
        () ->
            classUnderTest.getCanonicalName()
                + " method '"
                + methodName
                + "' has unexpected value");
  }

  public static void assertClassDoesNotHaveMethod(
      final Class<?> classUnderTest, final String methodName, final Class<?>... methodArgs) {
    Assertions.assertThrows(
        NoSuchMethodException.class,
        () -> classUnderTest.getMethod(methodName, methodArgs),
        () ->
            classUnderTest.getCanonicalName()
                + " unexpectedly has method: "
                + methodName
                + " with methodArgs: "
                + Arrays.toString(methodArgs));
  }

  public static Method assertClassHasMethod(
      final Class<?> classUnderTest, final String methodName, final Class<?>... methodArgs) {
    return Assertions.assertDoesNotThrow(
        () -> classUnderTest.getDeclaredMethod(methodName, methodArgs),
        () ->
            classUnderTest.getCanonicalName()
                + " does not have method: "
                + methodName
                + " with methodArgs: "
                + Arrays.toString(methodArgs));
  }

  public static void assertRecordDoesNotHaveField(
      final Class<?> classUnderTest, final String fieldName) {
    Assertions.assertThrows(
        NoSuchFieldException.class,
        () -> classUnderTest.getDeclaredField(fieldName),
        () -> classUnderTest.getCanonicalName() + " unexpectedly has the field: " + fieldName);
  }

  public static Field assertRecordHasField(
      final Class<?> classUnderTest, final String fieldName, final Class<?> fieldType) {
    final Field field =
        Assertions.assertDoesNotThrow(
            () -> classUnderTest.getDeclaredField(fieldName),
            () -> classUnderTest.getCanonicalName() + " does not have the field: " + fieldName);

    Assertions.assertEquals(fieldType, field.getType());

    return field;
  }

  public static void assertClassImplementsInterface(
      final Class<?> classUnderTest, final Class<?> interfaceClass) {
    Assertions.assertTrue(Arrays.asList(classUnderTest.getInterfaces()).contains(interfaceClass));
  }

  public static void assertClassDoesNotImplementsInterface(
      final Class<?> classUnderTest, final Class<?> interfaceClass) {
    Assertions.assertFalse(Arrays.asList(classUnderTest.getInterfaces()).contains(interfaceClass));
  }

  public static void assertClassHasInnerClass(
      final Class<?> classUnderTest, final String innerClassName) {
    Assertions.assertTrue(
        Arrays.stream(classUnderTest.getClasses())
            .anyMatch(b -> innerClassName.equals(b.getSimpleName())),
        () ->
            classUnderTest.getCanonicalName()
                + " does NOT have inner class with name: "
                + innerClassName);
  }

  public static void assertClassDoesNotHaveInnerClass(
      final Class<?> classUnderTest, final String innerClassName) {
    Assertions.assertTrue(
        Arrays.stream(classUnderTest.getClasses())
            .noneMatch(b -> innerClassName.equals(b.getSimpleName())),
        () ->
            classUnderTest.getCanonicalName()
                + " DOES have inner class with name: "
                + innerClassName);
  }

  public static void assertInnerBuilderClassExistsAndCanBuildRecord(
      final GeneratedSource generatedSource) {

    final Class<?> classUnderTest = generatedSource.getClassUnderTest();

    // Assert Builder can be instantiated from builder()-method
    final Method builderMethod = assertClassHasMethod(classUnderTest, "builder");
    final Object builderObject = Assertions.assertDoesNotThrow(() -> builderMethod.invoke(null));
    Assertions.assertNotNull(builderObject);
    for (GeneratedField<?> generatedField : generatedSource.generatedFields()) {
      final String fieldBuilderMethodName = generatedField.name();
      final Class<?> fieldClass = generatedField.type();
      final Method fieldBuilderMethod =
          Assertions.assertDoesNotThrow(
              () -> builderObject.getClass().getDeclaredMethod(fieldBuilderMethodName, fieldClass));
      final Object object =
          Assertions.assertDoesNotThrow(
              () -> fieldBuilderMethod.invoke(builderObject, (Object) null));
      Assertions.assertEquals(builderObject, object);
    }
    final Method buildMethod =
        AssertionUtils.assertClassHasMethod(builderObject.getClass(), "build");
    final Object classObject =
        Assertions.assertDoesNotThrow(() -> buildMethod.invoke(builderObject));
    Assertions.assertNotNull(classObject);
    Assertions.assertInstanceOf(classUnderTest, classObject);
  }

  public static void assertStaticMethodWithArgsThrows(
      final Method method,
      final Class<? extends Throwable> expectedException,
      final Object... args) {
    Assertions.assertInstanceOf(
        expectedException,
        Assertions.assertThrows(InvocationTargetException.class, () -> method.invoke(null, args))
            .getCause());
  }
}
