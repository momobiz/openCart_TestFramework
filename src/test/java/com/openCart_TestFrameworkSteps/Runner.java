package com.openCart_TestFrameworkSteps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features",
				     glue = "")
public class Runner extends AbstractTestNGCucumberTests {

}
