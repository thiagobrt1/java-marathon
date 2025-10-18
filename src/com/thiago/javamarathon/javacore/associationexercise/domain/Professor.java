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

public class Professor{
    private String name;
    private String researchField;
    private Seminar[] seminars;

    public Professor(String name, String researchField){
        this.name = name;
        this.researchField = researchField;
    }

    public Professor(String name, String researchField, Seminar[] seminars){
        this(name, researchField);
        this.seminars = seminars;
    }

    public void print(){
        System.out.println("Professor: " + name);
        System.out.println("Research Field: " + researchField + "\n");

        if(seminars != null){
            for(int i = 0; i < seminars.length; i++){
                System.out.println("Seminar: " + seminars[i].getTitle());
                System.out.println("Place: " + seminars[i].getPlace().getAddress());

                if(seminars[i].getStudents() != null || seminars[i].getStudents().length > 0){
                    for(int j = 0; j < seminars[i].getStudents().length; j++){
                        System.out.println("Student: " + seminars[i].getStudents()[j].getName());
                        System.out.println("Age: " + seminars[i].getStudents()[j].getAge() + "\n");
                    }
                }
            }
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getResearchField(){
        return researchField;
    }

    public void setResearchField(String researchField){
        this.researchField = researchField;
    }

    public Seminar[] getSeminars(){
        return seminars;
    }

    public void setSeminars(Seminar[] seminars){
        this.seminars = seminars;
    }
}
