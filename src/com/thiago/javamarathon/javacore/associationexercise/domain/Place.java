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

public class Place{
    private String address;

    public Place(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }
}
