package com.mystore.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAccount {
	
	WebDriver ldriver;
	
	public myAccount(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="name") 
	WebElement enterName;
	
	@FindBy(xpath="//input[@data-qa=\"signup-email\"]") 
	WebElement enterEmail;
	
	@FindBy(xpath="//button[@data-qa=\"signup-button\"]")
	WebElement Clickbtn;
	
	@FindBy(xpath="//input[@data-qa=\"login-email\"]")
	WebElement enterLogin;
	
	@FindBy(xpath="//input[@data-qa=\"login-password\"]")
	WebElement enterlogPassword;
	
	@FindBy(xpath="//button[@data-qa=\"login-button\"]")
	WebElement ClickOnLog;
	
	public void enterNames(String name) {
		enterName.sendKeys(name);
	}
	
	public void enterEmail(String email) {
		enterEmail.sendKeys(email);
	}
	
	public void OnClick() {
		Clickbtn.click();
	}
	
	public void enterlogin(String logname) {
		enterLogin.sendKeys(logname);
		
	}
	
	public void enterLogPassword(String paswd) {
		enterlogPassword.sendKeys(paswd);
	}
	
	public void ClickOnLog() {
		ClickOnLog.click();
	}
	
	

}
