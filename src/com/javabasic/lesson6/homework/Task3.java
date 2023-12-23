package com.javabasic.lesson6.homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Введите количество яблок: ");
        printCountJars(scaner.nextInt());
    }

    public static void printCountJars(int apple) {
        int appleBigJar = 5;
        int appleMiddleJar = 3;

        int bigJar = apple / appleBigJar;
        int middleJar = apple % appleBigJar / appleMiddleJar;
        int smallJar = apple % appleMiddleJar;

        System.out.println("Количество больших банок: " + bigJar);
        System.out.println("Количество средних банок: " + middleJar);
        System.out.println("Количество маленьких банок: " + smallJar);
    }
}
