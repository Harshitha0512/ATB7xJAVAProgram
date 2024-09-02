package ex_20072024;

import java.lang.foreign.SymbolLookup;
import java.util.Scanner;

public class Lab068 {
    public static void main(String[] args) {
        // program to check it is +ve, -Ve, or zero
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Positive number");
        }else if(num < 0){
            System.out.println("negative number");
        }else {
            System.out.println("its not +Ve or -Ve");
        }
    }
}
