package com.mystore.utilities;

import java.io.FileInputStream;

import java.util.Properties;

public class readConfig {

	Properties properties;

	String path = "F:\\selnenium prc1\\Configuration\\Config.properties";

	public readConfig() {
		try {
			properties = new Properties();


			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String baseurl() {

		String baseurl = properties.getProperty("baseurl");
		return baseurl;
			

	}
	public String browser() {

		String browser = properties.getProperty("browser");
		return browser;
			
	}

	public String email() {
		// TODO Auto-generated method stub
		String email = properties.getProperty("email");
		return email;
	}
}
