package com.javabasic.lesson14.homework.coffeemaker;

public class Cappuccino extends Drink {
    private double cost = 1.3;
    private int count;

    public Cappuccino(int count) {
        this.count = count;
    }

    public double calcCost() {
        return this.cost * this.count;
    }

    public void cook() {
        System.out.println(count + " Cappuccino is done!");
    }

    public String toString() {
        return "[" + this.count + " Cappuccino: "+ this.calcCost() + "]";
    }
}
