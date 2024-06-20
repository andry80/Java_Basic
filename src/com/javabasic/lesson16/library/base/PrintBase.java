package com.javabasic.lesson16.library.base;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class PrintBase {
    public static void PrintResult(ResultSet rs, ResultSetMetaData metadata) throws Exception {
        while (rs.next()){
            System.out.print(" | ");
            for (int i = 1; i<=metadata.getColumnCount(); i++) {
                String namecolomn = metadata.getColumnName(i);
                System.out.print(rs.getString(namecolomn) + " | ");
            }
            System.out.println();
        }
    }
}
