package com.Liton;

public class MarkClass extends Mark {
    private double presentation;

    public MarkClass(double assignment, double attendence, double quiz, double mid, double finalexam, double lab, double presentation) {
        super(assignment, attendence, quiz, mid, finalexam, lab);
        this.presentation = presentation;
    }


    public double Cgpa()
    {
        double totalCgpa =getAssignment()+getAttendence()+getMid()+getQuiz()+getFinalexam()+presentation;
        return totalCgpa;
    }
}
