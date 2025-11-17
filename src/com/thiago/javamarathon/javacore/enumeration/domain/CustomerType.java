package com.thiago.javamarathon.javacore.enumeration.domain;

public enum CustomerType{
    INDIVIDUAL(1, "Individual"),
    COMPANY(2, "Company"),
    STARTUP(3, "Startup");

    public final int DB_VALUE;
    public final String REPORT;

    CustomerType(int dbValue, String reportValue){
        this.DB_VALUE = dbValue;
        this.REPORT = reportValue;
    }

    public static CustomerType getByDatabaseValue(int dbValue){
        CustomerType[] types = values();

        for(int i = 0; i < types.length; i++){
            if(types[i].DB_VALUE == dbValue){
                return types[i];
            }
        }

        return null;
    }

    public static CustomerType getByReportValue(String reportValue){
        CustomerType[] types = values();

        for(int i = 0; i < types.length; i++){
            if(types[i].REPORT.equalsIgnoreCase(reportValue)){
                return types[i];
            }
        }

        return null;
    }
}
