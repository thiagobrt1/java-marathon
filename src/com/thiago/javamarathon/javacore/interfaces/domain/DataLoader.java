package com.thiago.javamarathon.javacore.interfaces.domain;

public interface DataLoader{
    int MAX_DATA_SIZE = 10;

    void load();

    default void checkPermission(){
        System.out.println("Checking general permission");
    }

    static void retrieveMaxDataSize(){
        System.out.println(MAX_DATA_SIZE);
    }
}
