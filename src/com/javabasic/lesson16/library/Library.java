package com.javabasic.lesson16.library;
import com.javabasic.lesson16.library.controllers.CatalogController;
import com.javabasic.lesson16.library.models.*;
import com.javabasic.lesson16.library.views.CatalogViews;

import java.sql.*;
import java.util.Scanner;

public class Library {

    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:/home/user/repoz/Java_Basic/src/com/javabasic/lesson16/library";

    static final String USER = "sa";
    static final String PASS = "sa";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);


            stmt = conn.createStatement();

            Autor autor = new Autor(stmt);
            Ganres ganres = new Ganres(stmt);
            Book books = new Book(stmt);

            CatalogViews ctv = new CatalogViews(autor, ganres, books);

            CatalogController ctc = new CatalogController(ctv);

            ctc.runApp();


            System.out.println("Close base");
            stmt.close();
            conn.close();

        } catch (Exception se) {
            se.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                System.out.println("Close base");
            } catch (SQLException se) {}
            try {
                if (conn != null) conn.close();
                System.out.println("Close base");
            } catch (SQLException se) {}
        }
    }
}
