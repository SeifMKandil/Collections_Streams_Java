package org.example;

import java.util.List;

public class Employee {
    private Long id;
    private String name;
    private String department;
    private double Salary;


    public Employee(){}
    public Employee(Long id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        Salary = salary;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee Details:" +
                "\nName: " + name +
                "\nDepartment: " + department +
                "\nSalary: " + Salary;
    }


}
