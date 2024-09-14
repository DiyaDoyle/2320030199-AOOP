package com.StudentGrades;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentGrades {
   
    private Map<Integer, Set<Double>> studentGrades;

    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    public void addGrade(int studentId, double grade) {

        studentGrades.putIfAbsent(studentId, new HashSet<>());

        studentGrades.get(studentId).add(grade);
    }

    public Set<Double> getGrades(int studentId) {
        return studentGrades.getOrDefault(studentId, new HashSet<>());
    }

    public void listAllStudentGrades() {
        for (Map.Entry<Integer, Set<Double>> entry : studentGrades.entrySet()) {
            int studentId = entry.getKey();
            Set<Double> grades = entry.getValue();
            System.out.println("Student ID: " + studentId + " Grades: " + grades);
        }
    }
}
