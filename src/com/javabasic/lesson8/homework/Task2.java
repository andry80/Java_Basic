package com.javabasic.lesson8.homework;

import java.util.Scanner;

public class Task2 {
    static Scanner scanner = new Scanner(System.in);

    static String[] lst = new String[20];

    static String[] lst1;// = new String[lst.length / 2];
    static String[] lst2;// = new String[lst.length / 2 + lst.length % 2];

    public static void main(String[] args) {
        scaner();

        gen();

        printLst(lst);

        cut();

        printLst(lst1);
        printLst(lst2);

    }

    public static void printLst(String[] lst) {
        for (int i = 0; i < lst.length; i++) {
            System.out.print(lst[i] + ", ");
        }
        System.out.println();
    }

    public static void gen() {
        for (int i = 0; i < lst.length; i++) {
            lst[i] = String.valueOf(i);
        }
    }

    public static void scaner() {
        String l  = scanner.nextLine();
        lst = new String[l.length()];
        for (int i = 0; i < l.length(); i++) {
            lst[i] = String.valueOf(l.charAt(i));
        }
    }

    public static void cut() {
        lst1 = new String[lst.length / 2];
        lst2 = new String[lst.length / 2 + lst.length % 2];

        for (int i = 0; i < lst.length / 2; i++) {
            lst1[i] = lst[i];
        }
        for (int i = 0; i < lst.length / 2 + lst.length % 2; i++) {
            lst2[i] = lst[i + lst.length / 2];
        }
    }
}
