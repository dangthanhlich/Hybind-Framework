package com.nopcommerce.user;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest_Headless;
import pageObjects.HomePageObject;
import pageObjects.RegisterPageObject;

public class Level_04_Multiple_browser extends BaseTest_Headless {

	private WebDriver driverTestClass;
	private String firstName, lastName, emailAddress, password;
	private HomePageObject homePage;
	private RegisterPageObject registerPage;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driverTestClass = getBrowserDriver(browserName);
		homePage = new HomePageObject(driverTestClass);

		firstName = "Automation";
		lastName = "FC";
		emailAddress = "afc" + generateFakeNumber() + "@gmail.com";
		password = "123456";
		homePage = new HomePageObject(driverTestClass);
	}

	@Test
	public void TC_01_Register_Empty_Data() {
		System.out.println("Home Page 01 - step 01 : click to register link");
		homePage.clickToRegisterLink();

		// Click Register link -> nhảy qua trang Register
		registerPage = new RegisterPageObject(driverTestClass);

		System.out.println("Register Page 01 - step 02 : Click to register button");
		registerPage.clickToRegisterButton();

		System.out.println("Register Page 01 - Step 03 : click to register button");
		Assert.assertEquals(registerPage.getErrorMessageAtFirstnameTextbox(), "First name is required.");
		Assert.assertEquals(registerPage.getErrorMessageAtLastNameTextbox(), "Last name is required.");
		Assert.assertEquals(registerPage.getErrorMessageAtEmailTextbox(), "Email is required.");
		Assert.assertEquals(registerPage.getErrorMessageAtPasswordTextbox(), "Password is required.");
		Assert.assertEquals(registerPage.getErrorMessageAtConfirmPasswordTextbox(), "Password is required.");
	}

	@Test
	public void TC_02_Register_Invalid_Email() {

		System.out.println("Home Page 02- step 01 : click to register link");
		homePage.clickToRegisterLink();

		// Click Register link -> nhảy qua trang Register
		registerPage = new RegisterPageObject(driverTestClass);

		System.out.println("Register Page 02- step 2 : input to required fields");
		registerPage.inputToFirstnameTextbox(firstName);
		registerPage.inputToLastNameTextbox(lastName);
		registerPage.inputToEmailTextbox("###123");
		registerPage.inputToPasswordTextbox(password);
		registerPage.inputToConfirmPasswordTextbox(password);

		System.out.println("Register Page 02- step 03 : Click to register button");
		registerPage.clickToRegisterButton();

		System.out.println("Register Page 02- step 04 : verify error message displayed");
		Assert.assertEquals(registerPage.getErrorMessageAtEmailTextbox(), "Wrong email");
	}

	@Test
	public void TC_03_Register_Success() {
		System.out.println("Home Page 03- step 01 : click to register link");
		homePage.clickToRegisterLink();

		// Click Register link -> nhảy qua trang Register
		registerPage = new RegisterPageObject(driverTestClass);

		System.out.println("Register Page 03- step 2 : input to required fields");
		registerPage.inputToFirstnameTextbox(firstName);
		registerPage.inputToLastNameTextbox(lastName);
		registerPage.inputToEmailTextbox(emailAddress);
		// registerPage.inputToCompanyTextbox("ABC");
		registerPage.inputToPasswordTextbox(password);
		registerPage.inputToConfirmPasswordTextbox(password);

		System.out.println("Register Page 03- step 03 : Click to register button");
		registerPage.clickToRegisterButton();

		System.out.println("Register Page 03- step 04:verify success mssage displayed");
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");

		System.out.println("Register Page 03- step 05:click to logout link");
		registerPage.clickToLogoutLink();

	}

	@Test
	public void TC_04_Register_Existing_Email() {
		System.out.println("Home Page 04- step 01 : click to register link");
		homePage.clickToRegisterLink();

		// Click Register link -> nhảy qua trang Register
		registerPage = new RegisterPageObject(driverTestClass);

		System.out.println("Register Page 04- step 2 : input to required fields");
		registerPage.inputToFirstnameTextbox(firstName);
		registerPage.inputToLastNameTextbox(lastName);
		registerPage.inputToEmailTextbox(emailAddress);
		// registerPage.inputToCompanyTextbox("ABC");
		registerPage.inputToPasswordTextbox(password);
		registerPage.inputToConfirmPasswordTextbox(password);

		System.out.println("Register Page 04- step 03 : Click to register button");
		registerPage.clickToRegisterButton();

		System.out.println("Register Page 04- step 04:verify error existing message displayed");
		Assert.assertEquals(registerPage.getErrorExistingEmailMessage(), "The specified email already exists");

	}

	@Test
	public void TC_05_Register_password_Less_Than_6_Chars() {
		System.out.println("Home Page - step 01 : click to register link");
		homePage.clickToRegisterLink();

		// Click Register link -> nhảy qua trang Register
		registerPage = new RegisterPageObject(driverTestClass);

		System.out.println("Register Page 05- step 2 : input to required fields");
		registerPage.inputToFirstnameTextbox(firstName);
		registerPage.inputToLastNameTextbox(lastName);
		registerPage.inputToEmailTextbox(emailAddress);
		// registerPage.inputToCompanyTextbox("ABC");
		registerPage.inputToPasswordTextbox("123");
		registerPage.inputToConfirmPasswordTextbox("123");

		System.out.println("Register Page 05- step 03 : Click to register button");
		registerPage.clickToRegisterButton();

		System.out.println("Register Page 05- step 04:verify error have at least 6 characters");
		Assert.assertEquals(registerPage.getErrorMessageAtPasswordTextbox(), "Password must meet the following rules:\nmust have at least 6 characters");

	}

	@Test
	public void TC_06_Register_Invalid_Confirm_Password() {
		System.out.println("Home Page 06- step 01 : click to register link");
		homePage.clickToRegisterLink();

		// Click Register link -> nhảy qua trang Register
		registerPage = new RegisterPageObject(driverTestClass);

		System.out.println("Register Page 06- step 2 : input to required fields");
		registerPage.inputToFirstnameTextbox(firstName);
		registerPage.inputToLastNameTextbox(lastName);
		registerPage.inputToEmailTextbox(emailAddress);
		// registerPage.inputToCompanyTextbox("ABC");
		registerPage.inputToPasswordTextbox("123456789");
		registerPage.inputToConfirmPasswordTextbox("1234567");

		System.out.println("Register Page 06- step 03 : Click to register button");
		registerPage.clickToRegisterButton();

		System.out.println("Register Page 06- step 04:verify error have at least 6 characters");
		Assert.assertEquals(registerPage.getErrorMessageAtConfirmPasswordTextbox(), "The password and confirmation password do not match.");

	}

	@AfterClass
	public void afterClass() {
		driverTestClass.quit();
	}

	public int generateFakeNumber() {
		Random rand = new Random();
		return rand.nextInt(9999);
	}

}
