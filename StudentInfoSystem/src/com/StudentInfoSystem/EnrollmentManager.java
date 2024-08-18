package com.StudentInfoSystem;

public class EnrollmentManager {
      public void enroll(Student student , Courses course) {
    	  student.enrolledCourses(course);
    	  course.enrolledStudents(student);
      }
}
