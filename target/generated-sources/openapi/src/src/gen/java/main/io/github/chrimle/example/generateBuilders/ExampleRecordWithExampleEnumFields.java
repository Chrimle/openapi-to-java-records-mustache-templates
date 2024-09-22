/*
 * Example OpenAPI Spec.
 * An example OpenAPI-spec to generate example Java records.
 *
 * The version of the OpenAPI document: 0.0.1
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 * This class was generated using custom mustache templates from
 * openapi-to-java-records-mustache-templates. For further information,
 * questions, requesting features or reporting issues, please visit:
 * https://github.com/Chrimle/openapi-to-java-records-mustache-templates.
 * Generated with Version: 1.7.0
 *
 */

package io.github.chrimle.example.generateBuilders;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.chrimle.example.generateBuilders.ExampleEnum;
import java.io.IOException;
import java.util.Arrays;

/**
 * Example of a Record with Enum fields
 * @param field1 ExampleEnum
 * @param field2 ExampleEnum
 * @param field3 ExampleEnum
 */
public record ExampleRecordWithExampleEnumFields(
        @javax.annotation.Nonnull ExampleEnum field1,
        @javax.annotation.Nonnull ExampleEnum field2,
        @javax.annotation.Nonnull ExampleEnum field3) {

    public ExampleRecordWithExampleEnumFields(
            @javax.annotation.Nonnull final ExampleEnum field1,
            @javax.annotation.Nonnull final ExampleEnum field2,
            @javax.annotation.Nonnull final ExampleEnum field3) { 
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    /**
     * Builder class for {@link ExampleRecordWithExampleEnumFields }
     */
    public static class Builder {

        private ExampleEnum field1;
        private ExampleEnum field2;
        private ExampleEnum field3;

        /**
         * Sets the value of {@link ExampleRecordWithExampleEnumFields#field1 }.
         * <p><b>NOTE:</b> Pass-by-reference is used
         */
        public Builder field1(final ExampleEnum field1) {
            this.field1 = field1;
            return this;
        }

        /**
         * Sets the value of {@link ExampleRecordWithExampleEnumFields#field2 }.
         * <p><b>NOTE:</b> Pass-by-reference is used
         */
        public Builder field2(final ExampleEnum field2) {
            this.field2 = field2;
            return this;
        }

        /**
         * Sets the value of {@link ExampleRecordWithExampleEnumFields#field3 }.
         * <p><b>NOTE:</b> Pass-by-reference is used
         */
        public Builder field3(final ExampleEnum field3) {
            this.field3 = field3;
            return this;
        }

        /**
         * Builds a {@link ExampleRecordWithExampleEnumFields }-instance with the values provided in
         * preceding builder methods.
         * <p><b>NOTE:</b> Pass-by-reference is used
         * <p><b>Description:</b> Example of a Record with Enum fields
         */
        public ExampleRecordWithExampleEnumFields build() {
            return new ExampleRecordWithExampleEnumFields(
                field1,
                field2,
                field3
            );
        }
    }

    /**
     * Creates a {@link Builder}-instance.
     */
    public static ExampleRecordWithExampleEnumFields.Builder builder() {
        return new ExampleRecordWithExampleEnumFields.Builder();
    }
}