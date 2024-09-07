package com.chrimle.example;

import java.util.List;

/**
 * Example of a Record with Array fields
 * @param field1 an Array field
 * @param field2 another Array field
 * @param field3 yet another Array field
 */
public record ExampleRecordWithArrayFields(
    List<Boolean> field1,
    List<Boolean> field2,
    List<Boolean> field3) {

}
