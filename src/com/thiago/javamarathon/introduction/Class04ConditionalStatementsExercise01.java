package com.thiago.javamarathon.introduction;

// Find out how much tax you had to pay in the Netherlands in 2020 based on your yearly salary.

public class Class04ConditionalStatementsExercise01{
    public static void main(String[] args){
        double annualWage = 25000.00;
        double taxes;

        if(annualWage <= 34712.00){
            taxes = annualWage * 9.70 / 100;
        }
        else if(annualWage >= 34713.00 && annualWage <= 68507.00){
            taxes = annualWage * 37.35 / 100;
        }
        else{
            taxes = annualWage * 49.50 / 100;
        }

        System.out.println(taxes);
    }
}
