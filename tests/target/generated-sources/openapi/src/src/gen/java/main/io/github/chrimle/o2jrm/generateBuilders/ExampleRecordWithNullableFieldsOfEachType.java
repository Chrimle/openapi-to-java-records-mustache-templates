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
 * Generated with Version: 2.8.2
 *
 */

package io.github.chrimle.o2jrm.generateBuilders;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.chrimle.o2jrm.generateBuilders.ExampleNullableEnum;
import io.github.chrimle.o2jrm.generateBuilders.ExampleNullableRecord;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Example of a Record with fields of each type
 *
 * @param field1 a Boolean field
 * @param field2 a String field
 * @param field3 an Integer field
 * @param field4 a Number field
 * @param field5 an Array of Boolean field
 * @param field6 a Set field
 * @param field7 ExampleNullableRecord.
 * @param field8 ExampleNullableEnum.
 */
public record ExampleRecordWithNullableFieldsOfEachType(
    @javax.annotation.Nullable Boolean field1,
    @javax.annotation.Nullable String field2,
    @javax.annotation.Nullable Integer field3,
    @javax.annotation.Nullable BigDecimal field4,
    @javax.annotation.Nullable List<Boolean> field5,
    @javax.annotation.Nullable Set<Boolean> field6,
    @javax.annotation.Nullable ExampleNullableRecord field7,
    @javax.annotation.Nullable ExampleNullableEnum field8) {

  /** A set containing the names of all instance fields defined in this class. */
  public static final HashSet<String> openapiFields =
      new HashSet<String>(
          Set.of("field1",
              "field2",
              "field3",
              "field4",
              "field5",
              "field6",
              "field7",
              "field8"));

  /** A set containing the names of all required fields defined in this class. */
  public static final HashSet<String> openapiRequiredFields =
      new HashSet<String>(
          Set.of("field1",
              "field2",
              "field3",
              "field4",
              "field5",
              "field6"));

  public ExampleRecordWithNullableFieldsOfEachType(
      @javax.annotation.Nullable final Boolean field1,
      @javax.annotation.Nullable final String field2,
      @javax.annotation.Nullable final Integer field3,
      @javax.annotation.Nullable final BigDecimal field4,
      @javax.annotation.Nullable final List<Boolean> field5,
      @javax.annotation.Nullable final Set<Boolean> field6,
      @javax.annotation.Nullable final ExampleNullableRecord field7,
      @javax.annotation.Nullable final ExampleNullableEnum field8) { 
    this.field1 = field1;
    this.field2 = field2;
    this.field3 = field3;
    this.field4 = field4;
    this.field5 = field5;
    this.field6 = field6;
    this.field7 = field7;
    this.field8 = field8;
  }

  /** Builder class for {@link ExampleRecordWithNullableFieldsOfEachType }. */
  public static class Builder {

    private Boolean field1;
    private String field2;
    private Integer field3;
    private BigDecimal field4;
    private List<Boolean> field5;
    private Set<Boolean> field6;
    private ExampleNullableRecord field7;
    private ExampleNullableEnum field8;

    /**
     * Sets the value of {@link ExampleRecordWithNullableFieldsOfEachType#field1 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field1 a Boolean field.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field1(final Boolean field1) {
      this.field1 = field1;
      return this;
    }

    /**
     * Sets the value of {@link ExampleRecordWithNullableFieldsOfEachType#field2 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field2 a String field.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field2(final String field2) {
      this.field2 = field2;
      return this;
    }

    /**
     * Sets the value of {@link ExampleRecordWithNullableFieldsOfEachType#field3 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field3 an Integer field.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field3(final Integer field3) {
      this.field3 = field3;
      return this;
    }

    /**
     * Sets the value of {@link ExampleRecordWithNullableFieldsOfEachType#field4 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field4 a Number field.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field4(final BigDecimal field4) {
      this.field4 = field4;
      return this;
    }

    /**
     * Sets the value of {@link ExampleRecordWithNullableFieldsOfEachType#field5 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field5 an Array of Boolean field.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field5(final List<Boolean> field5) {
      this.field5 = field5;
      return this;
    }

    /**
     * Sets the value of {@link ExampleRecordWithNullableFieldsOfEachType#field6 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field6 a Set field.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field6(final Set<Boolean> field6) {
      this.field6 = field6;
      return this;
    }

    /**
     * Sets the value of {@link ExampleRecordWithNullableFieldsOfEachType#field7 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field7 sets the value of field7.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field7(final ExampleNullableRecord field7) {
      this.field7 = field7;
      return this;
    }

    /**
     * Sets the value of {@link ExampleRecordWithNullableFieldsOfEachType#field8 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field8 sets the value of field8.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field8(final ExampleNullableEnum field8) {
      this.field8 = field8;
      return this;
    }

    /**
     * Builds a {@link ExampleRecordWithNullableFieldsOfEachType }-instance with the values provided in preceding
     * builder methods.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @return a new {@link ExampleRecordWithNullableFieldsOfEachType }-instance.
     */
    public ExampleRecordWithNullableFieldsOfEachType build() {
      return new ExampleRecordWithNullableFieldsOfEachType(
        field1,
        field2,
        field3,
        field4,
        field5,
        field6,
        field7,
        field8
      );
    }
  }

  /** Creates a new {@link Builder}-instance. */
  public static ExampleRecordWithNullableFieldsOfEachType.Builder builder() {
    return new ExampleRecordWithNullableFieldsOfEachType.Builder();
  }

  /**
   * Validates the JSON Element and throws an exception if issues are found.
   *
   * @param jsonElement to validate.
   * @throws IOException if the JSON Element is not a valid ExampleRecordWithNullableFieldsOfEachType object.
   */
  public static void validateJsonElement(final JsonElement jsonElement) throws IOException { 
    if (jsonElement == null) {
      throw new IllegalArgumentException(
          String.format(
              "The required field(s) %s in ExampleRecordWithNullableFieldsOfEachType is not found in the empty JSON string",
              ExampleRecordWithNullableFieldsOfEachType.openapiRequiredFields.toString()));
    }

    for (final String key : jsonElement.getAsJsonObject().keySet()) {
      if (!ExampleRecordWithNullableFieldsOfEachType.openapiFields.contains(key)) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `ExampleRecordWithNullableFieldsOfEachType` properties. JSON: %s",
                key, jsonElement));
      }
    }

    for (final String requiredField : ExampleRecordWithNullableFieldsOfEachType.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement));
      }
    }

    final JsonObject jsonObj = jsonElement.getAsJsonObject();

    if (!jsonObj.get("field1").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `field1` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("field1")));
    }

    if (!jsonObj.get("field2").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `field2` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("field2")));
    }

    if (!jsonObj.get("field3").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `field3` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("field3")));
    }

    if (!jsonObj.get("field4").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `field4` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("field4")));
    }

    if (!jsonObj.get("field5").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `field5` to be an array in the JSON string but got `%s`",
              jsonObj.get("field5")));
    }

    if (!jsonObj.get("field6").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `field6` to be an array in the JSON string but got `%s`",
              jsonObj.get("field6")));
    }

    if (jsonObj.get("field7") != null
        && !jsonObj.get("field7").isJsonNull()) { 
      ExampleNullableRecord.validateJsonElement(jsonObj.get("field7"));
    }

    if (jsonObj.get("field8") != null
        && !jsonObj.get("field8").isJsonNull()) { 
      ExampleNullableEnum.validateJsonElement(jsonObj.get("field8"));
    }
  }

  /**
   * Creates {@link TypeAdapter}s for {@link ExampleRecordWithNullableFieldsOfEachType }s and other
   * <i>assignable</i> types.
   */
  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {

    /**
     * {@inheritDoc}
     *
     * @param gson to create the {@link TypeAdapter} from.
     * @param type to <i>serialize</i>/<i>deserialize</i>.
     * @return an (<i>anonymous</i>) instance of {@link TypeAdapter<ExampleRecordWithNullableFieldsOfEachType>}, or
     *     {@code null} if {@code T} is not <i>assignable</i> to {@link ExampleRecordWithNullableFieldsOfEachType }.
     * @param <T> class to <i>serialize</i>/<i>deserialize</i>.
     */
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> type) {
      if (!ExampleRecordWithNullableFieldsOfEachType.class.isAssignableFrom(type.getRawType())) {
        return null;
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ExampleRecordWithNullableFieldsOfEachType> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(ExampleRecordWithNullableFieldsOfEachType.class));

      return (TypeAdapter<T>)
          new TypeAdapter<ExampleRecordWithNullableFieldsOfEachType>() {

            @Override
            public void write(final JsonWriter out, final ExampleRecordWithNullableFieldsOfEachType value) throws IOException {
              final JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public ExampleRecordWithNullableFieldsOfEachType read(final JsonReader in) throws IOException {
              final JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }
}
