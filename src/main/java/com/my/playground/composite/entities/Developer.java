package com.my.playground.composite.entities;

import com.my.playground.composite.model.Employee;

public class Developer extends Employee {

    public Developer(String name, String job) {
        super(name, job);
    }

    @Override
    public String toString() {
        return "Developer {" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}