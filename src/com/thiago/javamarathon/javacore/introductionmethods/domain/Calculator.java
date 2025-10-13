package com.thiago.javamarathon.javacore.introductionmethods.domain;

public class Calculator{
    // Methods
    public void addTwoNumbers(){
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers(){
        System.out.println(30 - 26);
    }

    // Primitive parameters
    public void multiplyTwoNumbers(int n1, int n2){
        System.out.println(n1 * n2);
    }

    public double divideTwoNumbers(double n1, double n2){
        if(n2 == 0){
            return 0;
        }

        return n1 / n2;
    }

    public void printTwoNumbersDivided(double n1, double n2){
        if(n2 == 0){
            System.out.println("Can't divide by 0");
            return;
        }

        System.out.println(n1 / n2);
    }

    public void printTwoNumbers(int n1, int n2){
        n1 = 1;
        n2 = 2;

        System.out.println("Inside changeTwoNumbers:");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
    }

    public void sumArray(int[] numbers){
        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        System.out.println(sum);
    }

    //
    public void sumVarArgs(int... numbers){
        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        System.out.println(sum);
    }
}
