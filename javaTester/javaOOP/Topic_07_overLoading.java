package javaOOP;

public class Topic_07_overLoading {
	private int firstNumber;
	private int secondNumber;

	// nếu cùng số lượng tham số thì khác kieur dữ liệu
	// nếu khác số lượng tham số thì không quan tâm kiểu dữ liệu
	public void sumNumber() {
		System.out.println(this.firstNumber + this.secondNumber);
	}

	public void sumNumber(int firstNumber, int secondNumber) {
		System.out.println(firstNumber + secondNumber);
	}

	public void sumNumber(float firstNumber, float secondNumber) {
		System.out.println(firstNumber + secondNumber);
	}

	public void sumNumber(int firstNumber, float secondNumber) {
		System.out.println(firstNumber + secondNumber);
	}

	public static void main(String[] args) {

	}
}
