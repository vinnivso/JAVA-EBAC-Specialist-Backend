package org.example.list;

import org.example.models.CompareStudentResult;
import org.example.models.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        exampleSimpleList();
        exampleSimpleListAscSort();
        exampleSimpleListAscSortResult();
    }


    public static void exampleSimpleList(){
        System.out.println("*** Example Simple List ***");
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Edgar von Trips", "Advanced Linux", 9));
        list.add(new Student("Edgar von Blunchen", "Advanced Windows", 7));
        list.add(new Student("Edgar von Hokenheim", "Advanced MACOS", 5, "1-D"));
        System.out.println(list);
        System.out.println("");

        list.remove(0);
        boolean contain = list.contains("Edgar von Trips");
        System.out.println(contain);

        for (Student name: list) {
            System.out.println(name);
        }

        System.out.println(list.get(0));
    }

    public static void exampleSimpleListAscSort(){
        System.out.println("*** Example Simple List with ASC Sort ***");
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Edgar von Trips", "Advanced Linux", 9));
        list.add(new Student("Edgar von Blunchen", "Advanced Windows", 7));
        list.add(new Student("Edgar von Hokenheim", "Advanced MACOS", 5, "1-D"));
        Collections.sort(list);
        System.out.println(list);
        System.out.println("");
    }

    public static void exampleSimpleListAscSortResult(){
        System.out.println("*** Example Simple List with ASC Sort ***");
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Edgar von Trips", "Advanced Linux", 9));
        list.add(new Student("Edgar von Blunchen", "Advanced Windows", 7));
        list.add(new Student("Edgar von Hokenheim", "Advanced MACOS", 5, "1-D"));
        Collections.sort(list);
        System.out.println(list);
        System.out.println("");

        CompareStudentResult compareResult = new CompareStudentResult();
        Collections.sort(list, compareResult);
        System.out.println("Example List with sort in Results" + list);
        System.out.println("");
    }
}
