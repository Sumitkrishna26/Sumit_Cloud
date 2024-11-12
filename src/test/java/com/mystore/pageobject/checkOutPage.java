package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkOutPage {
	
	WebDriver ldriver;
	
	public checkOutPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//a[@class=\"btn btn-default check_out\"]")
	WebElement Checkout;
	
	
	
	public void procedToCheckOut() {
		Checkout.click();
	}
	

}
