package com.Rakhi;

public class Employee {
       private String id;
        private String name ;
        private double salary;

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    double bonusCalculation(){
            return salary*0.1;

        }
        public void show(){

            System.out.println("Employee Name : "+this.name);
            System.out.println("Employee ID : "+this.id);
        }

}
