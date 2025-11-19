package com.thiago.javamarathon.javacore.polymorphism.service;

import com.thiago.javamarathon.javacore.polymorphism.repository.Repository;

public class FileRepository implements Repository{

    @Override
    public void save(){
        System.out.println("Saving in the file");
    }
}
