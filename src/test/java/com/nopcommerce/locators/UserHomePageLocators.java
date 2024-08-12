package com.nopcommerce.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserHomePageLocators {

	@FindBy(linkText = "Log out")
	public WebElement logoutLink;
}
