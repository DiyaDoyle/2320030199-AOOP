package com.StudentInfoSystem;

import java.util.*;

public abstract class Student {
	private String name;
	private int id;
	private List <Courses> enrolledCourses;
	
	public Student(String name, int roll) {
		this.name= name;
		this.id= roll;
		this.enrolledCourses= new ArrayList<>();
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Courses> getEnrolledCourses(){
		return enrolledCourses;
	}
	
	public void enrolledCourses(Courses course) {
		enrolledCourses.add(course);
	}
	public abstract String getStudentType();

}
