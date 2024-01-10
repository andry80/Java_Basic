package com.javabasic.lesson7.hormwork;

public class Task3 {
    public static void main(String[] args) {
        // wasingMashinV2(10);
        wasingMashinV1(10);
    }

    public static void wasingMashinV1 (int countCar) {
        for (int i = 1; i <= countCar ; i++) {
            latherUp(i);
            wash(i);
            dry(i);
        }
        System.out.println("All cars clean");
    }

    public static void wasingMashinV2 (int countCar) {
        int i = 1;
        while (i <= countCar) {
            latherUp(i);
            wash(i);
            dry(i);
            i++;
        }
        System.out.println("All cars clean");
    }

    public static void  latherUp(int num) {
        System.out.println("latherUp car: " + num);
    }

    public static void  wash(int num) {
        System.out.println("wash car: " + num);
    }

    public static void  dry(int num) {
        System.out.println("dry car: " + num);
    }
}
