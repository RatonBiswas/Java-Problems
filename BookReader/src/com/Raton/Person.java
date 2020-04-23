package com.Raton;

public abstract class Person {
    protected String name;
    protected String number;
    protected String id;

    public Person(String name,String number,String id) {
        this.name = name;
        this.number = number;
        this.id=id;
    }

    abstract void show();
//    public void details(){
//        System.out.println("Name :" + this.name);
//        System.out.println("Number : " + this.number);
//    }

}
