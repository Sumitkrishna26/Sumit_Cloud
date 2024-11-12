package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreatedPage {
	
	//create object of webdriver
		WebDriver ldriver;
		
		//create constructor
		public AccountCreatedPage(WebDriver rdriver) {
			
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
			
		}
		
		@FindBy(xpath="//h2[@class=\"title text-center\"]")
		WebElement accountcreatedname;
		
		public String getAccountCreatedName() {
			
			String name = accountcreatedname.getText();
			return name;
			
		}
		
		@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b")
		WebElement profilename;
		
		@FindBy(xpath="//i[@class=\"material-icons card_travel\"]")
		WebElement product;
		
		public String veryfyprofile() {
			String profileName = profilename.getText();
			return profileName;
		}
		
		public void productlink() {
			product.click();
		}

}
