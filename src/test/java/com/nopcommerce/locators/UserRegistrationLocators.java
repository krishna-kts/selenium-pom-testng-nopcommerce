package com.nopcommerce.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationLocators {

	@FindBy(xpath = "//h1")
	public WebElement headding;
	
	
	
	@FindBy(id = "gender-male")
	public WebElement genderMale;
	
	@FindBy(id = "gender-female")
	public WebElement genderFemale;
	
	@FindBy(id = "FirstName")
	public WebElement firstName;
	
	@FindBy(id = "LastName")
	public WebElement lastName;
	
	@FindBy(name = "DateOfBirthDay")
	public WebElement dateOfBirthDay;
	
	@FindBy(name = "DateOfBirthMonth")
	public WebElement dateOfBirthMonth;

	@FindBy(name = "DateOfBirthYear")
	public WebElement dateOfBirthYear;
	
	@FindBy(id = "Email")
	public WebElement email;
	
	@FindBy(id = "Company")
	public WebElement company;
	
	@FindBy(id = "Newsletter")
	public WebElement newsLetter;
	
	@FindBy(id = "Password")
	public WebElement password;
	
	@FindBy(id = "ConfirmPassword")
	public WebElement confirmPassword;
	
	@FindBy(id = "register-button")
	public WebElement registerButton;
	
	
	
	@FindBy(id = "FirstName-error")
	public WebElement firstNameError;
	
	@FindBy(id = "LastName-error")
	public WebElement lastNameError;
	
	@FindBy(id = "Email-error")
	public WebElement emailError;
	
	@FindBy(id = "ConfirmPassword-error")
	public WebElement passwordError;
	
	
	@FindBy(xpath = "//div[@class='result']")
	public WebElement registrationStatus;
	
	@FindBy(linkText = "CONTINUE")
	public WebElement continueButton;
	
}

