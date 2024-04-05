package org.example.set;

import org.example.models.Student;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSetStudent {
    public static void main(String args[]) {
        exemploListaSimples();
    }

    /**
     * Para não repetir objetos na lista de alunos é necessário que a classe
     * Aluno implemente a classe Comparable
     * Tem ordem natural dos objetos
     */
    private static void exemploListaSimples() {
        Set<Student> conjunto = new TreeSet<>();

        Student a = new Student("João da Silva", "Linux básico", 0);
        Student b = new Student("Antonio Sousa", "OpenOffice", 0);
        Student c = new Student("Lúcia Ferreira", "Internet", 0);
        Student d = new Student("Antonio Sousa", "OpenOffice", 0);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);
    }
}
