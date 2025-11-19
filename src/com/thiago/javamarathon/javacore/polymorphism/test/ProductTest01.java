package com.thiago.javamarathon.javacore.polymorphism.test;

import com.thiago.javamarathon.javacore.polymorphism.domain.Computer;
import com.thiago.javamarathon.javacore.polymorphism.domain.Television;
import com.thiago.javamarathon.javacore.polymorphism.domain.Tomato;
import com.thiago.javamarathon.javacore.polymorphism.service.ProductTaxReport;

public class ProductTest01{
    public static void main(String[] args){
        Computer computer = new Computer("MacBook Air", 12999.00);
        Tomato tomato = new Tomato("Italian", 7.99);
        Television television = new Television("Samsung 2025", 9499.00);

        ProductTaxReport.generateTaxReport(computer);
        System.out.println();
        ProductTaxReport.generateTaxReport(tomato);
        System.out.println();
        ProductTaxReport.generateTaxReport(television);
    }
}
