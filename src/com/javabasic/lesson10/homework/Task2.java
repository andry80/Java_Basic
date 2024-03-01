package com.javabasic.lesson10.homework;

public class Task2 {
    public static void main(String[] args) {
        Integer[][] matrix = new Integer[3][3];

        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j< matrix[0].length; j++) {
                matrix[i][j] = random(-10, 10);
            }
        }

        printMatrix(matrix);

        cordMatrix(matrix);
    }

    public static int random(int min, int max) {
        int i = (int) (Math.random() * (max - min) + min);
        return i;
    }

    public static void printMatrix(Integer[][] matrix) {
        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j< matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void cordMatrix(Integer[][] matrix) {
        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j< matrix[0].length; j++) {
                if (matrix[i][j] < 0) {
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
        }
    }

}
