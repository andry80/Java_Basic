package com.javabasic.lesson4.classwork;

public class Task1 {
    public static void main(String[] args) {
        double salaryFirstPerson = 3000.0;
        double salarySecondPerson = 4500.0;
        double salaryThirdPerson = 5800.0;

        System.out.println("Salary first person 10 years: " + calcSalaryTenYears(salaryFirstPerson));
        System.out.println("Salary second person 10 years: " + calcSalaryTenYears(salarySecondPerson));
        System.out.println("Salary third person 10 years: " + calcSalaryTenYears(salaryThirdPerson));

        System.out.println("Salary first person (non-taxed): " + calcSalaryTenYearsTax(salaryFirstPerson));
        System.out.println("Salary second person (non-taxed): " + calcSalaryTenYearsTax(salarySecondPerson));
        System.out.println("Salary third person (non-taxed): " + calcSalaryTenYearsTax(salaryThirdPerson));

        System.out.println("Average salary all person: " + calcAverSalaryTenYearsTax(salaryFirstPerson, salarySecondPerson, salaryThirdPerson));
    }

    public static double calcSalaryTenYears(double salary) {
        return salary * 12 * 10;
    }

    public static double calcSalaryTenYearsTax(double salaryForTenYears) {
        return calcSalaryTenYears(salaryForTenYears) - calcSalaryTenYears(salaryForTenYears) * 0.05;
    }

    public static double calcAverSalaryTenYearsTax(double first, double second, double third) {
        return (calcSalaryTenYearsTax(first) + calcSalaryTenYearsTax(second) + calcSalaryTenYearsTax(third)) / 3;
    }
}
