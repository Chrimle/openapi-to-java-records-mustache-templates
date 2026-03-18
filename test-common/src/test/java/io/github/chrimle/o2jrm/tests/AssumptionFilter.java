package io.github.chrimle.o2jrm.tests;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AssumptionFilter {

  Condition enumUnknownDefaultCase() default Condition.ANY;

  Condition hasAdditionalEnumTypeAnnotations() default Condition.ANY;

  Condition hasXImplements() default Condition.ANY;

  Condition isDeprecated() default Condition.ANY;

  Condition isLibraryOkHttpGson() default Condition.ANY;

  Condition isLibraryWebClient() default Condition.ANY;

  Condition isSerializationLibraryJackson() default Condition.ANY;

  Condition serializableModel() default Condition.ANY;

  Condition useEnumCaseInsensitive() default Condition.ANY;
}
