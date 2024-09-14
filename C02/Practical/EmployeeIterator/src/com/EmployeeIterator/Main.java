package com.EmployeeIterator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date dob1 = sdf.parse("12/01/1980");
            Date dob2 = sdf.parse("23/03/1995");
            Date dob3 = sdf.parse("11/07/1990");

            Employee emp1 = new Employee("John Doe", dob1, "1234567890", 101);
            Employee emp2 = new Employee("Jane Smith", dob2, "0987654321", 102);
            Employee emp3 = new Employee("Robert Brown", dob3, "1122334455", 103);

            employeeList.addEmployee(emp1);
            employeeList.addEmployee(emp2);
            employeeList.addEmployee(emp3);
            
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }

        employeeList.displayAllEmployees();
    }
}
