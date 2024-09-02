package ex_20072024;

import java.util.Scanner;

public class Lab058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name:");
        String browser = sc.next();
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Chrome is started");
                break;
            case "Edge":
                System.out.println("Edge is started");
                break;
            default:
                System.out.println("Browser not found");
                break;
        }
    }
}
