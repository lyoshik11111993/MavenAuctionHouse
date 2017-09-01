package com.example;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Menu menu = new Menu();
        System.out.println("Hello! Welcome to our auction house! Make your choise: ");
        while (menu.breaker()) {
            menu.menubar();
            System.out.println("-----------------------------------");
            System.out.println("Select another action: ");
            System.out.println("Press '0' to close auction.");
            System.out.println("-----------------------------------");
        }
    }
}
