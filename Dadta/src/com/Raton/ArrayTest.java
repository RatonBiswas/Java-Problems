package com.Raton;
import java.util.Scanner;

public class ArrayTest {

   private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many numbers :");

        int[] numberOfValue = getIntegers(sc.nextInt());

        for (int i=0;i<numberOfValue.length;i++)
        {
            System.out.println("Element "+i+" Value is :"+numberOfValue[i]);
        }
        System.out.println("The average value is :"+getAverage(numberOfValue));
    }
    public static int[] getIntegers(int number)
    {
        System.out.println("Enter "+number+" Integers Value .");

        int[] value= new int[number];

        for(int i=0;i<value.length;i++)
        {
            value[i]=sc.nextInt();
        }
        return value;
    }
    public static double getAverage(int[] array){

       double sum=0;

       for (int i=0;i<array.length;i++)

       {
           sum+=array[i];
       }
       return (double)sum/(double)array.length;
    }
}
