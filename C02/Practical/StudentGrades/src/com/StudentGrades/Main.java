package com.StudentGrades;

public class Main {
    public static void main(String[] args) {
     
        StudentGrades studentGrades = new StudentGrades();

        studentGrades.addGrade(101, 95.0);
        studentGrades.addGrade(101, 88.5);
        studentGrades.addGrade(102, 76.0);
        studentGrades.addGrade(102, 82.3);
        studentGrades.addGrade(101, 95.0);
        studentGrades.addGrade(103, 90.0);

     
        System.out.println("Grades for Student ID 101: " + studentGrades.getGrades(101));

        System.out.println("Grades for Student ID 104: " + studentGrades.getGrades(104)); 

        System.out.println("All Student Grades:");
        studentGrades.listAllStudentGrades();
    }
}
