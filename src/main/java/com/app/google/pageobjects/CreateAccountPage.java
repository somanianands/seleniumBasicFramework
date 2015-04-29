package com.app.google.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {

	WebDriver driver;

	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//input[@id='first-name']")
	WebElement firstName;

	@FindBy(xpath = "//select[@id='month']")
	WebElement months;

	@FindBy(xpath = "//input[@id='male' and @type='radio']")
	WebElement maleGender;

	@FindBy(xpath = "//input[@id='female' and @type='radio']")
	WebElement femaleGender;

	@FindBy(xpath = "//a[@id='yucs-login_signIn']")
	WebElement signIn;

	public void enterFirstName(String name) {
		firstName.sendKeys(name);
	}

	public void selectMonth(String month) {
		Select getMonths = new Select(months);
		getMonths.selectByValue(month);
	}

	public void selectMaleGender() {
		maleGender.click();
	}

	public String getCreateAccountPageTitle() {
		return driver.getTitle();
	}

	public String getFirstName() {
		return firstName.getAttribute("value");
	}
	
	public YahooPage clickOnSignIn() {
		signIn.click();
		return PageFactory.initElements(driver, YahooPage.class);
	}
}
