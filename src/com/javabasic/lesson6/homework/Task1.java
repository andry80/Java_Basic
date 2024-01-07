package com.javabasic.lesson6.homework;

public class Task1 {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;

        printMinNumber(random(min, max), random(min, max), random(min, max));
    }

    public static int random (int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static void printMinNumber (int number1, int number2, int number3) {
        int num1 = Math.min(number1, number2);
        int result = Math.min(num1, number3);
        System.out.println("min: " + result);

    }
}
