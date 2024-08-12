package com.nopcommerce.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {

	public static String getProperty(String propertyName) {
		String value="";
		try {
			InputStream input = WebDriverUtil.class.getClassLoader().getResourceAsStream("environment.properties");
			Properties prop = new Properties();
			if (input == null) {
	            System.out.println("Sorry, unable to find environment.properties");
	            return null;
	        }
	
	        prop.load(input);
	        
			value = prop.getProperty(propertyName);
		}catch(IOException ex) {
			System.out.println("Exception Caught: "+ex);
		}
		
		return value;
	}
}
