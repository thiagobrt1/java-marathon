package com.thiago.javamarathon.javacore.interfaces.test;

import com.thiago.javamarathon.javacore.interfaces.domain.DataLoader;
import com.thiago.javamarathon.javacore.interfaces.domain.DatabaseLoader;
import com.thiago.javamarathon.javacore.interfaces.domain.FileLoader;

public class DataLoaderTest{
    public static void main(String[] args){
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
    }
}
