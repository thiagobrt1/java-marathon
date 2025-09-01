package com.thiago.javamarathon.introduction;

/*
Given a car's total price (e.g. 20000), find out how much and for how long you'll have to pay monthly.
Condition: Monthly payment must be at least 1000.
 */

public class Class05LoopStatementsExercise02{
    public static void main(String[] args){
        double carPrice = 20000.00;

        for(int installments = 1; installments < carPrice; installments++){
            double monthlyPayment = carPrice / installments;

            if(monthlyPayment < 1000.00){
                break;
            }

            System.out.println("Installments: " + installments + " - Price: " + monthlyPayment);
        }
    }
}
