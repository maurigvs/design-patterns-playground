package com.my.playground.composite.entities;

import com.my.playground.composite.model.Employee;

public class Manager extends Employee {

    public Manager(String name, String job) {
        super(name, job);
    }

    @Override
    public String toString() {
        return "Manager {" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}