/*
 *   Copyright 2024-2026 Chrimle
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package io.github.chrimle.o2jrm.tests;

import io.github.chrimle.o2jrm.GeneratedSource;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public abstract sealed class GeneratedSourceProvider implements ArgumentsProvider
    permits GeneratedEnumProvider, GeneratedRecordProvider {

  private static final ConcurrentHashMap<String, List<GeneratedSource>> ARGUMENTS_PER_METHOD =
      new ConcurrentHashMap<>();

  Stream<Arguments> applyFilters(
      final String methodSourceClassName,
      final String methodSourceMethodName,
      final ExtensionContext context) {

    final var assumptionFilter =
        context.getRequiredTestMethod().getAnnotation(AssumptionFilter.class);

    return ARGUMENTS_PER_METHOD
        .computeIfAbsent(
            methodSourceMethodName,
            key -> invokeMethodSource(methodSourceClassName, methodSourceMethodName))
        .stream()
        .filter(
            generatedSource -> {
              if (assumptionFilter == null) return true;
              if (!(assumptionFilter.enumValueClass().equals(Object.class)
                  || assumptionFilter.enumValueClass().equals(generatedSource.enumValueClass())))
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
              if (assumptionFilter.enabledConfigOptions().length > 0
                  && !Arrays.stream(assumptionFilter.enabledConfigOptions())
                      .allMatch(
                          configOption ->
                              generatedSource.getEnabledConfigOptions().contains(configOption)))
                return false;
              if (assumptionFilter.disabledConfigOptions().length > 0
                  && Arrays.stream(assumptionFilter.disabledConfigOptions())
                      .anyMatch(
                          configOption ->
                              generatedSource.getEnabledConfigOptions().contains(configOption)))
                return false;
              if (assumptionFilter.isOneOfLibraries().length > 0
                  && !Arrays.stream(assumptionFilter.isOneOfLibraries())
                      .toList()
                      .contains(generatedSource.getLibrary())) return false;
              return true;
            })
        .map(Arguments::of);
  }

  @SuppressWarnings("unchecked")
  List<GeneratedSource> invokeMethodSource(final String className, final String methodName) {
    try {
      Class<?> clazz = Class.forName(className);
      Method method = clazz.getDeclaredMethod(methodName);
      method.setAccessible(true);

      return (List<GeneratedSource>) method.invoke(null);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
