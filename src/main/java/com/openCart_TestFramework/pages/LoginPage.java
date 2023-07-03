package com.openCart_TestFramework.pages;

import org.openqa.selenium.support.PageFactory;

import com.openCart_TestFramework.locators.LoginPageLocators;

public class LoginPage extends BasePage{
	HeaderComponent headerComponent;
	LoginPageLocators loginPageLocators;
	
	
	public LoginPage() {
		headerComponent=new HeaderComponent();
		loginPageLocators=new LoginPageLocators();
		
		PageFactory.initElements(driver, loginPageLocators);
	}
	
	public void fillInEmail(String email) {
		fillIn(loginPageLocators.emailInput, email);
	}
	public void fillInPassword(String password) {
		fillIn(loginPageLocators.passwordInput, password);
	}
	public void clickOnLogin() {
		clickOn(loginPageLocators.loginButton);
	}
	public MyAccountPage redirectedToMyAccountPage() {
		return new MyAccountPage();
	}
	
	public boolean returningCustomerTextIsdisplayed() {
		return isDisplayed(loginPageLocators.returningCustomerText);
	}
	public String getReturningCustomerText() {
		return loginPageLocators.returningCustomerText.getText();
	}
	public boolean warningInvalidCredentialMessageIsDisplayed() {
		return isDisplayed(loginPageLocators.warningInvalidCredentialMessage);
	}
	public String getWarningInvalidCredentialMessage() {
		return loginPageLocators.warningInvalidCredentialMessage.getText();
	}
	
	public ForgotYourPasswordPage clickOnForgottenPassWordLink() {
		clickOn(loginPageLocators.forgottenPasswordLink);
		return new ForgotYourPasswordPage();
	}
	
	public boolean confirmationSentMessageIsDisplayed() {
		return isDisplayed(loginPageLocators.confirmationSentEmailMessage);
	}
	public String getConfirmationSentMessage() {
		return loginPageLocators.confirmationSentEmailMessage.getText();
	}
 

}
