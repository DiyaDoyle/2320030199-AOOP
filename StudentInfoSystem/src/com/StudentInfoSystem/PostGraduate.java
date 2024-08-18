package com.StudentInfoSystem;

public class PostGraduate extends Student{

	public PostGraduate(String name, int roll) {
		super(name, roll);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getStudentType() {
		// TODO Auto-generated method stub
		return "PostGraduate";
	}

}
