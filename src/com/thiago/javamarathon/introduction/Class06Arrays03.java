package com.thiago.javamarathon.introduction;

public class Class06Arrays03{
    public static void main(String[] args){
        // Initializing arrays
        String[] names = new String[3];
        names[0] = "John";
        names[1] = "Anna";
        names[2] = "Mary";

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        int[] numbers = {1, 2, 3, 4, 5};

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        int[] numbers2 = new int[]{5, 4, 3, 2, 1};

        for(int i = 0; i < numbers2.length; i++){
            System.out.println(numbers2[i]);
        }
    }
}
