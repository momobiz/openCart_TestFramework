package com.openCart_TestFramework.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ForgotYourPasswordLocators {
	
	@CacheLookup
	@FindBy(xpath="//h1[contains(text(),'Forgot Your Password?')]")
	public WebElement forgotYourPasswordMessage;
	
	@CacheLookup
	@FindBy(id="input-email")
	public WebElement emailInput;
	
	@CacheLookup
	@FindBy(xpath="//input[@type='submit']")
	public WebElement continueButton;
	

}
