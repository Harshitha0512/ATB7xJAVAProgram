package ex_20072024;

import java.util.Scanner;

public class Lab053 {
    public static void main(String[] args) {

        //Grade calculator
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the score");
        int score = sc.nextInt();

        char grade = 'F';

        if(score >=90 && score<100){
            grade='A';
        } else if (score >=80 && score<=89) {
            grade='B';
        } else if (score>=70 && score<=79) {
            grade='C';
        } else if (score>=60 && score<=60) {
            grade='D';
        } else if (score<=0 || score>=100 ){
            System.out.println("Lol!!, are you a GOD");
        }
        else{
            grade = 'F';
            System.out.println("Fail");
        }
        System.out.println("your grade is ->" +grade);
    }
}
