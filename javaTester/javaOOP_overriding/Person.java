package javaOOP_overriding;

public abstract class Person {
	public void eat() {
		System.out.println("suất cơm 20.000 VND");
	}

	public abstract void sleep();

	// nếu final không cho phép override
	public final void walk() {
		System.out.println("đi bộ");
	}
}
