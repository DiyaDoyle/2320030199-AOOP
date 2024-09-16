package com.EmployeeCloneable;
import java.util.*;

public class EmployeeOperations {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
            new Employee("John", 5000),
            new Employee("Jane", 7000),
            new Employee("Mark", 6000),
            new Employee("Sarah", 7500),
            new Employee("Paul", 5200)
        );

        EmployeeList employees = new EmployeeList(new ArrayList<>(employeeList));

        System.out.println("Original Employee List:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        Collections.sort(employeeList);
        System.out.println("\nEmployees sorted by name (Comparable):");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        Collections.sort(employeeList, new SalaryComparator());
        System.out.println("\nEmployees sorted by salary (Comparator):");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        Employee clonedEmployee = employeeList.get(0).clone();
        System.out.println("\nCloned employee: " + clonedEmployee);

        clonedEmployee = new Employee("ClonedJohn", 5500);
        System.out.println("Modified Cloned Employee: " + clonedEmployee);
        System.out.println("Original Employee (after clone modification): " + employeeList.get(0));
    }
}