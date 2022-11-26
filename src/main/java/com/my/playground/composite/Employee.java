package com.my.playground.composite;

public class Employee {

    public Department department;
    public int yearsOfExperience;
    public Degree qualification;

    @Override
    public String toString() {
        return "Employee{" +
                "department=" + department +
                ", yearsOfExperience=" + yearsOfExperience +
                ", qualification=" + qualification +
                '}';
    }
}