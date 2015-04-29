package com.app.google.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.google.pageobjects.CreateAccountPage;
import com.app.google.pageobjects.MyDriverFactory;
import com.app.google.pageobjects.YahooPage;

public class CreateAccountTest extends BaseTest {

	@Test
	public void verifyCreateAccountPageTitle_TC1() {
		System.out.println("IN verifyCreateAccountPageTitle_TC1");
		WebDriver driver = MyDriverFactory.getInstance().getDriver();
		YahooPage yahooPage = PageFactory.initElements(driver, YahooPage.class);
		System.out.println("TITLE :: " + yahooPage.getYahooPageTitle());
		Assert.assertEquals(yahooPage.getYahooPageTitle(), "Yahoo - login");
		CreateAccountPage createAccountPage = yahooPage.clickOnCreateAccount();
		Assert.assertEquals(createAccountPage.getCreateAccountPageTitle(),
				"Yahoo Registration");
		createAccountPage.enterFirstName("Anand");
		System.out.println("OUT verifyCreateAccountPageTitle_TC1  "
				+ createAccountPage.getFirstName());
	}

	@Test
	public void verifyCreateAccountPageTitle_TC2() {
		System.out.println("IN verifyCreateAccountPageTitle_TC2");
		WebDriver driver = MyDriverFactory.getInstance().getDriver();
		YahooPage yahooPage = PageFactory.initElements(driver, YahooPage.class);
		System.out.println("TITLE :: " + yahooPage.getYahooPageTitle());
		Assert.assertEquals(yahooPage.getYahooPageTitle(), "Yahoo - login");
		CreateAccountPage createAccountPage = yahooPage.clickOnCreateAccount();
		Assert.assertEquals(createAccountPage.getCreateAccountPageTitle(),
				"Yahoo Registration");
		createAccountPage.enterFirstName("Satish");
		System.out.println("OUT verifyCreateAccountPageTitle_TC2  "
				+ createAccountPage.getFirstName());
	}

	@Test
	public void verifyCreateAccountPageTitle_TC3() {
		System.out.println("IN verifyCreateAccountPageTitle_TC3");
		WebDriver driver = MyDriverFactory.getInstance().getDriver();
		YahooPage yahooPage = PageFactory.initElements(driver, YahooPage.class);
		System.out.println("TITLE :: " + yahooPage.getYahooPageTitle());
		Assert.assertEquals(yahooPage.getYahooPageTitle(), "Yahoo - login");
		CreateAccountPage createAccountPage = yahooPage.clickOnCreateAccount();
		Assert.assertEquals(createAccountPage.getCreateAccountPageTitle(),
				"Yahoo Registration");
		createAccountPage.enterFirstName("Somani");
		System.out.println("OUT verifyCreateAccountPageTitle_TC3  "
				+ createAccountPage.getFirstName());
	}

}
