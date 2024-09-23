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
 * Generated with Version: 1.7.5
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

  /** Builder class for {@link ExampleRecordWithArrayFields } */
  public static class Builder {

    private List<Boolean> field1;
    private List<Boolean> field2;
    private List<Boolean> field3;

    /**
     * Sets the value of {@link ExampleRecordWithArrayFields#field1 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     * @param field1 an Array field
     * @return this {@link Builder}-instance for method-chaining
     */
    public Builder field1(final List<Boolean> field1) {
      this.field1 = field1;
      return this;
    }

    /**
     * Sets the value of {@link ExampleRecordWithArrayFields#field2 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     * @param field2 another Array field
     * @return this {@link Builder}-instance for method-chaining
     */
    public Builder field2(final List<Boolean> field2) {
      this.field2 = field2;
      return this;
    }

    /**
     * Sets the value of {@link ExampleRecordWithArrayFields#field3 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     * @param field3 yet another Array field
     * @return this {@link Builder}-instance for method-chaining
     */
    public Builder field3(final List<Boolean> field3) {
      this.field3 = field3;
      return this;
    }

    /**
     * Builds a {@link ExampleRecordWithArrayFields }-instance with the values provided in preceding
     * builder methods.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     * @return a new {@link ExampleRecordWithArrayFields }-instance
     */
    public ExampleRecordWithArrayFields build() {
      return new ExampleRecordWithArrayFields(
        field1,
        field2,
        field3
      );
    }
  }

  /** Creates a {@link Builder}-instance. */
  public static ExampleRecordWithArrayFields.Builder builder() {
    return new ExampleRecordWithArrayFields.Builder();
  }
}
