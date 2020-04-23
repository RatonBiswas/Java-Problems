package com.Raton;

public abstract class Employee {
    private String name;
    private String address;
    private  String number;
    Employee(){}
    public Employee(String name, String address, String number) {
        System.out.println("Constructor Created.");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public double Computepay(){
        System.out.println("Inside Employee Computepay.");
        return 0.0;
    }
    public void Mailcheck(){
        System.out.println("Mailing Checking"+this.name+""+this.address);
    }
    public String toString(){
       return name+""+address+""+number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public void setAddress(String newaddress) {
        this.address = newaddress;
    }
}
