package com.thiago.javamarathon.introduction;

public class Class05LoopStatements02{
    public static void main(String[] args){
        // break
        for(int i = 0; i < 50; i++){
            if(i >= 25){
                break;
            }

            System.out.println(i);
        }

        // continue
        double x = 20000.00;

        for(int i = (int) x; i >= 1; i--){
            double y = x / i;

            if(y < 1000){
                continue;
            }

            System.out.println(i + " - " + y);
        }
    }
}
