package com.StudentInformationsystem;

public class EnrollmentService {
	  private StudentRepository studentRepository;
	    private CourseRepository courseRepository;

	    public EnrollmentService(StudentRepository studentRepository, CourseRepository courseRepository) {
	        this.studentRepository = studentRepository;
	        this.courseRepository = courseRepository;
	    }

	    public void enrollStudentInCourse(String studentId, String courseId) {
	        Student student = studentRepository.getStudentById(studentId);
	        Course course = courseRepository.getCourseById(courseId);

	        if (student != null && course != null) {
	            student.enrollInCourse(courseId);
	            course.addStudent(student);
	        }
	    }

}
