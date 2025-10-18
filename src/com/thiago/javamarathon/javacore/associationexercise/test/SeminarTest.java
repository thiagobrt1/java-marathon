package com.thiago.javamarathon.javacore.associationexercise.test;

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

import com.thiago.javamarathon.javacore.associationexercise.domain.Place;
import com.thiago.javamarathon.javacore.associationexercise.domain.Professor;
import com.thiago.javamarathon.javacore.associationexercise.domain.Seminar;
import com.thiago.javamarathon.javacore.associationexercise.domain.Student;

public class SeminarTest{
    public static void main(String[] args){
        Place place1 = new Place("Main Campus Auditorium");
        Place place2 = new Place("Virtual Classroom");

        Student student1 = new Student("John", 23);
        Student student2 = new Student("Mary", 21);

        Student[] seminar1Students = {student1};
        Student[] seminar2Students = {student2};

        Seminar seminar1 = new Seminar("Cell Biology and Microscopy", place1, seminar1Students);
        Seminar seminar2 = new Seminar("Ecology and Environmental Systems", place2, seminar2Students);

        Seminar[] availableSeminars = {seminar1, seminar2};

        Professor professor1 = new Professor("William", "Biology", availableSeminars);

        professor1.print();
    }
}
