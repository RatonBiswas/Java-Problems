package com.Raton;

public class CourseOffer {
    private String semester = "Next semester";
    private Course course;
    private Teacher teacher;

    public CourseOffer(String semester, Course course, Teacher teacher) {
        this.semester = semester;
        this.course = course;
        this.teacher = teacher;
    }
    public void semesterWiseCourseAndTeacherInfo(){
        System.out.println("Semester wise Course and Teacher Info");
        System.out.println("Semester:"+semester+", "
                + "course:"+course.getCourseTitle()+", "
                + "teacher:"+teacher.getName());
}
}
