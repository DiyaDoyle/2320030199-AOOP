package com.EmployeeCloneable;
import java.util.*;

class EmployeeList implements Iterable<Employee> {
    private List<Employee> employees;

    public EmployeeList(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public Iterator<Employee> iterator() {
        return employees.iterator();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}