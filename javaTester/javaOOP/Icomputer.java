package javaOOP;

public interface Icomputer {

	// nếu không gán từ khóa là 1 abstract cho hàm thì tự hiểu đây vẫn là 1 hàm abstract
	public void showComputerPerfomance();

	// Abstract method
	// mọi hàm trong này phải chứa abstract
	public abstract void showComputerRam();
}
