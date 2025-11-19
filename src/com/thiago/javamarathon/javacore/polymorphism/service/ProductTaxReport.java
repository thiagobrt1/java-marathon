package com.thiago.javamarathon.javacore.polymorphism.service;

import com.thiago.javamarathon.javacore.polymorphism.domain.Product;
import com.thiago.javamarathon.javacore.polymorphism.domain.Tomato;

public class ProductTaxReport{
    public static void generateTaxReport(Product product){
        double taxValue = product.calculateTaxValue();

        System.out.println("Generating tax report for Product");
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Tax Value: " + taxValue);

        if(product instanceof Tomato tomato){
            System.out.println(tomato.getBestConsumedBefore());
        }
    }
}
