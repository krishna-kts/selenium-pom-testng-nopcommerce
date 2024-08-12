package com.nopcommerce.actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonActions {
	private WebDriver driver;
	WebDriverWait wait;
	
	public CommonActions(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	public String getText(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element.getText();
	}
	
	public void clickElement(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public void typeData(WebElement element, String s) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(s);
	}
	
	public void selectUsingVisibleText(WebElement element, String s) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		Select ob = new Select(element);
		ob.selectByVisibleText(s);
	}
}
