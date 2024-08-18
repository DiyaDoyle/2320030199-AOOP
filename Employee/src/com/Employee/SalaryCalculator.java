package com.Employee;

public class SalaryCalculator {
	public double calculateSalary(Employee employee) {
        String role = employee.getRole();
        double salary;

        switch (role) {
            case "Manager":
                salary = 5000.0;
                break;
            case "Developer":
                salary = 4000.0;
                break;
            case "Designer":
                salary = 3500.0;
                break;
            default:
                salary = 3000.0; 
                break;
        }

        return salary;
    }

}
