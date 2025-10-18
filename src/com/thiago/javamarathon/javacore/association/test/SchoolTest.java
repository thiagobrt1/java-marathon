package com.thiago.javamarathon.javacore.association.test;

import com.thiago.javamarathon.javacore.association.domain.Professor;
import com.thiago.javamarathon.javacore.association.domain.School;

public class SchoolTest{
    public static void main(String[] args){
        Professor professor1 = new Professor("John");
        Professor professor2 = new Professor("Mary");
        Professor[] professors = {professor1, professor2};

        School school = new School("Riverside High School", professors);

        school.print();
    }
}
