package org.br.vinicius.model;

import java.util.Comparator;

/**
 * @author VSO
 */
public class CompareStudentResult implements Comparator<Student> {

    @Override
    public int compare(Student firstElement, Student secondElement) {
        return Double.compare(secondElement.getResult(), firstElement.getResult());
    }
}
