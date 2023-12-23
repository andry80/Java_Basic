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
        if (number1 < number2 && number1 < number3) {
            System.out.println("min: " + number1);
        } else if (number2 < number1 && number2 < number3) {
            System.out.println("min: " + number2);
        }else {
            System.out.println("min: " + number3);
        }
    }
}
