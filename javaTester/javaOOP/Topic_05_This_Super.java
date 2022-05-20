package javaOOP;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class Topic_05_This_Super extends BaseOOP {
	// private int firstNumber;
	// private int secondNumber;
	//
	// public Topic_05_This_Super(int fNumber, int sNumber) {
	// firstNumber = fNumber;
	// secondNumber = sNumber;
	// }
	//
	// public void sumNumber() {
	// System.out.println(firstNumber + secondNumber);
	// }
	//
	// public static void main(String[] args) {
	// Topic_05_This_Super topic = new Topic_05_This_Super(15, 7);
	// topic.sumNumber();
	// }

	// private int firstNumber;
	// private int secondNumber;
	//
	// public Topic_05_This_Super(int firstNumber, int secondNumber) {
	// this.firstNumber = firstNumber;
	// this.secondNumber = secondNumber;
	// }
	//
	// public void sumNumber() {
	// System.out.println(this.firstNumber + this.secondNumber);
	// }
	//
	// public static void main(String[] args) {
	// Topic_05_This_Super topic = new Topic_05_This_Super(15, 7);
	// topic.sumNumber();
	// }

	// private int firstNumber;
	// private int secondNumber;
	//
	// public Topic_05_This_Super(int fNumber, int sNumber) {
	// firstNumber = fNumber;
	// secondNumber = sNumber;
	// }
	//
	// public void sumNumber() {
	// System.out.println(firstNumber + secondNumber);
	// }
	//
	// public static void main(String[] args) {
	// Topic_05_This_Super topic = new Topic_05_This_Super(15, 7);
	// topic.sumNumber();
	// }

	// private WebDriver driver;
	//
	// // Global
	// private long shortTimeout = 15;
	// private long longTimeout = 45;
	//
	// public void setImplicitWait() {
	// // Local
	// long shortTimeout = 15;
	//
	// driver.manage().timeouts().implicitlyWait(super.longTimeout, TimeUnit.SECONDS);
	// driver.manage().timeouts().implicitlyWait(super.shortTimeout, TimeUnit.SECONDS);
	//
	// // This ở đây là biến global
	// // nếu gọi this là global , không gọi this là local
	// driver.manage().timeouts().implicitlyWait(this.shortTimeout, TimeUnit.SECONDS);
	// }
	private WebDriver driver;

	// Global
	private long shortTimeout = 15;
	private long longTimeout = 45;

	public Topic_05_This_Super() {
		// luôn luôn gọi qua Constructor của class cha
		super();
		System.out.println("constructor của class con");
	}

	public void setImplicitWait() {
		driver.manage().timeouts().implicitlyWait(super.longTimeout, TimeUnit.SECONDS);
		System.out.println(super.browserName);
	}

	public void clickToElement() {
		setImplicitWait();

		// gọi qua hàm ở lớp cha
		super.setImplicitWait();
	}

	public static void main(String[] args) {
		Topic_05_This_Super topic = new Topic_05_This_Super();
	}

}
