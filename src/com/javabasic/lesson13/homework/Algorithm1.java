package com.javabasic.lesson13.homework;

public class Algorithm1 {
    public static void main(String[] args) {
        int[] lst = new int[5];

        for (int i = 1; i<6; i++){
            lst[i-1] = i;
        }

        for (int h : lst) {
            System.out.println(h);
        }

        findSum(lst, 6);
    }

    public static void findSum(int[] lst, int num) {
        for (int i = 0; i<lst.length; i++) {
            for (int j = i; j<lst.length; j++) {
                if ((lst[i] + lst[j]) == num) {
                    System.out.println("[" + i + ", " + j + "]");
                }
            }
        }
    }
}
