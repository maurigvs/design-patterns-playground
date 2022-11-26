package com.my.playground.composite.entities;

import com.my.playground.composite.model.Employee;

public class CEO extends Employee {

    public CEO(String name, String job) {
        super(name, job);
    }

    @Override
    public String toString() {
        return "CEO {" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}