package com.DailyTask_Pack;

public class Student {
	private Integer studentId;
	private String studentName;
	private Integer studentAge;
	public Student(Integer studentId, String studentName, Integer studentAge) {
	
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public Integer getStudentAge() {
		return studentAge;
	}
	
	

}
