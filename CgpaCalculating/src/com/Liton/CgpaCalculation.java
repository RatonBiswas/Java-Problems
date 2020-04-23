package com.Liton;

public class CgpaCalculation {
    private Student student;
    private Teacher teacher;
    private Mark mark;
    private MarkClass mak;


    public CgpaCalculation(Student student, Teacher teacher,Mark mark,MarkClass mak) {
        this.student = student;
        this.teacher = teacher;
        this.mark=mark;
        this.mak = mak;

    }
//    public void Cgpa(double assignment,double attendence,double quiz,double mid,double finalexam,double lab){
//             double totalCgpa=assignment+attendence+quiz+mid+finalexam;
//        System.out.println("CGPA :"+totalCgpa);
//    }
//    public void Cgpa2(double assignment,double attendence,double quiz,double mid,double finalexam,double presentation)
//    {
//        double totalCgpa = assignment+attendence+quiz+mid+finalexam+presentation;
//        System.out.println("CGPA :"+totalCgpa);
//    }
//

    public void CourseCredit(int credit){
        double totalCgpa=mark.Cgpa2();
        System.out.println("CGPA :"+totalCgpa);

    }
    public void Coursecredit(int credit)
    {
        double totalCgpa = mak.Cgpa();
        System.out.println("CGPA :"+totalCgpa);
    }

    public void show(){
        System.out.println("Student Name : "+student.name);
        System.out.println("Student Id :"+student.id);
        System.out.println("Cousre name :"+teacher.getCourseNAme());
        System.out.println("Techer name :"+teacher.name);
    }
}
