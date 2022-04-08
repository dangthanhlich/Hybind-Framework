package javaBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topic_06_Condition_Statement {
	
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	
	public void TC_01_If() {
		boolean status = 5<3;
		System.out.println(status);
		
		//hàm if sẽ nhận vào điều kiện đúng
		//kiểm tra duy nhất 1 đk
		//sai thì bỏ qua
		if(status){
			//đúng thì vào phần thân của if
			//sai thì bỏ qua
		}
		
		WebDriver driver =  new FirefoxDriver();
		
		WebElement salePopup = driver.findElement(By.id(""));
		
		if(salePopup.isDisplayed())
		{
			
		}
		
		//Element không có trong Dom khi popup k hiển thị
		List<WebElement> salePopups = driver.findElements(By.id(""));
	
		//check element không hiển thị
		if(salePopups.size()>0 && salePopups.get(0).isDisplayed()) {
			
		}
		
		//gán (assign)
		int studentNumber =10;
		
		//== so sánh
		status = (studentNumber==10);
		System.out.println(status);
		
		//uncheck to checkbox
		WebElement languagesCheckbox =driver.findElement(By.id(""));
		if(languagesCheckbox.isSelected()) {
			languagesCheckbox.click();
		}
		
		//check to checkbox
		if(!languagesCheckbox.isSelected()) {
			languagesCheckbox.click();
		}  
		
	}
	
	
	public void TC_02_If_Else()
	{
		//nếu driver start vs browser như chrome/firefox/edge/safari thì dùng hàm click
		//thông thường (builtin) của selenium webelement
		
		//nếu driver là IE thì dùng hàm click của javascriptExecutor
		
		System.setProperty("webdriver.ie.driver", projectPath + "\\browserDrivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		if(driver.toString().contains("internet explorer")) {
			System.out.println("click by javascript excutor");
		}else {
			System.out.println("click by selenium webElement");
		}
	}
	
//	@Parameters("browser")
//	@Test
	public void TC_03_If_Else_If_Else(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", projectPath + "\\browserDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else {//safari/Opera/Coccoc
			throw new RuntimeException("please input correct the browser name!");
		}
		
		System.out.println(browserName);
		System.out.println(driver.toString());
		driver.quit();
	}
	
	@Test
	public void TC_04_If_Else_If_Else() {
		//page object
		//Dynamic Page
		
		String pageName = "Login";
		
		if(pageName.equals("Login")) {
			//Loginpage loginPage = new LoginPage();
			//return LoginPage;
		}else if(pageName.equals("Register")) {
			//registerPage RegisterPage = new RegisterPage();
			//return RegisterPage;
		}else if(pageName.equals("New customer")) {
			//customerPage customerPage = new customerPage();
			//return customerPage;
		}else {
			//HomePage homepage = new homePage();
			//return homePage
		}
		
		//if-elseint age = 20;
		int age = 20;
		String access = (age<18)?"you can not access":"welcome to our system!";
		if(age<18) {
			access = "you can not access";
		}else {
			access = "welcome to our system!";
		}
		
		System.out.println(access);
		
		
	}
	
	
	
}
