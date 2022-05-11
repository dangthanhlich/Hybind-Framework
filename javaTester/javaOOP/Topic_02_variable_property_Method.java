package javaOOP;

public class Topic_02_variable_property_Method {
	static int studentNumber;
	static float studentPrice;
	static String studentCountry;
	static boolean studentStatus;

	// Access Modifier
	// Data type
	// Variable name
	// Variable value
	private String studentName = "Automation FC";// biến toàn cục (Global variable)

	// biến static variable
	// static variable : dùng bà gán lại được
	public static String studentAddress = "Ho Chi Minh";
	// dùng trong class này
	private static String studentPhone = "0987654321";

	// final variable
	// final không cho phép gán lại (không cho phép gán lại giá trị mới)
	// final cố định dữ liệu không được phép thay đổi trong quá trình chạy
	// final variable : không cho phép ghi đè
	// final method(hàm) : không cho phép overide
	// final class: không cho phép kế thừa
	final String country = "Viet Nam";

	// static final variable: hằng số
	// 1 không được ghi đè
	// có thể truy cập rộng rãi cho tất cả các instance/ thread
	static final float PI_NUMBER = 3.1423544f;

	// Access modifier : default
	int studentID = 100056;

	// hàm (method)- static
	public static void main(String[] args) {
		// Local variable - biến cục bộ : hàm
		String studentName = "Automation FC";
		if (studentName.startsWith("Automation")) {
			// Local variable - biến cục bộ : block code
			int number = 100;
		}

		studentAddress = "Da Nang";
		studentPhone = "1234567";

		// int studentNumber;
		// String studentCountry;
		// static float studentPrice;
		// boolean studentStatus;
		// biến global có thể sử dụng
		System.out.println(studentNumber);
		System.out.println(studentCountry);
		System.out.println(studentPrice);
		System.out.println(studentStatus);

		// biến local phải khởi tạo mới được sử dụng
		// int studentNumber;
		// String studentCountry1;
		// float studentPrice2;
		// boolean studentStatus3;
		// System.out.println(studentNumber);
		// System.out.println(studentCountry1);
		// System.out.println(studentPrice2);

	}

	// constructor
	public Topic_02_variable_property_Method() {
		// Local variable - biến cục bộ : constructor
		String studentName = "Automation FC";

		// //biến ưu tiên toàn cục và cục bộ sẽ là cục bộ
		// if(studentName.startsWith("Automation")) {
		//
		// }
		// muốn dùng toàn cục thì dùng this.studentName
		if (this.studentName.startsWith("Automation")) {

		}
	}

	// hàm (method) - non static
	public void display() {
		// Local variable - biến cục bộ : hàm/ block code / constructor
		String studentName = "AutomationFC";
	}
}
