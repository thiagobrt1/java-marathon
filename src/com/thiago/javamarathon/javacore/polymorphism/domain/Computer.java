package com.thiago.javamarathon.javacore.polymorphism.domain;

public class Computer extends Product{
    public static final double TAX_PERCENTAGE = 0.21;

    public Computer(String name, double price){
        super(name, price);
    }

    @Override
    public double calculateTaxValue(){
        return price * TAX_PERCENTAGE;
    }
}
