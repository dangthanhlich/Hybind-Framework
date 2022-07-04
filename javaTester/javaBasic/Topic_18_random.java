package javaBasic;

import java.util.Calendar;
import java.util.Random;

public class Topic_18_random {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(getRandomEmail());
		Thread.sleep(1000);

		System.out.println(getRandomEmail());
		Thread.sleep(1000);

		System.out.println(getRandomEmail());
		Thread.sleep(1000);
		System.out.println(getRandomEmail());

		System.out.println(getRandomNumber(100, 200));
		System.out.println(getRandomNumber(100, 200));
		System.out.println(getRandomNumber(100, 200));
	}

	// random 3 numbers
	public static int getRandomNumber() {
		int uLimit = 999;
		int lLimit = 100;
		Random rand = new Random();
		return lLimit + rand.nextInt(uLimit - lLimit);
	}

	// rane(minimunm- maximum)
	public static int getRandomNumber(int minimum, int maximum) {
		Random rand = new Random();
		return minimum + rand.nextInt(maximum - minimum);
	}

	public static String getRandomEmail() {
		return "automation" + getRandomNumberByDateTime() + "@live.com";
	}

	// Get random number by date time minute second (no duplicate)
	public static long getRandomNumberByDateTime() {
		return Calendar.getInstance().getTimeInMillis() % 100000;
	}
}
