package ex_20072024;

import java.util.Scanner;

public class Lab057 {
    public static void main(String[] args) {
        // switch condition
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7, I'll tell which day it is..");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Moday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No idea, which day it is");
        }
        System.out.println("Outside the switch loop");
    }
}
