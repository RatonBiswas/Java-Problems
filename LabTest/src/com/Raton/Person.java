package com.Raton;

public class Person {
    protected String id;
    protected String name;
    protected String department;



    public Person(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void show() {
        System.out.println("Id :" + this.id + "\nName :" + this.name + "\nDepartment :" + this.department);
    }
}

