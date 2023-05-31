package com.zakaria;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        while (true) {
            System.out.println("\n\t-: Employee management :-");
            System.out.println("1 = Create, 2 = Read, 3 = Update, 4 = Delete");

            Scanner input = new Scanner(System.in);
            int menu = input.nextInt();
            if (menu < 1 || menu > 4) break;

            switch (menu) {
                case 1:
                    System.out.println("Enter employee information:\n(id, name, salary, email)");
                    int id = input.nextInt();
                    input.nextLine();
                    String name = input.nextLine();
                    int salary = input.nextInt();
                    input.nextLine();
                    String email = input.nextLine();
                    Employee employee = new Employee(id, name, salary, email);
                    DAO.insertEmployee(employee);
                    break;

                case 2:
                    ArrayList<Employee> list = DAO.selectAllEmployee();
                    for (Employee emp : list) {
                        System.out.println(emp);
                    }
                    break;

                case 3:
                    System.out.print("Enter employee id to edit his/her name:");
                    int emp_id = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter employee name:");
                    String e_name = input.nextLine();
                    DAO.updateEmployee(emp_id, e_name);
                    break;

                case 4:
                    System.out.print("Enter employee id to delete information: ");
                    int e_id  = input.nextInt();
                    DAO.deleteEmployee(e_id);
                    break;
            }
        }
    }
}
