package com.thiago.javamarathon.introduction;

public class Class07MultidimensionalArrays02{
    public static void main(String[] args){
        // Initializing multidimensional arrays
        int[][] numbers = new int[3][];
        int[] numbers2 = {1, 2, 3};

        numbers[0] = new int[2];
        numbers[1] = numbers2;
        numbers[2] = new int[]{1, 2, 3, 4, 5, 6};

        numbers[0][0] = 1;
        numbers[0][1] = 2;

        for(int[] array : numbers){
            for(int number : array){
                System.out.print(number + " ");
            }

            System.out.println();
        }

        System.out.println();

        int[][] numbers3 = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for(int i = 0; i < numbers3.length; i++){
            for(int j = 0; j < numbers3[i].length; j++){
                System.out.print(numbers3[i][j] + " ");
            }

            System.out.println();
        }
    }
}
