package com.javabasic.lesson14.homework.coffeemaker;

public class MainCoffeeMachine {
    public static void main(String[] args) {
        СoffeeMachine c = new СoffeeMachine(new DrinkFabric());
        c.setList();
        c.check();
        c.cook();
    }
}
