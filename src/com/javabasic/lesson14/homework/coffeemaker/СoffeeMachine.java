package com.javabasic.lesson14.homework.coffeemaker;

import java.util.ArrayList;
import java.util.Scanner;

public class СoffeeMachine {

    private ArrayList<Drink> drink = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private DrinkFabric drinkfabric;

    public СoffeeMachine(DrinkFabric fabricclass) {
        this.drinkfabric = fabricclass;
    }

    public void setList() {
        drinkfabric.printMenu();

        while (true) {
            System.out.print("Enter number: ");
            int num = scanner.nextInt() - 1;
            if (num == 4) {
                break;
            }

            System.out.print("    enter quantity: ");
            int count = scanner.nextInt();
            drink.add(this.drinkfabric.menu(num, count));
        }
    }


    public void check() {
        System.out.println();
        System.out.println("Check:");
        double num = 0;
        for (Drink i : drink) {
            System.out.println(i);
            num += i.calcCost();
        }
        System.out.println("Order cost: " + num);
        System.out.println();
    }

    public void cook() {
        for (Drink i : drink) {
            i.cook();
        }
    }
}
