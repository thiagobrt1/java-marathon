package com.thiago.javamarathon.javacore.introductionmethods.domain;

public class Person{
    // private access modifier, get and set
    private String name;
    private int age;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if(age < 0){
            System.out.println("Invalid age.");
            return;
        }

        this.age = age;
    }
}
