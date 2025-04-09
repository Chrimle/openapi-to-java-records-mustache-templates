/*
  Copyright 2024-2025 Chrimle

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
package io.github.chrimle.o2jrm.utils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

/**
 * Collection of custom assertion methods which complements {@link Assertions} and {@link
 * org.junit.platform.commons.util.ReflectionUtils}.
 *
 * @since 2.5.3
 */
public final class CustomAssertions extends CustomUtilityAssertions {

  private CustomAssertions() {
    super();
  }

  /**
   * Asserts that the {@code aClass} is a <i>record</i> class.
   *
   * @param aClass to be asserted.
   * @since 2.5.3
   */
  public static void assertClassIsRecordClass(final Class<?> aClass) {
    Assertions.assertTrue(aClass::isRecord, () -> aClass + " is NOT a record class");
  }

  /**
   * Asserts that the {@code aClass} is an <i>enum</i> class.
   *
   * @param aClass to be asserted.
   * @since 2.5.3
   */
  public static void assertClassIsEnumClass(final Class<?> aClass) {
    Assertions.assertTrue(aClass::isEnum, () -> aClass + " is NOT an enum class");
  }

  /**
   * Asserts that the {@code aClass} is annotated with the {@code annotation}.
   *
   * @param aClass to be asserted.
   * @param annotation which the {@code aClass} is expected to be annotated with.
   * @param <T> the type of the {@code annotation}.
   * @return the {@code annotation} instance from the {@code aClass}.
   * @since 2.5.3
   */
  public static <T extends Annotation> T assertClassIsAnnotatedWith(
      final Class<?> aClass, final Class<T> annotation) {
    return assertNotNull(
        () -> aClass.getAnnotation(annotation),
        () ->
            aClass.getCanonicalName() + " is NOT annotated with " + annotation.getCanonicalName());
  }

  /**
   * Asserts that the {@code aClass} is <b>not</b> annotated with the {@code annotation}.
   *
   * @param aClass to be asserted.
   * @param annotation which the {@code aClass} is expected <b>not</b> to be annotated with.
   * @since 2.5.3
   */
  public static void assertClassIsNotAnnotatedWith(
      final Class<?> aClass, final Class<? extends Annotation> annotation) {
    assertNull(
        () -> aClass.getAnnotation(annotation),
        () -> aClass.getCanonicalName() + " IS annotated with " + annotation.getCanonicalName());
  }

  /**
   * Asserts that the {@code aClass} <i>implements</i> the {@code interfaceClass}.
   *
   * @param aClass to be asserted.
   * @param interfaceClass which the {@code aClass} is expected to <i>implement</i>.
   * @since 2.5.3
   */
  public static void assertClassImplementsInterface(
      final Class<?> aClass, final Class<?> interfaceClass) {
    Assertions.assertTrue(
        () -> Arrays.asList(aClass.getInterfaces()).contains(interfaceClass),
        () ->
            aClass.getCanonicalName()
                + " does NOT implement the interface "
                + interfaceClass.getCanonicalName());
  }

  /**
   * Asserts that the {@code aClass} does <b>not</b> <i>implement</i> the {@code interfaceClass}.
   *
   * @param aClass to be asserted.
   * @param interfaceClass which the {@code aClass} is expected <b>not</b> to <i>implement</i>.
   * @since 2.5.3
   */
  public static void assertClassDoesNotImplementInterface(
      final Class<?> aClass, final Class<?> interfaceClass) {
    Assertions.assertFalse(
        () -> Arrays.asList(aClass.getInterfaces()).contains(interfaceClass),
        () ->
            aClass.getCanonicalName()
                + " DOES implement the interface "
                + interfaceClass.getCanonicalName());
  }

  /**
   * Asserts that the {@code aClass} has an inner class named {@code innerClassName}.
   *
   * @param aClass to be asserted.
   * @param innerClassName of the inner class which the {@code aClass} is expected to have.
   * @return the inner {@link Class} named {@code innerClassName}.
   * @since 2.9.0
   */
  public static Class<?> assertClassHasInnerClass(
      final Class<?> aClass, final String innerClassName) {
    return assertNotNull(
        () ->
            Arrays.stream(aClass.getClasses())
                .filter(innerClass -> innerClass.getSimpleName().equals(innerClassName))
                .findFirst()
                .orElse(null),
        () -> aClass.getCanonicalName() + " does NOT have inner class " + innerClassName);
  }

  /**
   * Asserts that the {@code aClass} does <b>not</b> have an inner class named {@code
   * innerClassName}.
   *
   * @param aClass to be asserted.
   * @param innerClassName of the inner class which the {@code aClass} is expected <b>not</b> to
   *     have.
   * @since 2.5.3
   */
  public static void assertClassDoesNotHaveInnerClass(
      final Class<?> aClass, final String innerClassName) {
    Assertions.assertTrue(
        () ->
            Arrays.stream(aClass.getClasses())
                .map(Class::getSimpleName)
                .noneMatch(innerClassName::equals),
        () -> aClass.getCanonicalName() + " DOES have inner class " + innerClassName);
  }

  /**
   * Asserts that the {@code aClass} has a <i>method</i> named {@code methodName} and with method
   * parameters of types {@code methodParameterTypes}. The <i>method</i> may either be an instance
   * method, or a {@code static} method.
   *
   * @param aClass to be asserted.
   * @param methodName of the method which {@code aClass} is expected to have.
   * @param methodParameterTypes of the method which {@code aClass} is expected to have.
   * @return the {@link Method} with the matching name and parameter types.
   * @since 2.5.3
   */
  public static Method assertClassHasMethod(
      final Class<?> aClass, final String methodName, final Class<?>... methodParameterTypes) {
    return Assertions.assertDoesNotThrow(
        () -> aClass.getDeclaredMethod(methodName, methodParameterTypes),
        () ->
            aClass.getCanonicalName()
                + " does NOT have method '"
                + methodName
                + "' with parameterTypes "
                + Arrays.toString(methodParameterTypes));
  }

  /**
   * Asserts that the {@code aClass} does <b>not</b> have a <i>method</i> named {@code methodName}
   * and with method parameters of types {@code methodParameterTypes}. The <i>method</i> may either
   * be an instance method, or a {@code static} method.
   *
   * @param aClass to be asserted.
   * @param methodName of the method which {@code aClass} is expected <b>not</b> to have.
   * @param methodParameterTypes of the method which {@code aClass} is expected <b>not</b> to have.
   * @since 2.5.3
   */
  public static void assertClassDoesNotHaveMethod(
      final Class<?> aClass, final String methodName, final Class<?>... methodParameterTypes) {
    Assertions.assertThrows(
        NoSuchMethodException.class,
        () -> aClass.getDeclaredMethod(methodName, methodParameterTypes),
        () ->
            aClass.getCanonicalName()
                + " DOES have method '"
                + methodName
                + "' with parameterTypes "
                + Arrays.toString(methodParameterTypes));
  }

  /**
   * Asserts that the {@code method} is annotated with the {@code expectedAnnotation}.
   *
   * @param method to assert.
   * @param expectedAnnotation which the {@code method} is expected to be annotated with.
   * @return the expected {@link Annotation} instance of the {@code method}.
   * @since 2.8.1
   */
  public static Annotation assertMethodIsAnnotatedWith(
      final Method method, final Class<? extends Annotation> expectedAnnotation) {
    return assertNotNull(
        () -> method.getAnnotation(expectedAnnotation),
        () -> method.getName() + " is NOT annotated with " + expectedAnnotation.getCanonicalName());
  }

  /**
   * Asserts that the {@code method} is <b>not</b> annotated with the {@code unexpectedAnnotation}.
   *
   * @param method to assert.
   * @param unexpectedAnnotation which the {@code method} is expected <b>not</b> to be annotated
   *     with.
   * @since 2.8.1
   */
  public static void assertMethodIsNotAnnotatedWith(
      final Method method, final Class<? extends Annotation> unexpectedAnnotation) {
    assertNull(
        () -> method.getAnnotation(unexpectedAnnotation),
        () -> method.getName() + " IS annotated with " + unexpectedAnnotation.getCanonicalName());
  }

  /**
   * Asserts that the {@code method} throws {@code expectedException} when invoked with the {@code
   * methodArguments}.
   *
   * @param method to be asserted.
   * @param expectedException to be thrown when invoking the method.
   * @param methodArguments to use when invoking the method.
   * @since 2.5.3
   */
  public static void assertStaticMethodThrowsWhenInvoked(
      final Method method,
      final Class<? extends Throwable> expectedException,
      final Object... methodArguments) {
    Assertions.assertInstanceOf(
        expectedException,
        Assertions.assertThrows(
                InvocationTargetException.class, () -> method.invoke(null, methodArguments))
            .getCause(),
        () ->
            method
                + " did NOT throw "
                + expectedException.getCanonicalName()
                + " when invoked with arguments "
                + Arrays.toString(methodArguments));
  }

  /**
   * Asserts that the <b>static</b> {@code method} can be invoked with the {@code methodArguments}.
   *
   * @param method to be asserted.
   * @param methodArguments to use when invoking the method.
   * @return the value from invoking the method, or {@code null} if the method has return type
   *     {@code void}.
   * @since 2.5.3
   */
  public static Object assertStaticMethodCanBeInvoked(
      final Method method, final Object... methodArguments) {
    return Assertions.assertDoesNotThrow(
        () -> method.invoke(null, methodArguments),
        () -> method + " could NOT be invoked with " + Arrays.toString(methodArguments));
  }

  /**
   * Asserts that the <b>static</b> {@code method} returns a non-{@code null} value when invoked
   * with the {@code methodArguments}.
   *
   * @param method to be asserted.
   * @param methodArguments to use when invoking the method.
   * @return the non-null value from invoking the method.
   * @since 2.5.3
   */
  public static Object assertStaticMethodReturnsNonNull(
      final Method method, final Object... methodArguments) {
    return assertNotNull(
        () -> assertStaticMethodCanBeInvoked(method, methodArguments),
        () -> method + " returned null when invoked with " + Arrays.toString(methodArguments));
  }

  /**
   * Asserts that the <b>static</b> {@code method} returns the {@code expectedValue} when invoked
   * with the {@code methodArguments}.
   *
   * @param method to be asserted.
   * @param expectedValue of the value returned from invoking the method.
   * @param methodArguments to invoke the method with.
   * @since 2.5.3
   */
  public static void assertStaticMethodReturnsValue(
      final Method method, final Object expectedValue, final Object... methodArguments) {
    assertEquals(
        expectedValue,
        () -> assertStaticMethodCanBeInvoked(method, methodArguments),
        () ->
            method
                + " did NOT return value "
                + expectedValue
                + " when invoked with "
                + Arrays.toString(methodArguments));
  }

  /**
   * Asserts that the <b>instance</b> {@code method} can be invoked on the {@code object} with the
   * {@code methodArguments}.
   *
   * @param method to be asserted.
   * @param object to invoke the method on.
   * @param methodArguments to invoke the method with.
   * @return the value from invoking the method, or {@code null} if the method has return type
   *     {@code void}.
   * @since 2.5.3
   */
  public static Object assertInstanceMethodCanBeInvoked(
      final Method method, final Object object, final Object... methodArguments) {
    return Assertions.assertDoesNotThrow(
        () -> method.invoke(object, methodArguments),
        () -> method + " could NOT be invoked with " + Arrays.toString(methodArguments));
  }

  /**
   * Asserts that the <b>instance</b> {@code method} throws the {@code expectedException} when
   * invoked with the {@code methodArguments}.
   *
   * @param method to assert.
   * @param expectedException to be thrown.
   * @param object to invoke the {@code method} on.
   * @param methodArguments to invoke the {@code method} with.
   * @since 2.9.0
   */
  public static void assertInstanceMethodThrowsWhenInvoked(
      final Method method,
      final Class<? extends Throwable> expectedException,
      final Object object,
      final Object... methodArguments) {
    Assertions.assertInstanceOf(
        expectedException,
        Assertions.assertThrows(
                InvocationTargetException.class, () -> method.invoke(object, methodArguments))
            .getCause(),
        () ->
            method
                + " did NOT throw "
                + expectedException.getCanonicalName()
                + " when invoked with arguments "
                + Arrays.toString(methodArguments));
  }

  /**
   * Asserts that the <b>instance</b> {@code method} returns a non-{@code null} value when invoked
   * with the {@code methodArguments}.
   *
   * @param method to be asserted.
   * @param object to invoke the method on.
   * @param methodArguments to invoke the method with.
   * @return the non-null value from invoking the method.
   * @since 2.5.3
   */
  public static Object assertInstanceMethodReturnsNonNull(
      final Method method, final Object object, final Object... methodArguments) {
    return assertNotNull(
        () -> assertInstanceMethodCanBeInvoked(method, object, methodArguments),
        () -> method + " returned null when invoked with " + Arrays.toString(methodArguments));
  }

  /**
   * Asserts that the <b>instance</b> {@code method} returns the {@code expectedValue} when invoked
   * with the {@code methodArguments}.
   *
   * @param method to be asserted.
   * @param expectedValue of the value returned from invoking the method.
   * @param object to invoke the method on.
   * @param methodArguments to invoke the method with.
   * @since 2.5.3
   */
  public static void assertInstanceMethodReturnsValue(
      final Method method,
      final Object expectedValue,
      final Object object,
      final Object... methodArguments) {
    assertEquals(
        expectedValue,
        () -> assertInstanceMethodCanBeInvoked(method, object, methodArguments),
        () ->
            method
                + " did NOT return value "
                + expectedValue
                + " when invoked with "
                + Arrays.toString(methodArguments));
  }

  /**
   * Asserts that the {@code aClass} has a constructor with method parameter types of {@code
   * parameterTypes}.
   *
   * @param aClass to be asserted.
   * @param parameterTypes of the constructor which {@code aClass} is expected to have.
   * @param <T> type of the {@code aClass}.
   * @return the {@link Constructor}, with the matching parameter types.
   * @since 2.5.3
   */
  public static <T> Constructor<T> assertClassHasConstructor(
      final Class<T> aClass, final Class<?>... parameterTypes) {
    return Assertions.assertDoesNotThrow(
        () -> aClass.getDeclaredConstructor(parameterTypes),
        () ->
            aClass.getCanonicalName()
                + " does NOT have a constructor with parameter types "
                + Arrays.toString(parameterTypes));
  }

  /**
   * Asserts that the {@code constructor} can be invoked with the {@code methodArguments} to
   * instantiate a new object of type {@link T}.
   *
   * @param constructor to be asserted.
   * @param methodArguments to invoke the constructor with.
   * @param <T> type of the instantiated object.
   * @return the instantiated object of type {@link T}.
   * @since 2.5.3
   */
  public static <T> T assertConstructorCanInstantiateObject(
      final Constructor<T> constructor, final Object... methodArguments) {
    return Assertions.assertDoesNotThrow(
        () -> constructor.newInstance(methodArguments),
        () -> constructor + " could NOT be instantiated with " + Arrays.toString(methodArguments));
  }

  /**
   * Asserts that the {@code aClass} has number of fields equal to {@code numberOfFields}.
   *
   * @param aClass to be asserted.
   * @param numberOfFields which the {@code aClass} is expected to have.
   * @since 2.5.3
   */
  public static void assertClassHasNumberOfFields(final Class<?> aClass, final int numberOfFields) {
    assertEquals(
        numberOfFields,
        () -> aClass.getDeclaredFields().length,
        () -> aClass.getCanonicalName() + " does NOT have " + numberOfFields + " fields");
  }

  /**
   * Asserts that the {@code aClass} has a field named {@code fieldName} and of type {@code
   * fieldType}.
   *
   * @param aClass to be asserted.
   * @param fieldName of the field which {@code aClass} is expected to have.
   * @param fieldType of the field which {@code aClass} is expected to have.
   * @return the {@link Field} with the matching name and type.
   * @since 2.5.3
   */
  public static Field assertClassHasField(
      final Class<?> aClass, final String fieldName, final Class<?> fieldType) {
    return assertFieldIsOfType(assertClassHasFieldWithName(aClass, fieldName), fieldType);
  }

  /**
   * Asserts that the {@code aClass} has a field named {@code fieldName}.
   *
   * @param aClass to be asserted.
   * @param fieldName of the field which {@code aClass} is expected to have.
   * @return the {@link Field} with the matching name.
   * @since 2.5.3
   */
  public static Field assertClassHasFieldWithName(final Class<?> aClass, final String fieldName) {
    return Assertions.assertDoesNotThrow(
        () -> aClass.getDeclaredField(fieldName),
        () -> aClass.getCanonicalName() + " does NOT have a field with name " + fieldName);
  }

  /**
   * Asserts that the {@code aClass} does <b>not</b> have a field with the matching {@code
   * fieldName}.
   *
   * @param aClass to be asserted.
   * @param fieldName of the field which {@code aClass} is expected <b>not</b> to have.
   * @since 2.5.3
   */
  public static void assertClassDoesNotHaveFieldWithName(
      final Class<?> aClass, final String fieldName) {
    Assertions.assertThrows(
        NoSuchFieldException.class,
        () -> aClass.getDeclaredField(fieldName),
        () -> aClass.getCanonicalName() + " DOES have a field with name " + fieldName);
  }

  /**
   * Asserts that the {@code field} is annotated with the {@code annotation}.
   *
   * @param field to be asserted.
   * @param annotation which the {@code field} is expected to be annotated with.
   * @param <T> the type of the {@code annotation}.
   * @return the {@code annotation} instance from the {@code field}.
   * @since 2.5.3
   */
  public static <T extends Annotation> T assertFieldIsAnnotatedWith(
      final Field field, final Class<T> annotation) {
    return assertNotNull(
        () -> field.getAnnotation(annotation),
        () -> field + " is NOT annotated with " + annotation.getCanonicalName());
  }

  /**
   * Asserts that the {@code field} is <b>not</b> annotated with the {@code annotation}.
   *
   * @param field to be asserted.
   * @param annotation which the {@code field} is expected <b>not</b> to be annotated with.
   * @since 2.5.3
   */
  public static void assertFieldIsNotAnnotatedWith(
      final Field field, final Class<? extends Annotation> annotation) {
    assertNull(
        () -> field.getAnnotation(annotation),
        () -> field + " IS annotated with " + annotation.getCanonicalName());
  }

  /**
   * Asserts that the {@code field} is of type {@code type}.
   *
   * @param field to be asserted.
   * @param type which the {@code field} is expected to be.
   * @return the {@code field}.
   * @since 2.5.3
   */
  public static Field assertFieldIsOfType(final Field field, final Class<?> type) {
    assertEquals(type, field::getType, () -> field + " is NOT of type " + type.getCanonicalName());
    return field;
  }

  /**
   * Asserts that the {@code aClass} has <i>enum constants</i>, also implying it is an enum class.
   *
   * @param aClass to be asserted.
   * @return the <i>enum constants</i>, as an {@code Array}, in the order they are declared.
   * @since 2.5.3
   */
  public static Enum<?>[] assertClassHasEnumConstants(final Class<?> aClass) {
    return (Enum<?>[])
        assertNotNull(
            aClass::getEnumConstants,
            () -> aClass.getCanonicalName() + " does NOT have enum constants");
  }

  /**
   * Asserts that the {@code aClass} has {@code expectedCount} number of <i>enum constants</i>.
   *
   * @param aClass to be asserted.
   * @param expectedCount of the enum constants within the {@code aClass}.
   * @since 2.5.3
   */
  public static void assertClassHasEnumConstants(final Class<?> aClass, final int expectedCount) {
    assertEquals(
        expectedCount,
        () -> assertClassHasEnumConstants(aClass).length,
        () -> aClass.getCanonicalName() + " does NOT have " + expectedCount + " enum constants");
  }

  /**
   * Asserts that the {@code aClass} has an <i>enum constant</i> matching the {@code expectedName}.
   *
   * @param aClass to be asserted.
   * @param expectedName of the enum constant within the {@code aClass}
   * @since 2.7.0
   */
  public static void assertClassHasEnumConstantWithName(
      final Class<?> aClass, final String expectedName) {
    Assertions.assertTrue(
        () ->
            Arrays.stream(assertClassHasEnumConstants(aClass))
                .map(Enum::name)
                .anyMatch(expectedName::equals));
  }

  /**
   * Asserts that the {@code aClass} does <b>not</b> have an <i>enum constant</i> matching the
   * {@code unexpectedName}.
   *
   * @param aClass to be asserted.
   * @param unexpectedName of the enum constant within the {@code aClass}.
   * @since 2.7.0
   */
  public static void assertClassDoesNotHaveEnumConstantWithName(
      final Class<?> aClass, final String unexpectedName) {
    Assertions.assertTrue(
        () ->
            Arrays.stream(assertClassHasEnumConstants(aClass))
                .map(Enum::name)
                .noneMatch(unexpectedName::equals));
  }

  /**
   * Asserts that the {@code aClass} has <i>enum constants</i> with names exactly matching {@code
   * expectedNames}, and in the same order.
   *
   * @param aClass to be asserted.
   * @param expectedNames of the enum constants within the {@code aClass}.
   * @since 2.5.3
   */
  public static void assertClassHasEnumConstantsWithNames(
      final Class<?> aClass, final String... expectedNames) {
    Assertions.assertArrayEquals(
        expectedNames,
        Arrays.stream(assertClassHasEnumConstants(aClass)).map(Enum::name).toArray(),
        () -> aClass.getCanonicalName() + " does NOT have the expected enum constants");
  }

  /**
   * Asserts that the {@code aClass} has <i>enum constants</i> with the <i>values</i> exactly
   * matching {@code expectedValues}, and in the same order.
   *
   * @param aClass to be asserted.
   * @param expectedValues of the enum constants within the {@code aClass}.
   * @since 2.5.3
   */
  public static void assertClassHasEnumConstantsWithValues(
      final Class<?> aClass, final Object... expectedValues) {
    final Method getValueMethod = assertClassHasMethod(aClass, "getValue");
    Assertions.assertArrayEquals(
        expectedValues,
        Arrays.stream(assertClassHasEnumConstants(aClass))
            .map(
                enumConstant ->
                    Assertions.assertDoesNotThrow(() -> getValueMethod.invoke(enumConstant)))
            .toArray(),
        () -> aClass.getCanonicalName() + " does NOT have the expected enum constants");
  }

  /**
   * Asserts that the {@code aClass} has an <i>enum constant</i> with a <i>value</i> exactly
   * matching {@code expectedValue}.
   *
   * @param aClass to be asserted.
   * @param expectedValue of the enum constant within the {@code aClass}.
   * @since 2.7.0
   */
  public static void assertClassHasEnumConstantWithValue(
      final Class<?> aClass, final Object expectedValue) {
    final Method getValueMethod = assertClassHasMethod(aClass, "getValue");
    Assertions.assertTrue(
        Arrays.stream(assertClassHasEnumConstants(aClass))
            .map(
                enumConstant ->
                    Assertions.assertDoesNotThrow(() -> getValueMethod.invoke(enumConstant)))
            .anyMatch(expectedValue::equals));
  }
}
