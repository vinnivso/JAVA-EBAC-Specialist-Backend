package org.example.set;

import org.example.models.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class TestePerformanceSet {
    public static void main(String args[]) {
        Random r = new Random();

        HashSet<Student> hashSet = new HashSet<Student>();
        TreeSet<Student> treeSet = new TreeSet<Student>();
        LinkedHashSet<Student> linkedSet = new LinkedHashSet<Student>();

        // start time
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            hashSet.add(new Student("João da Silva", "Linux básico", x));
        }
        // end time
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("HashSet: " + duration);




        // start time
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            treeSet.add(new Student("João da Silva", "Linux básico", x));
        }
        // end time
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("TreeSet: " + duration);




        // start time
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            linkedSet.add(new Student("João da Silva", "Linux básico", x));
        }
        // end time
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("LinkedHashSet: " + duration);
    }
}
