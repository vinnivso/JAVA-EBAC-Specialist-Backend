package org.example;


import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class FirstClass {
    public static void main(String[] args) {
        Client client = new Client();
        client.setCode(17);
        client.setAddress("Rua Doutor Correa");
        System.out.println("Your code: " + client.getCode());
        System.out.println("Your address: " + client.getAddress());
        client.printAddress();
        client.setName("Vinicius");
        System.out.println("Your name: " + client.returnCLientName());
    }
}