package com.Raton;

public class CourseOffer {
    private String semester;
    private Course course;
    private Teacher teacher;
    private Student student;

    public CourseOffer(String semester, Course course, Teacher teacher, Student student) {
        this.semester = semester;
        this.course = course;
        this.teacher = teacher;
        this.student = student;
    }

    public void semesterWiseCourseAndTeacherInfo() {
        System.out.println("Semester wise Course ,Student and Teacher Info ");
        System.out.println("Semester :\n" + semester + ", "
                + "course :\n" + course.getCourseTirle() + ", "
                + "teacher :\n" + teacher.getName() + "Student :\nn" + student.getBatch());
    }
}
