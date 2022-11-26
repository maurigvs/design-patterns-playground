package com.my.playground.composite.entities;

import com.my.playground.composite.model.Employee;

public class QA extends Employee {

    public QA(String name, String dept, String job) {
        super(name, dept, job);
    }

    @Override
    public String toString() {
        return "QA {" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}