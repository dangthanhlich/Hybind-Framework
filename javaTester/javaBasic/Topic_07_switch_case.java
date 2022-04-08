package javaBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Scanner;

public class Topic_07_switch_case {

		WebDriver driver;
		String projectPath = System.getProperty("user.dir");
		Scanner scanner = new Scanner(System.in);
		
		@Parameters("browser")
		@Test
		public void TC_01_If_Else_If_Else(String browserName) {
			
			driver = getBrowserDriver(browserName);
			System.out.println(browserName);
			System.out.println(driver.toString());
			driver.quit();
		}
		
		public void TC_02() {
			
			int month = scanner.nextInt();
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.print("thang co 31 ngay");
				break;
			case 2:
				System.out.print("thang co 28 ngay");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.print("thang co 30 ngay");
				break;
			default:
				System.out.print("thang vua nhap sai dinh dang");
				break;
			}
			
		}
		
		public WebDriver getBrowserDriver(String browserName) {
			switch (browserName) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			case "edge":
				System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\msedgedriver.exe");
				driver = new EdgeDriver();
				break;
			case "ie":
				System.setProperty("webdriver.ie.driver", projectPath + "\\browserDrivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				break;
				
			default:
				break;
			}
			
			return driver;
		}
		

}
