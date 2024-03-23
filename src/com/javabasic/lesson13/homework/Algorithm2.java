package com.javabasic.lesson13.homework;

import java.util.Arrays;

public class Algorithm2 {
    public static void main(String[] args) {
        int[] lst = new int[4];
        for (int i = 1; i<lst.length+1; i++){
            lst[i-1] = i;
        }

        System.out.println(Arrays.toString(lst));

        int[] lst1 = swap(lst, 3);

        System.out.println(Arrays.toString(lst1));

    }

    public static int[] swap(int[] lst, int num) {
        int[] sortedLst = new int[lst.length];
        for (int i = 0; i<lst.length; i++) {
            sortedLst[(i+num)%lst.length] = lst[i];
        }
        return sortedLst;
    }
}
