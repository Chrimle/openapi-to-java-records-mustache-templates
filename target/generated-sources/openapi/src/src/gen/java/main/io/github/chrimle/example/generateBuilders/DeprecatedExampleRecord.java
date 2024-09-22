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
import java.io.IOException;
import java.util.Arrays;

/**
 * Example of a deprecated Record
 * @deprecated
 * @param field1 a boolean field
 */
@Deprecated
public record DeprecatedExampleRecord(
        @javax.annotation.Nonnull Boolean field1) {

    public DeprecatedExampleRecord(
            @javax.annotation.Nonnull final Boolean field1) { 
        this.field1 = field1;
    }

    /**
     * Builder class for {@link DeprecatedExampleRecord }
     */
    public static class Builder {

        private Boolean field1;

        /**
         * Sets the value of {@link DeprecatedExampleRecord#field1 }.
         * <p><b>NOTE:</b> Pass-by-reference is used
         * <p><b>Description:</b> a boolean field
         */
        public Builder field1(final Boolean field1) {
            this.field1 = field1;
            return this;
        }

        /**
         * Builds a {@link DeprecatedExampleRecord }-instance with the values provided in
         * preceding builder methods.
         * <p><b>NOTE:</b> Pass-by-reference is used
         * <p><b>Description:</b> Example of a deprecated Record
         */
        public DeprecatedExampleRecord build() {
            return new DeprecatedExampleRecord(
                field1
            );
        }
    }

    /**
     * Creates a {@link Builder}-instance.
     */
    public static DeprecatedExampleRecord.Builder builder() {
        return new DeprecatedExampleRecord.Builder();
    }
}