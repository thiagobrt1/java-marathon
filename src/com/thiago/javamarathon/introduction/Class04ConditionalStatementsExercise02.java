package com.thiago.javamarathon.introduction;

/*
Using a switch statement, print whether a day is a business day or a weekend,
given a number from 1 to 7 (where 1 represents Sunday).
 */

public class Class04ConditionalStatementsExercise02{
    public static void main(String[] args){
        byte day = 1;

        switch(day){
            case 1, 7:
                System.out.println("It is the weekend");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("It is a business day");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
