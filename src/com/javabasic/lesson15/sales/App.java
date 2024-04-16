package com.javabasic.lesson15.sales;

import com.javabasic.lesson15.sales.controllers.ProductController;
import com.javabasic.lesson15.sales.models.Product;
import com.javabasic.lesson15.sales.views.SalesView;

// Входная точка в программу/приложение
public class App {

    public static void main(String[] args) {

        // Здесь создайте экземпляры Model, View и Controller,
        // на основании соответствующих конструкторов.
        Product model = new Product();
        SalesView view = new SalesView(model);
        ProductController controller = new ProductController(model, view);

        // Запуск программы/приложения.
        // Раскомментированный код будет корректным после
        // правильной настройки приложения
         controller.runApp();
    }
}
