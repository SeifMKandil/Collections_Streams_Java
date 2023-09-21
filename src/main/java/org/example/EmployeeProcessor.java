package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeProcessor extends Employee {

    public void getEmployeesInDepartment(List<Employee> employees, String department){
        List<Employee> softwareEmployees = employees.stream().filter(employee -> employee.getDepartment().equals("Software"))
                .collect(Collectors.toList());
        softwareEmployees.forEach(System.out::println);
    }

    public void getEmployeesNames(List<Employee> employees) {
        employees.forEach(employee -> System.out.println(employee.getName()));
    }

    public double getTotalSalary(List<Employee> employees) {
        double totalSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        return  totalSalary;
    }

    public List<Employee> getIncrementedEmployeesSalary(List<Employee> employees, double incrementPercantage) {
        List<Employee> updatedEmployees = employees.stream()
                .map(employee -> {
                    double currentSalary = employee.getSalary();
                    double updatedSalary = currentSalary + (currentSalary * incrementPercantage / 100.0);
                    employee.setSalary(updatedSalary);
                    return employee;
                })
                .collect(Collectors.toList());
        updatedEmployees.forEach(System.out::println);
        return updatedEmployees;
    }
}
