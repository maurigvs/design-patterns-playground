package com.my.playground.composite.entities;

import com.my.playground.composite.model.Employee;

public class CEO extends Employee {

    public CEO(String name, String dept, String job) {
        super(name, dept, job);
    }

    @Override
    public String toString() {
        return "CEO {" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}