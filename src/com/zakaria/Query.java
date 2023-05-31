package com.zakaria;

public class Query {
    static String create = "INSERT INTO employee (id, name, salary, email) VALUES (?, ?, ?, ?)";
    static String read = "SELECT * FROM employee";
    static String update = "UPDATE employee SET name = ? WHERE id = ?";
    static String delete = "DELETE FROM employee WHERE id = ?";
}
