package com.thiago.javamarathon.javacore.abstractclasses.test;

import com.thiago.javamarathon.javacore.abstractclasses.domain.Developer;
import com.thiago.javamarathon.javacore.abstractclasses.domain.Manager;

public class EmployeeTest{
    public static void main(String[] args){
        Manager manager = new Manager("Mary", 5000.00);
        Developer developer = new Developer("John", 3000.00);

        System.out.println(manager);
        System.out.println(developer);

        manager.print();
        developer.print();
    }
}
