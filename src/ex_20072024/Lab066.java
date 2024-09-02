package ex_20072024;

import java.util.Scanner;

public class Lab066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.next();

        System.out.println("enter your age");
        int age = sc.nextInt();

        System.out.println("enter your salary");
        double sal = sc.nextDouble();

        System.out.println("Your details are");
        System.out.println("Your name is ->" + name);
        System.out.println("Your age is ->" + age);
        System.out.println("Your sal is ->"+ sal);
    }
}
