package ex_27072024;

import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        for(int i = 0; i<marks.length;i++){
            System.out.println("Enter marks" +(i+1));
            marks[i] = sc.nextFloat();
        }
        float avg = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("Average marks is ->" + avg );
    sc.close();
    }

}
