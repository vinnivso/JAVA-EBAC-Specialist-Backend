package org.br.vinicius.model;

import java.util.Objects;

/**
 * @author VSO
 */
public class Student implements Comparable <Student> {
    private String name;
    private String course;
    private double result;
    private String classroom;

    public Student(String name, String course, double result) {
        this.name = name;
        this.course = course;
        this.result = result;
    }

    public Student(String name, String course, double result, String classroom) {
        this(name, course, result);
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", result=" + result +
                ", classroom='" + classroom + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student element) {
        return this.name.compareTo(element.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(name, student.name) && Objects.equals(classroom, student.classroom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, classroom);
    }
}
