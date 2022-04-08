package javaBasic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.util.Scanner;

public class Topic_06_EX_If_else {
	
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	Scanner scanner = new Scanner(System.in);
	
	
	public void TC_01_If() {
		//nhập từ bàn phím
//		Scanner scanner = new Scanner(System.in);
//		int age = scanner.nextInt();
//		System.out.println(age);
		
		int number = scanner.nextInt();
		
		if(number %2 == 0) {
			System.out.println("so chan");
		}else {
			System.out.println("so le");
		}
	}
	
	public void TC_02() {
		int numbera = scanner.nextInt();
		int numberb = scanner.nextInt();
		
		if(numbera>numberb) {
			System.out.println("hien thi: a>b");
		}else {
			System.out.println("hien thi: a<b");
		}
	}
	
	
	public void TC_03() {
		String namea = scanner.nextLine();
		String nameb = scanner.nextLine();
		//kieu primitive type =>sai
		if(namea == nameb) {
			System.out.println("hien thi: a = b");
		}else {
			System.out.println("hien thi: a # b");
		}
		//reference :String
		//kiểm tra value + vị trí biến trong bộ nhớ
		if(namea.equals(nameb)) {
			System.out.println("hien thi: a = b");
		}else {
			System.out.println("hien thi: a # b");
		}
	}
	
	public void TC_04() {
		int numbera = scanner.nextInt();
		int numberb = scanner.nextInt();
		int numberc = scanner.nextInt();
		if(numbera > numberb && numbera >numberb) {
			System.out.println("a lon nhat");
		}else if(numberb > numbera && numberb >numberc) {
			System.out.println("b lon nhat");
		}else {
			System.out.println("c lon nhat");
		}
	}
	
	
	public void TC_05() {
		
		int numbera = scanner.nextInt();
		
		if(10 < numbera && numbera < 100)
		{
			System.out.println("thuoc");
		}else{
			System.out.println("k thuoc");
		}
	}
	
	@Test
	public void TC_06() {
		
//		int month = scanner.nextInt();
//		
//		if(month==1||month==3||month==5||month==7||month==8||month==12)
//		{
//			System.out.println("thang co 31 day");
//		}else if(month ==2 ){
//			System.out.println("thang 28 day");
//		}else if(month ==4 ||month ==6 ||month ==9 ||month ==11){
//			System.out.println("thang 30 day");
//		}
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
	
	
	
	
}
