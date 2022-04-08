package javaBasic;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Topic_12_String {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", ".\\browserDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// TODO Auto-generated method stub
		// so sánh giá trị và bộ nhớ biến
		// dùng "==" kiểu nguyên thủy, equals kiểu tham chiếu String
		// == so sánh giá trị + bộ nhớ biến, nếu dùng string so sánh dùng equal so sánh giá trị
		// string bắt đâu từ 1

		// String s1 = "cat";
		// String s2 = s1;
		// String s3 = new String("cat");
		//
		// System.out.println(s1 == s2);
		// System.out.println(s1 == s3);
		// System.out.println(s2 == s3);
		// System.out.println(s2.equals(s3));

		String schoolName = "Automation Testing";
		String courseName = schoolName.toLowerCase();
		// String courseName = "AUTOMATION TESTING";
		String schoolAddress = "Ho Chi Minh City";

		System.out.println("Độ dài :" + schoolName.length());
		System.out.println("lấy ra kí tự :" + schoolName.charAt(0));
		System.out.println("nói chuỗi :" + schoolName.concat(schoolAddress));
		System.out.println("nỗi chuỗi :" + schoolName + schoolAddress);
		System.out.println("kiểm tra 2 chuỗi có bằng nhau tuyệt đối :" + schoolName.equals(schoolAddress));
		System.out.println("kiểm tra 2 chuỗi có bằng nhau tương đối đối :" + schoolName.equalsIgnoreCase(courseName));

		// startwith / endsWith/contains
		System.out.println("có bắt đầu bằng 1 kí tự /chuỗi kí tự=" + schoolName.startsWith("A"));
		System.out.println("có bắt đầu bằng 1 kí tự /chuỗi kí tự=" + schoolName.startsWith("Automation"));
		System.out.println("có bắt đầu bằng 1 kí tự /chuỗi kí tự=" + schoolName.startsWith("T"));

		System.out.println("có chứa 1 kí tự /chuỗi kí tự" + schoolName.contains("Autimation"));
		System.out.println("có chứa 1 kí tự /chuỗi kí tự" + schoolName.contains("T"));
		System.out.println("có chứa 1 kí tự /chuỗi kí tự" + schoolName.contains("Testing"));
		System.out.println("có chứa 1 kí tự /chuỗi kí tự" + schoolName.contains("Advanced"));

		System.out.println("có kết thúc bằng 1 kí tự/chuỗi kí tự=" + schoolName.endsWith("g"));
		System.out.println("có kết thúc bằng 1 kí tự/chuỗi kí tự=" + schoolName.endsWith("Testing"));
		System.out.println("có kết thúc bằng 1 kí tự/chuỗi kí tự=" + schoolName.endsWith("Automation"));

		System.out.println("vị trí của 1 kí tự/chuỗi kí tự trong chuỗi" + schoolName.indexOf("Automation"));
		System.out.println("vị trí của 1 kí tự/chuỗi kí tự trong chuỗi" + schoolName.indexOf("A"));
		System.out.println("vị trí của 1 kí tự/chuỗi kí tự trong chuỗi" + schoolName.indexOf("Testing"));

		System.out.println("tách 1 kí tự/chuỗi kí tự trong chuỗi=" + schoolName.substring(11));
		System.out.println("tách 1 kí tự/chuỗi kí tự trong chuỗi=" + schoolName.substring(11, 15));

		// split : tách chuỗi thành 1 mảng dựa vào kí tự /chuỗi kí tự
		// dùng trong alert
		String result = "Viewing 48 of 132 result";
		String results[] = result.split("");
		System.out.println(results[1]);

		// replace
		String productPrice = "$100.00";
		productPrice = productPrice.replace("$", "");
		System.out.println(productPrice);

		// sắp xếp nó: Sort data (Asc/Desc)
		float productPriceF = Float.parseFloat(productPrice);
		System.out.println(productPriceF);

		productPrice = String.valueOf(productPriceF);
		System.out.println(productPrice);

		String osName = System.getProperty("os.name");
		System.out.println(osName);
		// windows 10
		// Handle multiple OS:MAC /windows (Actions -keys -Ctrl/command)
		if (osName.toLowerCase().contains("windows")) {
			Keys key = Keys.CONTROL;
		} else {
			Keys key = Keys.COMMAND;
		}

		// multipe browser :toUpperCase
		// firefox = FIREFOX(Enum)

		String driverInstanceName = driver.toString();
		System.out.println(driverInstanceName);

		// cloase browser/driver
		if (driverInstanceName.contains("internetexplorer")) {
			// Sleep cứng thêm 5S sau mỗi sự kiện chuyển page
		}

		// trim: cắt bỏ khoảng trắng đầu cuối chuỗi
		String helloWorld = "  \n  \t   Hello World!          ";
		System.out.println(helloWorld);
		System.out.println(helloWorld.trim());

		helloWorld = " ";
		System.out.println("Empty = " + helloWorld.isEmpty());
		System.out.println("Empty = " + helloWorld.isBlank());

		// Dynamic locator
		// đại diện cho 1 chuỗi:%s
		// %b %t %d

		String dynamicButtonXpath = "//button[@id='%s']";
		System.out.println("Click to Login button = " + dynamicButtonXpath.format(dynamicButtonXpath, "login"));
		System.out.println("Click to Search button = " + dynamicButtonXpath.format(dynamicButtonXpath, "search"));
		System.out.println("Click to Register button = " + dynamicButtonXpath.format(dynamicButtonXpath, "register"));

	}

}
