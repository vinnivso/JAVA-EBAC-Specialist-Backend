package org.example.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        exampleSimpleList();
        exampleSimpleListAscSort();
    }
    public static void exampleSimpleList(){
        System.out.println("*** Example Simple List ***");
        List<String> list = new ArrayList<String>();
        list.add("First User");
        list.add("Second User");
        list.add("Third User");
        System.out.println(list);
        System.out.println("");
    }

    public static void exampleSimpleListAscSort(){
        System.out.println("*** Example Simple List with ASC Sort ***");
        List<String> list = new ArrayList<String>();
        list.add("First User");
        list.add("Second User");
        list.add("Third User");
        list.add("A");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("");
    }
}
