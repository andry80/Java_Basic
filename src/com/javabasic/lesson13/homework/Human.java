package com.javabasic.lesson13.homework;

import java.util.Objects;

public class Human {

    private String name;
    private Human father;
    private Human mother;

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, Human father, Human mother) {
        this.name = name;
        this.father = father;
        this.mother = mother;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        if (this.father!=null || this.mother!=null) {
            return "name: " + this.getName() + " father: " + father.getName() + " mother: " + mother.getName() ;
        }
        return "name: " + this.getName();
    }

    public static void main(String[] args) {
        Human mother = new Human("Coral");
        Human father = new Human("Rafael");

        Human son = new Human("Victor", father, mother);

        System.out.println(son);
        System.out.println(mother);
        System.out.println(father);
    }
}
