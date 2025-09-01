package com.thiago.javamarathon.introduction;

public class Class04ConditionalStatements03{
    public static void main(String[] args){
        // switch statements
        byte day = 5;

        switch(day){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid option");
                break;
        }

        char gender = 'm';

        switch(gender){
            case 'm':
                System.out.println("male");
                break;
            case 'f':
                System.out.println("female");
                break;
            default:
                System.out.println("invalid option");
                break;
        }
    }
}
