package com.javabasic.lesson14.homework.buildings;

public class MainBuildings {
    public static void main(String[] args) {
        IndustrialBuildings bld1 = new IndustrialBuildings();
        ResidentialBuildings bld2 = new ResidentialBuildings(10);
        CommercialBuildings bld3 = new CommercialBuildings(99);

        System.out.println(bld1.calcCost(100 , 2));
        System.out.println(bld2.calcCost(100 , 2));
        System.out.println(bld3.calcCost(99 , 1));

    }
}
