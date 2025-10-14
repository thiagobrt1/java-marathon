package com.thiago.javamarathon.javacore.introductionmethods.test;

import com.thiago.javamarathon.javacore.introductionmethods.domain.Person;

public class PersonTest{
    public static void main(String[] args){
        Person person = new Person();

        person.setName("Thiago");
        person.setAge(26);

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
