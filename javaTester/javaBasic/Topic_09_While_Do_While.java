package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_09_While_Do_While {
	static Scanner scanner = new Scanner(System.in);

	// public static void main(String[] args) {
	// int i = 0;
	// for (i = 0; i < 5; i++) {
	// // đi phần thân trước rồi mới công i++
	// System.out.println("for:" + i);
	// }
	// System.out.println("i sau khi ket thuc for:" + i);
	//
	// // i =5 ko thoa man đk while
	// // kiem tra dk đúng thì vào phần thân thực hiện đk
	// while (i < 5) {
	// // tăng i rồi mới kiểm tra đk
	// System.out.println("While:" + i);
	// i++;
	// }
	//
	// // chay it nhat 1 lan moi kiem tra dk
	// do {
	// System.out.println("do -While:" + i);
	// i++;
	// } while (i < 5);
	//
	// }

	@Test
	public void TC_01() {
		int number = scanner.nextInt();
		for (int i = number; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	@Test
	public void TC_02_while() {
		int i = scanner.nextInt();
		do {
			if (i % 2 == 0) {
				System.out.println(i);
				i++;
			}
		} while (i < 100);
	}

	@Test
	public void TC_03_do_while() {
		int i = scanner.nextInt();
		while (i < 100) {
			if (i % 2 == 0) {
				System.out.println(i);
				i++;
			}
		}
	}
}
