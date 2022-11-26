package com.my.playground.composite;

import com.my.playground.composite.entities.*;
import com.my.playground.composite.composition.Company;
import com.my.playground.composite.model.Department;

import java.util.ArrayList;

public class MainComposite {

    public static void main(String[] args) {

        CEO ceo = new CEO("Andrew", "COM", "Chief Executive Officer");

        Manager manager = new Manager("Peter", "HR", "HR Manager");
        Manager executive = new Manager("Derik", "HR", "Senior HR Executive");

        Developer developer1 = new Developer("salitha", "ENG", "Software Engineer");
        Developer developer2 = new Developer("Jhon", "ENG", "Senior Software Engineer");

        QA qe1 = new QA("Tom", "ENG", "Quality Assurance Engineer");
        QA qe2 = new QA("Jimmy", "ENG", "Quality Assurance Lead");

        Department engDept = new Department("ENG", new ArrayList<>());
        engDept.addEmployee(developer1);
        engDept.addEmployee(developer2);
        engDept.addEmployee(qe1);
        engDept.addEmployee(qe2);

        Department hrDept = new Department("HR", new ArrayList<>());
        hrDept.addEmployee(manager);
        hrDept.addEmployee(executive);

        Company company = new Company("XYZ");
        company.addMember(engDept);
        company.addMember(hrDept);
        company.addMember(ceo);
        company.showCompanyName();
        company.showDetails();
    }
}
