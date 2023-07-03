package com.openCart_TestFramework.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HeaderLocators {
	
	@CacheLookup
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	public WebElement myAccount;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Register')]")
	public WebElement register;
	
	@CacheLookup
	@FindBy(xpath="//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=common/home']")
	public WebElement headerLogo;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Login')]")
	public WebElement loginLink;
	

}
