package com.StudentInfoSystem;

public class OnCampusCourse extends Courses{

	public OnCampusCourse(String name, String id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getCourseType() {
		// TODO Auto-generated method stub
		return "On Campus Course";
	}

}
