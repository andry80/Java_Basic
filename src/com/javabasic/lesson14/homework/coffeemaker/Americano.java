package com.javabasic.lesson14.homework.coffeemaker;

public class Americano extends Drink {
    private double cost = 1.5;
    private int count;

    public Americano(int count) {
        this.count = count;
    }
    public double getCost() {
        return this.cost * this.count;
    }

    public void cook() {
        System.out.println(count + " Americano is done!");
    }

    public String toString() {
        return "[" + this.count + " Americano: "+ this.getCost() + "]";
    }
}
