package com.thiago.javamarathon.javacore.inheritance.test;

import com.thiago.javamarathon.javacore.inheritance.domain.Address;
import com.thiago.javamarathon.javacore.inheritance.domain.Employee;
import com.thiago.javamarathon.javacore.inheritance.domain.Manager;

public class InheritanceTest01{
    public static void main(String[] args){
        Address address = new Address();

        address.setStreet("123 Main Street");
        address.setZipCode("12345");

        Employee employee = new Employee("John");

        employee.setSocialSecurityNumber("123-45-6789");
        employee.setAddress(address);
        employee.setSalary(60000.00);

        Manager manager = new Manager("Mary");

        manager.setSocialSecurityNumber("987-65-4321");
        manager.setAddress(address);
        manager.setSalary(120000.00);
        manager.setDepartment("IT");

        employee.print();
        System.out.println();
        manager.print();
        manager.paymentReport();
    }
}
