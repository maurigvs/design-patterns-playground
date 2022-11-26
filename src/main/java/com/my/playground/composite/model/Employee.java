package com.my.playground.composite.model;

import com.my.playground.composite.interfaces.CompanyMember;

public abstract class Employee implements CompanyMember {

    protected String name;
    protected String dept;
    protected String job;

    public Employee(String name, String dept, String job) {
        this.name = name;
        this.dept = dept;
        this.job = job;
    }

    @Override
    public void showDetails() {
        System.out.println(this);
    }
}