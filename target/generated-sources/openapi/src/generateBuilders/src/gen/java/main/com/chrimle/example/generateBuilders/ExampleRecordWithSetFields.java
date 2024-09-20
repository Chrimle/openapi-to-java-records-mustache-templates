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
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Example of a Record with Set fields
 * @param field1 a Set field
 * @param field2 another Set field
 * @param field3 yet another Set field
 */
public record ExampleRecordWithSetFields(
        @javax.annotation.Nonnull Set<Boolean> field1,
        @javax.annotation.Nonnull Set<Boolean> field2,
        @javax.annotation.Nonnull Set<Boolean> field3) {

    public ExampleRecordWithSetFields(
            @javax.annotation.Nullable final Set<Boolean> field1,
            @javax.annotation.Nullable final Set<Boolean> field2,
            @javax.annotation.Nullable final Set<Boolean> field3) { 
        this.field1 = Objects.requireNonNullElse(field1, new LinkedHashSet<>());
        this.field2 = Objects.requireNonNullElse(field2, new LinkedHashSet<>());
        this.field3 = Objects.requireNonNullElse(field3, new LinkedHashSet<>());
    }

    /**
     * Builder class for {@link ExampleRecordWithSetFields }
     */
    public static class Builder {

        private Set<Boolean> field1;
        private Set<Boolean> field2;
        private Set<Boolean> field3;

        /**
         * Builds a {@link ExampleRecordWithSetFields }-instance with the values provided in
         * preceding builder methods.
         * <p><b>NOTE:</b> Pass-by-reference is used
         */
        public ExampleRecordWithSetFields build() {
            return new ExampleRecordWithSetFields(
                null,
                null,
                null
            );
        }
    }
}
