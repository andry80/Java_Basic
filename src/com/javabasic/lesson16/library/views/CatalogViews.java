package com.javabasic.lesson16.library.views;

import com.javabasic.lesson16.library.models.Autor;
import com.javabasic.lesson16.library.models.Book;
import com.javabasic.lesson16.library.models.Ganres;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CatalogViews {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private Autor autor;
    private Ganres ganres;
    private Book books;

    public CatalogViews(Autor autor, Ganres ganres, Book books) {
        this.autor = autor;
        this.ganres = ganres;
        this.books = books;
    }

    public int menu() throws IOException {
        System.out.println("1 - add");
        System.out.println("2 - delete");
        System.out.println("3 - view");
        System.out.println("4 - view book by autor ID");
        System.out.println("5 - view book by genres ID");
        System.out.println("6 - Exit");
        System.out.println("введите число:");
        return  Integer.parseInt(reader.readLine());
    }

    public void add() throws Exception {
        System.out.println("1 - add autor");
        System.out.println("2 - add genre");
        System.out.println("3 - add book");
        System.out.println("Enter number:");

        switch (Integer.parseInt(reader.readLine())) {
            case 1 -> {
                System.out.println("Enter name: ");
                autor.setName(reader.readLine());

                System.out.println("Enter surname: ");
                autor.setSurname(reader.readLine());

                autor.add();
            }

            case 2 -> {
                System.out.println("Enter name: ");
                ganres.setName(reader.readLine());

                System.out.println("Enter discription: ");
                ganres.setDiscript(reader.readLine());

                ganres.add();
            }
            default -> {
                autor.view();
                System.out.println("Enter ID Autor: ");
                books.setIdAutor(Integer.parseInt(reader.readLine()));

                ganres.view();
                System.out.println("Enter ID Ganres: ");
                books.setIdGanres(Integer.parseInt(reader.readLine()));

                System.out.println("Enter name: ");
                books.setName(reader.readLine());

                System.out.println("Enter discription: ");
                books.setDiscript(reader.readLine());

                System.out.println("Enter year: ");
                books.setYear(Integer.parseInt(reader.readLine()));

                books.add();
            }
        }
        System.out.println();
    }

    public void delete() throws Exception {
        System.out.println("1 - delete autor");
        System.out.println("2 - delete genre");
        System.out.println("3 - delete book");
        System.out.println("Enter number: ");
        int num = Integer.parseInt(reader.readLine());

        switch (num) {
            case 1 -> {
                autor.view();
                System.out.println("Enter ID to remove:");
                autor.delete(Integer.parseInt(reader.readLine()));
            }
            case 2 -> {
                ganres.view();
                System.out.println("Enter ID to remove:");
                ganres.delete(Integer.parseInt(reader.readLine()));
            }
            default -> {
                books.view();
                System.out.println("Enter ID to remove:");
                books.delete(Integer.parseInt(reader.readLine()));
            }
        }
        System.out.println();
    }

    public void view() throws Exception {
        System.out.println("1 - view autors");
        System.out.println("2 - view genres");
        System.out.println("3 - view books");
        System.out.println("Enter number:");

        switch (Integer.parseInt(reader.readLine())) {
            case 1 -> autor.view();
            case 2 -> ganres.view();
            default -> books.view();
        }
        System.out.println();
    }

    public void viewBookByAutors() throws Exception {
        autor.view();
        System.out.println("введите ID autor:");
        books.viewByAutor(Integer.parseInt(reader.readLine()));
        System.out.println();
    }

    public void viewBookByGenres() throws Exception  {
        ganres.view();
        System.out.println("введите ID ganre:");
        books.viewByGanre(Integer.parseInt(reader.readLine()));
        System.out.println();
    }
}
