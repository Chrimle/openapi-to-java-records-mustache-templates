package io.github.chrimle.o2jrm.tests;

import io.github.chrimle.o2jrm.GeneratedSource;
import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public abstract class GeneratedSourceProvider implements ArgumentsProvider {

  Stream<Arguments> applyFilters(
      final String fullyQualifiedMethodName, final ExtensionContext context) {

    final var assumptionFilter =
        context.getRequiredTestMethod().getAnnotation(AssumptionFilter.class);

    return invokeMethodSource(fullyQualifiedMethodName).stream()
        .filter(
            generatedSource -> {
              if (assumptionFilter == null) return true;
              if (!assumptionFilter
                  .enumUnknownDefaultCase()
                  .test(generatedSource.enumUnknownDefaultCase())) return false;
              if (!(assumptionFilter.enumValueClass().equals(Object.class)
                  || assumptionFilter.enumValueClass().equals(generatedSource.enumValueClass())))
                return false;
              if (!assumptionFilter.generateBuilders().test(generatedSource.generateBuilders()))
                return false;
              if (!assumptionFilter
                  .hasAdditionalEnumTypeAnnotations()
                  .test(generatedSource.hasAdditionalEnumTypeAnnotations())) return false;
              if (!assumptionFilter
                  .hasAdditionalModelTypeAnnotations()
                  .test(generatedSource.hasAdditionalModelTypeAnnotations())) return false;
              if (!assumptionFilter
                  .hasRequiredGeneratedFields()
                  .test(generatedSource.hasRequiredGeneratedFields())) return false;
              if (!assumptionFilter
                  .hasExtraAnnotations()
                  .test(generatedSource.hasExtraAnnotations())) return false;
              if (!assumptionFilter.hasXImplements().test(generatedSource.hasXImplements()))
                return false;
              if (!assumptionFilter.isDeprecated().test(generatedSource.isDeprecated()))
                return false;
              if (!assumptionFilter.isInnerEnum().test(generatedSource.isInnerEnum())) return false;
              if (!assumptionFilter
                  .isLibraryOkHttpGson()
                  .test(generatedSource.isLibraryOkHttpGson())) return false;
              if (!assumptionFilter.isLibraryWebClient().test(generatedSource.isLibraryWebClient()))
                return false;
              if (!assumptionFilter
                  .isSerializationLibraryJackson()
                  .test(generatedSource.isSerializationLibraryJackson())) return false;
              if (!assumptionFilter.serializableModel().test(generatedSource.serializableModel()))
                return false;
              if (!assumptionFilter.useBeanValidation().test(generatedSource.useBeanValidation()))
                return false;
              if (!assumptionFilter
                  .useEnumCaseInsensitive()
                  .test(generatedSource.useEnumCaseInsensitive())) return false;
              return true;
            })
        .map(Arguments::of);
  }

  @SuppressWarnings("unchecked")
  List<GeneratedSource> invokeMethodSource(final String fullyQualifiedMethodName) {
    try {
      String[] parts = fullyQualifiedMethodName.split("#");
      String className = parts[0];
      String methodName = parts[1];

      Class<?> clazz = Class.forName(className);
      Method method = clazz.getDeclaredMethod(methodName);
      method.setAccessible(true);

      return (List<GeneratedSource>) method.invoke(null);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
