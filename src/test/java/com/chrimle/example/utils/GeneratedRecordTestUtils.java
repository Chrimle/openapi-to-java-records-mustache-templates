package com.chrimle.example.utils;

import com.chrimle.example.GeneratedClass;
import com.chrimle.example.PluginExecution;
import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/** Generalized Test-class for testing Generated Record-classes */
public class GeneratedRecordTestUtils {

  public static void assertRecord(
      final PluginExecution pluginExecution, final GeneratedClass generatedClass) {
    assertRecord(pluginExecution, generatedClass, generatedClass.fieldClasses);
  }

  public static void assertRecord(
      final PluginExecution pluginExecution,
      final GeneratedClass generatedClass,
      final Class<?>... fieldClasses) {

    final Class<?> classUnderTest =
        AssertionUtils.assertClassExists(generatedClass.getCanonicalClassName(pluginExecution));

    AssertionUtils.assertIsRecord(classUnderTest);
    AssertionUtils.assertClassIsAnnotatedAsDeprecated(classUnderTest, generatedClass.isDeprecated);
    AssertionUtils.assertClassIsAnnotatedWithAdditionalTypeAnnotations(
        classUnderTest, pluginExecution.hasAdditionalModelTypeAnnotations);
    AssertionUtils.assertModelIsSerializable(classUnderTest, pluginExecution.serializableModel);
    AssertionUtils.assertRecordHasFieldsOfTypeWithNullableAnnotations(
        classUnderTest,
        pluginExecution.serializableModel,
        generatedClass.isNullable,
        pluginExecution.useJakartaEe,
        fieldClasses);
    AssertionUtils.assertClassImplementsSerializable(
        classUnderTest, pluginExecution.serializableModel);
    AssertionUtils.assertRecordHasBuilderInnerClass(
        classUnderTest, pluginExecution.generateBuilders, generatedClass.isNullable, fieldClasses);
    Constructor<?> constructor =
        AssertionUtils.assertRecordHasConstructor(classUnderTest, fieldClasses);
    AssertionUtils.assertRecordInstantiateWithArgs(
        classUnderTest, constructor, Arrays.stream(fieldClasses).map(x -> null).toArray());
  }

  public static void assertExampleRecordWithDefaultFields(final PluginExecution pluginExecution) {

    final GeneratedClass generatedClass = GeneratedClass.EXAMPLE_RECORD_WITH_DEFAULT_FIELDS;

    final Class<?> classUnderTest =
        AssertionUtils.assertClassExists(generatedClass.getCanonicalClassName(pluginExecution));

    assertRecord(pluginExecution, generatedClass, generatedClass.fieldClasses);

    final Constructor<?> constructor =
        AssertionUtils.assertRecordHasConstructor(classUnderTest, generatedClass.fieldClasses);

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
      final PluginExecution pluginExecution) {
    assertRecord(
        pluginExecution,
        GeneratedClass.EXAMPLE_RECORD_WITH_REQUIRED_FIELDS_OF_EACH_TYPE,
        Boolean.class,
        String.class,
        Integer.class,
        BigDecimal.class,
        List.class,
        Set.class,
        AssertionUtils.assertClassExists(
            GeneratedClass.EXAMPLE_RECORD.getCanonicalClassName(pluginExecution)),
        AssertionUtils.assertClassExists(
            GeneratedClass.EXAMPLE_ENUM.getCanonicalClassName(pluginExecution)));
  }
}
