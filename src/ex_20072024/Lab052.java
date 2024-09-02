package ex_20072024;

import java.util.Scanner;

public class Lab052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();

        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        if(num2>num1){
            System.out.println("Num2 is greater");
        } else if (num1>num2) {
            System.out.println("Num1 is grater");
        } else{
            System.out.println("both are equal");
        }
    }
}
