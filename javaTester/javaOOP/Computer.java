package javaOOP;

public abstract class Computer {

	// lưu ý 1 class thường k chưa abstract
	// normal method
	public void showComputerPerfomance() {
		System.out.println("Show computer performance ");
	}

	// abstract method
	// khung để cho các class con kế thừa nó phải overide lại (implement) lại
	public abstract void showComputerRam();
}
