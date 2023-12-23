package com.javabasic.lesson5.homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свои оценки по 5 предметам: ");
        int firstBal = scanner.nextInt();
        int secondBal = scanner.nextInt();
        int thirdBal = scanner.nextInt();
        int fourthBal = scanner.nextInt();
        int fifthBal = scanner.nextInt();

        stp(firstBal, secondBal, thirdBal, fourthBal, fifthBal);
    }

    public static void stp(int first, int second, int third, int forth, int fifth) {
        float average = (float) (first + second + third + forth + fifth) / 5;
        if (average > 10) {
            System.out.println("повышеная степендия с средним балом: " + average);
        } else if (average > 8) {
            System.out.println("обычная степендия с средним балом: " + average);
        } else {
            System.out.println("нет стипендии, средний бал: " + average);
        }

    }
}
