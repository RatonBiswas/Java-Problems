package com.Rakhi;
public class Student {

        private String id;
        private String name;
        private double cgpa;

    public Student(String id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double cgpa_calculate(double java, double alg, double testing, double data, double math){
            cgpa=(java*3)+(alg*4)+(testing*4)+(data*3)+(math*4);
            return cgpa/18;
        }
     public void Show(){
         System.out.println("Student Name : "+this.name);
        System.out.println("Student Id :"+this.id);

     }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}
