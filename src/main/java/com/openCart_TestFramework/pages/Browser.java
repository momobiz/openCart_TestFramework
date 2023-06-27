package com.openCart_TestFramework.pages;

import java.util.Arrays;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	static Browser browser;
	static WebDriver driver;
    
	
	private Browser() {
			
	}
	
	public static Browser getInstance() {
		if(browser==null) {
			browser= new Browser();
		}
		return browser;
	}
	
	public WebDriver getDriver(String driverName) {
		
		switch(driverName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*"); 
			options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
			
			driver=new ChromeDriver(options);
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		default:
			System.out.println("You have to choose firefox or chrome browser");
			break;
		
			
		
		}
		return driver;
			
		
	}

}
