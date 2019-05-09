package com.Raton;

public class Main {

    public static void main(String[] args) {

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());
        VipPerson person2 = new VipPerson("Raton",200000.20);
        System.out.println(person2.getName());
        VipPerson person3 = new VipPerson("Tim",100.00,"raton@.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());

    }
}
