package com.thiago.javamarathon.javacore.association.domain;

/*
Unidirectional one-to-many:
A School knows multiple Professors,
but Professors do not know the School
 */

public class School{
    private String name;
    private Professor[] professors;

    public School(String name){
        this.name = name;
    }

    public School(String name, Professor[] professors){
        this.name = name;
        this.professors = professors;
    }

    public void print(){
        System.out.println(name);

        if(professors != null){
            for(int i = 0; i < professors.length; i++){
                System.out.println(professors[i].getName());
            }
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Professor[] getProfessors(){
        return professors;
    }

    public void setProfessors(Professor[] professors){
        this.professors = professors;
    }
}
