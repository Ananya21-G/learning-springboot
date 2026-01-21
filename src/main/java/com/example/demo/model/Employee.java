package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="Employee_Table")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String jobRole;

    public Employee() {}

    public Employee(Integer id, String name,String jobRole) {
        this.id = id;
        this.name = name;
        this.jobRole = jobRole;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

}
