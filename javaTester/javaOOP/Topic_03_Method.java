package javaOOP;

public class Topic_03_Method {
	// Non - static
	void showCarName() {
		System.out.println("Huyndai Tucson");
	}

	static void showCarColor() {
		System.out.println("white");
	}

	public static void main(String[] args) {
		// gọi vào trong 1 hàm static khác được
		showCarColor();

		// gọi qua instance/ Object
		Topic_03_Method obj = new Topic_03_Method();
		obj.showCarName();

		showCarColor();

		Topic_03_Method.showCarColor();
	}

}
