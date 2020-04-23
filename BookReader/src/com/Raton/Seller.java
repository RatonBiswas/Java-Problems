package com.Raton;

public class Seller extends Person {


    public Seller(String name, String number, String id) {
        super(name, number, id);
    }

    public void show(){
        System.out.println("Seller Information :");
        System.out.println("Name :" + this.name);
        System.out.println("Number : " + this.number);
        System.out.println("Id: "+this.id);

    }

}
