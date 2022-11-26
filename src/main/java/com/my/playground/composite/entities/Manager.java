package com.my.playground.composite.entities;

import com.my.playground.composite.model.Employee;

public class Manager extends Employee {

    public Manager(String name, String dept, String job) {
        super(name, dept, job);
    }

    @Override
    public String toString() {
        return "Developer {" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}