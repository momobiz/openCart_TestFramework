package com.openCart_TestFramework.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
	
	public static WebDriver driver; 
	public WebDriverWait wait;
	public Logger logger=LogManager.getLogger(BasePage.class);
	public JavascriptExecutor js;
	public Select select;
	public Actions actions;
	
	public static void lauchBrowser(String browserName) {
		driver=Browser.getInstance().getDriver(browserName);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void openUrl(String url) {
		driver.get(url);
	}
	
	public boolean isDisplayed(WebElement element) {
		wait=new WebDriverWait(driver, 10);
		
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			
			
		} catch (Exception e) {
			logger.info(e.getMessage());
			return false;
		}
	
		return true;
		
	}
	public void clickOn(WebElement element) {
		element.click();
	}
	public void fillIn(WebElement element,String str) {
		element.clear();
		element.sendKeys(str);
	}
	
	public void selectRadioButton(List<WebElement> radios, String gender) {
		
		for(WebElement radio:radios) {
			try {
				
					if(radio.getAttribute("value").contentEquals(gender)) {
						if(!radio.isSelected()) radio.click();
						
					};
				
				
			} catch (Exception e) {
				logger.warn(e.getMessage());;
			}
		}
	
	}
	public String toCamelcase(String str) {
		String str1=str.toLowerCase();
		return Character.toUpperCase(str1.charAt(0))+str1.substring(1);
	}
	public void scrollDown(int pixelNumber) {
		js=(JavascriptExecutor) driver;
		js.executeScript("scroll(0,"+pixelNumber+")");
	
	}
	public void selectOption(WebElement dropDown,String option) {
		select=new Select(dropDown);
		select.selectByValue(option);
		
	}
	public void selectCheckbox(WebElement checkbox) {
		if(!checkbox.isSelected()) checkbox.click();
	}
	public void deSelectCheckbox(WebElement checkbox) {
		if(checkbox.isSelected()) checkbox.click();
	}
	public void moveToWebElement(WebElement element) {
		actions=new Actions(driver);
		actions.moveToElement(element).build().perform();;
	}
	public void moveToWebElementAndClick(WebElement element) {
		actions=new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}
	public void scrollToWebElement(WebElement element) {
		js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	public void uploadFile(WebElement element, String filePath) {
		element.sendKeys(filePath);
	}
	public void quitDriver() {
		driver.quit();
	}
	public void clickOnAlertButton() {
		driver.switchTo().alert().accept();
	}
	

}
