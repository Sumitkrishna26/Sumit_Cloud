package com.mystore.testcases;

import java.time.Duration;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.mystore.utilities.readConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	readConfig ReadConfig = new readConfig();
	String url = ReadConfig.baseurl();
	
	public static Logger logger;
	String browser = ReadConfig.browser();
	
	String emailaddress = ReadConfig.email();
	
	public static WebDriver driver;
	@BeforeClass
	public void setup() {
		 switch(browser.toLowerCase()) {
		  
		  case "chrome":
		  WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		  break;
		  
		  case "msedge":
		  WebDriverManager.edgedriver().setup();
		   driver = new EdgeDriver();
		  break;
		  
		  default:
			 driver= null;
			 break; 
		  
		  
		  }
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 logger = LogManager.getLogger("MyStore");
		 
		 driver.get(url);

	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
