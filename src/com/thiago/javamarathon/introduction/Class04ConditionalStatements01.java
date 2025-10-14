package com.thiago.javamarathon.introduction;

public class Class04ConditionalStatements01{
    public static void main(String[] args){
        // if statements
        int age = 26;
        boolean hasAccess = age >= 18;

        if(hasAccess){
            System.out.println("Access authorized");
        }
        else{
            System.out.println("Access denied");
        }

        // Logical NOT operator
        if(!hasAccess){
            System.out.println("Access denied");
        }

        // age < 13 child; age >=13 && age < 18 adolescent; age >= 18 adult.
        age = 21;
        String ageGroup;

        if(age < 13){
            ageGroup = "child";
        }
        else if(age >= 13 && age < 18){
            ageGroup = "adolescent";
        }
        else{
            ageGroup = "adult";
        }

        System.out.println(ageGroup);
    }
}
