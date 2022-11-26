package com.my.playground.composite;

import com.my.playground.composite.entities.*;
import com.my.playground.composite.composition.Company;
import com.my.playground.composite.model.Department;

import java.util.ArrayList;

public class MainComposite {

    public static void main(String[] args) {

        CEO ceo = new CEO("Andrew", "Chief Executive Officer");

        Manager executive = new Manager("Derik",  "Senior HR Executive");
        Manager manager = new Manager("Peter",  "HR Manager");

        Developer developer1 = new Developer("salitha", "Software Engineer");
        Developer developer2 = new Developer("Jhon", "Senior Software Engineer");

        QA qe1 = new QA("Tom","Quality Assurance Engineer");
        QA qe2 = new QA("Jimmy","Quality Assurance Lead");

        Department engDept = new Department("ENG", new ArrayList<>());
        engDept.addEmployee(developer1);
        engDept.addEmployee(developer2);
        engDept.addEmployee(qe1);
        engDept.addEmployee(qe2);

        Department hrDept = new Department("HR", new ArrayList<>());
        hrDept.addEmployee(manager);
        hrDept.addEmployee(executive);

        Company company = new Company("XYZ");
        company.addMember(ceo);
        company.addMember(hrDept);
        company.addMember(engDept);
        company.showCompanyName();
        company.showDetails();
    }
}
