package com.openCart_TestFramework.pages;

import org.apache.hc.client5.http.entity.mime.Header;
import org.openqa.selenium.support.PageFactory;

import com.openCart_TestFramework.locators.ForgotYourPasswordLocators;

public class ForgotYourPasswordPage extends BasePage{
	
	public ForgotYourPasswordLocators forgotYourPasswordLocators;
	public HeaderComponent header;
	
	public ForgotYourPasswordPage() {
		forgotYourPasswordLocators=new ForgotYourPasswordLocators();
		header= new HeaderComponent();
		
		PageFactory.initElements(driver, forgotYourPasswordLocators);
	}
	
	public boolean forgotPasswordMessageIsDisplayed() {
		return isDisplayed(forgotYourPasswordLocators.forgotYourPasswordMessage);
	}
	public String getForgotPasswordMessage() {
		return forgotYourPasswordLocators.forgotYourPasswordMessage.getText();
	}
	public void fillInEmailAndClickPnContinue(String email) {
		fillIn(forgotYourPasswordLocators.emailInput, email);
		clickOn(forgotYourPasswordLocators.continueButton);
		
	}
	public LoginPage redirectToLoginPage() {
		return new LoginPage();
	}
}
