package com.openCart_TestFramework.pages;

import org.openqa.selenium.support.PageFactory;

import com.openCart_TestFramework.locators.RegisterAccountLocators;

public class RegisterAccountPage extends BasePage{
	
	RegisterAccountLocators registerAccountLocators;
	public HeaderComponent headerPage;
	
	public RegisterAccountPage() {
		headerPage=new HeaderComponent();
		registerAccountLocators=new RegisterAccountLocators();
		
		PageFactory.initElements(driver, registerAccountLocators);
	}
	
	public String getRegisterAccountText() {
		return registerAccountLocators.registerAccount.getText();
	}
	public void fillInFirstname(String firstname) {
		scrollDown(150);
		fillIn(registerAccountLocators.fistnameInput, firstname);
		
	}
	public void fillInLastname(String lastname) {
		fillIn(registerAccountLocators.lastnameInput, lastname);
	}
	public void fillInEmail(String email) {
		fillIn(registerAccountLocators.emailInput, email);
	}
	public void fillInPhone(String phoneNumber) {
		 fillIn(registerAccountLocators.phoneInput, phoneNumber);
	}
	public void fillInPassword(String password) {
		scrollDown(100);
		fillIn(registerAccountLocators.passwordInput, password);
	}
	public void fillInConfirmPassword(String confirmPassword) {
		fillIn(registerAccountLocators.confirmPasswordInput, confirmPassword);
	}
	public void subscribeToNewsletter(String choice) {
		scrollToWebElement(registerAccountLocators.continueButton);
		selectRadioButton(registerAccountLocators.newsletterradioButtons, choice);
		
	}
	public void checkReadAndAgreeCheckbox() {
//		moveToWebElement(registerAccountLocators.continueButton);
		selectCheckbox(registerAccountLocators.readAndAgreeCheckbox);
	}
	public AccountCreatedPage clickOnContinueButton() {
		clickOn(registerAccountLocators.continueButton);
		return new AccountCreatedPage();
		
	}
	
	

}
