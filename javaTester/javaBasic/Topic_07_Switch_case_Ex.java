package javaBasic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.util.Scanner;

public class Topic_07_Switch_case_Ex {
	
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	Scanner scanner = new Scanner(System.in);
	
	public void TC_01() {
	
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
	
	@Test
	public void TC_02() {
		int numbera = scanner.nextInt();
		int numberb = scanner.nextInt();
		String operator = scanner.nextLine();
		switch (operator) {
		case "+":
			System.out.println("A+B="+(numbera+numberb));
			break;
		case "-":
			System.out.println("A-B="+(numbera-numberb));
			break;
		case "*":
			System.out.println("A*B="+(numbera*numberb));
			break;
		case "/":
			System.out.println("A/B="+(numbera/numberb));
			break;

		}
		
	}
	
	
	
	
}
