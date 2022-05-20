package javaOOP_abstraction;

public interface IAnimal {
	// các biến interface mặc định là hằng số
	public int number = 199;

	String getName();

	void setName(String name);

	abstract String getAddress();

	abstract void setAddress(String address);

}
