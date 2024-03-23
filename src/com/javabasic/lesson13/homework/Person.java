package com.javabasic.lesson13.homework;

public class Person {

    private String name;

    private String lastName;

    private int age;

    private int height;

    private int weight;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Person(String name, String lastName, int age) {
        this(name, lastName);
        this.age = age;
    }

    public Person(String name, String lastName, int age, int height) {
        this(name, lastName, age);
        this.height = height;
    }

    public Person(String name, String lastName, int age, int height, int weight) {
        this(name, lastName, age, height);
        this.weight = weight;
    }

    public String toString() {
        return "name:" + this.name + " last name:" +  this.lastName + " age:" + this.age + " height:" + this.height + " weight:" + this.weight;
    }

    public static void main(String[] args) {

        String[] rName = "Xaviera Rafael Belen Corbin Xenos Zipporah Victor Molly Ysobel Paulette Mohamed Wilfreda Wolfgang Quillen Isaias Xochitl Eve Zephaniah Harlie Emmalyn".split(" ");
        String[] rLastName = "Ross Moore Brooks Ward Evans Lewis Diaz Adams Bryant Morris Powell Walker Davis Powell Young Young Clark Williams Long Butler".split(" ");
        Person[] lst = new Person[100];
        for (int i = 0; i < 100; i++) {
            int r1 = (int) (Math.random() * 20);
            int r2 = (int) (Math.random() * 20);

            String name = rName[r1];
            String lastname = rLastName[r2];

            int age = (int) (Math.random() * (70 - 25) + 25);
            int height = (int) (Math.random() * (190 - 155) + 155);
            int weight = (int) (Math.random() * ((height-90) - (height-110)) + (height-110));

            lst[i] = new Person(name, lastname, age, height, weight);
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(lst[i]);
        }
    }

}
