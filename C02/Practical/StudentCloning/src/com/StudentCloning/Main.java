package com.StudentCloning;

public class Main {
    public static void main(String[] args) {
        try {
          
            Student student1 = new Student("Alice", 101, 89.5);

            Student student2 = (Student) student1.clone();

            System.out.println("Original Student Details:");
            student1.displayDetails();

            System.out.println("Cloned Student Details:");
            student2.displayDetails();

            System.out.println("Are student1 and student2 the same object? " + (student1 == student2));
            System.out.println("Do student1 and student2 have the same content? " + student1.equals(student2));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
