package com.thiago.javamarathon.introduction;

public class Class03Operators{
    public static void main(String[] args){
        // Arithmetic operators
        int x = 21;
        int y = 2;
        int addition = x + y;
        System.out.println(addition);
        int subtraction = x - y;
        System.out.println(subtraction);
        int multiplication = x * y;
        System.out.println(multiplication);
        double division = x / (double) y;
        System.out.println(division);
        int modulus = x % y;
        System.out.println(modulus);

        // Relational operators
        boolean isTenLessThanTwenty = 10 < 20;
        System.out.println("isTenLessThanTwenty = " + isTenLessThanTwenty);
        boolean isTenGreaterThanTwenty = 10 > 20;
        System.out.println("isTenGreaterThanTwenty = " + isTenGreaterThanTwenty);
        boolean isTenLessThanOrEqualToTwenty = 10 <= 20;
        System.out.println("isTenLessThanOrEqualToTwenty = " + isTenLessThanOrEqualToTwenty);
        boolean isTenGreaterThanOrEqualToTwenty = 10 >= 20;
        System.out.println("isTenGreaterThanOrEqualToTwenty = " + isTenGreaterThanOrEqualToTwenty);
        boolean isTenNotEqualToTwenty = 10 != 20;
        System.out.println("isTenNotEqualToTwenty = " + isTenNotEqualToTwenty);
        boolean isTenEqualToTwenty = 10 == 20;
        System.out.println("isTenEqualToTwenty = " + isTenEqualToTwenty);

        // Logical operators
        int age = 25;
        double salary = 3500.00;
        boolean isLegalAboveThirty = age >= 30 && salary >= 4612.00;
        boolean isLegalUnderThirty = age < 30 && salary >= 3381.00;
        System.out.println("isLegalAboveThirty = " + isLegalAboveThirty);
        System.out.println("isLegalUnderThirty = " + isLegalUnderThirty);
        double currentAccount = 299.00;
        double savingsAccount = 3000.00;
        double tvPrice = 500.00;
        boolean canBeBought = currentAccount > tvPrice || savingsAccount > tvPrice;
        System.out.println("canBeBought = " + canBeBought);

        // Assignment operators
        double bonus = 1200.00;
        bonus += 1000;
        System.out.println(bonus);
        bonus -= 500;
        System.out.println(bonus);
        bonus *= 3;
        System.out.println(bonus);
        bonus /= 2;
        System.out.println(bonus);
        bonus %= 2;
        System.out.println(bonus);

        // Unary operators
        int count = 0;
        count++;
        System.out.println(++count);
        count--;
        System.out.println(count++);
        System.out.println(count);
    }
}
