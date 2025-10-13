package com.thiago.javamarathon.javacore.introductionmethods.test;

import com.thiago.javamarathon.javacore.introductionmethods.domain.Employee;

public class EmployeeTest{
    public static void main(String[] args){
        Employee employee = new Employee();

        employee.name = "John";
        employee.age = 34;

        employee.salaries = new double[3];
        employee.salaries[0] = 2030.00;
        employee.salaries[1] = 3660.00;
        employee.salaries[2] = 5000.00;

        employee.printData();
        System.out.println();
        employee.printAvgSalary();
    }
}
