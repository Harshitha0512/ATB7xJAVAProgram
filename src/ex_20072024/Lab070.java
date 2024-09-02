package ex_20072024;

import java.util.Scanner;

public class Lab070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char");
        char ch = sc.next().charAt(0);
        //char ch = 'a';
        if(ch == 'a' || ch =='e' ||ch == 'i' || ch =='o' || ch =='u' ){
            System.out.println("vowel");
        }else {
            System.out.println("consonant");
        }
    }
}
