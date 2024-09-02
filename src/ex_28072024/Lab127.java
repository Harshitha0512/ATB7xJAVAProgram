package ex_28072024;

import java.util.Scanner;

public class Lab127 {
    //cc=heck the given number or year is leap year or not

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int leapyear = sc.nextInt();
        boolean isLeapyear = false;

        if((leapyear % 4 == 0 && leapyear %100 !=0) || (leapyear%400==0)){
            isLeapyear = true;
        }
        if(isLeapyear){
            System.out.println(leapyear + " -> is a leap year");
        }else {
            System.out.println(leapyear +" -> is not a leap year");
        }
    }
}
