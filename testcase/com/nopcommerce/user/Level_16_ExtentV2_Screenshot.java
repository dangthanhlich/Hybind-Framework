package com.nopcommerce.user;

import java.lang.reflect.Method;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.nopCommerce.user.USerAddressPageObject;
import pageObjects.nopCommerce.user.USerCustomerInforPageObject;
import pageObjects.nopCommerce.user.USerHomePageObject;
import pageObjects.nopCommerce.user.USerLoginPageObject;
import pageObjects.nopCommerce.user.USerMyProductReviewPageObject;
import pageObjects.nopCommerce.user.USerRegisterPageObject;
import pageObjects.nopCommerce.user.USerRewardPointPageObject;
import reportConfig.ExtentTestManager;

public class Level_16_ExtentV2_Screenshot extends BaseTest {

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);

		homePage = PageGeneratorManager.getUserHomePage(driver);

		firstName = "Automation";
		lastName = "FC";
		emailAddress = "afc" + generateFakeNumber() + "@gmail.vn";
		validPassword = "123456";

	}

	//log 4j | 1 forder Log04J | TestNGAppender

	
		@Test
		public void User_01_Register(Method method) {
			ExtentTestManager.startTest(method.getName(), "user_01_Register");
			ExtentTestManager.getTest().log(LogStatus.INFO, "Register - step 01: Navigate to 'register' page");
			
			registerPage = homePage.openRegisterPage();
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Register - step 02 : enter to firstname textbox with value is '"+firstName+"'");
			registerPage.inputToFirstnameTextbox(firstName);
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Register - step 03 : enter to lastName textbox with value is '"+lastName+"'");
			registerPage.inputToLastNameTextbox(lastName);
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Register - step 04 : enter to emailAddress textbox with value is '"+emailAddress+"'");
			registerPage.inputToEmailTextbox(emailAddress);
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Register - step 05 : enter to validPassword textbox with value is '"+validPassword+"'");
			registerPage.inputToPasswordTextbox(validPassword);
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Register - step 06 : enter to confirmPassword textbox with value is '"+validPassword+"'");
			registerPage.inputToConfirmPasswordTextbox(validPassword);
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Register - step 07 : click to Register button");
			registerPage.clickToRegisterButton();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Register - step 08 : Verify register sucess message is displayed");
			Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");

			ExtentTestManager.endTest();

			}

		@Test
		public void User_02_Login(Method method) {
			ExtentTestManager.startTest(method.getName(), "user_02_login");
			ExtentTestManager.getTest().log(LogStatus.INFO, "Login - step 01: Navigate to login page");
			homePage = registerPage.clickToLogoutLink();
			
			loginPage = homePage.openLoginPage();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Login - step 02: Enter to Email textbox with values is '"+emailAddress+"'");
			loginPage.inputToEmailTextbox(emailAddress);
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Login - step 03: Enter to password textbox with values is '"+validPassword+"'");
			loginPage.inputToPasswordTextbox(validPassword);
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Login - step 04: Click to login button");
			homePage = loginPage.clickToLoginButton();
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Login - step 05: Verify 'My Account' link is displayed");
			Assert.assertFalse(homePage.isMyAccountLinkDisplayed());

			ExtentTestManager.getTest().log(LogStatus.INFO, "Login - step 06: Navigate to 'My account' page");
			customerInforPage = homePage.openMyAccountPage();
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Login - step 07: Verify 'Customer Infor' page is displayed");
			Assert.assertFalse(customerInforPage.isCustomerInforPageDisplayed());
		
			ExtentTestManager.endTest();
		}
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	public int generateFakeNumber() {
		Random rand = new Random();
		return rand.nextInt(9999);
	}

	private WebDriver driver;
	private USerHomePageObject homePage;
	private USerRegisterPageObject registerPage;
	private USerLoginPageObject loginPage;
	private USerCustomerInforPageObject customerInforPage;
	private USerAddressPageObject addressPage;
	private USerMyProductReviewPageObject myProductReviewPage;
	private USerRewardPointPageObject rewardPointPage;
	private String firstName, lastName, emailAddress, validPassword;

}