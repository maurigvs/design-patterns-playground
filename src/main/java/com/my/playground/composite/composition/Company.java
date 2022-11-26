package com.my.playground.composite.composition;

public class Company extends CompanyDirectory {

    private final String name;

    public Company(String name) {
        this.name = name;
    }

    public void showCompanyName(){
        System.out.println("Company " + name);
    }
}
