package com.thiago.javamarathon.javacore.polymorphism.test;

import com.thiago.javamarathon.javacore.polymorphism.domain.Computer;
import com.thiago.javamarathon.javacore.polymorphism.domain.Product;
import com.thiago.javamarathon.javacore.polymorphism.domain.Tomato;

public class ProductTest02{
    public static void main(String[] args){
        Product product1 = new Computer("Thinkpad", 5100.99);
        Product product2 = new Tomato("Dutch", 19.99);

        System.out.println(product1.getName());
        System.out.println(product1.getPrice());
        System.out.println(product1.calculateTaxValue());
        System.out.println();
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println(product2.calculateTaxValue());
    }
}
