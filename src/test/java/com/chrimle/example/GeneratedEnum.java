package com.chrimle.example;

import com.chrimle.example.utils.AssertionUtils;

public class GeneratedEnum {

  public final Class<?> classUnderTest;
  public final PluginExecution pluginExecution;
  public final GeneratedClass generatedClass;

  public GeneratedEnum(PluginExecution pluginExecution, GeneratedClass generatedClass) {
    this.pluginExecution = pluginExecution;
    this.generatedClass = generatedClass;
    classUnderTest =
        AssertionUtils.assertClassExists(generatedClass.getCanonicalClassName(pluginExecution));
  }
}
