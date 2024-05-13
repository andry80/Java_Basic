package com.javabasic.lesson14.homework.buildings;

public class MainBuildings {
    public static void main(String[] args) {
        IndustrialBuildings bld1 = new IndustrialBuildings(100, 5);
        ResidentialBuildings bld2 = new ResidentialBuildings(100, 5, 10);
        CommercialBuildings bld3 = new CommercialBuildings(99, 5, 1);

        System.out.println(bld1.calcCost());
        System.out.println(bld2.calcCost());
        System.out.println(bld3.calcCost());

    }
}
