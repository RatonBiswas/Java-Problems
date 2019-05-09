package com.Rakhi;

public class Main {

    public static void main(String[] args) {
        LocalStudent ls=new LocalStudent("181-35-2416","Rakhi moni saha",0);
        System.out.println();
        ls.Show();
        System.out.println("Student cgpa:"+ls.cgpa_calculate(4.0, 4.0, 3.75, 4.00, 3.75));
        ForeignStudent Fs=new ForeignStudent("173-35-2290","Steven Smith",0);
        System.out.println();
        Fs.Show();
        System.out.println("Student cgpa="+Fs.cgpa_calculate(3.5, 4.0, 3.25, 3.50, 3.75));
        System.out.println("Foregin Student waiver:"+Fs.waiver_calculation());

    }
}
