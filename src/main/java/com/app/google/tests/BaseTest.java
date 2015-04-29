package com.app.google.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.app.google.pageobjects.MyDriverFactory;

public abstract class BaseTest {

	@BeforeMethod(alwaysRun = true)
	public void startTest() {
		WebDriver driver = MyDriverFactory.getInstance().getDriver();
		driver.get("https://login.yahoo.com/");
	}

	@AfterMethod(alwaysRun = true)
	public void stopTest() {
		MyDriverFactory.getInstance().removeDriver();
	}

}
