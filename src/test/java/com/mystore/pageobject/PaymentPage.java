package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	
	WebDriver ldriver;
	
	public PaymentPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(name="name_on_card")
	WebElement cardname;
	
	@FindBy(name="card_number")
	WebElement cardnumber;
	
	@FindBy(name="cvc")
	WebElement cvc;
	
	@FindBy(name="expiry_month")
	WebElement month;
	
	@FindBy(name="expiry_year")
	WebElement year;
	
	@FindBy(id="submit")
	WebElement ClickOnProceed;
	
	public String CardName(String cardnam) {
		cardname.sendKeys(cardnam);
		return cardnam;
		
		
		}
	
	public String CardNumber(String cardnum) {
		cardnumber.sendKeys(cardnum);
		return cardnum;
		
		}
	
	public String Cardcvc(String cardcvc) {
		cvc.sendKeys(cardcvc);
		return cardcvc;
		
		}
	
	public String expirymonth(String expmon) {
		month.sendKeys(expmon);
		return expmon;
		
		}
	
	public String expyear(String expyear) {
		year.sendKeys(expyear);
		return expyear;
		
		}
	
	
	public void submitbtn() {
		ClickOnProceed.click();;
		
		}
	
	

}
