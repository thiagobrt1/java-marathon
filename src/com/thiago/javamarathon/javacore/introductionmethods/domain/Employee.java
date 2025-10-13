package com.thiago.javamarathon.javacore.introductionmethods.domain;

/*
Exercise:
Create a class named Employee with the attributes name, age, and salaries (which should store three salary values).
Then, implement two methods:
1. One method to print all the employee’s data (name, age, and salaries).
2. Another method to calculate and print the average salary.
 */

public class Employee{
    public String name;
    public int age;
    public double[] salaries;

    public void printData(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);

        if(salaries == null){
            return;
        }

        System.out.print("Salaries: ");

        for(int i = 0; i < salaries.length; i++){
            System.out.print(this.salaries[i] + " ");
        }
    }

    public void printAvgSalary(){
        if(salaries == null){
            return;
        }

        double sum = 0;

        for(int i = 0; i < this.salaries.length; i++){
            sum += salaries[i];
        }

        System.out.println("Average Salary: " + sum / salaries.length);
    }
}
