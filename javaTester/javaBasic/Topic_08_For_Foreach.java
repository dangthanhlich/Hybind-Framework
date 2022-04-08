package javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Topic_08_For_Foreach {
	
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	Scanner scanner = new Scanner(System.in);
	
	
	public void TC_01_for() {
		//Array
		String[] cityName = {"ha noi","HCM","da nang"};
		
		//Array/List/set/queue(index)
		//bat dau 0
		
		for(int i = 0;i<cityName.length;i++)
		{
			System.out.println(cityName[i]);
		}
	}
	
	public void TC_02_For()
	{
	    for(int i=1;;) {
	    	System.out.println(i);
	    }
	    
	}
	
	
	public void TC_03_Foreach() {
		String[] cityName= {"ha noi","hcm","laa"};
		for(String city:cityName) {
			System.out.println(city);
		}
		//java collection
		//class:ArrayList/LinkedList/vector/....
		//Interface :List/set/Queue
		List<String> cityAddress = new ArrayList<String>();
		//compile (coding)
		cityAddress.add("bac giang");
		cityAddress.add("bac giang 1 ");
		cityAddress.add("bac giang 2");
		//runtime (running)
		for(String city : cityName ) {
			cityAddress.add(city);
		}
	 
		System.out.println(cityAddress.size());
		
		
	}
	
	@Test
	public void TC_04_Example() {
		//java Generic
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		// xử lý dữ liệu /get text/value/css/attribute
		for(WebElement link : links) {
			//chuyển page
			//refresh dom /html
		}
	}
	
	

	
	
	
	
}
