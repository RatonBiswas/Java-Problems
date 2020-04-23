package com.Raton;

public class PartTimeTeacher extends Teacher {
    public PartTimeTeacher(String ID, String name, String init, String dept, double basic) {
        super(ID, name, init, dept, basic);
    }

    @Override
    public double calcSalary(){
        double salary = basic;
        return salary;
    }
    public double calcSalary(double allowance){
        double salary = basic+allowance;
        return salary;
    }
}
