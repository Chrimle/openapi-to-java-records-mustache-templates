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
    CustomAssertions.assertClassIsRecordClass(clazz);
  }

  public static void assertIsEnum(final Class<?> clazz) {
    CustomAssertions.assertClassIsEnumClass(clazz);
  }

  public static void assertClassIsAnnotatedWith(
      final Class<?> clazz, final Class<? extends Annotation> annotation) {
    CustomAssertions.assertClassIsAnnotatedWith(clazz, annotation);
  }

  public static void assertClassIsNotAnnotatedWith(
      final Class<?> clazz, final Class<? extends Annotation> annotation) {
    CustomAssertions.assertClassIsNotAnnotatedWith(clazz, annotation);
  }

  public static void assertRecordHasFieldsOfTypeWithNullableAnnotations(
      final GeneratedSource generatedSource) {

    final Class<?> classUnderTest = generatedSource.getClassUnderTest();

    for (final GeneratedField<?> generatedField : generatedSource.generatedFields()) {
      final Field field =
          assertRecordHasField(classUnderTest, generatedField.name(), generatedField.type());

      final Class<Valid> validAnnotation = Valid.class;
      if (generatedField.isCustomClass()) {
        assertHasAnnotation(field, validAnnotation);
      } else {
        assertDoesNotHaveAnnotation(field, validAnnotation);
      }
      final Class<NotNull> notNullAnnotation = NotNull.class;
      if (generatedField.isBeanValidationNullable()) {
        assertDoesNotHaveAnnotation(field, notNullAnnotation);
      } else {
        assertHasAnnotation(field, notNullAnnotation);
      }
      final Class<Pattern> patternAnnotation = Pattern.class;
      if (generatedField.pattern().isPresent()) {
        final Pattern actualPatternAnnotation = assertHasAnnotation(field, patternAnnotation);
        Assertions.assertEquals(generatedField.pattern().get(), actualPatternAnnotation.regexp());
      } else {
        assertDoesNotHaveAnnotation(field, patternAnnotation);
      }
      final Class<Size> sizeAnnotation = Size.class;
      if (generatedField.minLength().isPresent() || generatedField.maxLength().isPresent()) {
        final Size actualSizeAnnotation = assertHasAnnotation(field, sizeAnnotation);
        Assertions.assertEquals(generatedField.minLength().orElse(0), actualSizeAnnotation.min());
        Assertions.assertEquals(
            generatedField.maxLength().orElse(Integer.MAX_VALUE), actualSizeAnnotation.max());
      } else if (generatedField.minItems().isPresent() || generatedField.maxItems().isPresent()) {
        final Size actualSizeAnnotation = assertHasAnnotation(field, sizeAnnotation);
        Assertions.assertEquals(generatedField.minItems().orElse(0), actualSizeAnnotation.min());
        Assertions.assertEquals(
            generatedField.maxItems().orElse(Integer.MAX_VALUE), actualSizeAnnotation.max());
      } else {
        assertDoesNotHaveAnnotation(field, sizeAnnotation);
      }
      final Class<Min> minAnnotation = Min.class;
      if (generatedField.minimum().isPresent()) {
        final Min min = assertHasAnnotation(field, minAnnotation);
        Assertions.assertEquals(generatedField.minimum().get(), min.value());
      } else {
        assertDoesNotHaveAnnotation(field, minAnnotation);
      }
      final Class<Max> maxAnnotation = Max.class;
      if (generatedField.maximum().isPresent()) {
        final Max max = assertHasAnnotation(field, maxAnnotation);
        Assertions.assertEquals(generatedField.maximum().get(), max.value());
      } else {
        assertDoesNotHaveAnnotation(field, maxAnnotation);
      }
      final Class<DecimalMin> decimalMinAnnotation = DecimalMin.class;
      if (generatedField.decimalMin().isPresent()) {
        final DecimalMin decimalMin = assertHasAnnotation(field, decimalMinAnnotation);
        Assertions.assertEquals(generatedField.decimalMin().get(), decimalMin.value());
      } else {
        assertDoesNotHaveAnnotation(field, decimalMinAnnotation);
      }
      final Class<DecimalMax> decimalMaxAnnotation = DecimalMax.class;
      if (generatedField.decimalMax().isPresent()) {
        final DecimalMax decimalMax = assertHasAnnotation(field, decimalMaxAnnotation);
        Assertions.assertEquals(generatedField.decimalMax().get(), decimalMax.value());
      } else {
        assertDoesNotHaveAnnotation(field, decimalMaxAnnotation);
      }
      final Class<Email> emailAnnotation = Email.class;
      if (generatedField.isEmail()) {
        assertHasAnnotation(field, emailAnnotation);
      } else {
        assertDoesNotHaveAnnotation(field, emailAnnotation);
      }
    }
  }

  public static void assertRecordHasExpectedNumberOfFields(
      final Class<?> classUnderTest, final int expectedCount) {
    CustomAssertions.assertClassHasNumberOfFields(classUnderTest, expectedCount);
  }

  public static <T extends Annotation> T assertHasAnnotation(
      final Field field, final Class<T> annotation) {
    return CustomAssertions.assertFieldIsAnnotatedWith(field, annotation);
  }

  public static <T extends Annotation> void assertDoesNotHaveAnnotation(
      final Field field, final Class<T> annotation) {
    CustomAssertions.assertFieldIsNotAnnotatedWith(field, annotation);
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
    CustomAssertions.assertInstanceMethodReturnsValue(method, expectedValue, objectUnderTest);
  }

  public static void assertClassDoesNotHaveMethod(
      final Class<?> classUnderTest, final String methodName, final Class<?>... methodArgs) {
    CustomAssertions.assertClassDoesNotHaveMethod(classUnderTest, methodName, methodArgs);
  }

  public static Method assertClassHasMethod(
      final Class<?> classUnderTest, final String methodName, final Class<?>... methodArgs) {
    return CustomAssertions.assertClassHasMethod(classUnderTest, methodName, methodArgs);
  }

  public static void assertRecordDoesNotHaveField(
      final Class<?> classUnderTest, final String fieldName) {
    CustomAssertions.assertClassDoesNotHaveFieldWithName(classUnderTest, fieldName);
  }

  public static Field assertRecordHasField(
      final Class<?> classUnderTest, final String fieldName, final Class<?> fieldType) {
    return CustomAssertions.assertClassHasField(classUnderTest, fieldName, fieldType);
  }

  public static void assertClassImplementsInterface(
      final Class<?> classUnderTest, final Class<?> interfaceClass) {
    CustomAssertions.assertClassImplementsInterface(classUnderTest, interfaceClass);
  }

  public static void assertClassDoesNotImplementsInterface(
      final Class<?> classUnderTest, final Class<?> interfaceClass) {
    CustomAssertions.assertClassDoesNotImplementInterface(classUnderTest, interfaceClass);
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
    final Object builderObject = CustomAssertions.assertStaticMethodReturnsNonNull(builderMethod);
    for (GeneratedField<?> generatedField : generatedSource.generatedFields()) {
      final String fieldBuilderMethodName = generatedField.name();
      final Class<?> fieldClass = generatedField.type();
      final Method fieldBuilderMethod =
          CustomAssertions.assertClassHasMethod(
              builderObject.getClass(), fieldBuilderMethodName, fieldClass);
      CustomAssertions.assertInstanceMethodReturnsValue(
          fieldBuilderMethod, builderObject, builderObject, (Object) null);
    }
    final Method buildMethod =
        AssertionUtils.assertClassHasMethod(builderObject.getClass(), "build");
    final Object classObject =
        CustomAssertions.assertInstanceMethodCanBeInvoked(buildMethod, builderObject);
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
