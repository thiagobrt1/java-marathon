package com.thiago.javamarathon.javacore.staticmodifier.test;

import com.thiago.javamarathon.javacore.staticmodifier.domain.Car;

public class CarTest{
    public static void main(String[] args){
        Car car1 = new Car("BMW", 270);
        Car car2 = new Car("Mercedes", 285);

        car1.print();
        car2.print();

        Car.setSpeedLimit(180);

        car1.print();
        car2.print();
    }
}
