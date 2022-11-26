package com.my.playground.composite;

public class MainComposite {

    public static void main(String[] args) {

        var employee = new Employee();
        employee.department = Department.ENGINEERING;
        employee.yearsOfExperience = 12;
        employee.qualification = Degree.Btech;

        var designation = getDesignation(employee);

        System.out.println("Employee: " + employee);
        System.out.println("Designation: " + designation);
    }

    public static Designation getDesignation(Employee emp) {

        if (emp.department == Department.SALES) {

            if (emp.yearsOfExperience < 5) {
                if (emp.qualification == Degree.HIGH_SCHOOL) {
                    return Designation.ASSISTANT_SALES_ASSOCIATE;
                } else if (emp.qualification == Degree.BBA){
                    return Designation.SALES_ASSOCIATE;

                } else if (emp.qualification == Degree.BBA){
                    return Designation.SALES_MANAGER;
                } else {
                    return Designation.UNKNOWN;
                }
            }

            if (emp.yearsOfExperience >= 5 && emp.yearsOfExperience < 10) {
                if (emp.qualification == Degree.HIGH_SCHOOL){
                    return Designation.SALES_ASSOCIATE;
                } else if (emp.qualification == Degree.BBA){
                    return Designation.Account_Executive;
                } else if (emp.qualification == Degree.MBA){
                    return Designation.SENIOR_SALES_MANAGER;
                } else {
                    return Designation.UNKNOWN;
                }
            } else {
                return Designation.REGIONAL_HEAD;
            }
        } else if (emp.department == Department.ENGINEERING) {
            if (emp.yearsOfExperience < 5) {
                if (emp.qualification == Degree.Btech || emp.qualification == Degree.BE){
                    return Designation.ASSISTANT_ENGINEER;
                } else if (emp.qualification == Degree.Mtech || emp.qualification == Degree.Phd){
                    return Designation.ASSOCIATE_ENGINEER;
                } else {
                    return Designation.UNKNOWN;
                }
            } else {
                if (emp.qualification == Degree.Btech || emp.qualification == Degree.BE){
                    return Designation.ASSOCIATE_ENGINEER;
                } else if (emp.qualification == Degree.Mtech || emp.qualification == Degree.Phd){
                    return Designation.ENGINEER_LEAD;
                } else {
                    return Designation.UNKNOWN;
                }
            }
        }
        return null;
    }
}