package ex_20072024;

import java.util.Scanner;

public class Lab069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2");
        int num2 = sc.nextInt();
        System.out.println("Enter the number 3");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("Number 1 is bigger");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Number 2 is smaller");
        } else {
            System.out.println("Number 3 is bigger");
        }
    }
}
