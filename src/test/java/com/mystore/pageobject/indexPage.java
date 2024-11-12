package com.mystore.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class indexPage {
	
	WebDriver ldriver;
	
	public indexPage(WebDriver rdriver)
	{
		ldriver= rdriver;
		
		//for page factory
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(linkText="Signup / Login")
	WebElement Signup;
	
	public void Signup() {
		Signup.click();
	}

}
