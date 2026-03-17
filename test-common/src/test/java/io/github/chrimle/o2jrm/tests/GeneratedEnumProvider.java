package io.github.chrimle.o2jrm.tests;

import java.lang.reflect.Method;
import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.support.ParameterDeclarations;

public class GeneratedEnumProvider implements ArgumentsProvider {

  public static final String GENERATED_ENUM_TESTS_METHOD_SOURCE =
      "io.github.chrimle.o2jrm.tests.GeneratedEnumImplTests#allPluginExecutionsAndGeneratedEnumCombinations";

  @Override
  public Stream<? extends Arguments> provideArguments(
      ParameterDeclarations parameters, ExtensionContext context) throws Exception {
    return invokeMethodSource();
  }

  @SuppressWarnings("unchecked")
  private static Stream<Arguments> invokeMethodSource() {
    try {
      String[] parts = GENERATED_ENUM_TESTS_METHOD_SOURCE.split("#");
      String className = parts[0];
      String methodName = parts[1];

      Class<?> clazz = Class.forName(className);
      Method method = clazz.getDeclaredMethod(methodName);
      method.setAccessible(true);

      return (Stream<Arguments>) method.invoke(null);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
