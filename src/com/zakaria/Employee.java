package com.zakaria;

public class Employee {
    private int id;
    private String name;
    private int salary;
    private String email;

    public Employee(int id, String name, int salary, String email) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Employee [" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                " ]";
    }
}
