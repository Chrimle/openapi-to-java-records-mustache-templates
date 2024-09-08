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
 * Generated with Version: 1.2.1
 *
 */

package com.chrimle.example;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

/**
 * Example of a deprecated Enum
 * @deprecated
 */
@Deprecated
public enum DeprecatedExampleEnum {
    ENUM1,
    ENUM2,
    ENUM3;

    /**
     * Parses the given string to a matching Enum name, Case-insensitive.
     * @param name of the Enum
     * @return a {@link DeprecatedExampleEnum } with the matching name
     * @throws IllegalArgumentException if no Enum name matches the string
     */
    public static DeprecatedExampleEnum fromValue(final String name) {
        for (final DeprecatedExampleEnum b : DeprecatedExampleEnum.values()) {
            if (b.name().equalsIgnoreCase(name)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + name + "'");
    }
}
