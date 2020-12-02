package com.yedam.collection;

public class Student implements Comparable <Student> {
	private int studentNo;
	private String studentName;
	private int score;
	

	public Student(int studentNo, String studentName) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
	}

	public Student(int studentNo, String studentName, int score) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.score = score;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	@Override
	public int hashCode() {
		return this.studentName.hashCode() + this.studentNo;
	}

	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		boolean b1 = this.studentName.equals(student.studentName);
		boolean b2 = this.studentNo == student.studentNo;
		return b1 && b2;
	}

	@Override
	public int compareTo(Student o) { //음수: 오름차수, 0:같다, 양수:내림차순
//		return this.studentNo - o.studentNo;
		return o.score - this.score;
	}

}
