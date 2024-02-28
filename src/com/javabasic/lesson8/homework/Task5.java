package com.javabasic.lesson8.homework;

public class Task5 {
    public static void main(String[] args) {
        String pin = "9407";

        int counter = 0;
        for (int i = 0; i < pin.length(); i++) {
            for (int j = 0; j <= 9; j++) {
                counter++;
                if (String.valueOf(j).charAt(0) == pin.charAt(i)) {
                    System.out.println(j);
                    break;
                }
            }
        }
        System.out.println(counter);
    }

}
