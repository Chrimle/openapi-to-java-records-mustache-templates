package io.github.chrimle.o2jrm.tests;

import io.github.chrimle.o2jrm.GeneratedSource;
import java.lang.reflect.Method;
import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public abstract class GeneratedSourceProvider implements ArgumentsProvider {

  static Stream<Arguments> applyFilters(
      final String fullyQualifiedMethodName, final ExtensionContext context) {

    final var assumptionFilter =
        context.getRequiredTestMethod().getAnnotation(AssumptionFilter.class);

    return invokeMethodSource(fullyQualifiedMethodName)
        .filter(
            arguments -> {
              if (assumptionFilter == null) return true;
              final GeneratedSource generatedSource = (GeneratedSource) arguments.get()[0];
              if (!(assumptionFilter.hasXImplements().test(generatedSource.hasXImplements())))
                return false;
              if (!(assumptionFilter.isDeprecated().test(generatedSource.isDeprecated())))
                return false;
              if (!(assumptionFilter
                  .isLibraryOkHttpGson()
                  .test(generatedSource.isLibraryOkHttpGson()))) return false;
              return true;
            });
  }

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
