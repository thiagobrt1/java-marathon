package com.thiago.javamarathon.javacore.polymorphism.test;

import com.thiago.javamarathon.javacore.polymorphism.domain.Computer;
import com.thiago.javamarathon.javacore.polymorphism.domain.Product;
import com.thiago.javamarathon.javacore.polymorphism.domain.Tomato;
import com.thiago.javamarathon.javacore.polymorphism.service.ProductTaxReport;

public class ProductTest03{
    public static void main(String[] args){
        Product product = new Computer("MacBook Air", 12999.00);
        Tomato tomato = new Tomato("Italian", 7.99);
        tomato.setBestConsumedBefore("18/11/25");

        ProductTaxReport.generateTaxReport(product);
        System.out.println();
        ProductTaxReport.generateTaxReport(tomato);
    }
}
