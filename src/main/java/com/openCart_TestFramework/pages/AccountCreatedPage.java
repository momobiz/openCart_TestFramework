package com.openCart_TestFramework.pages;

import org.openqa.selenium.support.PageFactory;

import com.openCart_TestFramework.locators.AccountCreatedLocators;

public class AccountCreatedPage extends BasePage {
	
	HeaderComponent headerComponent;
	AccountCreatedLocators accountCreatedLocators;
	
	public AccountCreatedPage() {
		headerComponent=new HeaderComponent();
		accountCreatedLocators=new AccountCreatedLocators();
		
		PageFactory.initElements(driver, accountCreatedLocators);
	}
	
	public boolean accountHasBeenCreatedTextIsDisplayed() {
		return isDisplayed(accountCreatedLocators.accountHasBeenCreatedText);
	}
	
	public String getAccountHasBeenCreatedText() {
		return accountCreatedLocators.accountHasBeenCreatedText.getText();
	}
	public MyAccountPage clickOnContinue() {
		clickOn(accountCreatedLocators.continueButton);
		return new MyAccountPage();
	}

}
