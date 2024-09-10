package com.StudentInformationsystem;

import java.util.HashMap;
import java.util.Map;

public class InMemoryCourseRepository implements CourseRepository {
    private Map<String, Course> courses = new HashMap<>();

    @Override
    public void addCourse(Course course) {
        courses.put(course.getCourseId(), course);
    }

    @Override
    public Course getCourseById(String courseId) {
        return courses.get(courseId);
    }

    @Override
    public void removeCourse(String courseId) {
        courses.remove(courseId);
    }
}
