package eclipseTips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Topic_01_Template {
	//wd
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		System.out.println();
		//wdfe
		WebElement demo = driver.findElement(By.xpath("//xpath"));
	
		//wdf
		WebElement demo2 = driver.findElement(By.cssSelector(".css"));
		
		//		exe
		//		public Object executeForBrowserElement(WebDriver driver, String javaSript) {
		//			try {
		//				JavascriptExecutor js = (JavascriptExecutor) driver;
		//				return js.executeScript(javaSript);
		//			} catch (Exception e) {
		//				e.getMessage();
		//				return null;
		//			}
		//		}
		
		
	}
	
}
