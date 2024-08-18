package com.StudentInfoSystem;

import java.util.*;

public abstract class Courses {
	private String courseId;
	private String courseName;
	private List<Student> enrolledStudents;
	
	public Courses(String name, String id) {
		this.courseId=id;
		this.courseName= name;
		this.enrolledStudents= new ArrayList<>();
	}
	

	public String getCourseName() {
		return courseName;
	}
	
	public String getCourseId() {
		return courseId;
	}
	public List<Student> getEnrolledStudents(){
		return enrolledStudents;
	}
	
	public void enrolledStudents(Student student) {
		enrolledStudents.add(student);
	}
	
	public abstract String getCourseType();

}
