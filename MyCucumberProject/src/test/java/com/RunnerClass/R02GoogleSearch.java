package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/MyCucumberProject/MyCucumberProject/D02GoogleSearch.feature", 
					glue = "com.StepDef")
public class R02GoogleSearch {

}
