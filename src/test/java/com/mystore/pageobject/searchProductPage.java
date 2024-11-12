package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchProductPage {
	
	WebDriver ldriver;
	
	public searchProductPage(WebDriver rdriver) {
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(id="search_product")
	WebElement searchbox;
	
	@FindBy(id="submit_search")
	WebElement searchbtn;
	
	@FindBy(xpath="//i[@class=\"fa fa-lock\"]")
	WebElement logoutbtn;
	
	@FindBy(xpath="//a[@class=\"google-anno\"]")
	WebElement texttshirt;
	
	@FindBy(xpath="//a[@data-product-id=\"29\"]")
	WebElement addcart;
	
	@FindBy(linkText="View Cart")
	WebElement Clickcartbtn;
	
	public void Searchbox(String name) {
		searchbox.sendKeys(name);
	}
	
	public void Searchbtn() {
		searchbtn.click();
	}
	
	public void LogOut() {
		logoutbtn.click();
	}
	
	public String verfytshirt() {
		String tshirt = texttshirt.getText();
		return tshirt;
		
	}
	
	public void addtoCart() {
		addcart.click();
	}
	
	public void ClickOnCart() {
		Clickcartbtn.click();
	}

}
