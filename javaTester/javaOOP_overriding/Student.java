package javaOOP_overriding;

public class Student extends Person implements Iwork {
	@Override
	public void eat() {
		System.out.println("suất cơm 15.000 VND");
	}

	@Override
	public void sleep() {
		System.out.println("ngủ 12tieengs trên 1 day");
	}

	@Override
	public void workingTime() {
		System.out.println("làm 3h 1 day");

	}
}
