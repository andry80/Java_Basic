package com.javabasic.lesson14.homework.buildings;

public class ResidentialBuildings extends IndustrialBuildings {
    private double subsidies;

    public ResidentialBuildings(int area, int tax, double subsidies) {
        super(area, tax);
        this.subsidies = subsidies;
    }

    public int calcCost() {
        return super.calcCost() - (int) (super.calcCost() * (subsidies/100));
    }
}
