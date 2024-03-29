package com.javabasic.lesson11.homework;

public class Cat {

    private String name;
    private int age;
    private int weight;
    private String breed;

    public Cat(String name, int age, int weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 1;
        this.breed = null;
    }

    public Cat() {
        this.name = "Cat";
        this.age = 1;
        this.weight = 1;
        this.breed = "without breed";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            return this.age == cat.age && this.weight == cat.weight;
        }
        return false;
    }

    public String toString() {
        return "Cat{name="+ this.name +", age="+ this.age +", weight="+ this.weight +", breed="+ this.breed +"}";
    }


    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("cat1", 5);
        Cat cat3 = new Cat("cat2", 5, 2, "cat");

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);

        System.out.println(cat2.equals(cat3));
        System.out.println(cat2);
    }

}
