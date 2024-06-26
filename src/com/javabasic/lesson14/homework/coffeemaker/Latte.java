package com.javabasic.lesson14.homework.coffeemaker;

public class Latte extends Drink {
    private double cost = 1.2;
    private int count;

    public Latte(int count) {
        this.count = count;
    }

    public double calcCost() {
        return this.cost * this.count;
    }

    public void cook() {
        System.out.println(count + " Latte is done!");
    }

    public String toString() {
        return "[" + this.count + " Latte: "+ this.calcCost() + "]";
    }
}
