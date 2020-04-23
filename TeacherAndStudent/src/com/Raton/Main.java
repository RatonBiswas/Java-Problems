package com.Raton;

public class Main {

    public static void main(String[] args) {



        Person s = new Student("123-456-789", "ABCD", "SWE", 24);
        s.show();
        Course c = new Course("SWE233", "OOCD", 4.0);
        Teacher t = new Teacher("7123456", "ASDF", "MR", "SWE", 1000);
        t.show();

        Teacher pt = new PartTimeTeacher("7123456", "asdf", "MR", "SWE", 1000);
        pt.show();
        CourseOffer offer = new CourseOffer("Spring, 2019", c, t);
        offer.semesterWiseCourseAndTeacherInfo();

    }
}
