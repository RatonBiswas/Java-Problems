package com.Raton;
import java.util.InputMismatchException;
import java.util.Scanner;
public class tEST {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            try {
                int a = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e);
            }
            String r = input.next();
            System.out.println(r.length());
            int a = input.nextInt();
            double[] array2 = new double[a];

            try {
                int x = Integer.parseInt(r);
            } catch (NumberFormatException e) {
                System.out.println(e);
            }

            array2[a] = 34 % a;
            try {
                array2[34] = 67 / a;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            String b = input.next();

            Calculator obj = new Calculator(23, 45);

            double resutl = obj.sum(5, 2);
            System.out.println("Final : " + resutl);

        }
}
