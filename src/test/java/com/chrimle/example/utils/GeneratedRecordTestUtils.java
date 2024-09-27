package com.chrimle.example.utils;

import com.chrimle.example.PluginExecution;
import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/** Generalized Test-class for testing Generated Record-classes */
public class GeneratedRecordTestUtils {

  public static void assertRecord(
      final PluginExecution pluginExecution,
      final Class<?> classUnderTest,
      final boolean isDeprecated,
      final boolean isNullable,
      final Class<?>... fieldClasses) {
    AssertionUtils.assertIsRecord(classUnderTest);
    AssertionUtils.assertClassIsAnnotatedAsDeprecated(classUnderTest, isDeprecated);
    AssertionUtils.assertClassIsAnnotatedWithAdditionalTypeAnnotations(
        classUnderTest, pluginExecution.hasAdditionalModelTypeAnnotations());
    AssertionUtils.assertModelIsSerializable(classUnderTest, pluginExecution.serializableModel());
    AssertionUtils.assertRecordHasFieldsOfTypeWithNullableAnnotations(
        classUnderTest,
        pluginExecution.serializableModel(),
        isNullable,
        pluginExecution.useJakartaEe(),
        fieldClasses);
    AssertionUtils.assertClassImplementsSerializable(
        classUnderTest, pluginExecution.serializableModel());
    AssertionUtils.assertRecordHasBuilderInnerClass(
        classUnderTest, pluginExecution.generateBuilders(), isNullable, fieldClasses);
    Constructor<?> constructor =
        AssertionUtils.assertRecordHasConstructor(classUnderTest, fieldClasses);
    AssertionUtils.assertRecordInstantiateWithArgs(
        classUnderTest, constructor, Arrays.stream(fieldClasses).map(x -> null).toArray());
  }

  public static void assertExampleRecord(
      final PluginExecution pluginExecution, final Class<?> classUnderTest) {
    assertRecord(pluginExecution, classUnderTest, false, false, Boolean.class);
  }

  public static void assertDeprecatedExampleRecord(
      final PluginExecution pluginExecution, final Class<?> classUnderTest) {
    assertRecord(pluginExecution, classUnderTest, true, false, Boolean.class);
  }

  public static void assertExampleRecordWithDefaultFields(
      final PluginExecution pluginExecution, final Class<?> classUnderTest) {
    assertRecord(pluginExecution, classUnderTest, false, false, String.class);

    final Constructor<?> constructor =
        AssertionUtils.assertRecordHasConstructor(classUnderTest, String.class);

    AssertionUtils.assertRecordFieldHasValue(
        AssertionUtils.assertRecordInstantiateWithArgs(classUnderTest, constructor, (Object) null),
        "field1",
        "someDefaultValue");

    AssertionUtils.assertRecordFieldHasValue(
        AssertionUtils.assertRecordInstantiateWithArgs(classUnderTest, constructor, "someValue"),
        "field1",
        "someValue");
  }

  public static void assertExampleRecordWithRequiredFieldsOfEachType(
      final PluginExecution pluginExecution,
      final Class<?> classUnderTest,
      final Class<?> recordClass,
      final Class<?> enumClass) {
    assertRecord(
        pluginExecution,
        classUnderTest,
        false,
        false,
        Boolean.class,
        String.class,
        Integer.class,
        BigDecimal.class,
        List.class,
        Set.class,
        recordClass,
        enumClass);
  }

  public static void assertExampleRecordWithNullableFieldsOfEachType(
      final PluginExecution pluginExecution, final Class<?> classUnderTest) {
    assertRecord(
        pluginExecution,
        classUnderTest,
        false,
        true,
        Boolean.class,
        String.class,
        Integer.class,
        BigDecimal.class,
        List.class,
        Set.class);
  }
}
