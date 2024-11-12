package com.mystore.pageobject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class accountCreation {
	
	//create object of webdriver
	WebDriver ldriver;
	
	//create constructor
	public accountCreation(WebDriver rdriver) {
		
	ldriver = rdriver;
	
	PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(id="id_gender1")
	WebElement title;
	
	@FindBy(id="password")
	WebElement passwords;
	
	
	@FindBy(id="first_name")
	WebElement firstname;
	
	@FindBy(id="last_name")
	WebElement lastname;
	
	
	@FindBy(id="address1")
	WebElement address1;
	
	@FindBy(id="address2")
	WebElement address2;
	
	@FindBy(id="country")
	WebElement country;
	

	@FindBy(id="state")
	WebElement state;
	

	@FindBy(id="city")
	WebElement city;
	

	@FindBy(id="zipcode")
	WebElement zipcode;
	
	@FindBy(id="mobile_number")
	WebElement mobile_number;
	
	@FindBy(xpath="//button[@data-qa=\"create-account\"]")
	WebElement CreateAccountbtn;
	
	public void title() {
		title.click();
	}
	
	public void enterpassword(String password) {
		passwords.sendKeys(password);
	}
	
	public void enterfirstname(String Firstname) {
		firstname.sendKeys(Firstname);
	}
	
	public void enterlastname(String lastName) {
		lastname.sendKeys(lastName);
	}
	
	public void enteraddress(String address) {
		address1.sendKeys(address);
	}
	
	public void enteraddress2(String address) {
		address2.sendKeys(address);
	}
	
	public void entercountry(String countryname) {
		Select obj = new Select(country);
		obj.selectByVisibleText(countryname);
	}
	
	public void enterstate(String statename) {
		state.sendKeys(statename);
	}
	
	public void entercity(String cityname) {
		city.sendKeys(cityname);
	}
	
	public void enterzipcode(String zipcodes) {
		zipcode.sendKeys(zipcodes);
	}
	
	public void entermobilenumber(String number) {
		mobile_number.sendKeys(number);
	}
	
	public void clickOnCreatebtn() {
		CreateAccountbtn.click();
	}
	
	
	
	
	
	

}
