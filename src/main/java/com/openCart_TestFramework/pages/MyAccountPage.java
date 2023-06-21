package com.openCart_TestFramework.pages;

import org.openqa.selenium.support.PageFactory;

import com.openCart_TestFramework.locators.MyAccountLocators;

public class MyAccountPage extends BasePage{
	
	public MyAccountRightMenuComponent myAccountRightMenuComponent;
	public HeaderComponent headerComponent;
	public MyAccountLocators myAccountLocators;
	
	public MyAccountPage() {
		myAccountRightMenuComponent=new MyAccountRightMenuComponent();
		headerComponent=new HeaderComponent();
		myAccountLocators=new MyAccountLocators();
		PageFactory.initElements(driver, myAccountLocators);
		
	}
	public boolean myAccountTextIsDisplayed() {
		return isDisplayed(myAccountLocators.myAccountText);
	}
	public String getMyAccountText() {
		return myAccountLocators.myAccountText.getText();
	}
	
	public AccountLogoutPage logout() {
		scrollToWebElement(myAccountRightMenuComponent.myAccountRightMenuLocators.logoutLink);
		return myAccountRightMenuComponent.clickOnLogout();
	}

}
