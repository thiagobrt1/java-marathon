package com.thiago.javamarathon.introduction;

public class Class02PrimitiveTypes{
    public static void main(String[] args){
        // Primitive types
        short ageShort = 17;
        byte ageByte = 71;
        int ageInt = 26;
        long ageLong = 10000;
        float salaryFloat = 2500.00F;
        double salaryDouble = 1518.00;
        boolean trueValue = true;
        boolean falseValue = false;
        char character = 84;

        System.out.println("The age is " + ageInt + " years old");
        System.out.println(character);

        // Casting
        ageInt = (int) 10000000000L;
        System.out.println(ageInt);
        salaryFloat = (float) 3000.00;
        System.out.println(salaryFloat);
        ageLong = (long) 12345.67;
        System.out.println(ageLong);

        // Strings
        String name = "Thiago";
        System.out.println("Hi, my name is " + name);
    }
}
