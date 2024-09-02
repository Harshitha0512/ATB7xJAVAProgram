package ex_20072024;

import java.util.Scanner;

public class Lab050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();
        System.out.println("The input is ->" + user_input);
        if (user_input%2 == 0){
            System.out.println("user input is even->" + user_input);
        }else{
            System.out.println("user input is odd->" + user_input);
        }
    }
}
