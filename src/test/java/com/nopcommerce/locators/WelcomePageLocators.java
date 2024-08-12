package com.nopcommerce.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePageLocators {

	@FindBy(linkText = "Register")
	public WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	public WebElement loginLink;
	
	
}
