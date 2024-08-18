package com.StudentInformationsystem;

public interface CourseRepository {
	void addCourse(Course course);
    Course getCourseById(String courseId);
    void removeCourse(String courseId);

}
