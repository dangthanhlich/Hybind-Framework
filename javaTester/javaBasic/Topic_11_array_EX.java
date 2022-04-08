package javaBasic;

import org.testng.annotations.Test;

public class Topic_11_array_EX {

	// int number[] = { 5, 8, 15, 7, 60, 10 };
	int number[] = { 3, 30, 2, 5, 9, -6, 10, 12 };

	public void TC_01_Find_Max_Number() {
		int x = 0;
		for (int i = 0; i < number.length; i++) {
			if (x < number[i]) {
				x = number[i];
			}
		}
		// System.out.println("Max number = " + x);
		// System.out.println("Max number = " + number[0]);
		// System.out.println("Max number = " + number[number.length - 1]);

	}

	public void TC_02_Find_First_Last_Number() {
		System.out.println(number[0] + number[number.length - 1]);
	}

	public void TC_03_Find_chan() {
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				System.out.println("Even = " + number[i]);
			}
		}
	}

	public void TC_04_Find_about() {
		for (int i = 0; i < number.length; i++) {
			if (number[i] >= 0 && number[i] <= 10) {
				System.out.println("Number i about(0<number<10) = " + number[i]);
			}
		}
	}

	@Test
	public void TC_05_average() {
		// int number[] = { 3, 30, 2, 5, 9, -6, 10, 12 };
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
			sum = sum + number[i];
			// 1:sum = 0+3 =3
			// 2:sum = 3+30
		}
		// System.out.println("sum all number = " + sum);
		// System.out.println("average = " + sum / number.length);
		float average = sum / number.length;
		System.out.println("Averga all number" + average);

	}
}
