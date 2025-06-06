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
 * Generated with Version: 2.9.5
 *
 */

package io.github.chrimle.o2jrm.enumUnknownDefaultCase;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.chrimle.o2jrm.enumUnknownDefaultCase.ExampleRecord;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.util.HashSet;
import java.util.Set;

/**
 * Example of a Record with collections of records.
 *
 * @param optionalRecordList Optional field
 * @param requiredRecordList Required field
 * @param optionalRecordSet Another Optional field
 * @param requiredRecordSet Another required field
 */
public record ExampleRecordWithCollectionsOfRecords(
    @jakarta.annotation.Nonnull List<ExampleRecord> optionalRecordList,
    @jakarta.annotation.Nonnull List<ExampleRecord> requiredRecordList,
    @jakarta.annotation.Nonnull Set<ExampleRecord> optionalRecordSet,
    @jakarta.annotation.Nonnull Set<ExampleRecord> requiredRecordSet) {

  /** A set containing the names of all instance fields defined in this class. */
  public static final HashSet<String> openapiFields =
      new HashSet<String>(
          Set.of("optionalRecordList",
              "requiredRecordList",
              "optionalRecordSet",
              "requiredRecordSet"));

  /** A set containing the names of all required fields defined in this class. */
  public static final HashSet<String> openapiRequiredFields =
      new HashSet<String>(
          Set.of("requiredRecordList",
              "requiredRecordSet"));

  public ExampleRecordWithCollectionsOfRecords(
      @jakarta.annotation.Nullable final List<ExampleRecord> optionalRecordList,
      @jakarta.annotation.Nullable final List<ExampleRecord> requiredRecordList,
      @jakarta.annotation.Nullable final Set<ExampleRecord> optionalRecordSet,
      @jakarta.annotation.Nullable final Set<ExampleRecord> requiredRecordSet) {
    this.optionalRecordList = Objects.requireNonNullElse(optionalRecordList, new ArrayList<>());
    this.requiredRecordList = Objects.requireNonNullElse(requiredRecordList, new ArrayList<>());
    this.optionalRecordSet = Objects.requireNonNullElse(optionalRecordSet, new LinkedHashSet<>());
    this.requiredRecordSet = Objects.requireNonNullElse(requiredRecordSet, new LinkedHashSet<>());
  }

  /**
   * Validates the JSON Element and throws an exception if issues are found.
   *
   * @param jsonElement to validate.
   * @throws IOException if the JSON Element is not a valid ExampleRecordWithCollectionsOfRecords object.
   */
  public static void validateJsonElement(final JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      throw new IllegalArgumentException(
          String.format(
              "The required field(s) %s in ExampleRecordWithCollectionsOfRecords is not found in the empty JSON string",
              ExampleRecordWithCollectionsOfRecords.openapiRequiredFields.toString()));
    }

    for (final String key : jsonElement.getAsJsonObject().keySet()) {
      if (!ExampleRecordWithCollectionsOfRecords.openapiFields.contains(key)) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `ExampleRecordWithCollectionsOfRecords` properties. JSON: %s",
                key, jsonElement));
      }
    }

    for (final String requiredField : ExampleRecordWithCollectionsOfRecords.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement));
      }
    }

    final JsonObject jsonObj = jsonElement.getAsJsonObject();

    if (jsonObj.get("optionalRecordList") != null && !jsonObj.get("optionalRecordList").isJsonNull()) { 
      if (!jsonObj.get("optionalRecordList").isJsonArray()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `optionalRecordList` to be an array in the JSON string but got `%s`",
                jsonObj.get("optionalRecordList")));
      }
      for (final JsonElement element : jsonObj.getAsJsonArray("optionalRecordList").asList()) {
        ExampleRecord.validateJsonElement(element);
      }
    }

    if (!jsonObj.get("requiredRecordList").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `requiredRecordList` to be an array in the JSON string but got `%s`",
              jsonObj.get("requiredRecordList")));
    }
    for (final JsonElement element : jsonObj.getAsJsonArray("requiredRecordList").asList()) {
      ExampleRecord.validateJsonElement(element);
    }

    if (jsonObj.get("optionalRecordSet") != null && !jsonObj.get("optionalRecordSet").isJsonNull()) { 
      if (!jsonObj.get("optionalRecordSet").isJsonArray()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `optionalRecordSet` to be an array in the JSON string but got `%s`",
                jsonObj.get("optionalRecordSet")));
      }
      for (final JsonElement element : jsonObj.getAsJsonArray("optionalRecordSet").asList()) {
        ExampleRecord.validateJsonElement(element);
      }
    }

    if (!jsonObj.get("requiredRecordSet").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `requiredRecordSet` to be an array in the JSON string but got `%s`",
              jsonObj.get("requiredRecordSet")));
    }
    for (final JsonElement element : jsonObj.getAsJsonArray("requiredRecordSet").asList()) {
      ExampleRecord.validateJsonElement(element);
    }
  }

  /**
   * Creates {@link TypeAdapter}s for {@link ExampleRecordWithCollectionsOfRecords }s and other
   * <i>assignable</i> types.
   */
  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {

    /**
     * {@inheritDoc}
     *
     * @param gson to create the {@link TypeAdapter} from.
     * @param type to <i>serialize</i>/<i>deserialize</i>.
     * @return an (<i>anonymous</i>) instance of {@link TypeAdapter<ExampleRecordWithCollectionsOfRecords>}, or
     *     {@code null} if {@code T} is not <i>assignable</i> to {@link ExampleRecordWithCollectionsOfRecords }.
     * @param <T> class to <i>serialize</i>/<i>deserialize</i>.
     */
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> type) {
      if (!ExampleRecordWithCollectionsOfRecords.class.isAssignableFrom(type.getRawType())) {
        return null;
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ExampleRecordWithCollectionsOfRecords> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(ExampleRecordWithCollectionsOfRecords.class));

      return (TypeAdapter<T>)
          new TypeAdapter<ExampleRecordWithCollectionsOfRecords>() {

            @Override
            public void write(final JsonWriter out, final ExampleRecordWithCollectionsOfRecords value)
                throws IOException {
              final JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public ExampleRecordWithCollectionsOfRecords read(final JsonReader in) throws IOException {
              final JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }
}
