package com.thiago.javamarathon.javacore.staticmodifier.domain;

public class Car{
    private String name;
    private double maxSpeed;

    // static modifier
    private static double speedLimit = 250;

    public Car(String name, double maxSpeed){
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("Speed limit: " + speedLimit);
        System.out.println();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    // static method
    public static double getSpeedLimit(){
        return speedLimit;
    }

    public static void setSpeedLimit(double speedLimit){
        Car.speedLimit = speedLimit;
    }
}
