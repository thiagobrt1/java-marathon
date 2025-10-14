package com.thiago.javamarathon.javacore.introductionmethods.test;

import com.thiago.javamarathon.javacore.introductionmethods.domain.Employee;

public class EmployeeTest{
    public static void main(String[] args){
        Employee employee = new Employee();

        employee.setName("John");
        employee.setAge(34);
        employee.setSalaries(new double[]{2030.00, 3660.00, 5000.00});

        System.out.println(employee.getName());
        System.out.println(employee.getAge());

        for(int i = 0; i < employee.getSalaries().length; i++){
            System.out.print(employee.getSalaries()[i] + " ");
        }

        // In this case average is 0.0 because calculateAndPrintAvgSalary() has not been called
        System.out.println("\n" + employee.getAverage() + "\n");

        employee.printData();
        System.out.println();
        employee.calculateAndPrintAvgSalary();
    }
}
