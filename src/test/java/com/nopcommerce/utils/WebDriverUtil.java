package com.nopcommerce.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.nopcommerce.tests.RegistrationTests;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtil {
	private static WebDriver driver;
	
	static {
		
			String browser = PropertyUtil.getProperty("browser");
			switch(browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			default:
				System.out.println("Browser Not Set: "+browser);
			}
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
}
