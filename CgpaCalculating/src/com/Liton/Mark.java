package com.Liton;

public class Mark {
    private double assignment;
    private double attendence;
    private double quiz;
    private double mid;
    private double finalexam;
    private double lab;

    public Mark(double assignment, double attendence, double quiz, double mid, double finalexam, double lab) {
        this.assignment = assignment;
        this.attendence = attendence;
        this.quiz = quiz;
        this.mid = mid;
        this.finalexam = finalexam;
        this.lab = lab;
    }
    public double Cgpa2()
    {
        double totalCgpa = assignment+attendence+quiz+mid+finalexam;
        return totalCgpa;
    }

    public double getAssignment() {
        return assignment;
    }

    public void setAssignment(double assignment) {
        this.assignment = assignment;
    }

    public double getAttendence() {
        return attendence;
    }

    public void setAttendence(double attendence) {
        this.attendence = attendence;
    }

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getMid() {
        return mid;
    }

    public void setMid(double mid) {
        this.mid = mid;
    }

    public double getFinalexam() {
        return finalexam;
    }

    public void setFinalexam(double finalexam) {
        this.finalexam = finalexam;
    }

    public double getLab() {
        return lab;
    }

    public void setLab(double lab) {
        this.lab = lab;
    }
}
