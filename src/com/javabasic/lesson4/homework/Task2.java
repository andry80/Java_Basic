package com.javabasic.lesson4.homework;

public class Task2 {
    public static void main(String[] args) {
        int countDogs = 24;
        int countCats = 8;
        int foodCats = foodCounterMonth(countCats);
        int foodDogs = foodCounterMonth(countDogs);
        int cost = costCounter(foodCats + foodDogs);

        System.out.println("Грам корма для котов в месяц: " + foodCats);
        System.out.println("Грам корма для собак в месяц: " + foodDogs);
        System.out.println("Нужно денег в месяц на содержание приюта: " + cost);
    }

    public static int foodCounterMonth (int numberOfPet) {
        int dayInMonth = 30;
        int foodGram = 50;
        int foodIntake = 3;
        return numberOfPet * foodGram * foodIntake * dayInMonth;
    }

    public static int costCounter (int gram) {
        int foodIntakeGram = 50;
        int cost = 2;
        return gram / foodIntakeGram * cost;
    }
}
