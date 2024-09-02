package ex_27072024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab102 {
    public static void main(String[] args) {
     //take input from user and print the avr of sub

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter marks of sub 1");
        marks[0]=sc.nextFloat();
        System.out.println("Enter marks of sub 2");
        marks[1]=sc.nextFloat();
        System.out.println("Enter marks of sub 3");
        marks[2]=sc.nextFloat();
        System.out.println("Enter marks of sub 4");
        marks[3]=sc.nextFloat();
        System.out.println("Enter marks of sub 5");
        marks[4]=sc.nextFloat();

        float avg = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("Average marks is ->" + avg );
    }
}
