package com.Raton;

public class Teacher extends Person {
    protected String initial;
    protected double basic;

    public Teacher(String ID, String name, String dept, String initial, double basic) {
        super(ID, name, dept);
        this.initial = initial;
        this.basic = basic;
    }
    @Override
    public void show(){
        System.out.println("Teacher's info:");
        //super.show();
        System.out.print(", "+"initial: "+initial);
        System.out.println(", "+"Salary: "+calcSalary());
    }
    public double calcSalary(){
        double salary = basic+basic/10+basic/2;
        return salary;
    }

    public String getInitial() {
        return initial;
    }

    public String getName() {
        return name;
    }

}
