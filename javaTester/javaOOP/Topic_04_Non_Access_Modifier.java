package javaOOP;

public abstract class Topic_04_Non_Access_Modifier {

	// Static : Variable / Method
	// dùng cho tất cả các instance /object
	// phạm vi cho toàn bộ system sử dụng nó
	// có thể override được

	static String browserName = "Chrome";

	// Non static
	String serverName = "Testing";

	final String colorCar = "red";

	final static String REGISTER_BUTTON = "";

	public static void main(String[] args) {
		System.out.println(browserName);

		browserName = "firefox";
		System.out.println(browserName);

		// Topic_04_Non_Access_Modifier topic = new Topic_04_Non_Access_Modifier();
		// System.out.println(topic.serverName);
		//
		// topic.clickToElement("button");
		//
		// sendKeyToElement("link");

		// final không được phép gán lại giá trị
		// System.out.println(topic.colorCar);
		// topic.colorCar="black";

	}

	// non static
	public void clickToElement(String elementName) {
		System.out.println(elementName);
	}

	// static
	public static void sendKeyToElement(String elementName) {
		System.out.println(elementName);
	}

	// final
	public final void setCarName() {

	}

	// không báo lỗi trong quá trình copile (trình biên dịch khi mình viết code bị sai)
	// không đúng với convention/không đúng chuẩn/ vi phạm chuẩn java nó sẽ báo lỗi ngay

	// 2 loại lỗi
	// lỗi compiler: trong quá trình viết code sẽ báo lỗi
	// lỗi Runtime : trong quá trình mình run system / run testcase

}
