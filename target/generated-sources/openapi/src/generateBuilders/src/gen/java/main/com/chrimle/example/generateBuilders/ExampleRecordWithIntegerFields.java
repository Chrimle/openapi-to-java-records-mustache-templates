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
 * Generated with Version: 1.6.2
 *
 */

package com.chrimle.example.generateBuilders;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * Example of a Record with Integer fields
 * @param field1 a Integer field
 * @param field2 another Integer field
 * @param field3 yet another Integer field
 */
public record ExampleRecordWithIntegerFields(
        @javax.annotation.Nonnull Integer field1,
        @javax.annotation.Nonnull Integer field2,
        @javax.annotation.Nonnull Integer field3) {

    public ExampleRecordWithIntegerFields(
            @javax.annotation.Nonnull final Integer field1,
            @javax.annotation.Nonnull final Integer field2,
            @javax.annotation.Nonnull final Integer field3) { 
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    /**
     * Builder class for {@link ExampleRecordWithIntegerFields }
     */
    public static class Builder {

        private Integer field1;
        private Integer field2;
        private Integer field3;

        /**
         * Sets the value of {@link ExampleRecordWithIntegerFields#field1 }.
         * <p><b>NOTE:</b> Pass-by-reference is used
         * <p><b>Description:</b> a Integer field
         */
        public Builder field1(final Integer field1) {
            this.field1 = field1;
            return this;
        }

        /**
         * Sets the value of {@link ExampleRecordWithIntegerFields#field2 }.
         * <p><b>NOTE:</b> Pass-by-reference is used
         * <p><b>Description:</b> another Integer field
         */
        public Builder field2(final Integer field2) {
            this.field2 = field2;
            return this;
        }

        /**
         * Sets the value of {@link ExampleRecordWithIntegerFields#field3 }.
         * <p><b>NOTE:</b> Pass-by-reference is used
         * <p><b>Description:</b> yet another Integer field
         */
        public Builder field3(final Integer field3) {
            this.field3 = field3;
            return this;
        }

        /**
         * Builds a {@link ExampleRecordWithIntegerFields }-instance with the values provided in
         * preceding builder methods.
         * <p><b>NOTE:</b> Pass-by-reference is used
         * <p><b>Description:</b> Example of a Record with Integer fields
         */
        public ExampleRecordWithIntegerFields build() {
            return new ExampleRecordWithIntegerFields(
                field1,
                field2,
                field3
            );
        }
    }

    /**
     * Creates a {@link Builder}-instance.
     */
    public static ExampleRecordWithIntegerFields.Builder builder() {
        return new ExampleRecordWithIntegerFields.Builder();
    }
}
