package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class confirmOrderPage {
	
    WebDriver ldriver;
	
	public confirmOrderPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//p[text()='Congratulations! Your order has been confirmed!']")
	WebElement CnfOrder;
	
	@FindBy(xpath="//a[@class=\"btn btn-primary\"]")
	WebElement continueShoping;
	
	public String veryfyCnfOrder() {
		String cnf = CnfOrder.getText();
		return cnf;
	}
	
	public void ClickOnContinueShoping() {
		continueShoping.click();
	}

}
