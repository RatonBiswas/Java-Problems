package javaprac;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ResultMain {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        //System.out.print("Attendence = 5\nAssignment = 5\nMid = 20\nQuiz = 15\nLab Final = 25\nFinal Exam = 30\n");
        Result r1;
        String MarksDistribution = "[[==================]]"
                + "\n   Attendence = 5"
                + "\n   Assignment = 5"
                + "\n   Mid = 20"
                + "\n   Quiz = 15"
                + "\n   Lab Final = 25"
                + "\n   Final Exam = 30"
                + "\n [[===============]]";

        JOptionPane.showMessageDialog(null, MarksDistribution);

        //System.out.print("Enter Input : ");
        r1 = new Result(Sc.nextFloat(), Sc.nextFloat(), Sc.nextFloat(), Sc.nextFloat(), Sc.nextFloat(), Sc.nextFloat());
        r1.grade();
        r1.display();

    }

}
