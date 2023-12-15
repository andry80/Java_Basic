package com.javabasic.lesson5.classwork;

public class Task1 {
    public static void main(String[] args) {
        double length = 1.5;
        double width = 0.5;
        double height = 1;

        double volume  = calculateVolume(length, width, height);
        System.out.println(volume);

        double totalWeight = calculateTotalWeight(volume);
        System.out.println(totalWeight);
    }

    public static double calculateVolume(double l, double w, double h) {
        return l * w * h;
    }

    public static double calculateTotalWeight(double volume) {
        double maxWeight = 58;
        return volume * maxWeight;
    }
}
