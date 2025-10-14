package com.thiago.javamarathon.javacore.introductionmethods.domain;

/*
Exercise:
Create a class named Employee with the attributes name, age, and salaries (which should store three salary values).
Then, implement two methods:
1. One method to print all the employee’s data (name, age, and salaries).
2. Another method to calculate and print the average salary.
 */

public class Employee{
    private String name;
    private int age;
    private double[] salaries;
    private double average;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double[] getSalaries(){
        return salaries;
    }

    public void setSalaries(double[] salaries){
        this.salaries = salaries;
    }

    public double getAverage(){
        return average;
    }

    public void printData(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        if(salaries == null){
            return;
        }

        System.out.print("Salaries: ");

        for(int i = 0; i < salaries.length; i++){
            System.out.print(salaries[i] + " ");
        }
    }

    public void calculateAndPrintAvgSalary(){
        if(salaries == null){
            return;
        }

        for(int i = 0; i < salaries.length; i++){
            average += salaries[i] / salaries.length;
        }

        System.out.println("Average Salary: " + average);
    }
}
