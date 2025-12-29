package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/MyCucumberProject/MyCucumberProject/F05TestSeleniumPage.feature",
					glue = "com.StepDef",
					tags = "@SeleniumTest",
					publish = true)
					//publish = true will create a cucumber report
public class R05TestSeleniumPage {
	/*
	 * 1. Execute single scenario		tags = "@SmokeTest"
	 * 2. Execute multiple scenarios	tags = "@SmokeTest or @UITest"
	 * 3. Skip Single scenario			tags = "not @SupportTest"
	 * 4. Skip Multiple scenarios		tags = "not @SupportTest and not @UITest"
	 * 5. Execute all scenarios			tags = "@SeleniumTest"
	 */

}
