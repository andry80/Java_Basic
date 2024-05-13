package com.javabasic.lesson15.sales.models;

import com.javabasic.lesson15.sales.base.Fiscal;
import com.javabasic.lesson15.sales.base.Income;

// Model.
// Примените интерфейсы Income, Fiscal, переопределите их методы.
public class Product implements Fiscal, Income{

    // Объявление полей модели
    private String name;
    private int quantity;
    private double price;
    // Налоговоу ставку объявите в виде константы
    // здесь ...

    private final double STACK = 0.05;

    // Обеспечьте доступ к полям модели через getters и setters
    // здесь ...


    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Переопределите методы реализуемых интерфейсов.
    // Расчёт дохода от продаж, до уплаты налога.
    // здесь ...
    public double taxFromIncome() {
        return calcIncome() * STACK;
    }

    // Расчёт суммы налога с продаж.
    // здесь ...
    public double calcIncome() {
        return quantity * price;
    }

    // Расчёт чистого дохода, после уплаты налога.
    // здесь ...
    public double calcNetIncome() {
        return calcIncome() - taxFromIncome();
    }
}
