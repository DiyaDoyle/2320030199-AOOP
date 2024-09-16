package com.LamdaExpression;
import java.util.*;
import java.util.stream.*;

public class EmployeeOperations {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("John", 5000),
            new Employee("Jane", 7000),
            new Employee("Mark", 6000),
            new Employee("Sarah", 7500),
            new Employee("Paul", 5200),
            new Employee("Lucy", 6400),
            new Employee("Tom", 5800),
            new Employee("Anna", 7100),
            new Employee("Chris", 6700),
            new Employee("Emily", 5500)
        );

        List<Employee> filteredEmployees = employees.stream()
            .filter(e -> e.getSalary() > 6000)
            .collect(Collectors.toList());
        System.out.println("Employees with salary > 6000: " + filteredEmployees);

        List<Employee> sortedEmployees = employees.stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary))
            .collect(Collectors.toList());
        System.out.println("Employees sorted by salary (ascending): " + sortedEmployees);

        Employee highestSalaryEmployee = employees.stream()
            .max(Comparator.comparingDouble(Employee::getSalary))
            .orElseThrow(NoSuchElementException::new);
        System.out.println("Employee with the highest salary: " + highestSalaryEmployee);

        double averageSalary = employees.stream()
            .mapToDouble(Employee::getSalary)
            .average()
            .orElse(0);
        System.out.println("Average salary of employees: " + averageSalary);
    }
}
