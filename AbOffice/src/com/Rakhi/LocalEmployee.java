package com.Rakhi;

public class LocalEmployee extends Employee {
    public LocalEmployee(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void show() {
        System.out.println("Local Employee Information :");
        super.show();
    }
}
