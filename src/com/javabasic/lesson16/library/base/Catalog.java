package com.javabasic.lesson16.library.base;

import java.sql.Statement;

public interface Catalog {
    void add() throws Exception;
    void delete(int id) throws Exception;
    void view() throws Exception;
}
