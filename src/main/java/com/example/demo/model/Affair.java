package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Affair_Table")
public class Affair {

    @Id
    @GeneratedValue
    //requirements(fields) for the Affair
    private int id;
    private String partner1;
    private String partner2;

    //Constructor (Affair banane wala)
    public Affair(String partner1, String partner2){
        this.partner1 = partner1;
        this.partner2 = partner2;
    }

    public Affair(){

    }

    public String getPartner1(){
        return partner1;
    }

    public String getPartner2(){
        return partner2;
    }
}
