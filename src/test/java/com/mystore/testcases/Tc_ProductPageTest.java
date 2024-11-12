package com.mystore.testcases;

import org.testng.annotations.Test;

import com.mystore.pageobject.AccountCreatedPage;
import com.mystore.pageobject.PaymentPage;
import com.mystore.pageobject.checkOutPage;
import com.mystore.pageobject.confirmOrderPage;
import com.mystore.pageobject.myAccount;
import com.mystore.pageobject.placeOrderPage;
import com.mystore.pageobject.searchProductPage;

public class Tc_ProductPageTest extends BaseClass{
	
	@Test
	public void Productpage() {
	searchProductPage spp = new searchProductPage(driver);
	
	
	spp.LogOut();
	
	myAccount myac = new myAccount(driver);
	
	myac.enterlogin("sumitjikijaihooYO1@gmail.com");
	myac.enterLogPassword("sumit");
	myac.ClickOnLog();
	
	AccountCreatedPage acpg = new AccountCreatedPage(driver);
	
	acpg.productlink();
	
	spp.Searchbox("Tshirt");
	spp.Searchbtn();
	
	String tshirts = spp.verfytshirt();
	if(tshirts.equals("Tshirt")) {
		System.out.println("Verified");
	}else {
		System.out.println("Failed");
	}
	
	spp.addtoCart();
	spp.ClickOnCart();
	
	checkOutPage cop = new checkOutPage(driver);
	cop.procedToCheckOut();
	
	placeOrderPage pop = new placeOrderPage(driver);
	pop.placeOrderbtn();
	
	PaymentPage pp = new PaymentPage(driver);
	
	logger.info("Filled cardName");
	pp.CardName("Sumit krishna");
	
	logger.info("Filled cardNumber");
	pp.CardNumber("987654321987");
	
	logger.info("Filled cvc");
	pp.Cardcvc("373");
	
	logger.info("Filled cardexpmonth");
	pp.expirymonth("09");
	
	logger.info("Filled cardExpYear");
	pp.expyear("20");
	
	
	logger.info("ClickOn Confirm");
	pp.submitbtn();
	
	confirmOrderPage cops = new confirmOrderPage(driver);
	
	String cnfmsg = cops.veryfyCnfOrder();
	if(cnfmsg.equals("Congratulations! Your order has been confirmed!")) {
		System.out.println("ORDER PLACED");
	}
	else {
		System.out.println("ORDER NOT PLACED");
	}
	
	cops.ClickOnContinueShoping();
		

	
	}
	
}
