package com.thiago.javamarathon.javacore.abstractclasses.domain;

public class Developer extends Employee{
    public Developer(String name, double salary){
        super(name, salary);
    }

    @Override
    public void calculateBonusSalary(){
        salary += salary * 0.1;
    }

    @Override
    public String toString(){
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
