package com.javabasic.lesson8.homework;

public class Task1 {

    public static final int COUNTPLAYERS = 11;

    public static void main(String[] args) {
        int[] firstTeamAge = new int[COUNTPLAYERS];
        int[] secondTeamAge = new int[COUNTPLAYERS];

        randomAge(firstTeamAge);
        randomAge(secondTeamAge);

        printAge(firstTeamAge);
        printAge(secondTeamAge);

        int averageFirstTeamAge = averageAge(firstTeamAge);
        int averageSecondTeamAge = averageAge(secondTeamAge);

        printAverageAge(averageFirstTeamAge, averageSecondTeamAge);



    }

    public static void randomAge(int[] team) {
        int max = 45;
        int min = 18;
        for (int i = 0; i <= COUNTPLAYERS - 1; i++) {
            team[i] = (int) (Math.random() * (max - min) + min);
        }
    }

    public static void printAge(int[] team) {
        for (int i : team) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static int averageAge(int[] team) {
        int sum = 0;
        for (int i : team) {
            sum += i;
        }
        return sum / COUNTPLAYERS;
    }

    public static void printAverageAge(int average1, int average2) {
        System.out.println(average1);
        System.out.println(average2);

        if (average1 > average2) {
            System.out.println("average first team age: " + average1);
        } else if (average1 < average2) {
            System.out.println("average second team age: " + average2);
        } else {
            System.out.println("equals");
        }

    }
}
