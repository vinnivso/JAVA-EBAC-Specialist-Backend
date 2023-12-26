package org.br.vinicius.business;

import java.util.*;


/**
 * @author VINNIVSO
 */

public class CreateStudent {
    public static void main(String[] args) {
        System.out.println("Task 12");
        task();

    }

    public static void task() {
        try {
            List genreM = new ArrayList<>();
            List genreF = new ArrayList<>();
            List name = new ArrayList<>();

            System.out.println("Please inform the names, follow the instruction template: 'Name -m/f'");

            Scanner input = new Scanner(System.in);
            String nameList = input.nextLine();

            if (nameList.length() == 0) {
                throw new Exception("Error, please insert at least a name followed by the respective gender and separate the subjectives by ',', as example: Carlos -m, Maria -f ");
            }

            String[] separateStrings = nameList.split(",\\s");
            for (int x = 0; x < separateStrings.length; x++) {
                name.add(separateStrings[x]);
            }
            for (int x = 0; x < name.size(); x++) {
                String item = name.get(x).toString();
                String[] itemSplit = item.split("-");


                if (itemSplit[1].equalsIgnoreCase("m")) {
                    genreM.add(itemSplit[0]);
                } else if (itemSplit[1].equalsIgnoreCase("f")) {
                    genreF.add(itemSplit[0]);

                }

            }

            Collections.sort(name);
            Collections.sort(genreM);
            Collections.sort(genreF);

            System.out.println("Original informed list of names: " + name);
            System.out.println("Male names: " + genreM);
            System.out.println("Female names: " + genreF);

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
