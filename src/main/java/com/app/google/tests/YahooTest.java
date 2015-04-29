package com.app.google.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.app.google.pageobjects.MyDriverFactory;
import com.app.google.pageobjects.YahooPage;

public class YahooTest extends BaseTest {

	@Test
	public void verifyYahooPageTitle_TC1() {
		WebDriver driver = MyDriverFactory.getInstance().getDriver();
		System.out.println("IN verifyYahooPageTitle_TC1");
		YahooPage yahooPage = PageFactory.initElements(driver, YahooPage.class);
		yahooPage.clickOnSignIn();

	}

	@Test
	public void verifyYahooPageTitle_TC2() {
		WebDriver driver = MyDriverFactory.getInstance().getDriver();
		System.out.println("IN verifyYahooPageTitle_TC2");
		YahooPage yahooPage = PageFactory.initElements(driver, YahooPage.class);
		yahooPage.clickOnSignIn();
	}

	@Test
	public void verifyYahooPageTitle_TC3() {
		WebDriver driver = MyDriverFactory.getInstance().getDriver();
		System.out.println("IN verifyYahooPageTitle_TC3");
		YahooPage yahooPage = PageFactory.initElements(driver, YahooPage.class);
		yahooPage.clickOnSignIn();
	}
}