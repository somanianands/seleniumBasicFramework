package com.app.google.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriverFactory {
	public static final String CHROME_LOCATION = "/src/test/resources/drivers/chromedriver";

	private MyDriverFactory() {
	}

	private static MyDriverFactory instance = new MyDriverFactory();

	public static MyDriverFactory getInstance() {
		return instance;
	}

	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>() {
		@Override
		protected WebDriver initialValue() {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + CHROME_LOCATION);
			return new ChromeDriver();
		}
	};

	public WebDriver getDriver() {
		return driver.get();
	}

	public void removeDriver() {
		driver.get().quit();
		driver.remove();
	}
}