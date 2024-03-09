package com.javabasic.lesson9.homework;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] list = new int[10];
        random(list);
        System.out.println(Arrays.toString(list));

        mySort(list);
    }

    public static void random(int[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 10);
        }
    }

    public static void mySort(int[] list) {
        int y = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i; j < list.length; j++) {
                y++;
                if (list[j] == 0) {
                    int u = list[j];
                    list[j] = list[i];
                    list[i] = u;
                    break;
                }
            }
        }
        System.out.println(y);
        System.out.println(Arrays.toString(list));
    }
}
