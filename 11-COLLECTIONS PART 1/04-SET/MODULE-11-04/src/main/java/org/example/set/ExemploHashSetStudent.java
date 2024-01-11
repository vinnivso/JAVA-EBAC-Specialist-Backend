package org.example.set;

import org.example.models.Student;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSetStudent {
    public static void main(String args[]) {
        exemploListaSimples();
        exemploConsultando();
        exemploRemover();
    }

    private static void exemploRemover() {
        System.out.println("**** exemploRemover ****");
        Set<Student> conjunto = new HashSet<>();

        Student a = new Student("João da Silva", "Linux básico", 0);
        Student b = new Student("Antonio Sousa", "OpenOffice", 0);
        Student c = new Student("Lúcia Ferreira", "Internet", 0);
        Student d = new Student("Antonio Sousa", "OpenOffice", 10);
        Student e = new Student("Teste", "OpenOffice", 10);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);

        conjunto.remove(a);
        System.out.println(conjunto);

        for (Student student : conjunto) {
            System.out.println(student);
        }
    }

    private static void exemploConsultando() {
        System.out.println("**** exemploConsultando ****");
        Set<Student> conjunto = new HashSet<Student>();

        Student a = new Student("João da Silva", "Linux básico", 0);
        Student b = new Student("Antonio Sousa", "OpenOffice", 0);
        Student c = new Student("Lúcia Ferreira", "Internet", 0);
        Student d = new Student("Antonio Sousa", "OpenOffice", 10);
        Student e = new Student("Teste", "OpenOffice", 10);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);

        System.out.println(conjunto.contains(e));
    }

    /**
     * Para não repetir objetos na lista de alunos é necessário que a classe
     * Aluno implemente o equals e hashcode
     */
    private static void exemploListaSimples() {
        Set<Student> conjunto = new HashSet<Student>();

        Student a = new Student("João da Silva", "Linux básico", 0);
        Student b = new Student("Antonio Sousa", "OpenOffice", 0);
        Student c = new Student("Lúcia Ferreira", "Internet", 0);
        Student d = new Student("Antonio Sousa", "OpenOffice", 10);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);
    }
}
