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

public class Seminar{
    private String title;
    private Place place;
    private Student[] students;

    public Seminar(String title, Place place){
        this.title = title;
        this.place = place;
    }

    public Seminar(String title, Place place, Student[] students){
        this(title, place);
        this.students = students;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public Place getPlace(){
        return place;
    }

    public void setPlace(Place place){
        this.place = place;
    }

    public Student[] getStudents(){
        return students;
    }

    public void setStudents(Student[] students){
        this.students = students;
    }
}
