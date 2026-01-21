package com.example.demo.model;

public class Affair {
    //requirements(fields) for the Affair
    private String partner1;
    private String partner2;

    //Constructor (Affair banane wala)
    public Affair(String partner1, String partner2){
        this.partner1 = partner1;
        this.partner2 = partner2;
    }

    public String getPartner1(){
        return partner1;
    }

    public String getPartner2(){
        return partner2;
    }
}
