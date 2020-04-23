package com.Raton;

public class Course {

    private String courseCode, courseTitle;
    private double credit;

    public Course(String courseCode, String courseTitle, double credit) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }
    public void show(){
        System.out.println("Course's info:");
        System.out.println("courseCode:"+courseCode+", "
                + "courseTitle:"+courseTitle+". "
                + "credit:"+credit);
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }
}
