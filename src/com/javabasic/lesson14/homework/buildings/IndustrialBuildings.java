package com.javabasic.lesson14.homework.buildings;

public class IndustrialBuildings {
    private int area;
    private int tax;

    public IndustrialBuildings(int area, int tax) {
        this.area = area;
        this.tax = tax;
        }

    public int calcCost() {
        return this.area * this.tax;
    }
}
