package com.thiago.javamarathon.introduction;

public class Class04ConditionalStatements02{
    public static void main(String[] args){
        // Ternary operator
        // condition ? true : false
        double salary = 3500.00;
        String buyMessage = "Buy a game console";
        String dontBuyMessage = "Don't buy a game console";
        String displayMessage = salary > 2000.00 ? buyMessage : dontBuyMessage;
        System.out.println(displayMessage);
    }
}
