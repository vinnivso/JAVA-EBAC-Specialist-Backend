package org.vinnivo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<String> list = List.of("Fia -f", "Radagon -m", "Godfrey -m", "Godwyn -m", "Melina -f");
        Map<String, String> nameMap = new HashMap<>();

        for (String item : list) {
            String[] partes = item.split("\\s-");
            nameMap.put(partes[0], partes[1]);
        }

        //LAMBDA EXPRESSION to FEMALE LIST
        List<String> femaleList = nameMap.entrySet().stream()
                .filter(entry -> entry.getValue().equals("f"))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());


        //LAMBDA EXPRESSION to MALE LIST
        List<String> maleList = nameMap.entrySet().stream()
                .filter(entry -> entry.getValue().equals("m"))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        //WITHOUT LAMBDA EXPRESSION TO MALE LIST
        //List maleList = new ArrayList<>();
        //for (int x = 0; x < list.size(); x++){
        //    String[] segregated = list.get(x).split("\\s-");
        //     if (segregated[1].equals("m")){
        //maleList.add(segregated[0]);
        //
        //    }
        //}

        System.out.println("FEMALE LIST " + femaleList);
        System.out.println("MALE LIST " + maleList);

    }
}