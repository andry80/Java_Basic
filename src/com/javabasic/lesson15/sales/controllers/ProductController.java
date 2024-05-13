package com.javabasic.lesson15.sales.controllers;

import com.javabasic.lesson15.sales.models.Product;
import com.javabasic.lesson15.sales.utils.Rounder;
import com.javabasic.lesson15.sales.views.SalesView;

// Controller
public class ProductController {

    Product model;
    SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        // 2) вызов методов расчетов доходов и налога;
        // 3) округление расчетных значений;
        // 4) вывод расчетов по заданному формату.

        String output = "Наименование товара: " + model.getName() + "\n" +
                "Общий доход (грн.): " + Rounder.round(model.calcIncome()) + "\n" +
                "Сумма налога (грн.): " + Rounder.round(model.taxFromIncome()) + "\n" +
                "Чистый доход (грн.): " + Rounder.round(model.calcNetIncome());

        view.getOutput(output);
    }
}
