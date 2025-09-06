package com.thiago.javamarathon.javacore.introductionmethods.domain;

public class Calculator{
    public void addTwoNumbers(){
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers(){
        System.out.println(30 - 26);
    }

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
}
