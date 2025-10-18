package com.thiago.javamarathon.javacore.association.domain;

/*
Unidirectional one-to-many:
A School knows multiple Professors,
but Professors do not know the School
 */

public class Professor{
    private String name;

    public Professor(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
