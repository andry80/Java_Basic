package com.javabasic.lesson14.homework.buildings;

public class ResidentialBuildings extends IndustrialBuildings {
    private double subsidies;

    public ResidentialBuildings(double subsidies) {
        this.subsidies = subsidies;
    }

    public int calcCost(int area, int tax) {
        return super.calcCost(area, tax) - (int) (super.calcCost(area, tax)*(subsidies/100));
    }
}
