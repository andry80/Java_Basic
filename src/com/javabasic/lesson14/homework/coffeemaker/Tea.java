package com.javabasic.lesson14.homework.coffeemaker;

public class Tea extends Drink{
    private double cost = 1.0;
    private int count;

    public Tea(int count) {
        this.count = count;
    }

    public double getCost() {
        return this.cost * this.count;
    }

    public void cook() {
        System.out.println(count + " Tea is done!");
    }

    public String toString() {
        return "[" + this.count + " Tea: "+ this.getCost() + "]";
    }

}
