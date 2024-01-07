package com.javabasic.lesson6.homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOne = Double.parseDouble(scanner.nextLine());
        String action = scanner.nextLine();
        double numberTwo = Double.parseDouble(scanner.nextLine());

        System.out.println(getResult(numberOne, action, numberTwo));
    }

    public static Double getResult(double numberOne, String  action, double numberTwo) {
        return switch (action) {
            case "+" -> numberOne+numberTwo;
            case "-" -> numberOne-numberTwo;
            case "/" -> (numberTwo!=0 ? numberOne/numberTwo : null);
            case "*" -> numberOne*numberTwo;
            default -> null;
        };
    }
}
