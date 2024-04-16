package com.javabasic.lesson15.temperature;

import java.util.Scanner;

public class MainConvertor {
    public static void main(String[] args) {
        input();
    }

    public static void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter value in celsius: ");
        double value = scanner.nextInt();

        System.out.println("convert to");
        System.out.println("1 - kelvin");
        System.out.println("2 - fahrenheit");
        int num = scanner.nextInt();

        Converter temp;
        switch (num) {
            case 1 -> temp = new Fahrenheit();
            case 2 -> temp = new Kelvin();
            default -> temp = new Fahrenheit();
        }

        SuperConvertor s = new SuperConvertor(value, temp);
        System.out.println(s.Convert());
    }
}
