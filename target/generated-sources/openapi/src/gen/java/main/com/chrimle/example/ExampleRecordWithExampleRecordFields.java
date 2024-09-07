package com.chrimle.example;

import java.util.List;

/**
 * Example of a Record with Record fields
 * @param field1 
 * @param field2 
 * @param field3 
 */
public record ExampleRecordWithExampleRecordFields(
    ExampleRecord field1,
    ExampleRecord field2,
    ExampleRecord field3) {

}
