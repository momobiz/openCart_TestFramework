package com.openCart_TestFramework.pages;

import org.openqa.selenium.support.PageFactory;

import com.openCart_TestFramework.locators.HeaderLocators;

public class HeaderComponent extends BasePage{
	
	public HeaderLocators headerLocators;
	
	public HeaderComponent() {
		headerLocators=new HeaderLocators();
		
		PageFactory.initElements(driver, headerLocators);
	}
	
	public void clickOnMyAccount() {
		moveToWebElementAndClick(headerLocators.myAccount);
		
	}
	
	public RegisterAccountPage clickOnRegister() {
		
		clickOn(headerLocators.register);
		
		return new RegisterAccountPage();
		
	}
	public boolean logoIsVisible() {
		return isDisplayed(headerLocators.headerLogo);
	}
	
	public LoginPage clickOnLogin() {
		
		clickOn(headerLocators.loginLink);
		return new LoginPage();
	}
	

}
