package com.javabasic.lesson14.homework.coffeemaker;

public abstract class Drink {
    private double cost = 0.0;
    private int count;

    public abstract double calcCost();

    public abstract void cook();
}
