package com.openCart_TestFrameworkSteps;

import org.apache.log4j.Logger;
import org.testng.asserts.SoftAssert;

import com.openCart_TestFramework.pages.AccountCreatedPage;
import com.openCart_TestFramework.pages.AccountLogoutPage;
import com.openCart_TestFramework.pages.HomePage;
import com.openCart_TestFramework.pages.MyAccountPage;
import com.openCart_TestFramework.pages.RegisterAccountPage;

public abstract class BaseSteps {
	
	public static SoftAssert softAssert;
	public static Logger logger;
	
	public static HomePage homePage;
	public static RegisterAccountPage registerAccountPage;
	public static AccountCreatedPage accountCreatedPage;
	public static MyAccountPage myAccountPage;
	public static AccountLogoutPage accountLogoutPage;
	
	public BaseSteps() {
		softAssert=new SoftAssert();
		
	
	}

}
