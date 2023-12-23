package com.javabasic.lesson5.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите габариты своей сумки (Высота, ширина, длина): ");
        String h = reader.readLine();
        String w = reader.readLine();
        String l = reader.readLine();

        Double height = Double.parseDouble(h);
        Double width = Double.parseDouble(w);
        Double length = Double.parseDouble(l);

        calcBaggage(height, width, length);
    }

    public static void calcBaggage(double height, double width, double length) {
        if (55>=height && 40>=width && 20>=length) {
            System.out.println("подходит как ручная кладь");
        } else if (40>=height && 53>=width && 22>=length) {
            System.out.println("подходит как ручная кладь");
        } else {
            System.out.println("не подходит как ручная кладь");
        }
    }
}
