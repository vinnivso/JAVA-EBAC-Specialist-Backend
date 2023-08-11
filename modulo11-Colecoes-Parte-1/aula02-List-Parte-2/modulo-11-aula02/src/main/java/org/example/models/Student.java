package org.example.models;

public class Student implements Comparable<Student> {
    private String name;
    private String course;
    private double result;
    private String classroom;

    public Student(String name, String course, double result){
        this.name = name;
        this.course = course;
        this.result = result;
    }

    public Student(String name, String course, double result, String classroom){
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

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", course='" + course + '\'' +
//                ", result=" + result +
//                ", classroom='" + classroom + '\'' +
//                '}';
//    }

    public String toString(){
        return this.name;
    }

    @Override
    public int compareTo(Student element) {
        return this.name.compareTo(element.getName());
    }
}
