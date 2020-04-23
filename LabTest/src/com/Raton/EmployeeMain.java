package com.Raton;

public class EmployeeMain {
    public static void main(String[] args) {
        Salary s = new Salary("rimi","Dhaka","123-27",-5.0);
        Employee E = new Salary("Raton","Rangpur","123-56",-10.00);
        s.Mailcheck();
        E.Mailcheck();
        E.Computepay();
        s.setSalary(15000.00);
        s.Computepay();
    }
}
