package com.Liton;

public class Main {

    public static void main(String[] args) {
        Student p1 = new Student("173-35-2241","Raton",24,"24-A");
        Teacher p2 = new Teacher("789654","Musfiquar Rahman","SWE-123","OOP",4);
         ((Teacher) p2).getCredit();
         Mark m1 = new Mark(4.5,3.5,12.5,18.5,28.00,20.00);
         MarkClass mk = new MarkClass(4.5,3.5,12.5,18.5,28.00,20.00,5.00);
          CgpaCalculation cv = new CgpaCalculation("Raton","Musfiquar Rahman",m1,mk);
    }
}
