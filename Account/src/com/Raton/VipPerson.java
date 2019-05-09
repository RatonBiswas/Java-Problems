package com.Raton;

public class VipPerson {
             private String Name;
             private double Creditlimit;
             private  String EmailAddress;

    public VipPerson(String name, double creditlimit, String emailAddress) {
        Name = name;
        Creditlimit = creditlimit;
        EmailAddress = emailAddress;

    }

    public VipPerson() {
        this("Default name",50000.00,"default@gmail.com");
    }

    public VipPerson(String name,double creditlimit) {
        this(name,creditlimit,"unknown@gmail.com");
    }

    public String getName() {
        return Name;
    }

    public double getCreditlimit() {
        return Creditlimit;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }
}
