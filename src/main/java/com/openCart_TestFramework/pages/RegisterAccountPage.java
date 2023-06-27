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

		selectCheckbox(registerAccountLocators.readAndAgreeCheckbox);
	}
	public void clickOnContinueButton() {
		clickOn(registerAccountLocators.continueButton);
		
		
	}
	public AccountCreatedPage generateAccountCreatedPage() {
		return new AccountCreatedPage();
	}
	
	public boolean WarningEmailAlreadyExistMessageIsDisplayed() {
		return isDisplayed(registerAccountLocators.warningEmailAlreadyExist);
	}
	
	public String getWarningEmailAlreadyExistMessage() {
		String warning="";
		try {
			if(WarningEmailAlreadyExistMessageIsDisplayed()) {
				warning=registerAccountLocators.warningEmailAlreadyExist.getText();
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return warning;
	}
	
	public boolean warningEmailValidityIsDisplayed() {
		return isDisplayed(registerAccountLocators.warningEmailValidity);
	}
	public String getWarningEmailValidityMessage() {
		return registerAccountLocators.warningEmailValidity.getText();
	}
	
	public String getEmailLabelColor() {
		return registerAccountLocators.emailLabel.getCssValue("color");
	}
	public boolean passwordMatchingMessageIsDisplayed() {
		
		return isDisplayed(registerAccountLocators.warningMatchingPassword);
	}
	public String getPasswordMatchingMessage() {
		scrollDown(150);
		return registerAccountLocators.warningMatchingPassword.getText();
	}
	public boolean privacyPolicyMessageIsDisplayed() {
		return isDisplayed(registerAccountLocators.warningPrivacyPolicyMessage);
	}
	public String getPrivacyPolicyMessage() {
		return registerAccountLocators.warningPrivacyPolicyMessage.getText();
	}
	
	

}
