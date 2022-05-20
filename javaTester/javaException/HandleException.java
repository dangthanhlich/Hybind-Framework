package javaException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class HandleException {
	// public static void main(String[] args) throws FileNotFoundException, InterruptedException {
	// File file = new File("D:\testing.txt");
	// FileOutputStream fileOS = new FileOutputStream(file);
	// Thread.sleep(5000);
	// }

	public static void main(String[] args) {
		String[] browserName = { "chrome", "Firefox", "IE" };
		System.out.println(browserName[1]);
		System.out.println(browserName[2]);
		System.out.println(browserName[3]);
		System.out.println(browserName[4]);
	}
}
