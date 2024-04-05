package org.example.models;

import java.util.Comparator;

public class CompareStudentResult implements Comparator<Student> {

    @Override
    public int compare(Student firstElement, Student secondElement) {
        /**
         * ASC
         */
//        return Double.compare(firstElement.getResult(), secondElement.getResult());
        /**
         * DESC
         */
        return Double.compare(secondElement.getResult(), firstElement.getResult());
    }
}
