package org.br.vinicius.business;

import org.br.vinicius.model.Student;

import javax.swing.*;
import java.util.*;


/**
 * @author VINNIVSO
 */

public class CreateStudent {
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter student name and the genre after '-', the genre needs to be 'M' or 'F'");
        task();
    }

    public static void task() throws Exception {
        try {
            Map<Integer, Student> students = new TreeMap<Integer, Student>();
            Student firstStudent = new Student("Marcus Aurelius-M", "JAVA", 10.0, "1-A");
            Student secondStudent = new Student("Gaius Secundus-M", "PYTHON", 9.0, "1-A");
            Student thirdStudent = new Student("Boedica-F", "C++", 10.0, "1-A");
            Student fourthStudent = new Student("Sesta Principia Ethinaris-F", "JAVA", 10.0, "1-B");
            Student fifthStudent = new Student("Trovianus Secundus", "PYTHON", 10.0, "1-B");
            students.put(1, firstStudent);
            students.put(2, secondStudent);
            students.put(3, thirdStudent);
            students.put(4, fourthStudent);
            students.put(5, fifthStudent);
            Map<Integer, Student> male = new TreeMap<Integer, Student>();
            Map<Integer, Student> female = new TreeMap<Integer, Student>();
            Iterator<Map.Entry<Integer, Student>> it = students.entrySet().iterator();
            while(it.hasNext()) {
                Map.Entry<Integer, String> entry1 = it.next();
                System.out.println("Chave: " + entry1.getKey());
                System.out.println("Valor: " + entry1.getValue());
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
