package com.Raton;

public class Salary extends Employee {
    private double salary;

    public Salary(double salary) {
        this.salary = salary;
    }

    public Salary(String name, String address, String number, double salary) {
        super(name, address, number);
        this.setSalary(salary);
    }

   public void Mailcheck(){
       System.out.println("Mail checjk for salary");
       System.out.println("EMail check to "+getName()+"with salary"+salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newsalary) {
        if(newsalary>=0.0) {
            salary = newsalary;
        }
    }
    public double Computepay(){
        System.out.println("Computer Salary for:"+getName());
        return salary/2;
    }

}
