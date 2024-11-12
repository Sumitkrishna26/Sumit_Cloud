package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.AccountCreatedPage;
import com.mystore.pageobject.accountCreation;
import com.mystore.pageobject.indexPage;
import com.mystore.pageobject.myAccount;
import com.mystore.pageobject.searchProductPage;

public class Tc_MyaccountPageTest extends BaseClass {
	
	@Test(enabled=false)
	public void VerifyLogin() {
		
		
		
		indexPage pg = new indexPage(driver);
		pg.Signup();
		
		myAccount ac = new myAccount(driver);
		ac.enterNames("Sumit");
		ac.enterEmail("sumitjikijaihooYO1@gmail.com");
		ac.OnClick();
			
		accountCreation acCreation = new accountCreation(driver);
		
		acCreation.title();
		acCreation.enterpassword("sumit");
		acCreation.enterfirstname("Sumit");
		acCreation.enterlastname("krishna");
		acCreation.enteraddress("hanuman nager");
		acCreation.enteraddress2("patna");
		acCreation.entercountry("India");
		acCreation.enterstate("Bihar");
		acCreation.entercity("city");
		acCreation.enterzipcode("8000020");
		acCreation.entermobilenumber("89876547564");
		
		logger.info("Click on CREATE ACCOUNT BUTTON");
		acCreation.clickOnCreatebtn();
		
		AccountCreatedPage acp = new AccountCreatedPage(driver);
		
		String text = acp.getAccountCreatedName();
		
		Assert.assertEquals("ACCOUNT CREATED!" ,text );
	}
	
	@Test
	public void VerifyLoging() {
		
		indexPage idp = new indexPage(driver);
		idp.Signup();
		
		myAccount myac = new myAccount(driver);
		
		myac.enterlogin("sumitjikijaihooYO1@gmail.com");
		myac.enterLogPassword("sumit");
		myac.ClickOnLog();
		
		AccountCreatedPage acpg = new AccountCreatedPage(driver);
		
		String text = acpg.veryfyprofile();
		if(text.equals("Sumit")) {
			System.out.println("Verified");
		}else {
			System.out.println("Failed");
		}
			
		acpg.productlink();
		
		
		
		
	}

}
