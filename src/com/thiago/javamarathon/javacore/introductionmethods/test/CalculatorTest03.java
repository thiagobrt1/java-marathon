package com.thiago.javamarathon.javacore.introductionmethods.test;

import com.thiago.javamarathon.javacore.introductionmethods.domain.Calculator;

public class CalculatorTest03{
    public static void main(String... args){
        Calculator calculator = new Calculator();

        int[] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        calculator.sumArray(numbers);
        calculator.sumVarArgs(1, 2, 3, 4, 5);
    }
}
