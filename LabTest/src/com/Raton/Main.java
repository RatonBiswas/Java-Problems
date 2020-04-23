package com.Raton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student information :");
        Student s1 = new Student(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt());
        s1.show();
        System.out.println("Enter Teacher information :");
        Teacher t1 = new Teacher("789654","SWE","Musfiq","mr");
        t1.show();
        System.out.println("Enter Course information :");
        Course c1 = new Course("SWE233","OOP",4);
        System.out.println("Enter Semester information :");
        CourseOffer c2 = new CourseOffer("Spring-2019",c1,t1,s1);
        c2.semesterWiseCourseAndTeacherInfo();
    }
}
