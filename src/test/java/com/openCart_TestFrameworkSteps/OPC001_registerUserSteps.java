package com.openCart_TestFrameworkSteps;

import org.apache.log4j.LogManager;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.openCart_TestFramework.pages.BasePage;
import com.openCart_TestFramework.pages.HomePage;
import com.openCart_TestFrameworkUtilities.ProcessData;
import com.openCart_TestFrameworkUtilities.ReadConfigFile;
import com.openCart_TestFrameworkUtilities.ReadExcelsheet;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.netty.util.internal.SystemPropertyUtil;

public class OPC001_registerUserSteps extends BaseSteps {

	public OPC001_registerUserSteps() {
		super();
		logger = LogManager.getLogger(OPC001_registerUserSteps.class);

	}

	@Given("user launch browser from {string} throw {int}")
	public void user_launch_browser_from_throw(String sheetName, Integer rowNumber) {
		String browserName = ReadExcelsheet.readData(sheetName, rowNumber).get("Browser");
		BasePage.lauchBrowser(browserName);

	}

	@When("user open the website")
	public void user_open_the_website() {
		String url = ReadConfigFile.getProp().getProperty("opencartUrl");
		homePage = new HomePage(url);

	}

	@Then("Verify that the home page is visible")
	public void verify_that_the_home_page_is_visible() {
		softAssert.assertTrue(homePage.headerComponent.logoIsVisible());

	}

	@When("user clicks on myAccount")
	public void user_clicks_on_myAccount() {
		homePage.headerComponent.clickOnMyAccount();

	}

	@When("user clicks on Register")
	public void user_clicks_on_Register() {
		registerAccountPage = homePage.headerComponent.clickOnRegister();

	}

	@Then("Verify {string} is visible")
	public void verify_is_visible(String expectedStr) {
		softAssert.assertEquals(expectedStr, registerAccountPage.getRegisterAccountText());

	}

	@When("user enters firstname, lastname, email,phone and password taken from {string} through {int}")
	public void user_enters_firstname_lastname_email_phone_and_password_taken_from_through(String sheet,
			Integer rowNumber) {

		registerAccountPage.fillInFirstname(ReadExcelsheet.readData(sheet, rowNumber).get("Firstname"));
		registerAccountPage.fillInLastname(ReadExcelsheet.readData(sheet, rowNumber).get("Lastname"));
		registerAccountPage.fillInEmail(ReadExcelsheet.readData(sheet, rowNumber).get("Email"));

		String phoneNumber = ProcessData.processString(ReadExcelsheet.readData(sheet, rowNumber).get("Phone"));
		registerAccountPage.fillInPhone(phoneNumber);

		registerAccountPage.fillInPassword(ReadExcelsheet.readData(sheet, rowNumber).get("Password"));
		registerAccountPage.fillInConfirmPassword(ReadExcelsheet.readData(sheet, rowNumber).get("ConfirmPassword"));
	}

	@And("user subscribes in newsLetter {string} through {int}")
	public void user_subscribes_in_newsLetter_through(String sheet, Integer rowNumber) {

		String choice = ProcessData.getNewsletterchoice(ReadExcelsheet.readData(sheet, rowNumber).get("Newsletter"));
		registerAccountPage.subscribeToNewsletter(choice);

	}

	@When("user clicks on Policy and privacy")
	public void user_clicks_on_Policy_and_privacy() {
		registerAccountPage.checkReadAndAgreeCheckbox();

	}

	@When("user clicks on Continue")
	public void user_clicks_on_Continue() {
		accountCreatedPage = registerAccountPage.clickOnContinueButton();
	}

	@Then("Verify that {string} is visible")
	public void verify_that_is_visible(String ecpectedMessage) {
		softAssert.assertTrue(accountCreatedPage.accountHasBeenCreatedTextIsDisplayed());
		softAssert.assertEquals(accountCreatedPage.getAccountHasBeenCreatedText(), ecpectedMessage);
	}

	@When("user clicks on Continue to confirm his registration")
	public void user_clicks_on_Continue_to_confirm_his_registration() {
		myAccountPage = accountCreatedPage.clickOnContinue();
	}

	@Then("Verify that {string} is displayed")
	public void verify_that_is_displayed(String expectedText) {
		softAssert.assertTrue(myAccountPage.myAccountTextIsDisplayed());
		softAssert.assertEquals(myAccountPage.getMyAccountText(), expectedText);
		
	}
	@When("user clicks on Logout")
	public void user_clicks_on_Logout() {
	    accountLogoutPage= myAccountPage.logout();
	}
	@Then("Verify {string} is displayed")
	public void verify_is_displayed(String expectedText) {
	   softAssert.assertTrue(accountLogoutPage.accountLogoutTextIsDisplayed());
	   softAssert.assertEquals(accountLogoutPage.getAccountLogoutText(), expectedText);
	}
	
	@When("user clicks on Continue to confirm logout")
	public void user_clicks_on_Continue_to_confirm_logout() {
	    homePage=accountLogoutPage.clickOnContinue();
	}

}
