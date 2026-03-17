package io.github.chrimle.o2jrm.tests;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.params.provider.ArgumentsSource;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@ArgumentsSource(GeneratedEnumProvider.class)
public @interface AssumptionFilter {

  Condition hasXImplements() default Condition.ANY;

  Condition isDeprecated() default Condition.ANY;
}
