package com.javabasic.lesson15.sales.views;


import com.javabasic.lesson15.sales.models.Product;
import com.javabasic.lesson15.sales.utils.Validator;

import java.util.Scanner;

// View
public class SalesView {


    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;
    Product product;

    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.


    public SalesView(Product product) {
        this.product = product;
    }

    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Введите наименование товара: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        product.setName(Validator.validateName(scanner));

        title = "Введите количество: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        product.setQuantity(Validator.validateQuantityInput(scanner));

        title = "Введите цену: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        product.setPrice(Validator.validatePriceInput(scanner));

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
