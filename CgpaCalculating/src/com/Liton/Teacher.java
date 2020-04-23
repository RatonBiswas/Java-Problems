package com.Liton;

public class Teacher extends Person {
//    private double assignment;
//    private double attendence;
//    private double quiz;
//    private double mid;
//    private double finalexam;
//    private double lab

    private String courseId;
    private String courseNAme;
    private int credit;

    public Teacher(String id, String name, String courseId, String courseNAme, int credit) {
        super(id, name);
        this.courseId = courseId;
        this.courseNAme = courseNAme;
        this.credit = credit;
    }

    public void show(){
        System.out.println("Teacher Information ");
        System.out.println("Teacher Name :"+this.name);
        System.out.println("Teacher Id :"+this.id);
    }

    public int getCredit() {
        return credit;
    }

    public String getCourseNAme() {
        return courseNAme;
    }

    public void setCourseNAme(String courseNAme) {
        this.courseNAme = courseNAme;
    }

    //    public double setCredit(int credit) {
//        if(credit==4)
//        {
//            CgpaCalculation.Cgpa();
//        }
//        else
//
//    }
}
