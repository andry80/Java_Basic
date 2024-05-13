package com.javabasic.lesson14.homework.buildings;

public class CommercialBuildings extends IndustrialBuildings {
    private int income;

    public CommercialBuildings (int area, int tax, int income) {
        super(area, tax);
        this.income = income;
    }

    public int calcCost() {
        if (income>100) {
            return super.calcCost();
        }
        return 0;
    }
}
