package com.thiago.javamarathon.javacore.introductionclasses.test;

import com.thiago.javamarathon.javacore.introductionclasses.domain.Student;

public class StudentTest01{
    public static void main(String[] args){
        Student student = new Student();
        student.name = "Thiago";
        student.age = 26;
        student.gender = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
