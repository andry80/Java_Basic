package com.javabasic.lesson9.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    static int[] list1 = new int[7];
    static int[] list2 = new int[7];

    public static void main(String[] args) {
        random(list1);
        System.out.println(Arrays.toString(list1));
        mySort(list1);
        System.out.println(Arrays.toString(list1));

        inputNum(list2);
        System.out.println(Arrays.toString(list2));
        mySort(list2);
        System.out.println(Arrays.toString(list2));

        printCoincidence(list1, list2);
    }

    public static void inputNum(int[] list) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (list.length > i) {
            System.out.print("Введите число (от 0 до 9): ");
            int num = scanner.nextInt();
            if (num <= 9 && num >=0) {
                list[i] = num;
                i++;
            }
        }
    }

     public static void random(int[] list) {
         for (int i = 0; i < list.length; i++) {
             list[i] = (int) (Math.random() * 10);
         }
     }

     public static void  mySort(int[] list) {
        for (int i = 0; i< list.length; i++) {
            for (int j = 0; j < list.length-1-i; j++) {
                if (list[j] > list[j+1]) {
                    int u = list[j+1];
                    list[j+1] = list[j];
                    list[j] = u;
                }
            }
        }
     }

     public static void printCoincidence(int[] list1, int[] list2) {
        int t = 0;
        for (int i = 0; i < list1.length; i++) {
            if (list1[i]==list2[i]) {
                t++;
            }
        }
         System.out.println(t);
     }
}
