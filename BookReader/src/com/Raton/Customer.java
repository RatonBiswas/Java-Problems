package com.Raton;

public class Customer extends Person {
    private String address;

    public Customer(String name, String number, String id, String address) {
        super(name, number, id);
        this.address = address;
    }
        public void show() {
            System.out.println("Customer Information :");

            System.out.println("Name :" + this.name);
            System.out.println("Number : " + this.number);
            System.out.println("Address : "+this.address);
        }
}
