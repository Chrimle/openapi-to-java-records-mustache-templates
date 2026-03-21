package io.github.chrimle.o2jrm.tests;

import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.support.ParameterDeclarations;

public final class GeneratedEnumProvider extends GeneratedSourceProvider
    implements ArgumentsProvider {

  public static final String GENERATED_ENUM_TESTS_METHOD_SOURCE_CLASS =
      "io.github.chrimle.o2jrm.tests.GeneratedEnumImplTests";
  public static final String GENERATED_ENUM_TESTS_METHOD_SOURCE_METHOD =
      "allPluginExecutionsAndGeneratedEnumCombinations";

  @Override
  public Stream<? extends Arguments> provideArguments(
      ParameterDeclarations parameters, ExtensionContext context) throws Exception {
    return applyFilters(
        GENERATED_ENUM_TESTS_METHOD_SOURCE_CLASS,
        GENERATED_ENUM_TESTS_METHOD_SOURCE_METHOD,
        context);
  }
}
