package com.EmployeeIterator;

import java.util.Date;

public class Employee {
    private String name;
    private Date dob;
    private String mobileNumber;
    private int id;

    public Employee(String name, Date dob, String mobileNumber, int id) {
        this.name = name;
        this.dob = dob;
        this.mobileNumber = mobileNumber;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public int getId() {
        return id;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dob);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("----------------------------");
    }
}

