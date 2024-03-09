package com.javabasic.lesson10.homework;

import java.util.Scanner;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("enter the number of rows : ");
        int weight = scanner.nextInt();

        System.out.println("enter the number of columns: ");
        int height = scanner.nextInt();

        Integer[][] matrix = new Integer[weight][height];

        inputMatrix(matrix);

        System.out.println();

        printMatrix(matrix);

        Integer[][] matrix1 = transposeMatrix(matrix);

        System.out.println();

        printMatrix(matrix1);

    }

    public static void inputMatrix(Integer[][] matrix) {
        for (int i = 0; i<matrix.length; i++) {
            System.out.println("enter value of " + (i + 1) + " row: ");
            for (int j = 0; j<matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static void printMatrix(Integer[][] matrix) {
        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j< matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static Integer[][] transposeMatrix(Integer[][] matrix) {
        Integer[][] matrix1 = new Integer[matrix[0].length][matrix.length];
        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j< matrix[0].length; j++) {
                matrix1[j][i] = matrix[i][j];
            }
        }
        return matrix1;
    }
}
