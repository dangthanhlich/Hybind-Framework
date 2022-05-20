package javaOOP_overriding;

public class Employee extends Person implements Iwork {
	@Override
	public void eat() {
		System.out.println("suất cơm 30.000 VND");
	}

	@Override
	public void sleep() {
		System.out.println("ngủ 7h 1 day");

	}

	@Override
	public void workingTime() {
		System.out.println("làm 8h 1day");

	}
}
