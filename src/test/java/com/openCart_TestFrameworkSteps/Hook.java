package com.openCart_TestFrameworkSteps;

import java.io.ByteArrayInputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import com.openCart_TestFramework.pages.BasePage;

import io.cucumber.core.backend.TestCaseState;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

import io.qameta.allure.Allure;

public class Hook extends BaseSteps {
	Logger logger = LogManager.getLogger();

	@After
	public void tearDown(Scenario scenario) {

		if (scenario.isFailed()) {
			logger.info("scenario failed");
			TakesScreenshot ts = (TakesScreenshot) BasePage.driver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);

			Allure.addAttachment("failure screenshot", new ByteArrayInputStream(screenshot));

//			scenario.attach(screenshot,"image/png", "png");
		

		}

	}

	

}
