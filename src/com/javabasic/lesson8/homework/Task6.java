package com.javabasic.lesson8.homework;


public class Task6 {
    public static void main(String[] args) {
        double[] chance = new double[10];

        randomChanceList(chance);
        printList(chance);
        printMaxList(chance);
    }

    public static void printList(double[] lst) {
        for (int i = 0; i < lst.length; i++) {
            System.out.println(lst[i]);
        }
    }

    public static void randomChanceList(double[] lst ) {
        for (int i = 0; i < lst.length; i++) {
            lst[i] = Math.random();
        }
    }

    public static void printMaxList(double[] chance) {
        double max = 0;
        int index = 0;

        for (int i = 0; i < chance.length ; i++) {
            if (max <= chance[i]){
                max = chance[i];
                index = i+1;
            }
        }
        System.out.println("max: " + Math.round(max * 100 ) + "%");
        System.out.println("number: " + index);
    }
}
