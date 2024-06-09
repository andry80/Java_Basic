package com.javabasic.lesson16.library.controllers;

import com.javabasic.lesson16.library.views.CatalogViews;

public class CatalogController {

    private CatalogViews ctv;

    public CatalogController(CatalogViews ctv) {
        this.ctv = ctv;
    }

    public void runApp() throws Exception {

        boolean par = true;
        while (par) {
            switch (ctv.menu()) {
                case 1 -> ctv.add();
                case 2 -> ctv.delete();
                case 3 -> ctv.view();
                case 4 -> ctv.viewBookByAutors();
                case 5 -> ctv.viewBookByGenres();
                default -> par = false;
            }
        }
    }
}
