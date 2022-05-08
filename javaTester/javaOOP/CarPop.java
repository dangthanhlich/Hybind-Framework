package javaOOP;

public class CarPop {

	static String carCompany;
	static String carType;
	static String fuelType;
	static Float mileAge;
	static Double carPrice;

	public static void main(String[] args) {
		carCompany = "Honda";
		carType = "City";
		fuelType = "Petrol";
		mileAge = 200f;
		carPrice = 500000d;
		System.out.println("carcompany = " + carCompany);
		System.out.println("carType = " + carType);
		System.out.println("fuelType = " + fuelType);
		System.out.println("carPrice = " + carPrice);
		System.out.println("mileAge = " + mileAge);

		carCompany = "Honda2";
		carType = "City2";
		fuelType = "Petrol2";
		mileAge = 2002f;
		carPrice = 5000002d;
		System.out.println("carcompany = " + carCompany);
		System.out.println("carType = " + carType);
		System.out.println("fuelType = " + fuelType);
		System.out.println("carPrice = " + carPrice);
		System.out.println("mileAge = " + mileAge);

	}

}
