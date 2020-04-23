package com.Raton;

public class Student extends Person {
    private int batch;


    public Student(String id, String name, String department, int batch) {
        super(id, name, department);
        this.batch = batch;
    }

    public void show() {
        System.out.println("Student Information : ");
        super.show();
        System.out.println("Student Batch :" + this.batch);
    }

    public int getBatch() {
        return batch;
    }
}
