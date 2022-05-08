package javaBasic;

public class Topic_05_referenc_casting {

	public String studentName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void showStudentName() {
		System.out.println("Student name = " + studentName);
	}

	public static void main(String[] args) {
		Topic_05_referenc_casting firstStudent = new Topic_05_referenc_casting();
		Topic_05_referenc_casting secondStudent = new Topic_05_referenc_casting();

		firstStudent.setStudentName("Nguyen van A");
		secondStudent.setStudentName("Nguyen van B");

		firstStudent.showStudentName();
		secondStudent.showStudentName();

		// ép kiểu
		firstStudent = secondStudent;

		firstStudent.showStudentName();
		secondStudent.showStudentName();

		secondStudent.setStudentName("name =MMMMM M");

		firstStudent.showStudentName();
		secondStudent.showStudentName();

		// ép kiểu tường minh
		// WebDriver driver = null;
		// JavascriptExcutor jsExcutor = (javascriptExecutor) driver;

	}
}
