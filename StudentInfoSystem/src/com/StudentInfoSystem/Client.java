package com.StudentInfoSystem;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new UnderGraduate("John", 101);
		Student student2= new PostGraduate("Sara", 877);
		
		Courses course= new OnlineCourse("Introduction to Programming","C001");
		
		EnrollmentManager enroll = new EnrollmentManager();
		enroll.enroll(student1, course);
		enroll.enroll(student2, course);
		
		System.out.println("Student : " +student1.getName());
		System.out.println("ID : "+student1.getId());
		System.out.println("Course : "+course.getCourseName());
		System.out.println("Couse ID : "+course.getCourseId());
		//System.out.println("Enrolled number of students are "+course.getEnrolledStudents().size());
		System.out.println("Type of Course registered for: "+student1.getStudentType());
		System.out.println("Type of course: "+course.getCourseType());
        System.out.println();
		System.out.println("Student : " +student2.getName());
		System.out.println("ID : "+student2.getId());
		System.out.println("Course : "+course.getCourseName());
		System.out.println("Couse ID : "+course.getCourseId());
		//System.out.println("Enrolled number of students are "+course.getEnrolledStudents().size());
		System.out.println("Type of Course registered for: "+student2.getStudentType());
		System.out.println("Type of course: "+course.getCourseType());
		
	}

}
