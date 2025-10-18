package com.thiago.javamarathon.javacore.associationexercise.domain;

/*
Seminar Registration System

This program manages seminar registrations, including:
Registering seminars, students, professors, and seminar locations.

Rules:
Each student can be enrolled in only one seminar.
A seminar can have zero or more students.
A professor can teach one or multiple seminars.
Each seminar must have one assigned location.

Basic Attributes:
Student: name, age
Professor: name, researchField
Seminar: title
Place: address
 */

public class Student{
    private String name;
    private int age;
    private Seminar seminar;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Seminar seminar){
        this(name, age);
        this.seminar = seminar;
    }

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

    public Seminar getSeminar(){
        return seminar;
    }

    public void setSeminar(Seminar seminar){
        this.seminar = seminar;
    }
}
