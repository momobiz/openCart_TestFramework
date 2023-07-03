package com.openCart_TestFrameworkSteps;

import org.testng.Assert;

import com.openCart_TestFrameworkUtilities.ReadExcelsheet;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OPC002_loginUserSteps extends BaseSteps {

	public OPC002_loginUserSteps() {
		super();

	}

	@When("user clicks on Login")
	public void user_clicks_on_Login() {
		loginPage = homePage.headerComponent.clickOnLogin();

	}

	@Then("Verify that {string} on login page is visible")
	public void verify_that_on_login_page_is_visible(String expectedText) {

		Assert.assertTrue(loginPage.returningCustomerTextIsdisplayed());
		Assert.assertEquals(loginPage.getReturningCustomerText(), expectedText);
	

	}

	@When("user enters his login and password from {string} throw {int}")
	public void user_enters_his_login_and_password_from_throw(String sheet, Integer rowNumber) {

		loginPage.fillInEmail(ReadExcelsheet.readData(sheet, rowNumber).get("Email"));
		loginPage.fillInPassword(ReadExcelsheet.readData(sheet, rowNumber).get("Password"));

	}

	@And("on the login page user clicks on Login")
	public void on_the_login_page_user_clicks_on_Login() {
		loginPage.clickOnLogin();
		myAccountPage=loginPage.redirectedToMyAccountPage();
	
	}
	
	/*****************************************************************/
	/***  Additional steps for login with invalid credentials ***/
	/*****************************************************************/
	
	@Then("On the loginPage, verify {string} is Displayed")
	public void on_the_loginPage_verify_is_Displayed(String expectedWarningMessage) {
		Assert.assertTrue(loginPage.warningInvalidCredentialMessageIsDisplayed());
		Assert.assertEquals(loginPage.getWarningInvalidCredentialMessage(), expectedWarningMessage);

	    
	}
	/*****************************************************************/
	/***  Additional steps for login when user forgot his password  ***/
	/*****************************************************************/
	@When("user clicks on Forgotten Password")
	public void user_clicks_on_Forgotten_Password() {
		forgotYourPasswordPage=loginPage.clickOnForgottenPassWordLink();
	   
	}
	
	@Then("On ForgotYourPassword page, verify {string} is visible")
	public void on_ForgotYourPassword_page_verify_is_visible(String expectedMessage) {
		
		Assert.assertTrue(forgotYourPasswordPage.forgotPasswordMessageIsDisplayed());
		Assert.assertEquals(forgotYourPasswordPage.getForgotPasswordMessage(), expectedMessage);
	    
	}
	@When("On ForgotYourPassword page user enters email {string} throw {int} and clicks on Continue")
	public void on_ForgotYourPassword_page_user_enters_email_throw_and_clicks_on_Continue(String sheet8, Integer rowNumber) {
	   
		forgotYourPasswordPage.fillInEmailAndClickPnContinue(ReadExcelsheet.readData(sheet8, rowNumber).get("Email"));
		loginPage=forgotYourPasswordPage.redirectToLoginPage();
	}
	@Then("OnLoginPage verify that {string} is visible")
	public void onloginpage_verify_that_is_visible(String expectedMessage) {
	
		Assert.assertTrue(loginPage.confirmationSentMessageIsDisplayed());
		Assert.assertEquals(loginPage.getConfirmationSentMessage(),expectedMessage);
	   
	}

	

}
