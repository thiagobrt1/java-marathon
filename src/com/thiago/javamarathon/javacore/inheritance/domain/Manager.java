package com.thiago.javamarathon.javacore.inheritance.domain;

public class Manager extends Employee{
    private String department;

    static{
        System.out.println("Inside Manager static initialization block");
    }

    {
        System.out.println("Inside Manager initialization block 1");
    }

    {
        System.out.println("Inside Manager initialization block 2");
    }

    public Manager(String name){
        super(name);
        System.out.println("Inside Manager constructor");
    }

    @Override
    public void print(){
        super.print();
        System.out.println(department);
    }

    public void paymentReport(){
        System.out.println("Employee " + name + " from the " + department + " department received a salary of " + salary);
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }
}
