package com.thiago.javamarathon.javacore.introductionmethods.test;

import com.thiago.javamarathon.javacore.introductionmethods.domain.Calculator;

public class CalculatorTest{
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        calculator.addTwoNumbers();
        calculator.subtractTwoNumbers();
        calculator.multiplyTwoNumbers(2, 6);

        double result = calculator.divideTwoNumbers(20, 5);
        System.out.println(result);

        calculator.printTwoNumbersDivided(30, 0);
    }
}
