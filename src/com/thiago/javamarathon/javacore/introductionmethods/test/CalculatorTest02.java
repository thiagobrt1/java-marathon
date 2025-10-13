package com.thiago.javamarathon.javacore.introductionmethods.test;

import com.thiago.javamarathon.javacore.introductionmethods.domain.Calculator;

public class CalculatorTest02{
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        int n1 = 3;
        int n2 = 4;

        calculator.printTwoNumbers(n1, n2);

        System.out.println("\nInside CalculatorTest02:");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
    }
}
