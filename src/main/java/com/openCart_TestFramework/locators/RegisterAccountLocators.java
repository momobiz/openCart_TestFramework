package com.openCart_TestFramework.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterAccountLocators {
	
	@CacheLookup
	@FindBy(xpath="//h1[contains(text(),'Register Account')]")
	public WebElement registerAccount;
	
	@CacheLookup
	@FindBy(id="input-firstname")
	public WebElement fistnameInput;
	
	@CacheLookup
	@FindBy(id="input-lastname")
	public WebElement lastnameInput;
	
	@CacheLookup
	@FindBy(id="input-email")
	public WebElement emailInput;
	
	@CacheLookup
	@FindBy(id="input-telephone")
	public WebElement phoneInput;
	
	@CacheLookup
	@FindBy(id="input-password")
	public WebElement passwordInput;
	
	@CacheLookup
	@FindBy(id="input-confirm")
	public WebElement confirmPasswordInput;
	
	@CacheLookup
	@FindBy(xpath="//input[@name='newsletter']")
	public List<WebElement> newsletterradioButtons;
	
	@CacheLookup
	@FindBy(xpath="//input[@name='agree']")
	public WebElement readAndAgreeCheckbox;
	
	@CacheLookup
	@FindBy(xpath="//input[@type='submit']")
	public WebElement continueButton;
	

}
