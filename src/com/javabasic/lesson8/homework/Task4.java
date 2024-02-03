package com.javabasic.lesson8.homework;

public class Task4 {
    public static void main(String[] args) {
        printSquare(10);

        printTriangle();

        printRound(10, 10, 4);
        pringDonut(10, 10, 5, 2);
    }

    public static void pringDonut(int weight, int heinght, int radius, int radiusVoid) {
        for (int i = -weight/2; i <= weight/2; i++) {
            for (int j = -heinght/2; j <= heinght/2; j++) {
                if (i*i + j*j <= radiusVoid*radiusVoid) {
                    System.out.print(" ");
                } else if (i*i + j*j <= radius*radius) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printRound(int weight, int heinght, int radius) {
        for (int i = -weight/2; i <= weight/2; i++) {
            for (int j = -heinght/2; j <= heinght/2; j++) {
                if (i*i + j*j <= radius*radius) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printSquare (int diameter) {
        for (int i = 0; i < diameter; i++) {
            for (int j = 0; j < diameter; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    public static void printTriangle () {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
