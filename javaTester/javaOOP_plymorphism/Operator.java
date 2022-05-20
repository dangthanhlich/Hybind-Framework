package javaOOP_plymorphism;

public class Operator {
	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	public void sum(double a, double b) {
		System.out.println(a + b);
	}

	public void sum(float a, float b) {
		System.out.println(a + b);
	}

	public void sum(long a, long b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Operator opr = new Operator();
		opr.sum(5, 8);
		opr.sum(500l, 500l);
		opr.sum(5.18d, 5.18d);
		opr.sum(5.18f, 5.18d);
	}
}
