package javaBasic;

import org.testng.annotations.Test;

public class Topic_12_String_EX {

	String courseName = "Automation 19 20 21 TesTing AdvanceD";

	public void TC_01() {
		char courseNameArr[] = courseName.toCharArray();

		int countUpper = 0;
		int countLowser = 0;
		int countNumber = 0;

		for (char character : courseNameArr) {
			// uppercase
			if (character <= 'Z' && character >= 'A') {
				countUpper++;
			}

			// lowsercase
			if (character <= 'z' && character >= 'a') {
				countLowser++;
			}

			// number

			if (character <= '9' && character >= '0') {
				countNumber++;
			}
		}

		System.out.println("Sum of uppercase = " + countUpper);
		System.out.println("Sum of uppercase = " + countLowser);
		System.out.println("Sum of uppercase = " + countNumber);
	}

	public void TC_02() {
		char courseNameArr[] = courseName.toCharArray();
		int count = 0;
		for (char c : courseNameArr) {
			if (c == 'a') {
				count++;
			}
		}
		System.out.println(count);
	}

	@Test
	public void TC_03() {
		char courseNameArr[] = courseName.toCharArray();

		for (int i = courseNameArr.length - 1; i >= 0; i--) {
			System.out.print(courseNameArr[i]);
		}

	}
}
