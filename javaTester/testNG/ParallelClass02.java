package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;

public class ParallelClass02 extends BaseTest {
	WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);

	}

	@Test
	public void TC_01_New_User() {
	}

	@Test
	public void TC_02_Edit_User() {
	}

	@Test
	public void TC_03_View_User() {
	}

	@Test
	public void TC_04_Search_User() {
	}

	@Test
	public void TC_05_Delete_User() {
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
