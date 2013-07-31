package com.tw.jellybean.model;

import java.util.Currency;
import java.util.Date;

public class Project {

    private String name;
    private String description;
    private Date startDate;
    private int durationInDays;
    private ContractType contractType;
    private RateType rateType;
    private Currency billingCurrency;
    private Location locationOfWork ;
    private Domain domain;


    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", durationInDays=" + durationInDays +
                ", contractType=" + contractType +
                ", rateType=" + rateType +
                ", billingCurrency=" + billingCurrency +
                ", locationOfWork=" + locationOfWork +
                ", domain=" + domain +
                '}';
    }
}
