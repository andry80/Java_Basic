package com.javabasic.lesson15.sales.utils;

public class Rounder {
    public static double round(double num) {
        num *= 100;
        num = Math.round(num);
        num = num / 100;
        return num;
    }
}
