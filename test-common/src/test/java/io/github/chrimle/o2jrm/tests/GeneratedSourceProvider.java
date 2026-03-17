package io.github.chrimle.o2jrm.tests;

import java.lang.reflect.Method;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public abstract class GeneratedSourceProvider implements ArgumentsProvider {

  @SuppressWarnings("unchecked")
  static Stream<Arguments> invokeMethodSource(final String fullyQualifiedMethodName) {
    try {
      String[] parts = fullyQualifiedMethodName.split("#");
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
