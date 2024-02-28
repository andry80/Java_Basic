package com.javabasic.lesson8.homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);


        String palindrom = scaner.nextLine().replaceAll(" ", "");

        boolean isPalindrom = isPalindrom(palindrom);

        if (isPalindrom == true) {
            System.out.println("palindrom");
        } else {
            System.out.println("not palindrom");
        }
    }

    static public boolean isPalindrom(String pld) {

        for (int i = 0; i < pld.length(); i++) {
            if (pld.charAt(i) != pld.charAt(pld.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
