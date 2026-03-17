package io.github.chrimle.o2jrm.tests;

import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.support.ParameterDeclarations;

public class GeneratedRecordProvider extends GeneratedSourceProvider implements ArgumentsProvider {

  public static final String GENERATED_RECORD_TESTS_METHOD_SOURCE =
      "io.github.chrimle.o2jrm.tests.GeneratedRecordImplTests#allPluginExecutionsAndGeneratedRecordCombinations";

  @Override
  public Stream<? extends Arguments> provideArguments(
      ParameterDeclarations parameters, ExtensionContext context) throws Exception {
    return applyFilters(GENERATED_RECORD_TESTS_METHOD_SOURCE, context);
  }
}
