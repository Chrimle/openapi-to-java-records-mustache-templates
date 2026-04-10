package org.openapitools.configuration;

import io.github.chrimle.o2jrm.useEnumCaseInsensitive.DeprecatedExampleEnum;
import io.github.chrimle.o2jrm.useEnumCaseInsensitive.ExampleEnum;
import io.github.chrimle.o2jrm.useEnumCaseInsensitive.ExampleEnumWithIntegerValues;
import io.github.chrimle.o2jrm.useEnumCaseInsensitive.ExampleImplementsEnum;
import io.github.chrimle.o2jrm.useEnumCaseInsensitive.ExampleNullableEnum;
import io.github.chrimle.o2jrm.useEnumCaseInsensitive.ExampleTwoImplementsEnum;
import io.github.chrimle.o2jrm.useEnumCaseInsensitive.ExampleUriEnum;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

/**
 * This class provides Spring Converter beans for the enum models in the OpenAPI specification.
 *
 * By default, Spring only converts primitive types to enums using Enum::valueOf, which can prevent
 * correct conversion if the OpenAPI specification is using an `enumPropertyNaming` other than
 * `original` or the specification has an integer enum.
 */
@Configuration(value = "org.openapitools.configuration.enumConverterConfiguration")
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.deprecatedExampleEnumConverter")
    Converter<String, DeprecatedExampleEnum> deprecatedExampleEnumConverter() {
        return new Converter<String, DeprecatedExampleEnum>() {
            @Override
            public DeprecatedExampleEnum convert(String source) {
                return DeprecatedExampleEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.exampleEnumConverter")
    Converter<String, ExampleEnum> exampleEnumConverter() {
        return new Converter<String, ExampleEnum>() {
            @Override
            public ExampleEnum convert(String source) {
                return ExampleEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.exampleEnumWithIntegerValuesConverter")
    Converter<Integer, ExampleEnumWithIntegerValues> exampleEnumWithIntegerValuesConverter() {
        return new Converter<Integer, ExampleEnumWithIntegerValues>() {
            @Override
            public ExampleEnumWithIntegerValues convert(Integer source) {
                return ExampleEnumWithIntegerValues.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.exampleImplementsEnumConverter")
    Converter<String, ExampleImplementsEnum> exampleImplementsEnumConverter() {
        return new Converter<String, ExampleImplementsEnum>() {
            @Override
            public ExampleImplementsEnum convert(String source) {
                return ExampleImplementsEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.exampleNullableEnumConverter")
    Converter<String, ExampleNullableEnum> exampleNullableEnumConverter() {
        return new Converter<String, ExampleNullableEnum>() {
            @Override
            public ExampleNullableEnum convert(String source) {
                return ExampleNullableEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.exampleTwoImplementsEnumConverter")
    Converter<String, ExampleTwoImplementsEnum> exampleTwoImplementsEnumConverter() {
        return new Converter<String, ExampleTwoImplementsEnum>() {
            @Override
            public ExampleTwoImplementsEnum convert(String source) {
                return ExampleTwoImplementsEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.exampleUriEnumConverter")
    Converter<String, ExampleUriEnum> exampleUriEnumConverter() {
        return new Converter<String, ExampleUriEnum>() {
            @Override
            public ExampleUriEnum convert(String source) {
                return ExampleUriEnum.fromValue(source);
            }
        };
    }

}
