package com.StudentInformationsystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentRepository studentRepo = new InMemoryStudentRepository();
        CourseRepository courseRepo = new InMemoryCourseRepository();
        
        EnrollmentService enrollmentService = new EnrollmentService(studentRepo, courseRepo);
        
        Student student1 = new Student("John Doe", "S001");
        Student student2 = new Student("Jane Smith", "S002");
        
        studentRepo.addStudent(student1);
        studentRepo.addStudent(student2);
        
        Course course1 = new Course("C001", "Mathematics");
        Course course2 = new Course("C002", "Physics");
        
        courseRepo.addCourse(course1);
        courseRepo.addCourse(course2);

       
        enrollmentService.enrollStudentInCourse("S001", "C001");
        enrollmentService.enrollStudentInCourse("S002", "C002");

      
        System.out.println("Student 1 enrolled courses: " + studentRepo.getStudentById("S001").getEnrolledCourses());
        System.out.println("Course 1 enrolled students: " + courseRepo.getCourseById("C001").getEnrolledStudents().size());


	}

}
