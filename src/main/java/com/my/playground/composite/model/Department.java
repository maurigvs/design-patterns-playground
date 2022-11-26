package com.my.playground.composite.model;

import com.my.playground.composite.interfaces.CompanyMember;

import java.util.List;

public class Department implements CompanyMember {

    private final String name;

    private final List<Employee> employees;

    public Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    @Override
    public void showDetails() {
        System.out.println(this);
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    @Override
    public String toString() {
        return "Department {" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}