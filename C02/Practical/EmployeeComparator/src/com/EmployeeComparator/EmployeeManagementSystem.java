package com.EmployeeComparator;
import java.util.*;

public class EmployeeManagementSystem {

    public static void main(String[] args) {
    
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "John Doe", "Finance", 60000));
        employees.add(new Employee(102, "Jane Smith", "Engineering", 80000));
        employees.add(new Employee(103, "Emily Davis", "Human Resources", 50000));
        employees.add(new Employee(104, "Michael Brown", "Engineering", 90000));
        employees.add(new Employee(105, "Sarah Wilson", "Finance", 55000));

        
        System.out.println("Unsorted Employee List:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        Collections.sort(employees, new SalaryComparator());
        System.out.println("\nEmployees sorted by salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

      
        Collections.sort(employees, new NameComparator());
        System.out.println("\nEmployees sorted by name:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Sorting employees by department
        Collections.sort(employees, new DepartmentComparator());
        System.out.println("\nEmployees sorted by department:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
