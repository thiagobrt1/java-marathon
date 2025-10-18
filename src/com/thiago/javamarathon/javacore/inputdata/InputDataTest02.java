package com.thiago.javamarathon.javacore.inputdata;

import java.util.Scanner;

public class InputDataTest02{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ask any question and I shall reply yes or no:");
        String question = scanner.nextLine();

        if(question.charAt(0) == ' '){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
