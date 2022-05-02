package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import commons.BasePage;
import pageUIs.CustomerInforPageUI;
import pageUIs.MyProductPageUI;

public class MyProductReviewPageObject extends BasePage {
	private WebDriver driver;

	public MyProductReviewPageObject(WebDriver driver) {
		this.driver = driver;
	}

	// public AddressPageObject openAddressPage() {
	// waitForElementClickable(driver, MyProductPageUI.ADDRESS_PAGE);
	// clickToElement(driver, MyProductPageUI.ADDRESS_PAGE);
	// return PageGeneratorManager.getAddressPage(driver);
	// }
}
