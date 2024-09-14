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
 * Generated with Version: 1.6.0
 *
 */

package com.chrimle.example.additionalEnumTypeAnnotations;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

/**
 * Example of an Enum
 */
@com.chrimle.example.annotations.TestAnnotationOne
@com.chrimle.example.annotations.TestAnnotationTwo
@com.chrimle.example.annotations.TestAnnotationThree
public enum ExampleEnum {
    ENUM1,
    ENUM2,
    ENUM3;
}
