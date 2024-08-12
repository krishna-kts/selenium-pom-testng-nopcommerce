package com.nopcommerce.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.locators.UserHomePageLocators;
import com.nopcommerce.locators.UserRegistrationLocators;

public class UserHomePageActions extends CommonActions{
	
	private WebDriver driver;
	UserHomePageLocators homePageLocators;
	
	public UserHomePageActions(WebDriver driver) {
		super(driver);
		this.driver = driver;
	    homePageLocators = new UserHomePageLocators();
		PageFactory.initElements(driver, homePageLocators);
	}

	public void clickLogout() {
		clickElement(homePageLocators.logoutLink);
	}
}
