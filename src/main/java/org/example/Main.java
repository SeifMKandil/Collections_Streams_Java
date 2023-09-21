package org.example;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees =getEmployees();

        EmployeeProcessor softwareEmployers = new EmployeeProcessor();
        //softwareEmployers.getEmployeesInDepartment(employees , "Software");
        //softwareEmployers.getEmployeesNames(employees);
        //softwareEmployers.getTotalSalary(employees);
        //double totalSalary = softwareEmployers.getTotalSalary(employees);
        //System.out.println("Total Salary is: " + totalSalary);
        //softwareEmployers.getIncrementedEmployeesSalary(employees,25);

    }

    private static List<Employee> getEmployees(){
        return List.of(
                new Employee(1L , "Seiko" , "Software" , 300),
                new Employee(2L , "Hassan" , "Bussiness" , 300),
                new Employee(3L , "Ahmed" , "Software" , 100),
                new Employee(4L , "Farouk" , "HR" , 400)
        );
    }
}