package java_OOP_inheritance;

public class Dog extends Animal implements Runnable {
	// public Dog() {
	// super("tom", "5");
	// System.out.println("child's constructor");
	// }

	private int age;

	public void run() {
		System.out.println("Running...");
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			this.age = 0;
		}
	}

	public int getAge() {
		return this.age;
	}

}
