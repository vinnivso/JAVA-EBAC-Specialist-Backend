package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class FirstClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, inform your name:");

        String name = input.next();

        if (name.length() < 3) {
            System.out.println("name must contain at least 3 chars");
        } else {
            String capitalize = name.substring(0, 1).toUpperCase() + name.substring(1);
            System.out.println("Hello " + capitalize);
        }
    }
}