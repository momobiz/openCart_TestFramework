package com.openCart_TestFramework.pages;

import org.openqa.selenium.support.PageFactory;

import com.openCart_TestFramework.locators.MyAccountRightMenuLocators;

public class MyAccountRightMenuComponent extends BasePage {
	
	MyAccountRightMenuLocators myAccountRightMenuLocators;
	
	public MyAccountRightMenuComponent() {
		myAccountRightMenuLocators=new MyAccountRightMenuLocators();
		PageFactory.initElements(driver, myAccountRightMenuLocators);
		
	}
	
	public AccountLogoutPage clickOnLogout() {
		
		clickOn(myAccountRightMenuLocators.logoutLink);
		return new AccountLogoutPage();
	}
	

}
