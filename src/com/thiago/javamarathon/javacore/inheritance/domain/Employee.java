package com.thiago.javamarathon.javacore.inheritance.domain;

public class Employee{
    // protected access modifier allows access within the same package or by subclasses (even if they are in different packages).
    protected String name;
    protected String socialSecurityNumber;
    protected Address address;
    protected double salary;

    static{
        System.out.println("Inside Employee static initialization block");
    }

    {
        System.out.println("Inside Employee initialization block 1");
    }

    {
        System.out.println("Inside Employee initialization block 2");
    }

    public Employee(String name){
        System.out.println("Inside Employee constructor");
        this.name = name;
    }

    public Employee(String name, String socialSecurityNumber){
        this(name);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void print(){
        System.out.println(name);
        System.out.println(socialSecurityNumber);
        System.out.println(address.getStreet() + " - " + address.getZipCode());
        System.out.println(salary);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber){
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Address getAddress(){
        return address;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}
