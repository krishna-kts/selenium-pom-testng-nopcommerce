package com.nopcommerce.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.locators.WelcomePageLocators;

public class WelcomePageActions extends CommonActions{

	private WebDriver driver;
	WelcomePageLocators welcomePageLocators;
	
	public WelcomePageActions(WebDriver driver) {
		super(driver);
		welcomePageLocators = new WelcomePageLocators();
		PageFactory.initElements(driver, welcomePageLocators);
	}
	
	public void clickRegisterLink() {
		clickElement(welcomePageLocators.registerLink);
	}
	
	public void clickLoginLink() {
		clickElement(welcomePageLocators.loginLink);
	}
	
}
