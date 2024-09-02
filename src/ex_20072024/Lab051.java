package ex_20072024;

import java.util.Scanner;

public class Lab051 {
    public static void main(String[] args) {
        //max of 2 input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();

        System.out.println("Enter numb2");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println("num1 is greater");
        }else{
            System.out.println("num2 is grater");
        }
    }
}
