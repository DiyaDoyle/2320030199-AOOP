package com.EmployeeIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeList {
    private ArrayList<Employee> employeeList;

    public EmployeeList() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void displayAllEmployees() {
        Iterator<Employee> iterator = employeeList.iterator();
        
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            employee.displayDetails();
        }
    }
}
