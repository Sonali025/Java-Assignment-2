package JavaAssignment2;

public class StudentQ8 {
	private int rollNo;
	private String name, course, result;
	private double marks;
	private char grade;

	public void acceptDetails(int rollNo, String name, String course, double marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	public char calGrade(double marks) {
		if (marks > 90) {
			return grade = 'A';
		} else if (marks >= 80 && marks <= 90) {
			return grade = 'B';
		} else if (marks >= 70 && marks <= 80) {
			return grade = 'C';
		} else if (marks >= 60 && marks <= 70) {
			return grade = 'D';
		} else {
			return grade = 'F';
		}

	}

	public String calResult(double marks) {
		if (marks >= 60) {
			return result = "Pass";
		} else {
			return result = "Fail";
		}
	}

	public void display() {
		System.out.println("---------------Student Details------------------");

		System.out.println("Roll Number : " + rollNo);
		System.out.println("Name        : " + name);
		System.out.println("Course      : " + course);
		System.out.println("Marks       : " + marks);
		calGrade(marks);
		calResult(marks);
		System.out.println("Result      : " + result);
		System.out.println("Grade       : " + grade);

	}

	public static void main(String[] args) {
		StudentQ8 student = new StudentQ8();
		int rollNo;
		String name, course, result;
		double marks;
		char grade;
		student.acceptDetails(55, "Sonali", "PG-DAC", 92.37);
//		student.calGrade(86.34);
//		student.calResult(86.34);
		student.display();

	}

}
