package com.openCart_TestFramework.pages;


public class HomePage extends BasePage {
	public HeaderComponent headerComponent;
	
	public HomePage(String url) {
		openUrl(url);
		headerComponent=new HeaderComponent();
		
	}
	public HomePage() {
		headerComponent=new HeaderComponent();
		
	}

}
