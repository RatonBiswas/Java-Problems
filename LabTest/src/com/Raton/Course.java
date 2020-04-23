package com.Raton;

public class Course {
    //public Course(){}
    private String courseCode,courseTirle;
    private double credit;

    public Course(String courseCode, String courseTirle, double credit) {
        this.courseCode = courseCode;
        this.courseTirle = courseTirle;
        this.credit = credit;
    }
    public void Dhow()
    {
        System.out.println("Course Information :");
        System.out.println("courseCode :"+this.courseCode+"\ncourseTirle :"+this.courseTirle+"\nCredit :"+this.credit);
    }

    public String getCourseCode()   {
        return courseCode;
    }

    public String getCourseTirle()   {
        return courseTirle;
    }

    public double getCredit()  {
        return credit;
    }

    public void setCourseCode(String courseCode)  {
        this.courseCode = courseCode;
    }

    public void setCourseTirle(String courseTirle)  {
        this.courseTirle = courseTirle;
    }

    public void setCredit(double credit)  {
        this.credit = credit;
    }
}
