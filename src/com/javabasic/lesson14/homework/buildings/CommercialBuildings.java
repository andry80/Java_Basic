package com.javabasic.lesson14.homework.buildings;

public class CommercialBuildings extends IndustrialBuildings {
    private int income;

    public CommercialBuildings (int income) {
        this.income = income;
    }

    public int calcCost(int area, int tax) {
        if (income>100) {
            return super.calcCost(area, tax);
        }
        return 0;
    }
}
