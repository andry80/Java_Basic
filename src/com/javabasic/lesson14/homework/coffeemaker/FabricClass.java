package com.javabasic.lesson14.homework.coffeemaker;

public class FabricClass  {

    public void printMenu() {
        System.out.println("1 - Tea");
        System.out.println("2 - Americano");
        System.out.println("3 - Latte");
        System.out.println("4 - Cappuccino");
        System.out.println("5 - exit");
    }

    public Drink menu(int num , int count) {
        switch (Drinks.values()[num]) {
            case TEA -> {return new Tea(count);}
            case AMERICANO -> {return new Americano(count);}
            case LATTE -> {return new Latte(count);}
            case CAPPUCCINO -> {return new Cappuccino(count);}
            default -> {return new Tea(count);}
        }
    }
}
