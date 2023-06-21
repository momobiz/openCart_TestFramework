package com.openCart_TestFramework.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountRightMenuLocators {
	
	@CacheLookup
	@FindBy(xpath="//a[@class='list-group-item'][contains(text(),'Logout')]")
	public WebElement logoutLink;

}
