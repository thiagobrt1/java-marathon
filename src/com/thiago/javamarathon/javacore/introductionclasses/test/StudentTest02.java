package com.thiago.javamarathon.javacore.introductionclasses.test;

import com.thiago.javamarathon.javacore.introductionclasses.domain.Student;

public class StudentTest02{
    public static void main(String[] args){
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Thiago";

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gender);

        System.out.println();

        System.out.println(student2.name);
        System.out.println(student1.age);
        System.out.println(student1.gender);

    }
}
