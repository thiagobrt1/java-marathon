package com.thiago.javamarathon.javacore.introductionclasses.test;

/*
Exercise:
Create a class named Car with the attributes name, model and year.
Then, instantiate two different objects with distinct values for these attributes, and print their details to the console.
 */

import com.thiago.javamarathon.javacore.introductionclasses.domain.Car;

public class CarTest{
    public static void main(String[] args){
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Chevrolet";
        car1.model = "Camaro";
        car1.year = 1969;
        System.out.println("Car: " + car1.name + " Model: " + car1.model + " Year: " + car1.year);

        car2.name = "Nissan";
        car2.model = "Skyline";
        car2.year = 1999;
        System.out.println("Car: " + car2.name + " Model: " + car2.model + " Year: " + car2.year);

        // car1 now references the same object as car2
        car1 = car2;
        System.out.println("Car: " + car1.name + " Model: " + car1.model + " Year: " + car1.year);
    }
}
