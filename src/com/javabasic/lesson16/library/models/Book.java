package com.javabasic.lesson16.library.models;

import com.javabasic.lesson16.library.base.Catalog;
import com.javabasic.lesson16.library.base.PrintBase;
import com.javabasic.lesson16.library.base.ViewBy;

import java.sql.*;

public class Book implements Catalog, ViewBy {
    private Statement stmt;
    private String name;
    private String discript;
    private int year;
    private int idAutor;
    private int idGanres;

    public Book(Statement stmt) {
        this.stmt = stmt;
    }

    public String getName() {
        return name;
    }

    public String getDiscript() {
        return discript;
    }

    public int getYear() {
        return year;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public int getIdGanres() {
        return idGanres;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscript(String discript) {
        this.discript = discript;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public void setIdGanres(int idGanres) {
        this.idGanres = idGanres;
    }

    public void add() throws Exception{
        if (name == null || discript == null) {
            System.out.println("missing argument");
        }else {
            ResultSet rs = stmt.executeQuery("SELECT * FROM BOOKS");

            int id = 0;
            while (rs.next()) {
                int num = rs.getInt("ID");
                if (num>id) {
                    id = num;
                }
            }
            id++;
            stmt.executeUpdate("INSERT INTO BOOKS VALUES('" + id + "', '" + this.getName() +"', '" + this.getDiscript()  +"', '" + this.getYear()  +"', '" + this.getIdAutor()  +"', '" + this.getIdGanres() + "')");
        }
    }

    public void delete(int ID) throws Exception {
        stmt.executeUpdate("DELETE FROM BOOKS WHERE ID=" + ID);
    }

    public void view() throws Exception {
    ResultSet rs = stmt.executeQuery("SELECT b.ID, b.NAME_BOOK, a.NAME_AUTOR, a.SURNAME FROM BOOKS AS b, AUTORS AS a WHERE a.ID=b.ID_AUTOR");
        ResultSetMetaData metadata = rs.getMetaData();

        PrintBase.PrintResult(rs, metadata);
    }

    public void viewByAutor(int idAutor) throws Exception {
        ResultSet rs = stmt.executeQuery("SELECT BOOKS.ID, BOOKS.NAME_BOOK, BOOKS.DESCRIPTION, BOOKS.BOOK_YEAR, GANRES.NAME_GANRE  FROM BOOKS, GANRES  WHERE GANRES.ID=BOOKS.ID_GANRE and ID_AUTOR=" + idAutor);
        ResultSetMetaData metadata = rs.getMetaData();

        PrintBase.PrintResult(rs, metadata);
    }

    public void viewByGanre(int idGanre) throws Exception {
        ResultSet rs = stmt.executeQuery("SELECT BOOKS.ID, BOOKS.NAME_BOOK, BOOKS.DESCRIPTION, BOOKS.BOOK_YEAR, AUTORS.NAME_AUTOR  FROM BOOKS, AUTORS  WHERE AUTORS.ID=BOOKS.ID_AUTOR and ID_GANRE=" + idGanre);
        ResultSetMetaData metadata = rs.getMetaData();

        PrintBase.PrintResult(rs, metadata);
    }
}
