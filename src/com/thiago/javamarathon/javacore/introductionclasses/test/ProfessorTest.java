package com.thiago.javamarathon.javacore.introductionclasses.test;

import com.thiago.javamarathon.javacore.introductionclasses.domain.Professor;

public class ProfessorTest{
    public static void main(String[] args){
        Professor professor = new Professor();
        professor.name = "Mary";
        professor.age = 52;
        professor.gender = 'F';

        System.out.println("Name: " + professor.name + " Age: " + professor.age + " Gender: " + professor.gender);
    }
}
