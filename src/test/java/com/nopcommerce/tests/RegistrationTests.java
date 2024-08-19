package com.nopcommerce.tests;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopcommerce.actions.UserHomePageActions;
import com.nopcommerce.actions.UserRegistrationActions;
import com.nopcommerce.actions.WelcomePageActions;
import com.nopcommerce.utils.Constants;
import com.nopcommerce.utils.RandomUtil;
import com.nopcommerce.utils.WebDriverUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationTests {
	WebDriver driver;
	UserRegistrationActions actions;
	UserHomePageActions userHomePageActions;
	WelcomePageActions welcomePageActions;
	
	public RegistrationTests() {
		driver = WebDriverUtil.getDriver();
		actions = new UserRegistrationActions(driver);
		userHomePageActions = new UserHomePageActions(driver);
		welcomePageActions = new WelcomePageActions(driver);
	}
	
	@Test(groups = {"smoke"})
	public void registerLinkTest() {
		driver.get(Constants.USER_BASE_URL);
		
		welcomePageActions.clickRegisterLink();
		
		String actualHedding =  actions.getHeadding();
		String expectedHedding = "Register";
		
		Assert.assertEquals(actualHedding, expectedHedding);
	}
	
	@Test(groups = {"positive"})
	public void registerUserPositiveTest(){
		driver.get(Constants.USER_BASE_URL+Constants.USER_REGISTRATION_PAGE);
		
		actions.clickGenderMale();
		actions.setFirstName("Tony");
		actions.setLastName("Stark");
		actions.setDateOfBirthDay("11");
		actions.setDateOfBirthMonth("December");
		actions.setDateOfBirthYear("1991");
		String email = RandomUtil.getRandomEmail();
		System.out.println("Email: "+email);
		actions.setEmailAddress(email);
		actions.setCompanyName("KTS");
		actions.checkNewsLetter();
		actions.setPassword("kts@1234");
		actions.setConfirmPassword("kts@1234");
		actions.clickRegisterButton();
		
		String status = actions.getRegistrationStatus();
		Assert.assertEquals(status, "Your registration completed");
		
		actions.clickContinueButton();
		
		userHomePageActions.clickLogout();
	}

	@Test(groups = {"negative"})
	public void registerUserNegativeTest01() {
		driver.get(Constants.USER_BASE_URL+Constants.USER_REGISTRATION_PAGE);
		
		actions.clickRegisterButton();
		
		Assert.assertEquals(actions.getFirstNameError(), "First name is required.");
		Assert.assertEquals(actions.getLastNameError(), "Last name is required.");
		Assert.assertEquals(actions.getEmailError(), "Email is required.");
		Assert.assertEquals(actions.getPasswordError(), "Password is required.");
	}
}
