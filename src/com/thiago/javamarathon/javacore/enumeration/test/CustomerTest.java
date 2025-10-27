package com.thiago.javamarathon.javacore.enumeration.test;

import com.thiago.javamarathon.javacore.enumeration.domain.Customer;
import com.thiago.javamarathon.javacore.enumeration.domain.CustomerType;
import com.thiago.javamarathon.javacore.enumeration.domain.PaymentType;

public class CustomerTest{
    public static void main(String[] args){
        Customer customer1 = new Customer("John", CustomerType.COMPANY, PaymentType.CREDIT);
        Customer customer2 = new Customer("Mary", CustomerType.INDIVIDUAL, PaymentType.DEBIT);
        Customer customer3 = new Customer("William", CustomerType.STARTUP, PaymentType.DEBIT);

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);

        System.out.println(PaymentType.DEBIT.calculateDiscount(100.00));
        System.out.println(PaymentType.CREDIT.calculateDiscount(100.00));

        CustomerType customerType = CustomerType.getByReportValue("individual");
        System.out.println(customerType);

        PaymentType paymentType = PaymentType.getByDatabaseValue(2);
        System.out.println(paymentType);
    }
}
