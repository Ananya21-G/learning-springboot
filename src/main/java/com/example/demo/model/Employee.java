package com.example.demo.model;

public class Employee {
    private int id;
    private String name;
    private String jobRole;

    public Employee() {}

    public Employee(int id, String name,String jobRole) {
        this.id = id;
        this.name = name;
        this.jobRole = jobRole;
    }


    public void setId(int id) {
        this.id = id;
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
