package com.javabasic.lesson16.library.models;

import com.javabasic.lesson16.library.base.Catalog;
import com.javabasic.lesson16.library.base.PrintBase;

import java.sql.*;

public class Autor implements Catalog {
    private Statement stmt;
    private String name;
    private String surname;

    public Autor(Statement stmt) {
        this.stmt = stmt;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void add() throws Exception{
        if (name == null || surname == null) {
            System.out.println("missing argument");
        }else {
            ResultSet rs = stmt.executeQuery("SELECT * FROM AUTORS");

            int id = 0;
            while (rs.next()) {
                int num = rs.getInt("ID");
                if (num>id) {
                    id = num;
                }
            }

            id++;
            stmt.executeUpdate("INSERT INTO AUTORS VALUES('" + id + "', '" + this.getName() +"', '" + this.getSurname() + "')");
        }
    }

    public void delete(int id) throws Exception {
        stmt.executeUpdate("DELETE FROM AUTORS WHERE ID=" + id);
    }

    public void view() throws Exception {
        ResultSet rs = stmt.executeQuery("SELECT * FROM AUTORS");
        ResultSetMetaData metadata = rs.getMetaData();

        PrintBase.PrintResult(rs, metadata);
    }
}
