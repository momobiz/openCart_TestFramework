package com.RunnerTestFramework;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features",
				     glue = "com/openCart_TestFrameworkSteps",
				     plugin="io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"
				     
				   
				    
				     
		)
public class Runner extends AbstractTestNGCucumberTests {

}
