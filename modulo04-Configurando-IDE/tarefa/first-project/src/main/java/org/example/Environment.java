package org.example;
import java.util.Scanner;

    public class Environment {
        public static void main(String[] args) {
            try (Scanner input = new Scanner(System.in)) {
                System.out.println("Please, inform where the server will run:");

                String environment = input.next();

                if (environment.equalsIgnoreCase("DEV")) {
                    System.out.println("Server running on DEV Environment");
                } else if(environment.equalsIgnoreCase("TEST")) {
                    System.out.println("Server running on TEST Environment");
                } else {
                    System.out.println("Server running on " + environment);
                }
            } catch (Exception e) {
                System.out.println("ERROR");
            }
        }
    }