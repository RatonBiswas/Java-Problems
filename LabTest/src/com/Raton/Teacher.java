package com.Raton;

import java.sql.SQLOutput;

public class Teacher extends Person {
    private String initial;

    public Teacher(String id, String department,String name,  String initial) {
        super(id, name, department);
        this.initial = initial;
    }

    public String getInitial()  {
        return initial;
    }
    public String getName() {
        return name;
    }

    @Override
    public void show() {
        System.out.print("Teacher Information :");
        super.show();
        System.out.println("initial :\n"+this.initial);

    }
}
