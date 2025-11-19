package com.thiago.javamarathon.javacore.polymorphism.test;

import com.thiago.javamarathon.javacore.polymorphism.repository.Repository;
import com.thiago.javamarathon.javacore.polymorphism.service.DatabaseRepository;
import com.thiago.javamarathon.javacore.polymorphism.service.FileRepository;
import com.thiago.javamarathon.javacore.polymorphism.service.InMemoryRepository;

public class RepositoryTest{
    public static void main(String[] args){
        Repository repository1 = new DatabaseRepository();
        repository1.save();
        Repository repository2 = new InMemoryRepository();
        repository2.save();
        Repository repository3 = new FileRepository();
        repository3.save();
    }
}
