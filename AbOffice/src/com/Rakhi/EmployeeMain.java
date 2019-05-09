package com.Rakhi;

public class EmployeeMain {

    public static void main(String[] args) {
        LocalEmployee le=new LocalEmployee("E-123","Rakhi moni saha",25000.0);
        System.out.println();
        le.show();
        System.out.println("Local Employe Salary with bonus:"+le.bonusCalculation());
        ForeignEmployee fe=new ForeignEmployee("E-321","Jaki Shaha",30000.0);
        System.out.println();
        fe.show();
        System.out.println("Foregin Employee Salary with bonus & Tax:"+fe.taxCalculate());
    }

    }

