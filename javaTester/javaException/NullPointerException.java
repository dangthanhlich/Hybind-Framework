package javaException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class NullPointerException {

	public static void main(String[] args) {

		System.out.println("Step 01");
		// String name = "10";
		String name = "text";
		int number = Integer.parseInt(name);

		System.out.println("Step 02");
		System.out.println(number);

		System.out.println("Step 03");
		int i = Integer.parseInt("10");

		System.out.println("Step 04");
		float f = Float.parseFloat("4.5a");
	}
}
