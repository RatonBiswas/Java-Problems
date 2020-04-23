package com.Raton;

public class Student extends Person {
    private int batch;

    public Student(String ID, String name, String dept, int batch) {
        super(ID, name, dept);
        this.batch = batch;
    }

    @Override
    public void show() {
        System.out.println("Students info:");
        //super.show();
        System.out.println(", "+"batch: "+batch);
    }
}
