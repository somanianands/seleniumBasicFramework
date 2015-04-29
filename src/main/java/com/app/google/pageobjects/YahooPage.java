package com.app.google.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YahooPage {
	WebDriver driver;

	public YahooPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//a[@id='login-signup']/span[contains(text(),'Create Account')]")
	WebElement createAccount;

	@FindBy(how = How.ID, using = "login-signin")
	WebElement btnSignIn;

	public YahooPage clickOnSignIn() {
		btnSignIn.click();
		System.out.println("SignIn button clicked.");
		return PageFactory.initElements(driver, YahooPage.class);
	}

	public String getYahooPageTitle() {
		return driver.getTitle();
	}

	public CreateAccountPage clickOnCreateAccount() {
		createAccount.click();
		System.out.println("Create Account button clicked.");
		return PageFactory.initElements(driver, CreateAccountPage.class);
	}
}