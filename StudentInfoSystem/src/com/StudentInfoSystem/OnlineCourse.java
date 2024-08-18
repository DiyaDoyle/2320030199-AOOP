package com.StudentInfoSystem;

public class OnlineCourse extends Courses{

	public OnlineCourse(String name, String id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getCourseType() {
		// TODO Auto-generated method stub
		return "Online Course";
	}

}
