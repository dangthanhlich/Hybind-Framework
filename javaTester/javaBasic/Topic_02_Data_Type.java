package javaBasic;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Topic_02_Data_Type {
//	static int number;
//	static String address = "ABC";
//	//nếu khai báo bên ngoài gọi là : Global variable
//	public static void main(String[] args) {
//		//khai báo bên trong local variable
//		// biến local luôn  khai báo dữ liệu
//		int studentNumber  = 0;
//		System.out.println(number);
//		System.out.println(address);
//		Topic_02_Data_Type topic = new Topic_02_Data_Type();
//		System.out.println(topic.address);	
//		System.out.println(studentNumber);	
//	}
	
	//primitive type /value type : nguyên thủy
	
	//số nguyên
	//khác nhau:1. không có kiểu hàm đi sau
	//2 ;lưu trũ dự liệu Ram -> Stack
	byte bNumber = 6;
	short sNumber = 1500;
	int iNumber = 6500;
	
	long lNumber = 6500;
	float fNumber = 15.98f;
	double dNumber = 15.98d;
	char cChar = '1';
	boolean bStatus =false; 
	
	
	//Reference type : tham chiếu
	//String
		 String address = "ho chi minh";
	//Array
	String[] studentAddress = { address , "Ha noi" ,"da nag"};
	Integer[] studentNumber = {15, 20, 50};
	
	//Class
	Topic_02_Data_Type topic;
	
	
	//Interface
	WebDriver driver;
	
	//Object
	Object aObject;
	
	
	//collection 
	//List /set/queue/map
	List<WebElement> homePageLinks = driver.findElements(By.tagName("a"));
	Set<String> allWindowns = driver.getWindowHandles();
	List<String> productName = new ArrayList<String>();
	
	public void clickToElement()
	{//1 .tham chiếu đằng sau sẽ là 1 hàm
		//2 ;lưu trũ dự liệu Ram -> heap
		address.trim();
		studentAddress.clone();
		driver.getCurrentUrl();
		aObject.toString();
		homePageLinks.size();
		allWindowns.clear();
	}
	
	public static void main(String[] args) {
		
		
	}
	
	
}
