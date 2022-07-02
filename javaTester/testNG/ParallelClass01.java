package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;

public class ParallelClass01 extends BaseTest {
	WebDriver driver;

//@BeforeMethod nghĩa là sẽ chạy từng testcase một
	// beforeAfter sẽ chạy all testcase
	@Parameters("browser")
	@BeforeMethod
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);

	}

	@Test
	public void TC_01_New_Account() {
	}

	@Test
	public void TC_02_Edit_Account() {
	}

	@Test
	public void TC_03_View_Account() {
	}

	@Test
	public void TC_04_Search_Account() {
	}

	@Test
	public void TC_05_Delete_Account() {
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
