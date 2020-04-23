package javaprac;

public class Result {

    private float Assignment;
    private float Attendence;
    private float Mid;
    private float Quiz;
    private float Lab_final;
    private float Final_Exam;
    public float total;
    private float grade;

    public Result(float Assignment, float Attendence, float Mid, float Quiz, float Lab_final, float Final_Exam) {
        this.Assignment = Assignment;
        this.Attendence = Attendence;
        this.Mid = Mid;
        this.Quiz = Quiz;
        this.Lab_final = Lab_final;
        this.Final_Exam = Final_Exam;
    }

    public float getAssignment() {
        return Assignment;
    }

    public float getAttendence() {
        return Attendence;
    }

    public float getMid() {
        return Mid;
    }

    public float getQuiz() {
        return Quiz;
    }

    public float getLab_final() {
        return Lab_final;
    }

    public float getFinal_Exam() {
        return Final_Exam;
    }

    public float getGrade() {
        return grade;
    }

    public void setAssignment(float Assignment) {
        this.Assignment = Assignment;
    }

    public void setAttendence(float Attendence) {
        this.Attendence = Attendence;
    }

    public void setMid(float Mid) {
        this.Mid = Mid;
    }

    public void setQuiz(float Quiz) {
        this.Quiz = Quiz;
    }

    public void setLab_final(float Lab_final) {
        this.Lab_final = Lab_final;
    }

    public void setFinal_Exam(float Final_Exam) {
        this.Final_Exam = Final_Exam;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public float grade() {
        total = Assignment + Assignment + Mid + Quiz + Lab_final + Final_Exam;
        System.out.println("The Mark Is  : " + total);
        return total;
    }
//

    public void display() {
        if (total > 79) {
            System.out.println("The Grade Is Outstanding (A+)");
        } else if (total > 75) {
            System.out.println("The Grade Is Excellent (A)");
        } else if (total > 69) {
            System.out.println("The Grade Is Very Good (A-)");
        } else if (total > 64) {
            System.out.println("The Grade Is Good (B+)");
        } else if (total > 59) {
            System.out.println("The Grade Is Satisfactory (B)");
        } else if (total > 54) {
            System.out.println("The Grade Is Above Average (B-)");
        } else if (total >= 49) {
            System.out.println("The Grade Is Average (C+)");
        } else if (total > 44) {
            System.out.println("The Grade Is Bellow Average (C)");
        } else if (total > 39) {
            System.out.println("The Grade Is Pass (D)");
        } else {
            System.out.println("The Grade Is Fail (F)");
        }

    }
}
