package com.javabasic.lesson6.classwork;

public class Task1 {
    public static void main(String[] args) {
        int range = (int) (Math.random() * (2000 - 500) + 500);
        System.out.println(range);
        isHit(range);
    }

    public static void isHit(int range) {
        if (range >= 1000 && range <= 1500) {
            System.out.println("Пушка попала в замок");
        } else {
            System.out.println("Пушка не попала в замок");
        }
    }
}
