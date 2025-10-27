package com.thiago.javamarathon.javacore.finalmodifier.test;

import com.thiago.javamarathon.javacore.finalmodifier.domain.Car;
import com.thiago.javamarathon.javacore.finalmodifier.domain.Ferrari;

public class CarTest{
    public static void main(String[] args){
        Car car = new Car();
        System.out.println(Car.SPEED_LIMIT);

        car.BUYER.setName("John");
        System.out.println(car.BUYER);

        Ferrari ferrari = new Ferrari();

        ferrari.setName("Enzo");
        ferrari.print();
    }
}
