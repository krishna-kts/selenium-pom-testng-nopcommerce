package com.nopcommerce.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.locators.UserRegistrationLocators;

public class UserRegistrationActions extends CommonActions{
	private WebDriver driver;
	UserRegistrationLocators userRegistrationLocators;
	
	public UserRegistrationActions(WebDriver driver) {
		super(driver);
		this.driver = driver;
		userRegistrationLocators = new UserRegistrationLocators();
		PageFactory.initElements(driver, userRegistrationLocators);
	}
	
	public String getHeadding() {
		return getText(userRegistrationLocators.headding);
	}
	
	public void clickGenderMale() {
		clickElement(userRegistrationLocators.genderMale);
	}
	
	public void clickGenderFemale() {
		clickElement(userRegistrationLocators.genderFemale);
	}
	
	public void setFirstName(String s) {
		typeData(userRegistrationLocators.firstName, s);
	}
	
	public void setLastName(String s) {
		typeData(userRegistrationLocators.lastName, s);
	}
	
	public void setDateOfBirthDay(String day) {
		selectUsingVisibleText(userRegistrationLocators.dateOfBirthDay, day);
	}
	
	public void setDateOfBirthMonth(String month) {
		selectUsingVisibleText(userRegistrationLocators.dateOfBirthMonth, month);
	}
	
	public void setDateOfBirthYear(String year) {
		selectUsingVisibleText(userRegistrationLocators.dateOfBirthYear, year);
	}
	
	public void setEmailAddress(String s) {
		typeData(userRegistrationLocators.email, s);
	}
	
	public void setCompanyName(String s) {
		typeData(userRegistrationLocators.company, s);
	}
	
	public void checkNewsLetter() {
		if(! userRegistrationLocators.newsLetter.isSelected()) {
			clickElement(userRegistrationLocators.newsLetter);
		}
	}
	
	public void uncheckNewsLetter() {
		if(userRegistrationLocators.newsLetter.isSelected()) {
			clickElement(userRegistrationLocators.newsLetter);
		}
	}
	
	public void setPassword(String s) {
		typeData(userRegistrationLocators.password, s);
	}
	
	public void setConfirmPassword(String s) {
		typeData(userRegistrationLocators.confirmPassword, s);
	}
	
	public void clickRegisterButton() {
		clickElement(userRegistrationLocators.registerButton);
	}
	
	
	public String getFirstNameError() {
		return getText(userRegistrationLocators.firstNameError);
	}
	
	public String getLastNameError() {
		return getText(userRegistrationLocators.lastNameError);
	}
	
	public String getEmailError() {
		return getText(userRegistrationLocators.emailError);
	}
	
	public String getPasswordError() {
		return getText(userRegistrationLocators.passwordError);
	}
	
	public String getRegistrationStatus() {
		return getText(userRegistrationLocators.registrationStatus);
	}
	
	public void clickContinueButton() {
		clickElement(userRegistrationLocators.continueButton);
	}
}
