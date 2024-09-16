package com.EmployeeCloneable;

import java.util.*;

class Employee implements Comparable<Employee>, Cloneable {
 private String name;
 private double salary;

 public Employee(String name, double salary) {
     this.name = name;
     this.salary = salary;
 }

 public String getName() {
     return name;
 }

 public double getSalary() {
     return salary;
 }

 @Override
 public String toString() {
     return "Employee{name='" + name + "', salary=" + salary + "}";
 }

 @Override
 public int compareTo(Employee other) {
     return this.name.compareTo(other.name);
 }

 @Override
 public Employee clone() {
     try {
         return (Employee) super.clone();
     } catch (CloneNotSupportedException e) {
         throw new RuntimeException("Clone not supported");
     }
 }
}
