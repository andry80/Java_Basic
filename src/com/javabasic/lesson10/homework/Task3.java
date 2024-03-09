package com.javabasic.lesson10.homework;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(recursion(3));
    }


    public static long recursion(int num) {
        if (num == 0) {
            return 1;
        }
        return (long) num * recursion(num-1);
    }
}
