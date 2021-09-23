package week3.day1;

public class Student extends Department {

	public void studentName() {
		System.out.println("ajay");
	}
	public void studentDept() {
		System.out.println("EEE");
	}
	public void studentId() {
		System.out.println("BE3002");
	}
	public static void main(String[] args) {
		Student std=new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptName();
		std.studentDept();
		std.studentId();
		std.studentName();
	}
}
