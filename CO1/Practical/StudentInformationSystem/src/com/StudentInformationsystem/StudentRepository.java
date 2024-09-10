package com.StudentInformationsystem;

public interface StudentRepository {
	void addStudent(Student student);
    Student getStudentById(String id);
    void removeStudent(String id);

}
