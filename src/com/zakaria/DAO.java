package com.zakaria;

import java.sql.*;
import java.util.ArrayList;

public class DAO {
    static void insertEmployee(Employee employee) throws SQLException {
        Connection conn = DB.dbConnect();
        String query = Query.create;
        PreparedStatement statement = conn.prepareStatement(query);
        statement.setInt(1, employee.getId());
        statement.setString(2, employee.getName());
        statement.setInt(3, employee.getSalary());
        statement.setString(4, employee.getEmail());

        System.out.println("\nQuery = " + statement);
        System.out.println(employee);
        statement.executeUpdate();
        conn.close();
    }

    static ArrayList<Employee> selectAllEmployee() throws SQLException {
        ArrayList<Employee> employeeList  = new ArrayList<>();
        Connection conn = DB.dbConnect();
        String query = Query.read;
        Statement statement = conn.prepareStatement(query);
        System.out.println("\n Query = " + statement);

        ResultSet result = statement.executeQuery(query);

        while (result.next()) {
            Employee emp = new Employee(result.getInt(1),
                                        result.getString(2),
                                        result.getInt(3),
                                        result.getString(4));

            employeeList.add(emp);
        }

        return employeeList;
    }

    static void updateEmployee(int id, String name) throws SQLException {
        Connection conn = DB.dbConnect();
        String query = Query.update;
        PreparedStatement statement = conn.prepareStatement(query);
        statement.setInt(2, id);
        statement.setString(1, name);

        System.out.println("\n Query = " + statement);
        statement.executeUpdate();
        conn.close();
    }

    static void deleteEmployee(int id) throws SQLException {
        Connection conn = DB.dbConnect();
        String query = Query.delete;
        PreparedStatement statement = conn.prepareStatement(query);
        statement.setInt(1, id);
        System.out.println("\n Query = " + statement);

        statement.executeUpdate();
        conn.close();
    }
}
