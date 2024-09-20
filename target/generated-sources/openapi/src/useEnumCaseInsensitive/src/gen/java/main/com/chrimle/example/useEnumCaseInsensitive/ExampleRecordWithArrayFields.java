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

package com.chrimle.example.useEnumCaseInsensitive;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Example of a Record with Array fields
 * @param field1 an Array field
 * @param field2 another Array field
 * @param field3 yet another Array field
 */
public record ExampleRecordWithArrayFields(
        @javax.annotation.Nonnull List<Boolean> field1,
        @javax.annotation.Nonnull List<Boolean> field2,
        @javax.annotation.Nonnull List<Boolean> field3) {

    public ExampleRecordWithArrayFields(
            @javax.annotation.Nullable final List<Boolean> field1,
            @javax.annotation.Nullable final List<Boolean> field2,
            @javax.annotation.Nullable final List<Boolean> field3) { 
        this.field1 = Objects.requireNonNullElse(field1, new ArrayList<>());
        this.field2 = Objects.requireNonNullElse(field2, new ArrayList<>());
        this.field3 = Objects.requireNonNullElse(field3, new ArrayList<>());
    }
}
