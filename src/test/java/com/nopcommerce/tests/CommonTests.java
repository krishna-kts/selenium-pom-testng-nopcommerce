package com.nopcommerce.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.nopcommerce.utils.WebDriverUtil;

public class CommonTests {
	@BeforeSuite
	public void beforeSuite() {
		
	}
	
	@AfterSuite
	public void afterSuite() {
		WebDriverUtil.getDriver().quit();
	}
}
