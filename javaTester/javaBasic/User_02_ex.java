package javaBasic;

import org.testng.annotations.Test;

public class User_02_ex {
	@Test
	public void TC_01()
	{
		int a = 6;
		int b=2;
		
		System.out.println("Tong = " + (a+b));
		System.out.println("tru = " + (a-b));
		System.out.println("nhan = " + (a*b));
		System.out.println("chia = " + (a/b));
	}
	
	@Test
	public void TC_02()
	{
		float width = 7.5f;
		float height = 3.8f;
		
		System.out.println("S = " + (width*height));
	}
}
