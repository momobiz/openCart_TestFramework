package com.openCart_TestFramework.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedLocators {
	
	@CacheLookup
	@FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!')]")
	public WebElement accountHasBeenCreatedText;
	
	@CacheLookup
	@FindBy(xpath="//a[@class='btn btn-primary']")
	public WebElement continueButton;

}
