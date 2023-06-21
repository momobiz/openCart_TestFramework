package com.openCart_TestFramework.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountLogoutLocators {
	
	@CacheLookup
	@FindBy(xpath="//h1[contains(text(),'Account Logout')]")
	public WebElement accountLogoutText;
	
	@CacheLookup
	@FindBy(xpath="//a[@class='btn btn-primary']")
	public WebElement logoutContinuButton;
	

}
