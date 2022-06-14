package commons;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import javaOOP.BrowserList;
import javaOOP.EnviromentList;

public class BaseTest {
	private WebDriver driver;
	protected final Log log;
	
	protected BaseTest() {
		log = LogFactory.getLog(getClass());
	}

	protected WebDriver getBrowserDriver(String browserName) {
		BrowserList browserList = BrowserList.valueOf(browserName.toLowerCase());

		if (browserList == browserList.FIREFOX) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserList == browserList.H_FIREFOX) {
			WebDriverManager.firefoxdriver().setup();
			// Browser Option : selenium 3.xx trở lên
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("-headless");
			options.addArguments("window-size=1920x1080");
			driver = new FirefoxDriver(options);
		} else if (browserList == browserList.CHROME) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserList == browserList.H_CHROME) {
			WebDriverManager.chromedriver().setup();
			// Browser Option : selenium 3.xx trở lên
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080");
			driver = new ChromeDriver(options);
		} else if (browserList == browserList.EDGE) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserList == browserList.IE) {
			WebDriverManager.iedriver().arch32().setup();
			driver = new InternetExplorerDriver();
		} else if (browserList == browserList.OPERA) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		} else if (browserList == browserList.COCCOC) {
			// cốc cốc browser trừ đi 5-6 version ra chromedriver
			WebDriverManager.chromedriver().driverVersion("105.0.88").setup();
			ChromeOptions options = new ChromeOptions();

			if (GlobalConstants.OS_NAME.startsWith("windows")) {
				options.setBinary("C:\\Program Files (x86)\\CocCoc\\Browser\\Application\\browser.exe");
			} else {
				options.setBinary("C:duong dan mac");
			}

			driver = new ChromeDriver(options);
		} else if (browserList == browserList.BRAVE) {
			WebDriverManager.chromedriver().driverVersion("100.0.4896.127").setup();
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
			driver = new ChromeDriver(options);
		} else {
			System.out.println("Browser name invalid");
		}

		driver.manage().timeouts().implicitlyWait(GlobalConstants.LONG_TIMEOUT, TimeUnit.SECONDS);
		driver.get(GlobalConstants.PORTAL_DEV_URL);
		driver.manage().window().maximize();
		return driver;
	}

	protected WebDriver getBrowserDriver(String browserName, String appUrl) {
		if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equals("h_firefox")) {
			WebDriverManager.firefoxdriver().setup();
			// Browser Option : selenium 3.xx trở lên
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("-headless");
			options.addArguments("window-size=1920x1080");
			driver = new FirefoxDriver(options);
		} else if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("h_chrome")) {
			WebDriverManager.chromedriver().setup();
			// Browser Option : selenium 3.xx trở lên
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080");
			driver = new ChromeDriver(options);
		} else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equals("opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		} else if (browserName.equals("coccoc")) {
			WebDriverManager.chromedriver().driverVersion("105.0.88").setup();
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Program Files (x86)\\CocCoc\\Browser\\Application\\browser.exe");
			driver = new ChromeDriver(options);
		} else if (browserName.equals("brave")) {
			WebDriverManager.chromedriver().driverVersion("100.0.4896.127").setup();
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
			driver = new ChromeDriver(options);
		} else {
			System.out.println("Browser name invalid");
		}

		driver.manage().timeouts().implicitlyWait(GlobalConstants.LONG_TIMEOUT, TimeUnit.SECONDS);
		driver.get(appUrl);
		driver.manage().window().maximize();
		return driver;
	}

	protected String getEnvironmentUrl(String serverName) {

		String envUrl = null;
		EnviromentList environment = EnviromentList.valueOf(serverName.toUpperCase());
		if (environment == EnviromentList.DEV) {
			envUrl = "https://demo.nopcommerce.com/";
		} else if (environment == EnviromentList.DEV) {
			envUrl = "https://demo.nopcommerce.com/";
		} else if (environment == EnviromentList.STAGING) {
			envUrl = "https://demo.nopcommerce.com/";
		} else if (environment == EnviromentList.PRODUCTION) {
			envUrl = "https://demo.nopcommerce.com/";
		}
		return envUrl;
	}

	protected int generateFakeNumber() {
		Random rand = new Random();
		return rand.nextInt(9999);
	}
	
	protected boolean verifyTrue(boolean condition) {
		boolean pass = true;
		try {
			Assert.assertTrue(condition);
			log.info(" -------------------------- PASSED -------------------------- ");
		} catch (Throwable e) {
			log.info(" -------------------------- FAILED -------------------------- ");
			pass = false;

			// Add lỗi vào ReportNG
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}


	protected boolean verifyFalse(boolean condition) {
		boolean pass = true;
		try {
			Assert.assertFalse(condition);
			log.info(" -------------------------- PASSED -------------------------- ");
		} catch (Throwable e) {
			log.info(" -------------------------- FAILED -------------------------- ");
			pass = false;
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}


	protected boolean verifyEquals(Object actual, Object expected) {
		boolean pass = true;
		try {
			Assert.assertEquals(actual, expected);
			log.info(" -------------------------- PASSED -------------------------- ");
		} catch (Throwable e) {
			pass = false;
			log.info(" -------------------------- FAILED -------------------------- ");
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

}
