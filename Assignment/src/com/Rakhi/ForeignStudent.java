package com.Rakhi;

public class ForeignStudent extends Student {
    public ForeignStudent(String id, String name, double cgpa) {

        super(id, name, cgpa);
    }
   public  String waiver_calculation() {
        if (getCgpa() == 4.00) {
            return "50% waiver";
        } else if (getCgpa() >= 3.90 && getCgpa() <= 3.99) {
            return "30% waiver";
        } else if (getCgpa() >= 3.85 && getCgpa() <= 3.89) {
            return "20 % waiver";
        } else {
            return "no waiver";
        }
    }
    @Override
    public void Show() {
        System.out.println("Foreign Student Information :");
        super.Show();
    }
}
