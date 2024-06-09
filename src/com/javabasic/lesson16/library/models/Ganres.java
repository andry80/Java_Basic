package com.javabasic.lesson16.library.models;

import com.javabasic.lesson16.library.base.Catalog;

import java.sql.*;

public class Ganres implements Catalog {
    private Statement stmt;
    private String name;
    private String discript;

    public Ganres(Statement stmt) {
        this.stmt = stmt;
    }

    public String getName() {
        return name;
    }

    public String getDiscript() {
        return discript;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscript(String discript) {
        this.discript = discript;
    }

    public void add() throws Exception{
        if (name == null || discript == null) {
            System.out.println("missing argument");
        }else {
            ResultSet rs = stmt.executeQuery("SELECT * FROM GANRES");

            int id = 0;
            while (rs.next()) {
                int num = rs.getInt("ID");
                if (num>id) {
                    id = num;
                }
            }
            id++;
            stmt.executeUpdate("INSERT INTO GANRES VALUES('" + id + "', '" + this.getName() +"', '" + this.getDiscript() + "')");
        }
    }

    public void delete(int ID) throws Exception {
        stmt.executeUpdate("DELETE FROM GANRES WHERE ID=" + ID);
    }

    public void view() throws Exception {
        ResultSet rs = stmt.executeQuery("SELECT * FROM GANRES");
        ResultSetMetaData metadata = rs.getMetaData();

        while (rs.next()){
            System.out.print("|");
            for (int i = 1; i<=metadata.getColumnCount(); i++) {
                String namecolomn = metadata.getColumnName(i);
                System.out.print(rs.getString(namecolomn) + "|");
            }
            System.out.println();
        }
    }
}
