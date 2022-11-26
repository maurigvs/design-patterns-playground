package com.my.playground.composite.entities;

import com.my.playground.composite.model.Employee;

public class QA extends Employee {

    public QA(String name, String job) {
        super(name, job);
    }

    @Override
    public String toString() {
        return "QA {" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}