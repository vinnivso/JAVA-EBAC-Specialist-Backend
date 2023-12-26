package org.br.vinicius.business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author VINNIVSO
 */

public class CreateStudent {
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter student names separated by ','");
        firstTask();
        System.out.println("Please enter student names separated by ',' and the genre after '-', the genre needs to be 'M' or 'F'");
        secondTask();
    }

    public static void firstTask() throws Exception {
        try {
            Scanner input = new Scanner(System.in);
            String nameList = input.nextLine();
            List<String> list = new ArrayList<String>();
            list = List.of(nameList.toUpperCase().split(","));
            System.out.println(list);
            System.out.println(list.get(0));
            System.out.println(list.get(1));
            System.out.println(list.get(2));
            System.out.println("");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void secondTask() throws Exception {
        try {
            Scanner input = new Scanner(System.in);
            String nameList = input.nextLine();
            if (nameList.length() < 3) {
                throw new Exception("Error in first argument, please insert at least 3 chars of information");
            }
            if (!nameList.contains("-M") || !nameList.contains("-F")) {
                throw new Exception("Error in second argument, please insert at the specified genre as informed");
            }
            List<String> list = new ArrayList<String>();
            list = List.of(nameList.toUpperCase().split(","));
            List<String> genreM = new ArrayList<String>();
            List<String> genreF = new ArrayList<String>();

            for (String name: list) {
                if (name.contains("-M")) {
                    genreM.add(name);
                } else {
                    genreF.add(name);
                }
            }
            System.out.println("List of Masculine Genre: " + genreM);
            System.out.println("List of Feminine Genre: " + genreF);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
