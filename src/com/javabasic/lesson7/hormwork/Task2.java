package com.javabasic.lesson7.hormwork;

public class Task2 {
    public static void main(String[] args) {
        printLuckyNumbers(1, 100);
    }

    public static void printLuckyNumbers (int start, int stop) {
        for (int i = start; i<=stop; i++) {
            if(isLucky(i)) {
                System.out.println(i);
            }
        }
    }

    public  static boolean isLucky (int num) {
        String text = String.valueOf(num);
        if (text.contains("4") | text.contains("9")) {
            return false;
        }else {
            return true;
        }
    }
}
