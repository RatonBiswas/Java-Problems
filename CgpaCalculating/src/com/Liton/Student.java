package com.Liton;

public class Student extends Person {
    private int batch;
    private String section;

    public Student(String id, String name, int batch, String section) {
        super(id, name);
        this.batch = batch;
        this.section = section;
    }
    public void show(){
        System.out.println("Student Information ");
        System.out.println("Student name :"+this.name);
        System.out.println("Student Id :"+this.id);
        System.out.println("Student batch :"+this.batch);
        System.out.println("student section :"+this.section);
        System.out.println();
    }
}
