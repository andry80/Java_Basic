package com.javabasic.lesson7.hormwork;

import java.util.Scanner;

public class Task1 {

    public static final int MIN = 0;
    public static final int MAX = 10;
    public static final int randomValue = random(MIN, MAX);
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        gameMenu();
    }

    public static void gameMenu() {
        while (true) {
            System.out.println("------------------");
            System.out.println("| 1 - Start Game |");
            System.out.println("| 2 -    Exit    |");
            System.out.println("------------------");
            System.out.print("> ");
            int num = scanner.nextInt();
            if (num == 1) {
                startGame();
            } else if (num == 2) {
                break;
            }else {
                System.out.println("Попробуйте еще раз");
            }
        }
    }

    public static void startGame() {
        System.out.println("Введите число от " + MIN + " до " + MAX + " ");
        System.out.print("> ");
        int predict = input();
        while (true) {
            if (predict == randomValue) {
                System.out.println("Вы победили");
                System.out.println("Не хотите сыграть еще раз");
                break;
            } else if (predict < MIN | predict > MAX) {
                System.out.println("Число вне диапазона");
                System.out.print("> ");
                predict = input();
            } else {
                System.out.println("Неверное число");
                System.out.println("Введите другое число");
                System.out.print("> ");
                predict = input();
            }
        }
    }

    public static int random(int min, int max) {
        int i = (int) (Math.random() * (max - min) + min);
        return i;
    }

    public static int input() {
        int num = scanner.nextInt();
        return num;
    }
}
