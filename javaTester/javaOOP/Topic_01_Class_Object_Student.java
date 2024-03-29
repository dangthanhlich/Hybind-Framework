package javaOOP;

public class Topic_01_Class_Object_Student {

	private int studentID;
	private String studentName;
	private Float knowledgePoint;
	private Float PracticePoint;

	private int getStudentID() {
		return studentID;
	}

	private void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	private String getStudentName() {
		return studentName;
	}

	private void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	private Float getKnowledgePoint() {
		return knowledgePoint;
	}

	private void setKnowledgePoint(Float knowledgePoint) {
		this.knowledgePoint = knowledgePoint;
	}

	private Float getPracticePoint() {
		return PracticePoint;
	}

	private void setPracticePoint(Float practicePoint) {
		PracticePoint = practicePoint;
	}

	private Float getAveragePoint() {
		return (this.knowledgePoint + this.PracticePoint * 2) / 3;
	}

	private void showStudentInFor() {
		System.out.println("*******************************");
		System.out.println("Student ID = " + getStudentID());
		System.out.println("Student Name = " + getStudentName());
		System.out.println("Student knowledge Point = " + getKnowledgePoint());
		System.out.println("Student practice point = " + getPracticePoint());
		System.out.println("Student average Point" + getAveragePoint());
		System.out.println("*******************************");

	}

	public static void main(String[] args) {
		Topic_01_Class_Object_Student firstStudent = new Topic_01_Class_Object_Student();
		firstStudent.setStudentID(20052006);
		firstStudent.setStudentName("john terry");
		firstStudent.setKnowledgePoint(8.0f);
		firstStudent.setPracticePoint(7.8f);
		firstStudent.showStudentInFor();

		Topic_01_Class_Object_Student secondStudent = new Topic_01_Class_Object_Student();
		firstStudent.setStudentID(20052006);
		firstStudent.setStudentName("michael jackson");
		firstStudent.setKnowledgePoint(9.0f);
		firstStudent.setPracticePoint(9.8f);
		firstStudent.showStudentInFor();

	}

}
