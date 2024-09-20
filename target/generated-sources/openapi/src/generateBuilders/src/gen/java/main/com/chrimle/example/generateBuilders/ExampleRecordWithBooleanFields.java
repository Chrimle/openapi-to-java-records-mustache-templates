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
 * Example of a Record with Boolean fields
 * @param field1 a Boolean field
 * @param field2 another Boolean field
 * @param field3 yet another Boolean field
 */
public record ExampleRecordWithBooleanFields(
        @javax.annotation.Nonnull Boolean field1,
        @javax.annotation.Nonnull Boolean field2,
        @javax.annotation.Nonnull Boolean field3) {

    public ExampleRecordWithBooleanFields(
            @javax.annotation.Nonnull final Boolean field1,
            @javax.annotation.Nonnull final Boolean field2,
            @javax.annotation.Nonnull final Boolean field3) { 
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    /**
     * Builder class for {@link ExampleRecordWithBooleanFields }
     */
    public static class Builder {

        private Boolean field1;
        private Boolean field2;
        private Boolean field3;

        /**
         * Builds a {@link ExampleRecordWithBooleanFields }-instance with the values provided in
         * preceding builder methods.
         * <p><b>NOTE:</b> Pass-by-reference is used
         */
        public ExampleRecordWithBooleanFields build() {
            return new ExampleRecordWithBooleanFields(
                null,
                null,
                null
            );
        }
    }
}
