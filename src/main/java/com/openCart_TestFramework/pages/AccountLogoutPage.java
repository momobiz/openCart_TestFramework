package com.openCart_TestFramework.pages;

import org.openqa.selenium.support.PageFactory;

import com.openCart_TestFramework.locators.AccountLogoutLocators;

public class AccountLogoutPage extends BasePage{
	
	AccountLogoutLocators accountLogoutLocators;
	HeaderComponent headerComponent;
	MyAccountRightMenuComponent myAccountRightMenuComponent;
	
	public AccountLogoutPage() {
		accountLogoutLocators=new AccountLogoutLocators();
		headerComponent=new HeaderComponent();
		myAccountRightMenuComponent=new MyAccountRightMenuComponent();
		
		PageFactory.initElements(driver, accountLogoutLocators);
	}
	
	
	public boolean accountLogoutTextIsDisplayed() {
		return isDisplayed(accountLogoutLocators.accountLogoutText);
	}
	public String getAccountLogoutText() {
		return accountLogoutLocators.accountLogoutText.getText();
	}
	public HomePage clickOnContinue() {
		clickOn(accountLogoutLocators.logoutContinuButton);
		return new HomePage();
	}

}
