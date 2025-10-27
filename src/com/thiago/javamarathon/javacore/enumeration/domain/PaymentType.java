package com.thiago.javamarathon.javacore.enumeration.domain;

public enum PaymentType{
    DEBIT(1, "Debit"){
        @Override
        public double calculateDiscount(double value){
            return value * 0.1;
        }
    },
    CREDIT(2, "Credit"){
        @Override
        public double calculateDiscount(double value){
            return value * 0.05;
        }
    };

    public final int DB_VALUE;
    public final String REPORT;

    PaymentType(int dbValue, String report){
        this.DB_VALUE = dbValue;
        this.REPORT = report;
    }

    public abstract double calculateDiscount(double value);

    public static PaymentType getByDatabaseValue(int dbValue){
        PaymentType[] types = values();
        for(int i = 0; i < types.length; i++){
            if(types[i].DB_VALUE == dbValue){
                return types[i];
            }
        }

        return null;
    }
}
