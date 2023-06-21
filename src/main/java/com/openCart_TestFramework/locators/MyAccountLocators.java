package com.openCart_TestFramework.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountLocators {
	
	@CacheLookup
	@FindBy(xpath="//div[@id='content']/h2[contains(text(),'My Account')]")
	public WebElement myAccountText;
	

	
	
	

}
