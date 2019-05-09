package com.Rakhi;

public class ForeignEmployee extends Employee {
    public ForeignEmployee(String id, String name, double salary) {
        super(id, name, salary);
    }

    public double taxCalculate() {
        return getSalary() * 0.05;
    }

    @Override
    public void show() {
        System.out.println("Foreign Employee Information :");
        super.show();
    }
}
