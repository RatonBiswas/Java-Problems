package com.Raton;

public abstract class Person {

    protected String ID;
    protected String name;
    protected String department;


    public Person(String ID, String name, String dept) {
        this.ID = ID;
        this.name = name;
        this.department = dept;
    }

  public abstract void  show();
  //{
//        System.out.print("ID: "+this.ID+", "
//                + "name: "+this.name+", "
//                + "department: "+this.department);
//    }



}
