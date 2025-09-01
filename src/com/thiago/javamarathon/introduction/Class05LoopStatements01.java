package com.thiago.javamarathon.introduction;

public class Class05LoopStatements01{
    public static void main(String[] args){
        // while loops
        int counter = 0;

        while(counter < 10){
            System.out.print(counter + " ");
            counter++;
        }

        System.out.println();

        counter = 0;

        // do while loops
        do{
            System.out.print(counter + " ");
            counter++;
        }
        while(counter < 10);

        System.out.println();

        // for loops
        for(counter = 0; counter < 10; counter++){
            System.out.print(counter + " ");
        }
    }
}
