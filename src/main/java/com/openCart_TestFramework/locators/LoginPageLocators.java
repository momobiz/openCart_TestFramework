package com.openCart_TestFramework.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
	@CacheLookup
	@FindBy(id="input-email")
	public WebElement emailInput;
	
	@CacheLookup
	@FindBy(id="input-password")
	public WebElement passwordInput;
	
	@CacheLookup
	@FindBy(xpath="//input[@type='submit']")
	public WebElement loginButton;
	
	@CacheLookup
	@FindBy(xpath="//h2[contains(text(),'Returning Customer')]")
	public WebElement returningCustomerText;
	
	@CacheLookup
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	public WebElement warningInvalidCredentialMessage;
	
	@CacheLookup
	@FindBy(xpath="//div[@class='form-group']//a[contains(text(),'Forgotten Password')]")
	public WebElement forgottenPasswordLink;
	
	@CacheLookup
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	public WebElement confirmationSentEmailMessage;

	

}
