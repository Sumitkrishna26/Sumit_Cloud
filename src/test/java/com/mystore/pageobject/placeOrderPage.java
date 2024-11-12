package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class placeOrderPage {
	
	WebDriver ldriver;
	
	public placeOrderPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//a[@class=\"btn btn-default check_out\"]")
	WebElement placeOrder;
	
	public void placeOrderbtn() {
		placeOrder.click();
	}

}
