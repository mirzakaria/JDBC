package com.zakaria;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    static Connection conn = null;

    static Connection dbConnect() {
        try {
            String url = "jdbc:mysql://localhost:3306/Employee";
            String username = "root";
            String password = "zakaria";

            conn = DriverManager.getConnection(url, username, password);
        } catch(Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
}
